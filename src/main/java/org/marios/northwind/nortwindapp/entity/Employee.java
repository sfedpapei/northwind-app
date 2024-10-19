package org.marios.northwind.nortwindapp.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmployeeID")
    @Setter(AccessLevel.NONE)
    private Integer employeeId;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "BirthDate")
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate birthDate;

    @Column(name = "Photo")
    private String photo;

    @Column(name = "Notes")
    private String notes;

    @PostPersist
    void onCreate() {
        this.photo = "EmpID" + this.employeeId +".pic";
    }
}
