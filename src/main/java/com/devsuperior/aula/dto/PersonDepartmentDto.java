package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Person;

public class PersonDepartmentDto {
    private Long id;
    private String name;
    private Double salary;
    private DepartmentDto department;

    public PersonDepartmentDto(Long id, String name, Double salary, DepartmentDto department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public PersonDepartmentDto(Person entity) {
        id = entity.getId();
        name = entity.getName();
        salary = entity.getSalary();
        department = new DepartmentDto(entity.getDepartment());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getsalary() {
        return salary;
    }

    public DepartmentDto getDepartment() {
        return department;
    }

}
