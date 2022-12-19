package ru.miit.kisproject.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataStorage {
    private final List<Student2> student2List = new ArrayList<>();

    public List<Student2> getStudent2List() {
        return student2List;
    }

}
