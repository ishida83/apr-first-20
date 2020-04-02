/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.domains.Employee;

/**
 * @author yzhang44
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	private static Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Autowired
	EmployeeDao empDao;

	@Override
	public Employee createEmployee(Employee emp) {
		return empDao.createEmployee(emp);
	}

	@Override
	public Employee getEmployee(Long empId) {
		return empDao.getEmployee(empId);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return empDao.getAllEmployee();
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		return empDao.updateEmployee(emp);
	}

	@Override
	public boolean deleteEmployee(Long empId) {
		return empDao.deleteEmployee(empId);
	}

}
