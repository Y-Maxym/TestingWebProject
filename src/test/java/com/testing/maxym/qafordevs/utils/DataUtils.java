package com.testing.maxym.qafordevs.utils;

import com.testing.maxym.qafordevs.entity.DeveloperEntity;
import com.testing.maxym.qafordevs.entity.Status;

public class DataUtils {

    public static DeveloperEntity getJohnDoeTransient() {
        return DeveloperEntity.builder()
                .firstName("John")
                .lastName("Doe")
                .email("john.doe@example.com")
                .specialty("Java")
                .status(Status.ACTIVE)
                .build();
    }

    public static DeveloperEntity getMikeSmithTransient() {
        return DeveloperEntity.builder()
                .firstName("Mike")
                .lastName("Smith")
                .email("john.doe@example.com")
                .specialty("Java")
                .status(Status.ACTIVE)
                .build();
    }

    public static DeveloperEntity getFrankJonesTransient() {
        return DeveloperEntity.builder()
                .firstName("Frank")
                .lastName("Jones")
                .email("john.doe@example.com")
                .specialty("Java")
                .status(Status.DELETED)
                .build();
    }


    public static DeveloperEntity getJohnDoePersisted() {
        return DeveloperEntity.builder()
                .id(1)
                .firstName("John")
                .lastName("Doe")
                .email("john.doe@example.com")
                .specialty("Java")
                .status(Status.ACTIVE)
                .build();
    }

    public static DeveloperEntity getMikeSmithPersisted() {
        return DeveloperEntity.builder()
                .id(2)
                .firstName("Mike")
                .lastName("Smith")
                .email("john.doe@example.com")
                .specialty("Java")
                .status(Status.ACTIVE)
                .build();
    }

    public static DeveloperEntity getFrankJonesPersisted() {
        return DeveloperEntity.builder()
                .id(3)
                .firstName("Frank")
                .lastName("Jones")
                .email("john.doe@example.com")
                .specialty("Java")
                .status(Status.DELETED)
                .build();
    }

}