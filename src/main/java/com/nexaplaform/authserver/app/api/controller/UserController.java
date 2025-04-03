package com.nexaplaform.authserver.app.api.controller;

import com.nexaplaform.authserver.app.api.dto.UserDotIn;
import com.nexaplaform.authserver.app.api.mapper.UserDtoMapper;
import com.nexaplaform.authserver.app.api.service.UserApi;
import com.nexaplaform.authserver.app.applicacion.user.UserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RequiredArgsConstructor
public class UserController implements UserApi<UserDotIn, UserDotIn, Long> {

    private UserDtoMapper mapper;
    private final UserUseCase userUseCase;

    @Override
    public ResponseEntity<UserDotIn> create(UserDotIn dtoIn) {
        return new ResponseEntity<>(mapper.toDto(userUseCase.create(mapper.toDomain(dtoIn))), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<UserDotIn> update(UserDotIn dtoIn, Long id) {
        return new ResponseEntity<>(mapper.toDto(userUseCase.update(mapper.toDomain(dtoIn), id)), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<UserDotIn> findById(Long id) {
        return new ResponseEntity<>(mapper.toDto(userUseCase.findById(id)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        userUseCase.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
