package application.view;

import application.entity.Monster;

public class MonsterSelectionBoxView {

    private String name;
    private String family;
    private String attribute;
    private String role;
    // TODO image
    private Integer startingStarGrade;

    public MonsterSelectionBoxView(Monster monster){
        this.name = monster.getName();
        this.family = monster.getFamily().name();
        this.attribute = monster.getAttribute().name();
        this.role = monster.getRole().name();
        this.startingStarGrade = monster.getFirstStarGrade();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getStartingStarGrade() {
        return startingStarGrade;
    }

    public void setStartingStarGrade(Integer startingStarGrade) {
        this.startingStarGrade = startingStarGrade;
    }
}
