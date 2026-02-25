package manafleetplatform.repository.Abstractions;

import manafleetplatform.domain.Vehicles.Vehicle;
import manafleetplatform.domain.Vehicles.enums.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Repository interface for Vehicle persistence operations.
 * Extends JpaRepository to inherit standard CRUD operations.
 * Spring Data JPA automatically generates the implementation at runtime.
 */
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, UUID> {

    /**
     * Checks whether a vehicle with the given unit number already exists.
     * Used to guarantee uniqueness before persisting a new vehicle.
     *
     * @param unitNumber the unit number to check
     * @return true if a vehicle with this unit number exists
     */
    boolean existsByUnitNumber(String unitNumber);

    /**
     * Finds a vehicle by its human-readable unit number.
     *
     * @param unitNumber the unit number to search for
     * @return an Optional containing the vehicle if found, empty otherwise
     */
    Optional<Vehicle> findByUnitNumber(String unitNumber);

    /**
     * Finds a vehicle by its license plate.
     *
     * @param licensePlate the license plate to search for
     * @return an Optional containing the vehicle if found, empty otherwise
     */
    Optional<Vehicle> findByLicensePlate(String licensePlate);

    /**
     * Retrieves all vehicles with the given status.
     *
     * @param status the vehicle status to filter by
     * @return list of vehicles matching the given status
     */
    List<Vehicle> findAllByStatus(VehicleStatus status);
}
