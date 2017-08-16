package com.robin.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity Class for Match table in relational database.
 * @param Club homeClub
 * @param Club awayClub
 * @param int homeScore
 * @param int awayScore
 *
 */

@Entity
@Table(name = "match")
public class Match {

    //Primary key value is auto-generated.
    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "match_id", unique = true)
    private int matchId;

    @NotNull
    @Column(name = "home_score")
    private int homeScore;
    @NotNull
    @Column(name = "away_score")
    private int awayScore;

    //Relationships with other Entity Classes.
    @ManyToOne
    @JoinColumn(name = "club_id", insertable = false, updatable = false)
    private Club homeClub;
    @ManyToOne
    @JoinColumn(name = "club_id", insertable = false, updatable = false)
    private Club awayClub;


    public Match(Club homeClub, Club awayClub, int homeScore, int awayScore) {
        this.homeClub = homeClub;
        this.awayClub = awayClub;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public Match() {}

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

   
    public Club getHomeClub() {
        return homeClub;
    }

    public void setHomeClub(Club homeClub) {
        this.homeClub = homeClub;
    }


    public Club getAwayClub() {
        return awayClub;
    }

    public void setAwayClub(Club awayClub) {
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
