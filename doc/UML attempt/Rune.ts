import { StatBonus } from "./StatBonus";
import { RuneTypeStat } from "./Enum/RuneTypeStat";
import { RuneSet } from "./Enum/RuneSet";

export class Rune{

    location: number;

    set: RuneSet;

    mainBonus : StatBonus;
    authorizedMainBonus : Array<RuneTypeStat>;

    prefixBonus : StatBonus;
    prefixName : string;

    // authorizedPrefixBonus : Array<TypeStat>; ?

    subBonus : Array<StatBonus>;
  
}
