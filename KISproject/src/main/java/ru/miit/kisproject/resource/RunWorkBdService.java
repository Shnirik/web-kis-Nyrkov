package ru.miit.kisproject.resource;

import ru.miit.kisproject.mapper.Student2Mapper;
import ru.miit.kisproject.model.DataStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import ru.miit.kisproject.model.Student2;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


@Service
public class RunWorkBdService {
    @Autowired
    Student2Mapper student2mapper ;

    @Autowired
    DataStorage dataStorage;

    @Scheduled(fixedDelay = 10 * 24 * 60 * 60000)
    void run() {
        List<Student2> student2List = student2mapper.selectAll();
        List<Student2> filteredvivsdAsoupPOperList = student2List.parallelStream().filter((kodOp) -> {
            return Objects.equals(kodOp.getName(), "steev");
        }).collect(Collectors.toList());
        dataStorage.getStudent2List().addAll(student2List);
    }
}
