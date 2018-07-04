import { RuneSet } from "../Enum/RuneSet";
import { Stat } from "./Stat";
import { StatBonusUtils } from "../Utils/StatBonusUtils";
import { RunePrefix } from "../Enum/RunePrefix";
export class Rune{

    location: number;

    set: RuneSet;

    mainBonus : Stat;

    // TODO Authorized stat on main, prefix and sub, depending of previous stat in upper consideration

    prefixBonus : Stat;
    prefixName : RunePrefix;    

    subBonus : Array<Stat>;

    calculateTotalStatBonus(monsterTypeStatWanted : Stat) : Stat{
        let currentStatBonus : Stat;
        currentStatBonus = StatBonusUtils.getStatBonusToAnotherStatBonusAddition(currentStatBonus, this.mainBonus);
        currentStatBonus = StatBonusUtils.getStatBonusToAnotherStatBonusAddition(currentStatBonus, this.prefixBonus);
        this.subBonus.forEach( (currentSubBonus) =>{
            currentStatBonus = StatBonusUtils.getStatBonusToAnotherStatBonusAddition(currentStatBonus, currentSubBonus);
        });        
        return currentStatBonus;
    }
  
}
