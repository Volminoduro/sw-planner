import { Attribute } from "./Enum/Attribute";
import { MonsterTypeStat } from "./Enum/MonsterTypeStat";
import { TypeStat } from "./Enum/TypeStat";
import { MonsterStat } from "./Enum/MonsterStat";
import { LeaderBuff } from "./LeaderBuff";
import { Skill } from "./Skill";
import { Rune } from "./Rune";
import { StatBonus } from "./StatBonus";
import { StatBonusUtils } from "./Utils/StatBonusUtils";

export class MonsterImpl{
  name: string;
  family: string;
  attribute: Attribute;

  grade : number;
  level: number;
  isAwaken: boolean;

  leaderBuff : LeaderBuff;
  skills: Array<Skill>;

  stats: Array<MonsterStat>;
  runes: Array<Rune>;

  getCalculatedStats(MonsterTypeStatWanted : TypeStat) : number{    
    let wantedStatBaseValue : number = this.getBaseValueOfStat(MonsterTypeStatWanted);
    let myCalculatedStat: number;

    // Then I 
    return myCalculatedStat;
  }

  getBaseValueOfStat(MonsterTypeStatWanted : TypeStat) : number {
    let wantedStatBaseValue : number;
    // Attempt to error managing
    let error : string;
    let wantedMonsterStat : Array<MonsterStat> = this.getMonsterStat(MonsterTypeStatWanted);

    if (wantedMonsterStat.length>0){
      wantedMonsterStat.forEach( (currentMonsterStats) => {        
        if (currentMonsterStats.monsterTypeStat == MonsterTypeStatWanted && this.grade == currentMonsterStats.grade && this.isAwaken == currentMonsterStats.isAwaken){
          wantedStatBaseValue = this.calculateCurrentBaseValueOfStat(currentMonsterStats.minValue, currentMonsterStats.maxValue);
        }
      });
      // TODO If i can't find the awaken value, i get the not-awaken value and log an error - TODO
      // if(wantedStatBaseValue);
    }
    else{
      error = "MAJOR ERROR, NO VALUE FOUND FOR "+MonsterTypeStatWanted.name;
    }
    
    return wantedStatBaseValue;
  }

  getMonsterStat(MonsterTypeStatWanted : TypeStat, isAwaken? : boolean, grade? : number) : Array<MonsterStat> {
    let wantedMonsterStat : Array<MonsterStat>;
    this.stats.forEach( (currentMonsterStats) => {
      if (currentMonsterStats.monsterTypeStat == MonsterTypeStatWanted && this.grade == currentMonsterStats.grade && this.isAwaken == currentMonsterStats.isAwaken){
        wantedMonsterStat.push(currentMonsterStats);
      }
    });
    return wantedMonsterStat;
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

}
