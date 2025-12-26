package util;

import exception.ValidationException;

public class ValidationUtil {

    public static void notEmpty(String value, String field) throws ValidationException {
        if (value == null || value.trim().isEmpty()) {
            throw new ValidationException(field + " tidak boleh kosong");
        }
    }

    public static void isNumber(String value, String field) throws ValidationException {
        try {
            Double.parseDouble(value);
        } catch (NumberFormatException e) {
            throw new ValidationException(field + " harus berupa angka");
        }
    }
}
