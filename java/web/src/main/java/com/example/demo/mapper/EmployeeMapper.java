/**
 * 
 */
package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.domains.Employee;


/**
 * @author yzhang44
 *
 */
public interface EmployeeMapper {

	@Insert("insert into employee(name, emp_Id, serviceCode, password) values (#{name}, null, #{serviceCode}, #{password})")
	@Options(useGeneratedKeys = true, keyProperty = "empId")
	public int createEmployee(Employee emp);

	@Select("SELECT * FROM employee WHERE emp_Id = #{empId}")
	@Results({ @Result(property = "empId", column = "emp_Id"),
			@Result(property = "password", column = "password") })
	public Employee getEmployee(@Param("empId") Long empId);

	@Select("select * from employee")
	@Results({ @Result(property = "empId", column = "emp_Id"),
			@Result(property = "password", column = "password") })
	public List<Employee> getAllEmployee();

	@Update("update employee set name=#{name}, emp_Id=#{empId}, serviceCode=#{serviceCode},password=#{password} where emp_Id=#{empId}")
	public int updateEmployee(Employee emp);

	@Delete("delete from employee where emp_Id=#{empId} ")
	public boolean deleteEmployee(@Param("empId") Long empId);

	@Select("SELECT * FROM employee WHERE serviceCode = #{serviceCode}")
	@Results({ @Result(property = "empId", column = "emp_Id"),
			@Result(property = "password", column = "password") })
	public List<Employee> getEmployeeByService(String serviceCode);
}
