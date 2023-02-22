package com.info.javabasics;

import java.util.ArrayList;
import java.util.List;

public class Developer {
    private final long id;
    private final String name;
    private List<Skill> skills;

    public Developer(long id, String name, List<Skill> skills) {
        this.id = id;
        this.name = name;
        this.skills = skills;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
