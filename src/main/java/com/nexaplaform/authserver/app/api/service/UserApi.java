package com.nexaplaform.authserver.app.api.service;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/v1/users")
@Tag(name = "User API", description = "User management API")
public interface UserApi<T, O, K> {

    @PostMapping
    @Operation(operationId = "createUser", summary = "Create a new user.")
    default ResponseEntity<O> create(@RequestBody T dtoIn) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PutMapping("/{id}")
    @Operation(operationId = "updateUser", summary = "Update an existing user.")
    default ResponseEntity<O> update(@RequestBody T dtoIn, @PathVariable K id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping("/{id}")
    @Operation(operationId = "findUserById", summary = "Find a user by ID.")
    default ResponseEntity<O> findById(@PathVariable K id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @DeleteMapping("/{id}")
    @Operation(operationId = "deleteUserById", summary = "Delete a user by ID.")
    default ResponseEntity<Void> delete(@PathVariable K id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
