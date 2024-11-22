package com.eladr.data_rest.contorller;

import com.eladr.data_rest.entity.Centre;
import com.eladr.data_rest.entity.Student;
import com.eladr.data_rest.repository.CentreRepo;
import com.eladr.data_rest.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentController {

    // get all students
    // get all centers
    // get center by id
    // get student by id
    @Autowired
    StudentRepo studentRepo;
    @Autowired
    CentreRepo centreRepo;

    public StudentController(StudentRepo studentRepo, CentreRepo centreRepo) {
        this.studentRepo = studentRepo;
        this.centreRepo = centreRepo;
    }

    @QueryMapping
    public Student getStudentById(@Argument Long id){
        return  studentRepo.findById(id).orElseThrow( () ->
                new RuntimeException(String.format("no student found by this id :" + id)));
    }

    @QueryMapping
    public List<Student> getAllStudents(){
        return  studentRepo.findAll();
    }

    @QueryMapping
    public List<Centre> getAllCenters(){
        return  centreRepo.findAll();
    }

    @QueryMapping
    public Centre getCentreById(@Argument Integer id){
        return  centreRepo.findById(id).orElseThrow( () ->
                new RuntimeException(String.format("no center found by this id :" + id)));
    }



}
