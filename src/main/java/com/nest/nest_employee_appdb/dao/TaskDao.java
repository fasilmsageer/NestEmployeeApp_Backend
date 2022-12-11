package com.nest.nest_employee_appdb.dao;


import com.nest.nest_employee_appdb.model.Task;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskDao extends CrudRepository<Task,Integer> {
    @Query(value = "SELECT `id`, `completiondate`, `description`, `emp_id`, `givendate`, `status`, `title` FROM `task` WHERE `emp_id` = :empId ORDER BY `givendate` ASC",nativeQuery = true)
    List<Task> GetTask(@Param("empId")Integer empId);



    @Modifying
    @Transactional
    @Query(value = "UPDATE `task` SET `completiondate`= :completiondate,`status`= :status WHERE `id` = :id",nativeQuery = true)
    void StatusUpdate(@Param("id") Integer id, @Param("status")String status , @Param("completiondate")String completiondate);
}
