package co.com.common.utils.Email;


public record ChangePassword(
        String password,
        String confirmPassword
) { }
