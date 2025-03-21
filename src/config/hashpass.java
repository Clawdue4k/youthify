package config;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class hashpass {

    // Generate a hashed password with salt
    public static String hashPassword(String password) throws NoSuchAlgorithmException {
        byte[] salt = generateSalt(); // Generate random salt
        String saltStr = Base64.getEncoder().encodeToString(salt); // Convert salt to String
        String hashedPassword = hashWithSalt(password, salt); // Hash password with salt
        return saltStr + ":" + hashedPassword; // Store salt and hash together
    }

    // Generate a random salt
    private static byte[] generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16]; // 16-byte salt
        random.nextBytes(salt);
        return salt;
    }

    // Hash password with given salt using SHA-256
    public static String hashWithSalt(String password, byte[] salt) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(salt); // Add salt
        byte[] hashedBytes = md.digest(password.getBytes()); // Hash password
        return Base64.getEncoder().encodeToString(hashedBytes); // Convert to String
    }

    // Verify password by hashing input and comparing with stored hash
    public static boolean verifyPassword(String enteredPassword, String storedPassword) throws NoSuchAlgorithmException {
        String[] parts = storedPassword.split(":"); // Split salt and hash
        if (parts.length != 2) return false;

        byte[] salt = Base64.getDecoder().decode(parts[0]); // Decode salt
        String hashedEnteredPassword = hashWithSalt(enteredPassword, salt); // Hash entered password
        return hashedEnteredPassword.equals(parts[1]); // Compare hashes
    }
}
