import { Attribute } from "./Enum/Attribute";
import { MonsterTypeStat } from "./Enum/MonsterTypeStat";
import { MonsterStats } from "./Enum/MonsterStats";
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

  stats: Array<MonsterStats>;
  runes: Array<Rune>;

  getCalculatedStats(MonsterTypeStatWanted : MonsterTypeStat) : number{    
    let wantedStatBaseValue : number = this.getBaseValueOfStat(MonsterTypeStatWanted);
    let myCalculatedStat: number;

    // Then I 
    return myCalculatedStat;
  }

  getBaseValueOfStat(MonsterTypeStatWanted : MonsterTypeStat) : number {
    let wantedStatBaseValue : number;
    this.stats.forEach( (currentMonsterStats) => {
      // TODO If i can't find the awaken value, i get the not-awaken value and log an error
      if (currentMonsterStats.monsterTypeStat == MonsterTypeStatWanted && this.grade == currentMonsterStats.grade && this.isAwaken == currentMonsterStats.isAwaken){
        wantedStatBaseValue = this.calculateCurrentBaseValueOfStat(currentMonsterStats.minValue, currentMonsterStats.maxValue);
      }
    });
    return wantedStatBaseValue;
  }

  calculateCurrentBaseValueOfStat(minValue : number, maxValue : number) : number{
    let incrementStatPerLevel : number = maxValue / minValue;
    return minValue + (incrementStatPerLevel*this.level);
  }

  calculateGlobalBonusOfStat(MonsterTypeStatWanted : MonsterTypeStat) : StatBonus{
    let bonus : StatBonus = new StatBonus;
    this.runes.forEach( (rune) => {
      bonus = StatBonusUtils.addStatBonusToAnotherStatBonus(bonus, rune.calculateTotalStatBonus(MonsterTypeStatWanted));
    });
    return bonus;
  }

}
