package com.robin.models.dto;

import java.util.List;

public class ClubDTO {

	private String clubName;
	private List<String> players;
	
	public ClubDTO() {}
	
	public ClubDTO(String clubName, List<String> players) {
		this.clubName = clubName;
		this.players = players;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public List<String> getPlayers() {
		return players;
	}
	public void setPlayers(List<String> players) {
		this.players = players;
	}
	@Override
	public String toString() {
		return "ClubDTO [clubName=" + clubName + ", players=" + players + "]";
	}
	
}
