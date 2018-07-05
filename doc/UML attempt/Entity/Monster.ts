import { Attribute } from "../Enum/Attribute";
import { Stat } from "./Stat";
import { FlatStat } from "./Stat";
import { PercentStat } from "./Stat";
import { Const } from "../Enum/Const";
import { MonsterStat } from "./MonsterStat";
import { LeaderSkill } from "./LeaderSkill";
import { Skill } from "./Skill";
import { Rune } from "./Rune";
import { StatBonusUtils } from "../Utils/StatBonusUtils";
import { Context } from "./Context";
import { Situation } from "../Enum/Situation";

export class Monster{

  name: string;
  family: string;
  attribute: Attribute;

  isAwaken: boolean; 
  grade : number;
  level: number;   
  
  // TODO : Number of grade as key to the array
  // TODO : Number of grade + isAwaken as key to the array ?
  stats: MonsterStat[][];
  // TODO : Number of grade as key to the array
  statsAwakened: MonsterStat[][];
  
  leaderSkill : LeaderSkill;
  runes: Array<Rune>;

  skills: Array<Skill>;

  getCalculatedValueOfStat(MonsterTypeStatWanted : Stat) : number{    
    let wantedMonsterStat : MonsterStat = this.getMonsterStatFromStat(MonsterTypeStatWanted, this.grade, this.isAwaken);
    let wantedStatBaseValue : number = wantedMonsterStat.getCalculatedBaseValue(this.level, this.getMaxLevelLimit());
    // TODO
    // Question : I have to get another stat from another grade if this one is empty ? And how ?
    // Same question for awaken and not-awaken value
    let myCalculatedStatValue: number = wantedStatBaseValue;
    let statCapValue: number = wantedMonsterStat.cap;
    
    let multiplicativeStatBonusValue : number = this.getCalculatedGlobalBonusOfStat(new PercentStat(MonsterTypeStatWanted.name, 0));
    let additiveStatBonusValue : number = this.getCalculatedGlobalBonusOfStat(new FlatStat(MonsterTypeStatWanted.name, 0));

    myCalculatedStatValue = myCalculatedStatValue+(myCalculatedStatValue*(multiplicativeStatBonusValue/100))+additiveStatBonusValue;

    if (myCalculatedStatValue>statCapValue){
      myCalculatedStatValue=statCapValue;
    }
    return myCalculatedStatValue;
  }

  getMonsterStatFromStat(monsterStatWanted : Stat, grade : number, isAwaken? : boolean) : MonsterStat{
    let wantedMonsterStat : MonsterStat;
    let inspectedMonsterStat : MonsterStat[][] = this.stats;
   if(grade>Const.MAX_GRADE || grade <Const.MIN_GRADE){
     // TODO : Error managing
     return;
   }
    if(isAwaken){
      inspectedMonsterStat = this.statsAwakened;
    }
    inspectedMonsterStat[grade].forEach( (currentMonsterStat) => {
      if (currentMonsterStat.monsterTypeStat.name == monsterStatWanted.name){
        wantedMonsterStat=currentMonsterStat;
      }
    });
    return wantedMonsterStat;
  }

  getCalculatedGlobalBonusOfStat(monsterStatWanted : Stat) : number{
    let globalBonus : number = 0;
    globalBonus += this.getTotalRunesBonusOfStat(monsterStatWanted);

    globalBonus += this.getLeaderSkillBonusOfStat(monsterStatWanted);
    // prepare for building bonus calculating (to do in function)

    globalBonus += this.getOthersBonusOfStat(monsterStatWanted);

    return globalBonus;
  }

  getTotalRunesBonusOfStat(monsterStatWanted : Stat) : number{
    let runesBonus : Stat;
    this.runes.forEach( (rune) => {
      runesBonus = StatBonusUtils.getStatBonusToAnotherStatBonusAddition(runesBonus, rune.calculateTotalStatBonus(monsterStatWanted));
    });
    return runesBonus.value;
  }

  getLeaderSkillBonusOfStat(monsterStatWanted : Stat) : number{
    // TODO : context as a global static class ?
    if(Context.currentSituation==Situation.ALL || Context.currentSituation==this.leaderSkill.situation){
      return StatBonusUtils.getStatBonusToAnotherStatBonusAddition(monsterStatWanted, this.leaderSkill.stat).value;
    }
    return 0;
  }

  getOthersBonusOfStat(monsterStatWanted : Stat) : number{
    // TODO : Buildings
    return 0;
  }

  getMaxLevelLimit() : number{
    return Const.MIN_LEVEL+(this.grade*Const.GRADE_LEVEL_INCREMENTS);
  }

}
