package it.pi.registro.registro.dto;

import it.pi.registro.registro.entity.User;
import it.pi.registro.registro.enums.UserTypeEnum;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UserCreateDTO {
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String password;
    @NotBlank
    private String address;
    @NotBlank
    private String city;

    private UserTypeEnum type;

    @Override
    public String toString() {
        return "UserCreateDTO{" +
                "firstName"
    }
}
