package com.example.restaurant.services.impl;

import com.example.restaurant.domain.entities.Photo;
import com.example.restaurant.exceptions.StorageException;
import com.example.restaurant.services.PhotoService;
import com.example.restaurant.services.StorageService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PhotoServiceImpl implements PhotoService {

    private final StorageService storageService; //StorageService service will be injected because of @RequiredArgsConstructor

    @Override
    public Photo uploadPhoto(MultipartFile file) {
        String photoId = UUID.randomUUID().toString();
        String url;
        try {
            url = storageService.store(file, photoId);
        } catch (StorageException e) {
            throw new RuntimeException(e);
        }
        return Photo.builder()
                .url(url)
                .uploadDate(LocalDateTime.now())
                .build();
    }

    @Override
    public Optional<Resource> getPhotoAsResource(String id) {
        return storageService.loadAsResource(id);
    }
}
