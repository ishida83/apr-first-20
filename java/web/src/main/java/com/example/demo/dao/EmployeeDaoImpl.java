/**
 * 
 */
package com.example.demo.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.domains.Employee;
import com.example.demo.mapper.EmployeeMapper;

/**
 * @author yzhang44
 *
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private static Logger logger = LoggerFactory.getLogger(EmployeeDaoImpl.class);

	@Autowired
	EmployeeMapper employeeMapper;

	@Override
	public Employee createEmployee(Employee emp) {
		int newEmpId = employeeMapper.createEmployee(emp);
		return getEmployee(emp.getEmpId());
	}

	@Override
	public Employee getEmployee(Long empId) {
		return employeeMapper.getEmployee(empId);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeMapper.getAllEmployee();
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		employeeMapper.updateEmployee(emp);
		return getEmployee(emp.getEmpId());
	}

	@Override
	public boolean deleteEmployee(Long empId) {
		return employeeMapper.deleteEmployee(empId);
	}

}
