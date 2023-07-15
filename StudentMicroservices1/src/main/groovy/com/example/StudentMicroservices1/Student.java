package com.example.StudentMicroservices1;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Stu_id;

    @NotNull
    private String Stu_name;

    @NotNull
    private String Branch;

    @NotNull
//    @Column(name = "address")
    private String Address;
    @NotNull
    private double Marks;
}
