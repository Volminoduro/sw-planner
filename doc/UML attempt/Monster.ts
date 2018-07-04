import { Attribute } from "./Enum/Attribute";
import { Stat } from "./Enum/Stat";
import { TypeStat } from "./Enum/TypeStat";
import { MonsterStat } from "./Enum/MonsterStat";
import { LeaderSkill } from "./LeaderSkill";
import { Skill } from "./Skill";
import { Rune } from "./Rune";
import { StatBonusUtils } from "./Utils/StatBonusUtils";

export class Monster{

  name: string;
  family: string;
  attribute: Attribute;

  isAwaken: boolean; 
  grade : number;
  level: number;   
  
  // Le nombre d'étoiles en tant qu'indice de tableau
  // TODO Le couple nombre d'étoiles et boolean isAwaken en tant que clé ?
  stats: MonsterStat[][];
  // Le nombre d'étoiles en tant qu'indice de tableau
  statsAwakened: MonsterStat[][];
  
  leaderSkill : LeaderSkill;
  runes: Array<Rune>;

  skills: Array<Skill>;

  getCalculatedValueOfStat(MonsterTypeStatWanted : Stat) : number{    
    let wantedMonsterStat : MonsterStat = this.getMonsterStatFromStat(MonsterTypeStatWanted, this.grade, this.isAwaken);
    let wantedStatBaseValue : number = wantedMonsterStat.getCalculatedBaseValue(this.level, this.getMaxLevelLimit());
    let myCalculatedStat: number = wantedStatBaseValue;
    let statCapValue: number = wantedMonsterStat.cap;
    // TODO call to function
    let multiplicativeStatBonusValue : number = this.getCalculatedGlobalBonusOfStat(new PercentStat());
    // TODO call to function
    let additiveStatBonusValue : number = this.getCalculatedGlobalBonusOfStat(new FlatStat());

    myCalculatedStat = myCalculatedStat+(myCalculatedStat*(multiplicativeStatBonusValue/100))+additiveStatBonusValue;

    if (myCalculatedStat>statCapValue){
      myCalculatedStat=statCapValue;
    }
    return myCalculatedStat;
  }

  getMonsterStatFromStat(MonsterTypeStatWanted : Stat, grade : number, isAwaken? : boolean) : MonsterStat{
    let wantedMonsterStat : MonsterStat;
    let inspectedMonsterStat : MonsterStat[][] = this.stats;
    // TODO, grade control out of bounds
    /*
    if(grade > MAX_GRADE && grade <MIN_GRADE){
      error.
    }
    */
    if(isAwaken){
      inspectedMonsterStat = this.statsAwakened;
    }
    inspectedMonsterStat[grade].forEach( (currentMonsterStat) => {
      if (currentMonsterStat.monsterTypeStat.name == MonsterTypeStatWanted.name){
        wantedMonsterStat=currentMonsterStat;
      }
    });
    return wantedMonsterStat;
  }

  getBaseValueOfStat(MonsterTypeStatWanted : Stat, isAwaken? : boolean, grade? : number) : number {
    let wantedStatBaseValue : number;
    let wantedMonsterStat : MonsterStat;
    if(!(wantedMonsterStat==undefined)){
      // TODO
      // Question : I have to get another stat from another grade if this one is empty ? And how ?
      // Same question for awaken and not-awaken value
    }
    wantedStatBaseValue = wantedMonsterStat.getCalculatedBaseValue(this.level, this.getMaxLevelLimit());
    return wantedStatBaseValue;
  }

  getCalculatedGlobalBonusOfStat(MonsterTypeStatWanted : Stat) : number{

    // calculate runes bonus + set (to do in function)
    let bonus : number = 0;
    this.runes.forEach( (rune) => {
      bonus = StatBonusUtils.addStatBonusToAnotherStatBonus(bonus, rune.calculateTotalStatBonus(MonsterTypeStatWanted));
    });
    // Leader buff too (TODO)

    // prepare for building bonus calculating (to do in function)
    return bonus;
  }

  calculateRunesTotalBonusOfStat(MonsterTypeStatWanted : TypeStat) : number{
    // TODO
    return 0;
  }

  calculateLeaderSkillBonusOfStat(MonsterTypeStatWanted : TypeStat) : Stat{

  }

  getMaxLevelLimit() : number{
    // TODO Goes by constants
    // return (CurrentMonster.grade*Const.GRADE_LEVEL_INCREMENTS)+Const.NO_GRADE_MAX_LEVEL;
    return 10+(this.grade*5);
  }

}
