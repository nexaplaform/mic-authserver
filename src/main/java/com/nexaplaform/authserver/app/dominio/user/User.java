package com.nexaplaform.authserver.app.dominio.user;

import lombok.*;

@Data
@With
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String alias;
    private String password;
    private String phone;
    private Boolean enabled = true;
}
