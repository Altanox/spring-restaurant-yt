package com.example.restaurant.services;

import com.example.restaurant.domain.entities.Photo;
import com.example.restaurant.exceptions.StorageException;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

public interface PhotoService {

    Photo uploadPhoto(MultipartFile file) throws StorageException;

    Optional<Resource> getPhotoAsResource(String id);
}
