package kz.uib.market.api.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class User {

    private String login;
    private String password;
    private String role;
    private LocalDateTime birthDate;


}