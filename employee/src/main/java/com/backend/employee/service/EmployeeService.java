package com.backend.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.backend.employee.dto.EmployeeDTO;
import com.backend.employee.entity.Employee;
import com.backend.employee.mapper.EmployeeMapper;
import com.backend.employee.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepo;
    private final EmployeeMapper mapper;

    public Employee save(EmployeeDTO dto) {
        Employee emp = mapper.toEntity(dto);
        return employeeRepo.save(emp);
    }

    public List<Employee> getAll() {
        return employeeRepo.findAll();
    }

    public Optional<Employee> getById(Long id) {
        return employeeRepo.findById(id);
    }
}