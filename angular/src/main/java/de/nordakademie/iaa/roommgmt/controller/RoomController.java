package de.nordakademie.iaa.roommgmt.controller;

import de.nordakademie.iaa.roommgmt.model.Room;
import de.nordakademie.iaa.roommgmt.service.RoomService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

/**
 * REST controller for the room service.
 *
 * @author Stephan Anft
 */
@RestController
public class RoomController {

    /**
     * The room service.
     */
    private RoomService roomService;

    /**
     * Loads and returns a single room by given identifier.
     *
     * @param id The room's identifier.
     * @return a room or {@code null} if no room was found.
     */
    @RequestMapping(value = "/rooms/{id}", method = RequestMethod.GET)
    public Room loadRoom(@PathVariable Long id) {
        return roomService.loadRoom(id);
    }

    /**
     * List all existing rooms.
     *
     * @return the list of rooms.
     */
    @RequestMapping(value = "/rooms", method = RequestMethod.GET)
    public List<Room> listRooms() {
        return roomService.loadAllRooms();
    }

    /**
     * Saves the given room.
     *
     * @param room The room to be saved.
     * @return the updated room object.
     */
    @RequestMapping(value = "/rooms", method = RequestMethod.PUT)
    public Room saveRoom(@RequestBody Room room) {
        roomService.saveRoom(room);
        return room;
    }

    /**
     * Deletes the room with the given identifier.
     *
     * @param id The room's identifier.
     */
    @RequestMapping(value = "/rooms/{id}", method = RequestMethod.DELETE)
    public void deleteRoom(@PathVariable Long id) {
        roomService.deleteRoom(id);
    }

    @Inject
    public void setRoomService(RoomService roomService) {
        this.roomService = roomService;
    }
}
