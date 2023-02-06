package com.salesianostriana.dam.registrologin.user.dto;

import com.salesianostriana.dam.registrologin.validation.anotation.PasswordsMatch;
import com.salesianostriana.dam.registrologin.validation.anotation.StrongPassword;
import com.salesianostriana.dam.registrologin.validation.anotation.UniqueUsername;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@PasswordsMatch(
        passwordField = "password", verifyPasswordField = "verifyPassword"
)
public class CreateUserRequest {

    @NotEmpty(message = "{newUserDto.username.unique}")
    @UniqueUsername
    private String username;

    @StrongPassword
    @NotEmpty(message = "{userDto.password.notempty}")
    private String password;

    @NotEmpty(message = "{userDto.password.notempty}")
    private String verifyPassword;

    @URL(message = "{userDto.avatar.url}")
    private String avatar;

    @NotEmpty(message = "{userDto.fullname.notempty}")
    private String fullName;

}
