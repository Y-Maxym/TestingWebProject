package com.testing.maxym.qafordevs.repository;

import com.testing.maxym.qafordevs.entity.DeveloperEntity;
import com.testing.maxym.qafordevs.entity.Status;
import com.testing.maxym.qafordevs.repositoty.DeveloperRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class DeveloperRepositoryTests {

    @Autowired
    private DeveloperRepository developerRepository;

    @BeforeEach
    public void setUp() {
        developerRepository.deleteAll();
    }

    @Test
    @DisplayName("Test save developer functionality")
    public void givenDeveloperObject_whenSave_thenDeveloperIsCreated() {
        // given
        DeveloperEntity developerToSave = DeveloperEntity.builder()
                .firstName("John")
                .lastName("Doe")
                .email("john.doe@example.com")
                .specialty("Java")
                .status(Status.ACTIVE)
                .build();
        // when
        DeveloperEntity savedDeveloper = developerRepository.save(developerToSave);
        // then
        assertThat(savedDeveloper).isNotNull();
        assertThat(savedDeveloper.getId()).isNotNull();
    }

    @Test
    @DisplayName("Test update developer functionality")
    public void givenDeveloperToUpdate_whenSave_thenEmailIsChanged() {
        // given
        String updatedEmail = "updated@example.com";
        DeveloperEntity developerToSave = DeveloperEntity.builder()
                .firstName("John")
                .lastName("Doe")
                .email("john.doe@example.com")
                .specialty("Java")
                .status(Status.ACTIVE)
                .build();
        developerRepository.save(developerToSave);
        // when
        DeveloperEntity developerToUpdate = developerRepository.findById(developerToSave.getId())
                .orElse(null);
        developerToUpdate.setEmail(updatedEmail);
        DeveloperEntity updatedDeveloper = developerRepository.save(developerToUpdate);
        // then
        assertThat(updatedDeveloper).isNotNull();
        assertThat(updatedDeveloper.getEmail()).isEqualTo(updatedEmail);
    }
}
