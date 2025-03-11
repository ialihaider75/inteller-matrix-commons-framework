package com.intellermatrix.commons.framework.utils;

import lombok.experimental.UtilityClass;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@UtilityClass
public class DateTimeUtils {

    public static String humanReadableDate(OffsetDateTime date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM, yyyy", Locale.ENGLISH);
        return date.format(formatter);
    }
}
