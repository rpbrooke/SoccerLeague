package com.robin.models.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;

/**
 * Entity Class for Club table in relational database.
 * @param String clubName
 * @param List<Player> players
 *
 */


@Entity
@Table(name = "club")
public class Club {

    //Primary key value is auto-generated.
    @Id
    @JsonIgnore
    @GeneratedValue
    @Column(name = "club_id")
    private int clubId;

    @NotNull
    @Column(name = "club_name", unique = true)
    private String clubName;
    @NotNull
    @Column(name = "games_played")
    private int games;
    @NotNull
    @Column(name = "wins")
    private int wins;
    @NotNull
    @Column(name = "losses")
    private int losses;
    @NotNull
    @Column(name = "ties")
    private int ties;
    @NotNull
    @Column(name = "league_position")
    private int position;

    // Relationships with other Entity Classes.
    @OneToMany(mappedBy = "club")
    @JsonManagedReference
    private List<Player> players;
    @OneToMany(mappedBy = "homeClub")
    @JsonManagedReference
    private List<Match> homeGames;
    @OneToMany(mappedBy = "awayClub")
    @JsonManagedReference
    private List<Match> awayGames;

    public Club(String clubName, int games, int wins, int losses, int ties, int position, List<Player> players, List<Match> homeGames, List<Match> awayGames) {
        this.clubName = clubName;
        this.games = games;
        this.wins = wins;
        this.losses = losses;
        this.ties = ties;
        this.position = position;
        this.players = players;
        this.homeGames = homeGames;
        this.awayGames = awayGames;
    }

    public Club (){}

    public int getClubId() {
        return clubId;
    }

    public void setClubId(int clubId) {
        this.clubId = clubId;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Match> getHomeGames() {
        return homeGames;
    }

    public void setHomeGames(List<Match> homeGames) {
        this.homeGames = homeGames;
    }

    public List<Match> getAwayGames() {
        return awayGames;
    }

    public void setAwayGames(List<Match> awayGames) {
        this.awayGames = awayGames;
    }
}
