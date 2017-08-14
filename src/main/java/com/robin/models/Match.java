package com.robin.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "matches")
public class Match {

    private Integer matchId;
    private String homeTeam;
    private String awayTeam;
    private Integer homeScore;
    private Integer awayScore;

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "match_id", unique = true)
    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    @ManyToOne
    @JoinColumn(name = "club_name")
    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    @ManyToOne
    @JoinColumn(name = "club_name")
    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    @NotNull
    @Column(name = "home_score")
    public Integer getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Integer homeScore) {
        this.homeScore = homeScore;
    }

    @NotNull
    @Column(name = "away_score")
    public Integer getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(Integer awayScore) {
        this.awayScore = awayScore;
    }
}
