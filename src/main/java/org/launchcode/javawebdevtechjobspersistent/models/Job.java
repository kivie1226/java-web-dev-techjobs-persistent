package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;

    @ManyToMany
    @NotNull(message = "At least one skill is required")
    private List<Skill> skills;


    public Job(Employer anEmployer, List<Skill>someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }


    // Getters and setters:

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill>skills) {
        this.skills = skills;
    }

    //No-arg constructor:

    public Job() {
    }
}

