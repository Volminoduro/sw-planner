import { TypeStat } from "./TypeStat";
export class Stat{

    name : TypeStat;
    value : number;

    constructor(name: TypeStat, value: number){
        this.name = name;
        this.value = value;
    }
}

export class FlatStat extends Stat{

    getValue() : number{
        return this.value;
    }
}

export class PercentStat extends Stat{

    getValue() : number{
        return this.value;
    }

}