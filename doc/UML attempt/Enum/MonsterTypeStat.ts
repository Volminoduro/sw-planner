import { TypeStat } from "../Enum/TypeStat";

export class MonsterTypeStat{
    ATK_FLAT = new TypeStat("ATK", false);
    DEF_FLAT = new TypeStat("DEF", false);
    HP_FLAT = new TypeStat("HP", false);
    SPD_FLAT = new TypeStat("SPD", false);

    CRI_Rate = new TypeStat("CRI_R", true);
    CRI_Dmg = new TypeStat("CRI_D", true);
    Resistance = new TypeStat("RES", true);
    Accuracy = new TypeStat("ACC", true);
}