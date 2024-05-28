package co.develhope.demoFilm.services;


import co.develhope.demoFilm.entities.Regista;
import co.develhope.demoFilm.repositories.RegistaRepo;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class RegistaService {
    @Autowired
    private RegistaRepo registaRepo;


//    public RegistaDTO createRegista(RegistaDTO registaDTOto){
//        Regista regista = registaMapper.toEntity(registaDTOto);
//        Regista registaSaved = registaRepo.save(regista);
//        return registaMapp.toDto(registaSaved);
//
//    }

    public Regista getRegistaById(Long id){
        Optional<Regista> optionalRegista = registaRepo.findById(id);
        if(optionalRegista.isPresent()){
            Regista regista = optionalRegista.get();
            return registaRepo.save(regista);
        }else{
            throw new EntityNotFoundException("Not found");
        }
    }

    public Iterable<Regista> getAll(){
       return registaRepo.findAll();
    }

    public Regista postRegista(Regista regista){
        return registaRepo.save(regista);
    }
    public Regista updateRegista(Regista regista, Long id){
        Optional <Regista> optionalRegista = registaRepo.findById(id);
        if(optionalRegista.isPresent()){
            Regista updated =  optionalRegista.get();
            updated.setName(regista.getName());
            updated.setNationality(regista.getNationality());
            updated.setDateOfBirth(regista.getDateOfBirth());
            return registaRepo.save(updated);
        }else{
            throw new EntityNotFoundException("Not found");
        }
    }
    public void deleteRegistaById(Long id){
        Optional<Regista> optionalRegista = registaRepo.findById(id);
        if(optionalRegista.isPresent()){
            Regista regista = optionalRegista.get();
            registaRepo.deleteById(id);
        }else{
            throw new EntityNotFoundException("Not found");
        }
    }
}



