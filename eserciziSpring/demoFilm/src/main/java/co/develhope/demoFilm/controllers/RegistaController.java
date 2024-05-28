package co.develhope.demoFilm.controllers;

import co.develhope.demoFilm.entities.Regista;
import co.develhope.demoFilm.services.RegistaService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/regista")
public class RegistaController {
    @Autowired
    private RegistaService registaService;


    @GetMapping("{id}")
    public ResponseEntity<?> getRegista(@PathVariable Long id){
        try {
            return ResponseEntity.ok().body(registaService.getRegistaById(id));
        } catch (EntityNotFoundException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @GetMapping
    public ResponseEntity<Iterable<Regista>> getAllRegista(){
        return ResponseEntity.ok(registaService.getAll());
    }
    @PostMapping
    public ResponseEntity<?> postRegista(@RequestBody Regista regista){
        return ResponseEntity.ok().body(registaService.postRegista(regista));
    }
    @PutMapping("{id}")
    public ResponseEntity<?> putRegista(@RequestBody Regista regista, @PathVariable Long id){

        try {
            return ResponseEntity.ok().body(registaService.updateRegista(regista,id));
        }catch(EntityNotFoundException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @DeleteMapping
    public ResponseEntity<String> deleteRegista(Long id){
        registaService.deleteRegistaById(id);
        return ResponseEntity.ok("Deleted");
    }

}
