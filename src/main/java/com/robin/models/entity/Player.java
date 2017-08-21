package com.robin.models.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Entity Class for Player table in relational database.
 * @param String playerName
 * @param int playerNumber
 * @param Club club
 *
 */

@Entity
@Table(name = "player")
public class Player {

    //Primary key value is auto-generated.
    @Id
    @JsonIgnore
    @GeneratedValue
    @Column(name="player_id", unique = true)
    private int playerId;

    @NotNull
    @Column(name = "player_name")
    private String playerName;
    @Column(name = "player_number")
    private int playerNumber;

    //Relationships with other Entity Classes
    @ManyToOne
    @JoinColumn(name = "club_id", referencedColumnName = "club_id")
    @JsonBackReference
    private Club club;

    public Player(String playerName, int playerNumber, Club club) {
        this.playerName = playerName;
        this.playerNumber = playerNumber;
        this.club = club;
    }

    public Player(){}

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }
}
