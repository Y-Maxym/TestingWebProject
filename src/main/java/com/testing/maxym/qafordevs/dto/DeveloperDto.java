package com.testing.maxym.qafordevs.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.testing.maxym.qafordevs.entity.DeveloperEntity;
import com.testing.maxym.qafordevs.entity.Status;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeveloperDto {
    private Integer id;
    private String email;
    private String firstName;
    private String lastName;
    private String specialty;
    private Status status;

    public DeveloperEntity toEntity() {
        return DeveloperEntity.builder()
                .id(id)
                .email(email)
                .firstName(firstName)
                .lastName(lastName)
                .specialty(specialty)
                .status(status)
                .build();
    }

    public static DeveloperDto fromEntity(DeveloperEntity entity) {
        return DeveloperDto.builder()
                .id(entity.getId())
                .email(entity.getEmail())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .specialty(entity.getSpecialty())
                .status(entity.getStatus())
                .build();
    }
}
