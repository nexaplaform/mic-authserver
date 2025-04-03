package com.nexaplaform.authserver.app.applicacion.user;


import com.nexaplaform.authserver.app.dominio.user.User;

public interface UserUseCase {

    default User create(User value) {
        return null;
    }

    default User update(User value, Long id) {
        return null;
    }

    default User findById(Long id) {
        return null;
    }

    default void deleteById(Long id) {
    }

}
