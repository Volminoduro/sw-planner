import { TypeStat } from "./Enum/TypeStat";
import { MonsterTypeStat } from "./Enum/MonsterTypeStat";

export class StatBonus{

    monsterTypeStat : TypeStat;
    flatBonus : number;

    multiBonus : number;

    //constructor_impl(wantedMonsterTypeStat? : MonsterTypeStat, wantedFlatBonus? : number, wantedMultiBonus? : number){
    //    return new this(null, 0, 0);
    //}

    constructor(wantedMonsterTypeStat? : TypeStat, wantedFlatBonus? : number, wantedMultiBonus? : number){
        this.monsterTypeStat = wantedMonsterTypeStat;
        this.flatBonus = wantedFlatBonus;
        this.multiBonus = wantedMultiBonus;
    }

}