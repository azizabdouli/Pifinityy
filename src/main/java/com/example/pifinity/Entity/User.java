package com.example.pifinity.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter

public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String firstName;
    private String lastName;
    private String email ;
    private String Password;
    private long numTel;
    private Date BirthDate;
    private String Nationality;

    @JsonIgnore

    @OneToMany
    private List<Reclamation> reclamations;


}
