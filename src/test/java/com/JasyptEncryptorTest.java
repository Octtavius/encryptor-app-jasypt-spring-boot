package com;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.junit.jupiter.api.Test;

public class JasyptEncryptorTest {

    @Test
    public void testEncryptString() {
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();

        SimpleStringPBEConfig config = new SimpleStringPBEConfig();

        config.setAlgorithm("PBEWithMD5AndDES");
        config.setPassword("octav-hack");
        config.setKeyObtentionIterations("1000");
        config.setPoolSize("1");
        config.setProviderName("SunJCE");
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        config.setStringOutputType("base64");

        encryptor.setConfig(config);

        String plainText = "octav";
        String encryptedText = encryptor.encrypt(plainText);

        System.out.println("Original: " + plainText);
        System.out.println("Encrypted: " + encryptedText);
    }
}
