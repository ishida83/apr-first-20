package com.example.demo;

import java.util.List;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domains.Employee;
import com.example.demo.domains.Service;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.mapper.ServiceMapper;
import com.example.demo.service.EmployeeService;

@SpringBootApplication
@RestController
@MappedTypes({ Service.class, Employee.class })
@MapperScan("com.example.demo.mapper")
public class DemoApplication {

	@Autowired
	EmployeeService empService;

	@Autowired
	EmployeeMapper empMapper;

	@Autowired
	ServiceMapper serviceMapper;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@RequestMapping(value = "/employee/{empId}", method = RequestMethod.GET)
	public Employee getEmplyee(@PathVariable Long empId) {
		return empService.getEmployee(empId);
	}

	@GetMapping("/service/{serviceCode}")
	public Service getDepartmentByCode(@PathVariable String serviceCode) {
		Service service = serviceMapper.getServiceByServiceCode(serviceCode);
		return service;
	}

	@GetMapping("/employee-service-subscription/{serviceCode}")
	public List<Employee> getEmployeeByService(@PathVariable String serviceCode) {
		return empMapper.getEmployeeByService(serviceCode);
	}

}
