package com.nexaplaform.authserver.app.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@With
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDotIn {

    @Schema(example = "1")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;
    @Schema(example = "John")
    private String name;
    @Schema(example = "Smith")
    private String lastName;
    @Schema(example = "JonhSmith@example.com")
    private String email;
    @Schema(example = "JonhSmith")
    private String alias;
    @Schema(example = "password")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    @Schema(example = "+1 555 555 5555")
    private String phone;
    @Schema(example = "true")
    private Boolean enabled;
}
