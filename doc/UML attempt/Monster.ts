import { Attribute } from "./Enum/Attribute";
import { Stat } from "./Enum/Stat";
import { TypeStat } from "./Enum/TypeStat";
import { MonsterStat } from "./Enum/MonsterStat";
import { LeaderSkill } from "./LeaderSkill";
import { Skill } from "./Skill";
import { Rune } from "./Rune";
import { StatBonus } from "./StatBonus";
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

  getCalculatedStats(MonsterTypeStatWanted : Stat) : number{    
    let wantedStatBaseValue : number = this.getBaseValueOfStat(MonsterTypeStatWanted);
    let myCalculatedStat: number;

    // Then I 
    // Cap for some stats, (not above 100 %)

    return myCalculatedStat;
  }

  getBaseValueOfStat(MonsterTypeStatWanted : Stat, isAwaken? : boolean, grade? : number) : number {
    let wantedStatBaseValue : number;
    let wantedMonsterStat : MonsterStat[];
    let inspectedMonsterStat : MonsterStat[][] = this.stats;
    if(isAwaken){
      inspectedMonsterStat = this.statsAwakened;
    }
    inspectedMonsterStat[grade].forEach( (currentMonsterStat) => {
      if (currentMonsterStat.monsterTypeStat.name == MonsterTypeStatWanted.name){
        wantedMonsterStat.push(currentMonsterStat);
      }
    });
    if(!(wantedMonsterStat.length>0)){
      // Question : I have to get another stat from another grade if this one is empty ? And how ?
      // Same questio for awaken and not-awaken value
    }
    wantedStatBaseValue = wantedMonsterStat[0].getCalculatedValue(this.level, this.getMaxLevelLimit);
    return wantedStatBaseValue;
  }


  calculateCurrentBaseValueOfStat(minValue : number, maxValue : number) : number{
    let incrementStatPerLevel : number = maxValue / minValue;
    return minValue + (incrementStatPerLevel*this.level);
  }

  calculateGlobalBonusOfStat(MonsterTypeStatWanted : TypeStat) : StatBonus{
    let bonus : StatBonus = new StatBonus;
    this.runes.forEach( (rune) => {
      bonus = StatBonusUtils.addStatBonusToAnotherStatBonus(bonus, rune.calculateTotalStatBonus(MonsterTypeStatWanted));
    });
    
    // Leader buff too
    // If there is buff applied ?
    // 
    return bonus;
  }

  getMaxLevelLimit() : number{
    // TODO Goes by constants
    // return (CurrentMonster.grade*Const.GRADE_LEVEL_INCREMENTS)+Const.NO_GRADE_MAX_LEVEL;
    return 10+(this.grade*5);
  }

}
