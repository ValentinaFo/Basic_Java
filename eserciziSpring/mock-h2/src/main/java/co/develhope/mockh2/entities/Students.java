package co.develhope.mockh2.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String fullName;
    @Column(unique = true, nullable = false)
    private String email;


}
