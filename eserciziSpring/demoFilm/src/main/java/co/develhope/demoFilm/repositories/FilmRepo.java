package co.develhope.demoFilm.repositories;

import co.develhope.demoFilm.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepo extends JpaRepository<Film,Long> {
}
