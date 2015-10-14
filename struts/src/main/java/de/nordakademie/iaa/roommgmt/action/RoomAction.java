package de.nordakademie.iaa.roommgmt.action;

import com.opensymphony.xwork2.ActionSupport;
import de.nordakademie.iaa.roommgmt.model.Room;
import de.nordakademie.iaa.roommgmt.service.RoomService;

/**
 * Struts action for Room-based CRUD operations.
 * @author Stephan Anft
 */
public class RoomAction extends ActionSupport {

    /** The room service. */
    private RoomService roomService;

    /** The room currently edited. */
    private Room room;

    /** The room's identifier. */
    private Long roomId;

    /**
     * Loads the room with the current identifier.
     * @return the Struts outcome.
     */
    public String loadRoom() {
        room = roomService.loadRoom(roomId);
        return SUCCESS;
    }

    /**
     * Saves the room currently edited.
     * @return the Struts outcome.
     */
    public String saveRoom() {
        roomService.saveRoom(room);
        return SUCCESS;
    }

    /**
     * Deletes the room with the current identifier.
     * @return the Struts outcome.
     */
    public String deleteRoom() {
        roomService.deleteRoom(roomId);
        return SUCCESS;
    }

    public void setRoomService(RoomService roomService) {
        this.roomService = roomService;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }
}
