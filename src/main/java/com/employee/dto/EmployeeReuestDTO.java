package com.employee.dto;

public class EmployeeReuestDTO {
	
	private String empName;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public Integer getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(Integer empNumber) {
		this.empNumber = empNumber;
	}
	private String empAddress;
	private Integer empNumber;

}
