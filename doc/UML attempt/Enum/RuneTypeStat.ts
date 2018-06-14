import { Stat } from "../Enum/Stat";
import { MonsterTypeStat } from "./MonsterTypeStat";

export class RuneTypeStat extends MonsterTypeStat{
    ATK_MULTI = new Stat("ATK", true);
    DEF_MULTI = new Stat("DEF", true);
    HP_MULTI = new Stat("HP", true);
    SPD_MULTI = new Stat("SPD", true);
}