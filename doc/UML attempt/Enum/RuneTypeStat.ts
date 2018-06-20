import { TypeStat } from "../Enum/TypeStat";
import { MonsterTypeStat } from "./MonsterTypeStat";

export class RuneTypeStat extends TypeStat{
    ATK_MULTI = new TypeStat("ATK", true);
    DEF_MULTI = new TypeStat("DEF", true);
    HP_MULTI = new TypeStat("HP", true);
    SPD_MULTI = new TypeStat("SPD", true);
}