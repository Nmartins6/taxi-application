package dev.nicolasmartins.taxi.application.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long vehicleId;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false, unique = true)
    private String licensePlate;

    @Column(nullable = false)
    private int year;

    @Column(name = "km_otal", nullable = false)
    private Double kmTotal = 0.0;

    @ManyToMany
    @JoinColumn(name = "driver_id", nullable = false)
    private User driver;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();
}
