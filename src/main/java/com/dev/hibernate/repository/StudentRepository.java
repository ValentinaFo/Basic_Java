package com.dev.hibernate.repository;

import com.dev.hibernate.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StudentRepository extends CrudRepository<Student, Long> {
    @Override
    Optional<Student> findById(Long aLong);
}
