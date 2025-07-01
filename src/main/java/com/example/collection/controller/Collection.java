package com.example.collection.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class Collection {

    @GetMapping("/list")
    public List<String> getList() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); 
        return fruits;
    }

    @GetMapping("/set")
    public Set<String> getSet() {
        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("Jane");
        names.add("John"); 
        return names;
    }

    @GetMapping("/map")
    public Map<Integer, String> getMap() {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Arun");
        students.put(2, "Priya");
        students.put(3, "Arun");
        return students;
    }

    @GetMapping("/map/{id}")
    public String getStudentById(@PathVariable int id) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Arun");
        students.put(2, "Priya");
        students.put(3, "Arun");

        return students.getOrDefault(id, "Student Not Found");
    }
}
