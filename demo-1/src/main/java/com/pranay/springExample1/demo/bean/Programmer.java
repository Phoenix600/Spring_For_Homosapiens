package com.pranay.springExample1.demo.bean;

public class Programmer {
    private boolean copy;
    private String skills;


    public Programmer() {
    }

    public Programmer(boolean copy, String skills) {
        this.copy = copy;
        this.skills = skills;
    }

    public boolean isCopy() {
        return copy;
    }

    public String getSkills() {
        return skills;
    }

    public void setCopy(boolean copy) {
        this.copy = copy;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "copy=" + copy +
                ", skills='" + skills + '\'' +
                '}';
    }
}
