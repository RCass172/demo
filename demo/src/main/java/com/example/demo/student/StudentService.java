package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student("Ruth",
                        LocalDate.of(1989, 02, 17),
                        "email@e.com",
                        33)
        );
    }
}
