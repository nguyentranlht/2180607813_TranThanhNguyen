package com.example.__TranThanhNguyen.validator;

import com.example.__TranThanhNguyen.entity.Category;
import com.example.__TranThanhNguyen.validator.annotation.ValidatorCategoryId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidatorCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context) {
        return category != null && category.getId() != null;
    }
}
