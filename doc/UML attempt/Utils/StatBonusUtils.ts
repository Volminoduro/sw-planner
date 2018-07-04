import { Stat } from "../Enum/Stat";

export class StatBonusUtils {
    static addStatBonusToAnotherStatBonus(addedStatBonus : Stat, addingStatBonus : Stat) : Stat { 
        if(addedStatBonus.monsterTypeStat == addingStatBonus.monsterTypeStat){
            addedStatBonus.flatBonus += addingStatBonus.flatBonus;
            addedStatBonus.multiBonus += addingStatBonus.multiBonus;
        }
        return addedStatBonus;
     }
    
}