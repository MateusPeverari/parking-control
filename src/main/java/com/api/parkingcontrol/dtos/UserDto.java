package com.api.parkingcontrol.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;
@Data
public class UserDto {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
