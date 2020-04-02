/**
 * 
 */
package com.example.demo.domains;

/**
 * @author yzhang44
 *
 */
public class Employee {
	private String name;

	private Long empId;

	private String serviceCode;

	private String password;

	public Employee() {
		super();
	}

	public Employee(String name, Long empId, String serviceCode, String password) {
		super();
		this.name = name;
		this.empId = empId;
		this.serviceCode = serviceCode;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + empId + ", serviceCode=" + serviceCode + ", password="
				+ password + "]";
	}
}
