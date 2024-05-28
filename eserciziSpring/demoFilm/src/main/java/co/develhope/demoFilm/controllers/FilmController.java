package co.develhope.demoFilm.controllers;

import co.develhope.demoFilm.entities.Film;
import co.develhope.demoFilm.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/film")
public class FilmController {
    @Autowired
    private FilmService filmService;


    @GetMapping
    public ResponseEntity<Iterable<Film>> getAllFilm(){
        return ResponseEntity.ok(filmService.getAllFilm());

    }

    @GetMapping("{id}")
    public ResponseEntity<?>getById(@PathVariable Long id){
        return ResponseEntity.ok().body(filmService.searchForId(id));
    }
    @PostMapping
    public ResponseEntity<?>createFilm(@RequestBody Film film){
        return ResponseEntity.ok().body(filmService.createFilm(film));
    }
    @PutMapping
    public ResponseEntity<?>updateFilm(@PathVariable Long id, @RequestBody Film film){
        return ResponseEntity.ok().body(filmService.updateFilm(film,id));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<?>deleteById(@PathVariable Long id){
       filmService.deleteFilm(id);
       return ResponseEntity.ok("Film eliminato");
    }
    @DeleteMapping
    public ResponseEntity<?>deleteAll(){
        filmService.deleteAll();
        return ResponseEntity.ok("Tutti i film sono stati eliminati");
    }

}
