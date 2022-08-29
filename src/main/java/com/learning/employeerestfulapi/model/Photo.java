package com.learning.employeerestfulapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Data
@Entity
@Table(name="photo")
@NoArgsConstructor
public class Photo
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String url;


     @OneToOne(mappedBy = "photo")
     @JsonBackReference
     private Employee employee;



}
