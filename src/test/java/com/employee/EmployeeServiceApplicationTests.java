package com.employee;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.employee.entity.Employee;
import com.employee.repository.employeeRepository;

@SpringBootTest
class EmployeeServiceApplicationTests {

	@Autowired
	employeeRepository emp;
	
	@Test
	public void createviewEmpoyee() {
		Employee e=emp.findByEmpNumber(52028558);
		assertEquals("raja", e.getEmpName());
		
	}

}
