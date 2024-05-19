package co.develhope.crudoperations.repositories;

import co.develhope.crudoperations.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}
