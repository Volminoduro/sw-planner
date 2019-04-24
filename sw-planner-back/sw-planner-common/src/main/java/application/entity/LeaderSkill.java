package application.entity;

import application.enums.LeaderBuffContext;

public class LeaderSkill {

    private LeaderBuffContext leaderBuffContext;
    private Stat statBoosted;
    private int boostAmount;

    public LeaderBuffContext getLeaderBuffContext() {
        return leaderBuffContext;
    }

    public void setLeaderBuffContext(LeaderBuffContext leaderBuffContext) {
        this.leaderBuffContext = leaderBuffContext;
    }

    public Stat getStatBoosted() {
        return statBoosted;
    }

    public void setStatBoosted(Stat statBoosted) {
        this.statBoosted = statBoosted;
    }

    public int getBoostAmount() {
        return boostAmount;
    }

    public void setBoostAmount(int boostAmount) {
        this.boostAmount = boostAmount;
    }
}
