package com.nest.nest_employee_appdb.controller;


import com.nest.nest_employee_appdb.dao.TaskDao;
import com.nest.nest_employee_appdb.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskDao tdao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addTask",consumes ="application/json" , produces ="application/json" )
    public HashMap<String,String> AddTask (@RequestBody Task t){
        tdao.save(t);
        HashMap<String,String> status=new HashMap<>();
        status.put("status","success");
        return status;
    }


    @CrossOrigin(origins = "*")
    @GetMapping("/viewTask")
    public List<Task> TaskList(){
        return (List<Task>) tdao.findAll();
    }
}