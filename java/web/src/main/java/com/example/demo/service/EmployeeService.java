/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.domains.Employee;

/**
 * @author yzhang44
 *
 */
public interface EmployeeService {
	public Employee createEmployee(Employee emp);

	public Employee getEmployee(Long empId);

	public List<Employee> getAllEmployee();

	public Employee updateEmployee(Employee emp);

	public boolean deleteEmployee(Long empId);
}
