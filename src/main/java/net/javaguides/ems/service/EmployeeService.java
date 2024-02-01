package net.javaguides.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.javaguides.ems.dto.EmployeeDto;

public interface EmployeeService {
	
	@Autowired
	EmployeeDto createEmployee(EmployeeDto employeeDto);

	EmployeeDto getEmployeeById(Long employeeId);
	
	List<EmployeeDto> getAllEmployees();

	EmployeeDto updateEmployee(Long employeeId, EmployeeDto updateEmployee);
}
