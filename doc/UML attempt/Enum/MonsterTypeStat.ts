import { Stat } from "../Enum/Stat";

export class MonsterTypeStat{
    ATK_FLAT = new Stat("ATK", false);
    DEF_FLAT = new Stat("DEF", false);
    HP_FLAT = new Stat("HP", false);
    SPD_FLAT = new Stat("SPD", false);

    CRI_Rate = new Stat("CRI_R", true);
    CRI_Dmg = new Stat("CRI_D", true);
    Resistance = new Stat("RES", true);
    Accuracy = new Stat("ACC", true);
}