package dev.nicolasmartins.taxi.application.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "revenues")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Revenue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long revenueId;

    @ManyToOne
    @JoinColumn(name = "ride_id", nullable = false)
    private Ride ride;

    @Column(nullable = false)
    private Double amount;

    @Column(nullable = false)
    private LocalDateTime date = LocalDateTime.now();
}
