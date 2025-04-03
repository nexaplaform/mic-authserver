package com.nexaplaform.authserver.app.api.mapper;

import com.nexaplaform.authserver.app.api.dto.UserDotIn;
import com.nexaplaform.authserver.app.dominio.user.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserDtoMapper {

    UserDotIn toDto(User user);

    User toDomain(UserDotIn userDotIn);

    List<User> toDomainList(List<UserDotIn> userDotInList);

    List<UserDotIn> toDtoList(List<User> userList);
}
