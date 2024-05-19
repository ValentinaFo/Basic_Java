package co.develhope.crudoperations.controllers;

import co.develhope.crudoperations.entities.Car;
import co.develhope.crudoperations.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")

public class CarController {
    @Autowired
    private CarRepository carRepository;

    @PostMapping("/create")
    public Car create(@RequestBody Car car){
        Car carSaved = carRepository.saveAndFlush(car);
        return carSaved;
    }
    @GetMapping("/getAllCars")
    public List<Car> getAllCars(){
        List<Car> cars = carRepository.findAll();
        return cars;
    }
    @GetMapping("/{id}")
    public Car get1Car(@PathVariable Long id) {
        Car car = carRepository.getById(id);
        if (!carRepository.existsById(id)) {
            return new Car();
        } else{
            return car;
        }
    }
//    aggiorna type della Car specifica, identificata da id e
//    passando query param - se id non è presente in db (usa existsById()),
//    restituisce Car vuota

    @PutMapping("/{id}")
    public Car modifyType(@PathVariable long id, @RequestBody Car car){
        car.setId(id);
        Car modifiedCar = carRepository.saveAndFlush(car);
        if (!carRepository.existsById(id)) {
            return new Car();
        }else{
            return modifiedCar;
        }
    }
//    cancella la Car
//    specifica - se non presente, la risposta deve
//    avere Conflict HTTP status

    @DeleteMapping("/{id}")
    public void deleteOne(@PathVariable long id) throws Exception {
        if(carRepository.existsById(id)){
            carRepository.deleteById(id);
        }else{
            throw new Exception("Conflict HTTP status");
        }
    }

    @DeleteMapping("/deleteAll")
    public void deleteAll(){
        carRepository.deleteAll();
    }

}






