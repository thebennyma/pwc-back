/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pwc.web.controller;

import com.pwc.web.entity.People;
import com.pwc.web.service.PeopleService;
import java.util.List;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Laptop-149
 */
@RestController
@RequestMapping("/pwc-web/people")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    //Read an people
    @GetMapping("/{matricula}")
    public ResponseEntity<?> read(@PathVariable(value = "matricula") String PEOPLE_ID) {
        Optional<People> oPeople = peopleService.findById(PEOPLE_ID);

        if (!oPeople.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(oPeople);
    }

    //Read all people
    /* @GetMapping
    public List<People> readAll() {
        List<People> peoples = StreamSupport
                .stream(peopleService.findAll().spliterator(), false)
                .collect(Collectors.toList());
        return peoples;
    } */

    @GetMapping
    public Page<People> getStudents(
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "10") int size) {
        return peopleService.findAll(PageRequest.of(page, size));
    }
}
