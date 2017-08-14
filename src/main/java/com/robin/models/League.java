package com.robin.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "league")
public class League {

    private Integer position;
    private String clubName;
    private Integer gamesPlayed;
    private Integer wins;
    private Integer losses;
    private Integer ties;

    @NotNull
    @Column(name ="league_position")
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Id
    @NotNull
    @Column(name = "club_name")
    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    @NotNull
    @Column(name = "gamesplayed")
    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    @NotNull
    @Column(name ="wins")
    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    @NotNull
    @Column(name ="losses")
    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    @NotNull
    @Column(name="ties")
    public Integer getTies() {
        return ties;
    }

    public void setTies(Integer ties) {
        this.ties = ties;
    }
}
