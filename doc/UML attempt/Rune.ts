import { StatBonus } from "./StatBonus";
import { RuneTypeStat } from "./Enum/RuneTypeStat";
import { RuneSet } from "./Enum/RuneSet";
import { MonsterTypeStat } from "./Enum/MonsterTypeStat";
import { TypeStat } from "./Enum/TypeStat";
import { StatBonusUtils } from "./Utils/StatBonusUtils";
export class Rune{

    location: number;

    set: RuneSet;

    mainBonus : StatBonus;
    authorizedMainBonus : Array<RuneTypeStat>;

    prefixBonus : StatBonus;
    prefixName : string;

    // authorizedPrefixBonus : Array<TypeStat>; ?

    subBonus : Array<StatBonus>;

    calculateTotalStatBonus(monsterTypeStatWanted : TypeStat) : StatBonus{
        let currentStatBonus : StatBonus;
        currentStatBonus = StatBonusUtils.addStatBonusToAnotherStatBonus(currentStatBonus, this.mainBonus);
        currentStatBonus = StatBonusUtils.addStatBonusToAnotherStatBonus(currentStatBonus, this.prefixBonus);
        this.subBonus.forEach( (currentSubBonus) =>{
            currentStatBonus = StatBonusUtils.addStatBonusToAnotherStatBonus(currentStatBonus, currentSubBonus);
        });        
        return currentStatBonus;
    }
  
}
