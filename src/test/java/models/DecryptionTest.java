package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptionTest {

    @Test
    public void decryption_returnDecryptWord_String(){
        Decryption testDecryption = new Decryption();
        String expected = "How do you feel";
        assertEquals(expected, testDecryption.Decryption("How do you feel"));
    }


}