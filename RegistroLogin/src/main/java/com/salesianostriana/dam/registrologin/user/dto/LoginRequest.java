package com.salesianostriana.dam.registrologin.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {

    @NotEmpty(message = "{newUserDto.username.unique}")
    private String username;

    @NotEmpty(message = "{userDto.password.notempty}")
    private String password;

}
