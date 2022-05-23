package com.employee.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dto.EmployeeReuestDTO;
import com.employee.entity.Employee;
import com.employee.repository.employeeRepository;
import com.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	employeeRepository employeeRepository;

	@Override
	public String saveEmployee(EmployeeReuestDTO employeeReuestDTO) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setEmpName(employeeReuestDTO.getEmpName());
		e.setEmpNumber(employeeReuestDTO.getEmpNumber());
		e.setEmpAddress(employeeReuestDTO.getEmpAddress());
		employeeRepository.save(e);
		return "Employee details save sucessfully";
	}

	@Override
	public List<Employee> viewAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public String updateEmployee(Integer empNumber,EmployeeReuestDTO employeeReuestDTO) {
		
		Employee e= employeeRepository.findByEmpNumber(empNumber);
		e.setEmpName(employeeReuestDTO.getEmpName());
		employeeRepository.save(e);
		return "employee details are updated";
		
		
	}

	@Override
	public String deleteEmployee(Integer empNumber) {
		// TODO Auto-generated method stub
		//employeeRepository.findByEmpNumber(empNumber);
		employeeRepository.deleteById(empNumber);
		return "employee details deleted";
	}

	@Override
	public Employee viewEmpoyee(Integer empNumber) {
		// TODO Auto-generated method stub
		return employeeRepository.findByEmpNumber(empNumber);
		
		
	}

	

}
