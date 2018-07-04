import { Stat } from "../Entity/Stat";

export class StatBonusUtils {
    static getStatBonusToAnotherStatBonusAddition(addedStat : Stat, addingStat : Stat) : Stat {
        // TODO : Is constructor really a suitable solution for comparaison ?
        if(addedStat.constructor == addingStat.constructor && addedStat.name == addingStat.name){
            addedStat.value=+ addingStat.value;
        }
        return addedStat;
     }
    
}