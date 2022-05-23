package com.employee.service;

import java.util.List;
import java.util.Optional;

import com.employee.dto.EmployeeReuestDTO;
import com.employee.entity.Employee;

public interface EmployeeService {
	
	public String saveEmployee(EmployeeReuestDTO employeeReuestDTO);
	public List<Employee> viewAllEmployee();
	public String updateEmployee(Integer empNumber,EmployeeReuestDTO employeeReuestDTO);
	public String deleteEmployee(Integer empNumber);
	public Employee viewEmpoyee(Integer empNumber);

}
