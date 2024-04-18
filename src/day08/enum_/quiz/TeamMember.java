package day08.enum_.quiz;

public class TeamMember {

    private String name;
    private TeamRole role;

    public TeamMember(String name, TeamRole role) {
        this.name = name;
        this.role = role;
    }

    public void assignTask() {
        // 이하를 작성하세요
        System.out.printf("%s is assigned to %s\n",
                this.name, this.role.getDescription());
    }
}
