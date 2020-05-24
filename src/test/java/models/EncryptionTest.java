package models;

import models.Encryption;
import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptionTest {

    @Test
    public void encrpyt_returnsEncryptedWord_String(){
        Encryption testEncryption = new Encryption("JK", 2);
        String  expected = "HI";
        assertEquals(expected, testEncryption.getEncryptWord());
    }

    @Test
    public void encrpyt_returnsShiftNumberOrError_true(){
        Encryption testEncryption = new Encryption("HI", 28);
        String expectedOutPut = "Error Key must be between 0 and 26";
        assertEquals(expectedOutPut, testEncryption.getErrorMessage());
    }

}