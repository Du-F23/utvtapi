package com.duarte.UTVT.users.repositories;

import com.duarte.UTVT.users.models.Student;
import com.duarte.UTVT.users.models.dto.StudentDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    public Optional<StudentDto> findByName(String name);

    public List<StudentDto> findByNameContaining(String name);
}