package com.example.LibraryManagementSystem.Model;


import com.example.LibraryManagementSystem.Enum.CardStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Date;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class LibraryCard {

    @Id
    int id;
    String cardNo;
    CardStatus cardStatus;

    @CreatedDate
    Date issueDate;

}
