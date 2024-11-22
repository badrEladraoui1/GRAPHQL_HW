package com.eladr.data_rest.repository;

import com.eladr.data_rest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student , Long> {
}
