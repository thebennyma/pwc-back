/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pwc.web.service;

import com.pwc.web.entity.People;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author Laptop-149
 */
public interface PeopleService {
    
    public Iterable<People> findAll();
    
    public Page<People> findAll(Pageable pageable);
    
    public Optional<People> findById(String PEOPLE_ID);
    
    
}
