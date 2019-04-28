package application.entity;

public class ActiveSkill extends Skill {

    private int cooldown;

    public ActiveSkill() {
    }

    public void execute(){

    }

    public int getCooldown() {
        return cooldown;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }
}
