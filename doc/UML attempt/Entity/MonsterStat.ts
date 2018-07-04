import { Stat } from "./Stat";

export class MonsterStat{

    monsterTypeStat : Stat;
    maxValue : number;
    minValue : number;

    cap : number;

    getCalculatedBaseValue(actualLevel : number, maxLevel : number) : number {
        return this.minValue+((this.maxValue/maxLevel)*actualLevel);
    }
}