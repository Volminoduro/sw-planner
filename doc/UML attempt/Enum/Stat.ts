export class Stat{

    name : string;
    value : number;

    constructor(name: string, value: number){
        this.name = name;
        this.value = value;
    }
}

export class FlatStat{
    getValue()
}

export class PercentStat{

}