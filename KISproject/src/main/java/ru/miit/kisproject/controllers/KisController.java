package ru.miit.kisproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.miit.kisproject.model.DataStorage;
import ru.miit.kisproject.model.Student2;

import java.util.List;


@RestController
@RequestMapping("/kis")
public class KisController {

    @Autowired
    DataStorage dataStorage;

    @GetMapping(value = "/student", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student2> getSysOptions(){
        return dataStorage.getStudent2List();
    }
}
