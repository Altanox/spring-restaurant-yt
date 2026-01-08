package com.example.restaurant.services;

import com.example.restaurant.exceptions.StorageException;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

public interface StorageService {

    String store(MultipartFile file, String filename) throws StorageException;

    Optional<Resource> loadAsResource(String id);
}
