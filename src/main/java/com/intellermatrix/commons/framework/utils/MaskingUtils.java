package com.intellermatrix.commons.framework.utils;

import lombok.experimental.UtilityClass;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@UtilityClass
public class MaskingUtils {

    public static String maskMobileNumber(String mobileNumber) {
        return IntStream.range(0, mobileNumber.length())
                .mapToObj(i -> (i >= 3 && i < mobileNumber.length() - 1) ? "*" :
                        String.valueOf(mobileNumber.charAt(i)))
                .collect(Collectors.joining());
    }

    public static String maskPassword(String password) {
        return IntStream.range(0, password.length())
                .mapToObj(i -> "*")
                .collect(Collectors.joining());
    }

    public static String maskEmail(String email) {
        return Optional.ofNullable(email)
                .map(e -> {
                    String[] emailParts = e.split("@");
                    return IntStream.range(0, emailParts[0].length())
                            .mapToObj(i -> (i >= 3 && i < emailParts[0].length() - 1) ? "*" :
                                    String.valueOf(emailParts[0].charAt(i)))
                            .collect(Collectors.joining()) + "@" + emailParts[1];
                })
                .orElse(null);
    }
}
