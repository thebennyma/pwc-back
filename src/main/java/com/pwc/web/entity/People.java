/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pwc.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Laptop-149
 */
@Entity
@Getter 
@Setter 
@NoArgsConstructor
public class People {
    
    @Id
    private String People_ID;
    
    private String FIRST_NAME;
    
    private String LAST_NAME;
    
    private String MIDDLE_NAME;
    
    private String NICKNAME;
    
}
