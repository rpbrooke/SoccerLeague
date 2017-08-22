package com.robin.models.dto;

public class MatchDTO {
    private String homeClub;
    private String awayClub;
    private int homeScore;
    private int awayScore;

    public String getHomeClub() {
        return homeClub;
    }

    public void setHomeClub(String homeClub) {
        this.homeClub = homeClub;
    }

    public String getAwayClub() {
        return awayClub;
    }

    public void setAwayClub(String awayClub) {
        this.awayClub = awayClub;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }
}
