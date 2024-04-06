package com.testing.maxym.qafordevs.repositoty;

import com.testing.maxym.qafordevs.entity.DeveloperEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DeveloperRepository extends JpaRepository<DeveloperEntity, Integer> {

    Optional<DeveloperEntity> findByEmail(String email);

    @Query("SELECT d FROM DeveloperEntity d WHERE d.status = 'ACTIVE' AND d.specialty = ?1")
    List<DeveloperEntity> findAllActiveBySpecialty(String specialty);
}
