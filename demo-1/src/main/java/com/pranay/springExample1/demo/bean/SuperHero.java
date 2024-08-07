package com.pranay.springExample1.demo.bean;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;
import java.util.Map;

public class SuperHero {
    String heroName;
    List<String> superPowers;
    Map<String,String> missions;

    public SuperHero() {
    }

    public SuperHero(String heroName, List<String> superPowers) {
        this.heroName = heroName;
        this.superPowers = superPowers;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public List<String> getSuperPowers() {
        return superPowers;
    }

    public void setSuperPowers(List<String> superPowers) {
        this.superPowers = superPowers;
    }

    public Map<String, String> getMissions() {
        return missions;
    }

    public void setMissions(Map<String, String> missions) {
        this.missions = missions;
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "heroName='" + heroName + '\'' +
                ", superPowers=" + superPowers +
                ", missions=" + missions +
                '}';
    }
}
