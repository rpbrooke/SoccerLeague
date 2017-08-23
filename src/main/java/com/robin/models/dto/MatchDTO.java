package com.robin.models.dto;

public class MatchDTO {
    private String homeClub;
    private String awayClub;
    private int homeScore;
    private int awayScore;

    public MatchDTO(String homeClub, String awayClub, int homeScore, int awayScore) {
		this.homeClub = homeClub;
		this.awayClub = awayClub;
		this.homeScore = homeScore;
		this.awayScore = awayScore;
	}

	public MatchDTO() {}
    
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

	@Override
	public String toString() {
		return "MatchDTO [homeClub=" + homeClub + ", awayClub=" + awayClub + ", homeScore=" + homeScore + ", awayScore="
				+ awayScore + "]";
	}
    
    
}
