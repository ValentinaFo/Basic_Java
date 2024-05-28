package co.develhope.demoFilm.services;

import co.develhope.demoFilm.entities.Film;
import co.develhope.demoFilm.repositories.FilmRepo;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.internal.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FilmService {

    @Autowired
    private FilmRepo filmRepo;

    public Film createFilm(Film film){
        return filmRepo.save(film);
    }
    public Iterable<Film> getAllFilm(){
        return filmRepo.findAll();
    }
    public Film searchForId(Long id){
        Optional <Film> optionalFilm = filmRepo.findById(id);
        if(optionalFilm.isPresent()){
            Film film = optionalFilm.get();
            return filmRepo.save(film);
        }else{
            return null;

        }
    }
    public Film updateFilm(Film film, Long id) {
        Optional<Film> optionalFilm = filmRepo.findById(id);
        if (optionalFilm.isPresent()) {
            Film modifiedFilm = optionalFilm.get();
            modifiedFilm.setTitle(film.getTitle());
            modifiedFilm.setGenre(film.getGenre());
            modifiedFilm.setReleaseYear(film.getReleaseYear());
            return filmRepo.save(modifiedFilm);
        } else {
            return null;
        }
    }
    public void deleteFilm(Long id){
        Optional <Film> optionalFilm = filmRepo.findById(id);
        if(optionalFilm.isPresent()){
           Film film = optionalFilm.get();
           filmRepo.deleteById(id);
        }else{
            throw new EntityNotFoundException("Film non trovato");
        }

    }
    public void deleteAll(){
        filmRepo.deleteAll();
    }
}
