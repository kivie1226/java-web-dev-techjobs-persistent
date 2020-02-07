package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message="Location is required.")
    @Size(min=1, max=100)
    public String location;

    //Setting up one to many relationship
    @OneToMany(mappedBy="employer")
    private List<Job> jobs = new ArrayList<>();

    //No-arg constructor
    public Employer() {}

    public Employer(String location) {
        super();
        this.location = location;
    }

    //Getters and setters:

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }



}


