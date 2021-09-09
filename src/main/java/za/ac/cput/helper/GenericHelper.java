/**
 * GenericHelper.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */

package za.ac.cput.helper;

import java.util.UUID;

public class GenericHelper {
    public static String generateId() {
        return UUID.randomUUID().toString();
    }
    public static boolean isNullorEmpty(String str) {
        if (str == null) return true;
        if (str.isEmpty()) return true;
        if (str.equalsIgnoreCase("null")) return true;
        return false;
    }

    public static boolean isNullorEmpty() {
        return false;
    }
}