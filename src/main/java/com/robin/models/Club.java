package com.robin.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "clubs")
public class Club {

    private Integer clubId;
    private String clubName;

    @Id
    @GeneratedValue
    @Column(name = "club_id")
    public Integer getClubId() {
        return clubId;
    }

    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    @ManyToOne
    @JoinColumn(name = "club_name")
    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }
}
