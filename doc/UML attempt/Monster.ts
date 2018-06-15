import { Attribute } from "./Enum/Attribute";
import { MonsterTypeStat } from "./Enum/MonsterTypeStat";
import { MonsterStats } from "./Enum/MonsterStats";
import { LeaderBuff } from "./LeaderBuff";
import { Skill } from "./Skill";
import { Rune } from "./Rune";


export class Monster{
  name: string;
  family: string;
  attribute: Attribute;

  leaderBuff : LeaderBuff;
  skills: Array<Skill>;

  stats: Array<MonsterStats>;
  runes: Array<Rune>;

  getCalculatedStats() : Array<MonsterStats>{
    let myCalculatedStat: Array<MonsterStats>;

    // I should go through each rune and get the total of each bonus stat i have, flat and multi.

    // If i'm the current stat

    // Then I 
    return myCalculatedStat;
  }

}
