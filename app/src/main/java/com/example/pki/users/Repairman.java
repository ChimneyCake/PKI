package com.example.pki.users;

public class Repairman extends User {

    private int experienceYears;
    private boolean specialTechnique;
    private double rating;
    private String job;

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public boolean isSpecialTechnique() {
        return specialTechnique;
    }

    public void setSpecialTechnique(boolean specialTechnique) {
        this.specialTechnique = specialTechnique;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
