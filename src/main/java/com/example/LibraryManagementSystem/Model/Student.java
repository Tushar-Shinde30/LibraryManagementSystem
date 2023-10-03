package com.example.LibraryManagementSystem.Model;


import com.example.LibraryManagementSystem.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)  //All parameter are set as a Private automatically with the help of this...
@Entity
@Table(name= "student_Info")      //Create a New Table with new name
public class Student {           //Model Class

    @Id        //Primary key
    //@GeneratedValue(strategy= GenerationType.IDENTITY)
    int regNo;
    @Column(name = "Student_name")    //Create a New column with new name
    String name;
    int age;
    String email;

    @Enumerated(EnumType.STRING)         //it is showing the 'MALE'.FEMALE','OTHER' rather than numbers...In the db i.e. the ENUM;
    Gender gender;
}
