/**
 * 
 */
package com.example.demo.dao;

import java.util.List;

import com.example.demo.domains.Employee;

/**
 * @author yzhang44
 *
 */
public interface EmployeeDao {
	public Employee getEmployee(Long empId);

	public List<Employee> getAllEmployee();

	public Employee updateEmployee(Employee emp);

	public boolean deleteEmployee(Long empId);

	public Employee createEmployee(Employee emp);
}
