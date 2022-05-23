package com.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.employee.dto.EmployeeReuestDTO;
import com.employee.entity.Employee;
import com.employee.repository.employeeRepository;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/save")
	public String saveEmployee(@RequestBody EmployeeReuestDTO employeeReuestDTO) {
		return employeeService.saveEmployee(employeeReuestDTO);
		
	}
	@GetMapping("/viewAllEmployee")
	public List<Employee> viewEmployee() {
		return employeeService.viewAllEmployee();
	}
	@PutMapping("/updateEmployee/{empNumber}")
	public String updateEmployeeDetails(@PathVariable Integer empNumber,@RequestBody EmployeeReuestDTO employeeReuestDTO) {
		return employeeService.updateEmployee(empNumber, employeeReuestDTO);
	}
	
	@DeleteMapping("/deleteEmployee/{empNumber}")
	public String deleteEmployee(@PathVariable Integer empNumber) {
		// TODO Auto-generated method stub
		return employeeService.deleteEmployee(empNumber);
	}
	
	@GetMapping("/viewEmployee/{empNumber}")
	public Employee viewEmpoyee(Integer empNumber) {
		return employeeService.viewEmpoyee(empNumber);
	}

}
