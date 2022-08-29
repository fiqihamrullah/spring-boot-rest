package com.learning.employeerestfulapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name = "hobby")
@JsonIgnoreProperties(value = { "id" })
@NoArgsConstructor
public class Hobby
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nama;

    @ManyToMany(mappedBy = "hobbies")
    @JsonIgnore
    private Collection<Employee> employees;

}
