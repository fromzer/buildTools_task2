package com.epam.mikheev;

import static org.apache.commons.lang3.StringUtils.startsWith;
import static org.apache.commons.lang3.math.NumberUtils.isCreatable;

public class StringUtils {

    private static final String PREFIX = "-";

    public static boolean isPositiveNumber(String str) {
        if (isCreatable(str)) {
            return !startsWith(str.trim(), PREFIX);
        }
        return false;
    }
}
