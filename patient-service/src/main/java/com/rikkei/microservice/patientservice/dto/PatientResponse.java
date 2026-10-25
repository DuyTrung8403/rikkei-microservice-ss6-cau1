package com.rikkei.microservice.patientservice.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientResponse {
    private Long id;
    private String fullName;
    private LocalDate dateOfBirth;
    private String gender;
    private String phoneNumber;
    private String address;
    private String medicalHistory;
}
