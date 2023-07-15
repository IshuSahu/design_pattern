package com.example.StudentMicroservices1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;



@RestController
public class StudentController {
    @Autowired
    com.example.StudentMicroservices1.StudentRepository studentRepository;

    @GetMapping("/getmessagebypath/{studentName}")
    public String getMessageByPath(@PathVariable String studentName){
        return "Hello " + studentName + ".";
    }

    @GetMapping("/getmessagebybody")
    public String getMessageByBody(@RequestBody String studentName){
        return "Hello " + studentName + ".";
    }

    @PostMapping("/createstudentdata")
    public Student createStudent(@RequestBody Student studentData){
        return studentRepository.save(studentData);
    }
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
        Student student = studentRepository.findById(id).orElse(null);
        if (student != null) {
            return ResponseEntity.ok(student);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PutMapping("/updatestudent/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable int id, @RequestBody Student studentData) {
        if (studentRepository.existsById(id)) {
            studentData.setStu_id(id);
            Student updatedStudent = studentRepository.save(studentData);
            return ResponseEntity.ok(updatedStudent);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PatchMapping("/updatestudentpatch/{id}")
    public ResponseEntity<Student> updateStudentPatch(@PathVariable int id, @RequestBody Student student) {
        Optional <Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            Student existingStudent = optionalStudent.get();
            existingStudent.setAddress(student.getAddress());
//            existingStudent.setName(student.getName());
//            existingStudent.setMarks(student.getMarks());
            studentRepository.save(existingStudent);
            return ResponseEntity.ok(existingStudent);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/students/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
w
    @GetMapping("/getMsg/{studentName}")
    public String getGreetings(@PathVariable String studentName) {
        Date date = new Date();
        String greeting = null;
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
        String currentTime = time.format(date);
        SimpleDateFormat hour = new SimpleDateFormat("hh");
        SimpleDateFormat ampm = new SimpleDateFormat("aa");
        int hh = Integer.parseInt(hour.format(date));
        String aa = ampm.format(date);

        if ((hh >= 4 && hh < 12) && (aa.equals("AM"))) {
            greeting = "Good morning ";
        } else if ((hh >= 12 || hh < 4) && (aa.equals("PM"))) {
            greeting = "Good afternoon ";
        } else if ((hh >= 4 && hh < 8) && (aa.equals("PM"))) {
            greeting = "Good evening ";
        } else if ((hh >= 8 || hh < 4) && (aa.equals("PM")) || (hh >= 8 || hh < 4) && (aa.equals("AM"))) {
            greeting = "Good night ";
        } else {
            greeting = "Its mid night ";
        }
        return greeting + " " + studentName + " Time : " + currentTime;
    }

    @GetMapping("/distintstudent")
    public List<Student> distinctStudent() {
        return studentRepository.getDistinctStudents();
    }


}
