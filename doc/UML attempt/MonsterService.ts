import { MonsterImpl } from "./Monster";

// TODO
export class MonsterService{

    getMaxLevelLimit(CurrentMonster : MonsterImpl) : number{
        return (CurrentMonster.grade*Const.GRADE_LEVEL_INCREMENTS)+Const.NO_GRADE_MAX_LEVEL;
    }

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
          // TODO If i can't find the awaken value, i get the not-awaken value 
          // TODO If i can't find the value of this grade, i get the value of the current grade -1 (first the same awaken or not value then the others if i don't have)
          // error = "Minor error, NO VALUE FOUND FOR "+MonsterTypeStatWanted.name+""+AwakenOrNot+" for this grade "+grade+"
          // Resolution : picked the value of grade and awaken;
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


  