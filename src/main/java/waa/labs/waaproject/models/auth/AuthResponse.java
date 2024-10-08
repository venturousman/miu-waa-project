package waa.labs.waaproject.models.auth;

import lombok.Data;

@Data
public class AuthResponse {
    private String email;
    private String token;
}
