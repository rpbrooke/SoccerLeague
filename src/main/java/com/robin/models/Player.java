package com.robin.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "players")
public class Player {

    private String playerName;
    private Integer playerNumber;
    private Integer clubId;

    public Player(String playerName, Integer playerNumber, Integer clubId){
        this.playerName = playerName;
        this.playerNumber = playerNumber;
        this.clubId = clubId;
    }

    public Player(){}

    @Id
    @NotNull
    @Column(name = "player_name", unique = true)
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @Column(name = "player_number")
    public Integer getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(Integer playerNumber) {
        this.playerNumber = playerNumber;
    }

    @ManyToOne
    @JoinColumn(name = "club_id")
    public Integer getClubId() {
        return clubId;
    }

    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }
}
