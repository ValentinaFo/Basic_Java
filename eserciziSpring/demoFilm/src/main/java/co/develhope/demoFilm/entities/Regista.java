package co.develhope.demoFilm.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Regista {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private LocalDate dateOfBirth;

    @Column
    private String nationality;


    @OneToMany
    @JoinColumn(name = "Regista_id")
    private List<Film> films;

}
