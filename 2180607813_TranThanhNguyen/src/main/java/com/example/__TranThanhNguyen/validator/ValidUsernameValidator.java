package com.example.__TranThanhNguyen.validator;


import com.example.__TranThanhNguyen.repository.IUserRepository;
import com.example.__TranThanhNguyen.validator.annotation.ValidUsername;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidUsernameValidator implements ConstraintValidator<ValidUsername, String> {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        if (username == null) {
            return false; // Null username is considered invalid
        }
        // Return true if the username is not found in the database, indicating it is valid (i.e., unique)
        return userRepository.findByUsername(username) == null;
    }
}

