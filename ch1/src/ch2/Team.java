package ch2;

import java.util.ArrayList;
import java.util.List;

public class Team {
    @Override
    public String toString() {
        return "Team [id=" + id + ", teamName=" + teamName + "]";
    }

    private Long id;
    private String teamName;

    private List<TeamMember> list = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Team(Long id, String teamName) {
        this.id = id;
        this.teamName = teamName;
    }

    public List<TeamMember> getList() {
        return list;
    }

    public void setList(List<TeamMember> list) {
        this.list = list;
    }

}
