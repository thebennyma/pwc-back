/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pwc.web.service;

import com.pwc.web.entity.People;
import com.pwc.web.repository.PeopleRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Laptop-149
 */
@Service
public class PeopleServiceImpl implements PeopleService {
    
    @Autowired
    private PeopleRepository peopleRepository;

    @Override
    @Transactional(readOnly = true)
    public Iterable<People> findAll() {
        return peopleRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<People> findAll(Pageable pageable) {
        return peopleRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<People> findById(String PEOPLE_ID) {
        return peopleRepository.findById(PEOPLE_ID);
    }

}
