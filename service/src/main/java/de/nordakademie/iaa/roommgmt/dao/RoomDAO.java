package de.nordakademie.iaa.roommgmt.dao;

import de.nordakademie.iaa.roommgmt.model.Room;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * JPA-based data access object for the room entity.
 *
 * @author Stephan Anft
 */
public class RoomDAO {

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * Returns the room with the given identifier.
     * @param id The room's identifier.
     * @return a room or {@code null} if there is no existing room with this identifier.
     */
    public Room load(Long id) {
        return entityManager.find(Room.class, id);
    }

    /**
     * Returns all rooms.
     *
     * @return a list of rooms.
     */
    @SuppressWarnings("unchecked")
    public List<Room> findAll() {
        return entityManager.createQuery("select room from Room room").getResultList();
    }

    /**
     * Saves the given room.
     *
     * @param room The room to be saved.
     */
    public void save(Room room) {
        if (room.getId() == null) {
            entityManager.persist(room);
        } else {
            entityManager.merge(room);
        }
    }

    /**
     * Deletes the given room.
     * @param room The room to be deleted.
     */
    public void delete(Room room) {
        entityManager.remove(room);
    }
}
