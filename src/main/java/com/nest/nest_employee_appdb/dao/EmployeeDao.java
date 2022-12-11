package com.nest.nest_employee_appdb.dao;

import com.nest.nest_employee_appdb.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
    @Query(value = "SELECT `id`, `designation`, `code`, `email`, `mobile`, `name`, `password`, `username` FROM `employee` WHERE `username` = :username AND `password` = :password",nativeQuery = true)
    List<Employee> UserLogin(@Param("username") String username, @Param("password") String password);

    @Query(value = "SELECT `id`, `designation`, `code`, `email`, `mobile`, `name`, `password`, `username` FROM `employee` WHERE `name` LIKE %:name%",nativeQuery = true)
    List<Employee> SearchEmp(@Param("name")String ename);
}
