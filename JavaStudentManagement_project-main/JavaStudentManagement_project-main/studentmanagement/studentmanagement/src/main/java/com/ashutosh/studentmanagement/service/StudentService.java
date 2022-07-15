package com.ashutosh.studentmanagement.service;

import com.ashutosh.studentmanagement.model.Student;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
