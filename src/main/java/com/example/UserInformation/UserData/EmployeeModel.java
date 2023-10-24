package com.example.UserInformation.UserData;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeModel {
    @NotBlank(message="name Required")
    @JsonProperty("name")
    private String name;
    @NotBlank(message="Designation Required")
    @JsonProperty("designation")
    private String designation;
    @NotNull(message="Salary Required")
    @JsonProperty("salary")
    private Integer salary;

    public EmployeeModel() {
    }

    public EmployeeModel(String name, String designation, Integer salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
}