package com.robin.models.dto;

public class PlayerDTO {

	private String playerName;
	private int playerNumber;
	private String clubName;
	
	public PlayerDTO() {}
	
	public PlayerDTO(String playerName, int playerNumber, String clubName) {
		super();
		this.playerName = playerName;
		this.playerNumber = playerNumber;
		this.clubName = clubName;
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
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	
	@Override
	public String toString() {
		return "PlayerDTO [playerName=" + playerName + ", playerNumber=" + playerNumber + ", clubName=" + clubName
				+ "]";
	}
	
}
