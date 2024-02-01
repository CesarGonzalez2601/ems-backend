package net.javaguides.ems.service;

import org.springframework.beans.factory.annotation.Autowired;

import net.javaguides.ems.dto.EmployeeDto;

public interface EmployeeService {
	
	@Autowired
	EmployeeDto createEmployee(EmployeeDto employeeDto);

	EmployeeDto getEmployeeById(Long employeeId);
}
