package com.system.credit.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class EncryptionUtil {
    private static final Logger log  = LoggerFactory.getLogger(EncryptionUtil.class);
    private static final String ALGORITHM = "AES";
    private static final String TRANSFORMATION = "AES";
    private static final String  KEY = "+R5VqHUl+TU6Ved9nVRgsmtIEnemww3s00SNpCG0+fk=";

    // Generate a new AES key
    private static String generateKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance(ALGORITHM);
        keyGen.init(256); // You can use 128 or 192 bits key size
        SecretKey secretKey = keyGen.generateKey();
        return Base64.getEncoder().encodeToString(secretKey.getEncoded());
    }

    // Encrypt the data
    public static String encrypt(String data, String key) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(Base64.getDecoder().decode(key), ALGORITHM);
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public static String encrypt(String encryptedData){
        try{
            return encrypt( encryptedData,  KEY);
        }catch (Exception e){
            log.error("Erro ao desencriptar: "+e.getMessage());
            e.printStackTrace();
            return "";
        }

    }

    // Decrypt the data
    public static String decrypt(String encryptedData, String key) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(Base64.getDecoder().decode(key), ALGORITHM);
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
        return new String(decryptedBytes);
    }
    public static String decrypt(String encryptedData){
        try{
            return decrypt( encryptedData,  KEY);
        }catch (Exception e){
            log.error("Erro ao desencriptar: "+e.getMessage());
            e.printStackTrace();
            return "";
        }

    }
    public static void main(String[] args) {
        try {
            // Generate a new key
            String key = generateKey();
            System.out.println("Generated Key: " + key);

            // Original data
            String originalData = "strong";
            System.out.println("Original Data: " + originalData);

            // Encrypt the data
            String encryptedData = encrypt(originalData, key);
            System.out.println("Encrypted Data: " + encryptedData);

            // Decrypt the data
            String decryptedData = decrypt(encryptedData, key);
            System.out.println("Decrypted Data: " + decryptedData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}