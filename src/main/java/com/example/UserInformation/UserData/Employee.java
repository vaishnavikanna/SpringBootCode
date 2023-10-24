package com.example.UserInformation.UserData;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.GenerationType.AUTO;

@Getter
@Setter
@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="designation")
    private String designation;
    @Column(name="salary")
    private Integer salary;

    public Employee() {
    }

    public Employee(String name, String designation, Integer salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
}
