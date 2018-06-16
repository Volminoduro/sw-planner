import { StatBonus } from "../StatBonus";

export class StatBonusUtils {
    static addStatBonusToAnotherStatBonus(addedStatBonus : StatBonus, addingStatBonus : StatBonus) : StatBonus { 
        if(addedStatBonus.monsterTypeStat == addingStatBonus.monsterTypeStat){
            addedStatBonus.flatBonus += addingStatBonus.flatBonus;
            addedStatBonus.multiBonus += addingStatBonus.multiBonus;
        }
        return addedStatBonus;
     }
    
}