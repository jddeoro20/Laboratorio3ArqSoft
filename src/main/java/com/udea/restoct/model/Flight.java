package com.udea.restoct.model;

import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import java.io.Serializable;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Flight implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idflight")
    private Long idFlight;

    @Column(name = "nombreavion", nullable = false, length = 80)
    private @NonNull String nombreAvion;

    @Column(name = "numerovuelo", nullable = false, length = 80)
    private @NonNull String numeroVuelo;

    @Column(name = "origen", nullable = false, length = 80)
    private @NonNull String origen;

    @Column(name = "destino", nullable = false, length = 80)
    private @NonNull String destino;

    @Column(name = "capacidad", nullable = false)
    private int capacidad;

    @Column(name = "rating", nullable = false)
    @Min(value = 1, message = "Rating debe ser mínimo 1")
    @Max(value = 5, message = "Rating debe ser máximo 5")
    private int rating;

    @Column(name = "planvuelo", nullable = false)
    private long planvuelo;

    private Boolean cumplido;
}