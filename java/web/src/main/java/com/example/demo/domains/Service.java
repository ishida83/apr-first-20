/**
 * 
 */
package com.example.demo.domains;

import java.util.List;

/**
 * @author yzhang44
 *
 */
public class Service {
	private String serviceCode;

	private String serviceName;

	private List<Employee> employees;

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Service Subscription [serviceCode=" + serviceCode + ", serviceName=" + serviceName + ", employees=" + employees
				+ "]";
	}
}
