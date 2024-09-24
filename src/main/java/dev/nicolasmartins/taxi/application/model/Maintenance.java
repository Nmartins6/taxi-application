package dev.nicolasmartins.taxi.application.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "maintenance")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maintenanceId;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = false)
    private String description;

    @Column(nullable = false)
    private Double cost;

    @Column(nullable = false)
    private LocalDateTime date = LocalDateTime.now()
}
