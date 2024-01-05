package com.devsuperior.aula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.aula.dto.PersonDepartmentDto;
import com.devsuperior.aula.entities.Department;
import com.devsuperior.aula.entities.Person;
import com.devsuperior.aula.repositories.DepartmentRepository;
import com.devsuperior.aula.repositories.PersonRepository;

@Service
public class PersonService {
    @Autowired
    private PersonRepository repository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public PersonDepartmentDto insert(PersonDepartmentDto dto) {
        Person person = new Person();

        person.setName(dto.getName());
        person.setSalary(dto.getsalary());

        // Entidade Gerenciada
        Department dep = departmentRepository.getReferenceById(dto.getDepartment().getId());
        person.setDepartment(dep);

        person = repository.save(person);

        return new PersonDepartmentDto(person);

    }
}
