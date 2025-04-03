package com.nexaplaform.authserver.app.api.controller;

import com.nexaplaform.authserver.app.api.dto.UserDotIn;
import com.nexaplaform.authserver.app.api.service.UserApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserApi<UserDotIn, UserDotIn, Long> {
    
    @Override
    public ResponseEntity<UserDotIn> create(UserDotIn dtoIn) {
        return null;
    }

    @Override
    public ResponseEntity<UserDotIn> update(UserDotIn dtoIn, Long id) {
        return null;
    }

    @Override
    public ResponseEntity<UserDotIn> findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        return null;
    }
}
