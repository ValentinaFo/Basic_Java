package co.develhope.demoFilm.repositories;

import co.develhope.demoFilm.entities.Regista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistaRepo extends JpaRepository<Regista,Long> {
}
