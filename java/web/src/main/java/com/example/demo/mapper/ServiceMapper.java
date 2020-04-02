/**
 * 
 */
package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.example.demo.domains.Employee;
import com.example.demo.domains.Service;

/**
 * @author yzhang44
 *
 */
public interface ServiceMapper {

	@Select("SELECT * FROM service WHERE serviceCode = #{serviceCode}")
	@Results(value = { @Result(property = "serviceCode", column = "serviceCode"),
			@Result(property = "serviceName", column = "serviceName"),
			@Result(property = "employees", javaType = List.class, column = "serviceCode", many = @Many(select = "getEmployeeByService")) })
	public Service getServiceByServiceCode(@Param("serviceCode") String serviceCode);

	@Select("SELECT * FROM employee WHERE serviceCode = #{serviceCode}")
	@Results({ @Result(property = "empId", column = "emp_Id"),
			@Result(property = "password", column = "password") })
	public List<Employee> getEmployeeByService(String serviceCode);

	@Select("SELECT * FROM service WHERE serviceCode = #{serviceCode}")
	public Service getServiceByCode(@Param("serviceCode") String serviceCode);

}
