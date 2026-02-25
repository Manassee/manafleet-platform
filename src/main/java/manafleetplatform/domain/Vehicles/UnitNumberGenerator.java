package com.manafleet.domain.Vehicles;

import org.springframework.stereotype.Component;
import java.security.SecureRandom;

/**
 * Generates unique unit numbers for vehicles in the format MFXXXXX.
 * The suffix consists of 5 alphanumeric characters (A-Z, 0-9),
 * providing over 60 million possible combinations.
 */
@Component
public class UnitNumberGenerator {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int SUFFIX_LENGTH = 5;
    private static final String PREFIX = "MF";

    private final SecureRandom random = new SecureRandom();

    /**
     * Generates a random unit number in the format MFXXXXX.
     * Uniqueness must be verified by the caller before persisting.
     *
     * @return a randomly generated unit number string
     */
    public String generate() {
        StringBuilder suffix = new StringBuilder(SUFFIX_LENGTH);

        for (int i = 0; i < SUFFIX_LENGTH; i++) {
            int index = random.nextInt(CHARACTERS.length());
            suffix.append(CHARACTERS.charAt(index));
        }

        return PREFIX + suffix;
    }
}
