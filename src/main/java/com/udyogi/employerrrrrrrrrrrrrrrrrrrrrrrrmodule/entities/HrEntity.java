package com.udyogi.employerrrrrrrrrrrrrrrrrrrrrrrrmodule.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class HrEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long hrId;
    private String hrName;
    private String email;
    private String hrPassword;
    private String hrMobile;
    private String hrDesignation;
    private String workLocation;
    private Boolean isHrActive;
    private Integer otp;
    @Lob
    private byte[] hrProfilePic;
    private String workExperience;
    @ManyToOne
    @JoinColumn(name = "employer_id")
    private EmployerAdmin employerAdmin;
}