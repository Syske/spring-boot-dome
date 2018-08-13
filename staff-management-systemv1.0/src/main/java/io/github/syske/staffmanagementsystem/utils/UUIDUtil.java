package io.github.syske.staffmanagementsystem.utils;

import java.util.UUID;

public class UUIDUtil {
    public static String UUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
