/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learning.employeerestfulapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Fiqih Leonhart
 */
@Entity
@Table(name = "employee")
public class Employee 
{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id")
        private Long id;
        
        @Column(name="first_name")
        private String firstName;
        
        @Column(name="last_name")
        private String lastName;
        
        @Column(name="email_id")
        private String emailId;

        public void setFirstName(String firstName) 
        {
            this.firstName = firstName;
        }

        public String getFirstName()
        {
            return firstName;          
        }

        public void setLastName(String lastName) 
        {
            this.lastName = lastName;
        }       
        

        public String getLastName()
        {
            return lastName;
        }

        public void setEmailId(String emailId) 
        {
            this.emailId = emailId;
        }

        public String getEmailId() 
        {
            return emailId;
        }
        
        
        
        
        
        
        
        
        
        
        
}
