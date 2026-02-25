package manafleetplatform.domain.Vehicles;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import manafleetplatform.domain.Vehicles.enums.VehicleStatus;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "vehicles")
@Getter
@Setter
@NoArgsConstructor

/*  */
public class Vehicle {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(updatable = false, nullable = false)
    private UUID Id;

    /**
     * Human-readable unit number in format MFXXXXX.
     * Auto-generated on creation, immutable afterwards.
     */
    @Column(name = "unit_number", nullable = false, unique = true, updatable = false)
    private String unitNumber;

    @Column(nullable = false, unique = true)
    private String licensePlate;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String model;

    private Integer year;

    private Double mileage;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private VehicleStatus status;

    private LocalDate lastMaintenanceDate;


}
