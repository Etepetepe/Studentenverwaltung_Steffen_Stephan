package de.nordakademie.iaa.roommgmt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * The room resource.
 *
 * @author Stephan Anft
 */
@Entity
public class Room {
    private Long id;
    private String building;
    private String roomNumber;
    private Integer seats;
    private Boolean beamerPresent;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (!building.equals(room.building)) return false;
        if (!roomNumber.equals(room.roomNumber)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = building.hashCode();
        result = 31 * result + roomNumber.hashCode();
        return result;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(nullable = false)
    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    @Column(nullable = false)
    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Boolean getBeamerPresent() {
        return beamerPresent;
    }

    public void setBeamerPresent(Boolean beamerPresent) {
        this.beamerPresent = beamerPresent;
    }

}
