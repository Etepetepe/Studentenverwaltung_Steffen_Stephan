package de.nordakademie.iaa.roommgmt.service;

import de.nordakademie.iaa.roommgmt.dao.RoomDAO;
import de.nordakademie.iaa.roommgmt.model.Room;

import javax.inject.Inject;
import java.util.List;

/**
 * The room service's implementation.
 * @author Stephan Anft
 */
public class RoomServiceImpl implements RoomService {

    /** The room data access object. */
    private RoomDAO roomDAO;

    @Override
    public Room loadRoom(Long id) {
        return roomDAO.load(id);
    }

    @Override
    public List<Room> loadAllRooms() {
        return roomDAO.findAll();
    }

    @Override
    public void saveRoom(Room room) {
        roomDAO.save(room);
    }

    @Override
    public void deleteRoom(Room room) {
        roomDAO.delete(room);
    }

    @Override
    public void deleteRoom(Long id) {
        Room room = roomDAO.load(id);
        if (room != null) {
            roomDAO.delete(room);
        }
    }

    @Inject
    public void setRoomDAO(RoomDAO roomDAO) {
        this.roomDAO = roomDAO;
    }
}
