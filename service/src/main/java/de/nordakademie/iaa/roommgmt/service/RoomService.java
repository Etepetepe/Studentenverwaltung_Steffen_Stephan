package de.nordakademie.iaa.roommgmt.service;

import de.nordakademie.iaa.roommgmt.model.Room;

import java.util.List;

/**
 * Public interface of the room service.
 * @author Stephan Anft
 */
public interface RoomService {

    /**
     * Loads the room with the given identifier.
     * @param id The identifier.
     * @return a room or {@code null} if no matching room was found.
     */
    Room loadRoom(Long id);

    /**
     * Loads and returns all room entities in the database.
     * @return a list of rooms.
     */
    List<Room> loadAllRooms();

    /**
     * Saves the given room.
     * @param room The room to be saved.
     */
    void saveRoom(Room room);

    /**
     * Deletes the given room.
     * @param room The room to be deleted.
     */
    void deleteRoom(Room room);

    /**
     * Deletes the room with the given identifier.
     * @param id The identifier.
     */
    void deleteRoom(Long id);
}
