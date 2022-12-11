package com.nest.nest_employee_appdb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String description;
    private String status;
    private String givendate;
    private String completiondate;
    private int empId;

    public Task(){}

    public Task(int id, String title, String description, String status, String givendate, String completiondate, int empId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.givendate = givendate;
        this.completiondate = completiondate;
        this.empId = empId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGivendate() {
        return givendate;
    }

    public void setGivendate(String givendate) {
        this.givendate = givendate;
    }

    public String getCompletiondate() {
        return completiondate;
    }

    public void setCompletiondate(String completiondate) {
        this.completiondate = completiondate;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}