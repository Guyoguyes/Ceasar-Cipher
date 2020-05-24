package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptionTest {

    @Test
    public void decryption_instantiatesCorrectly_true(){
        Decryption testDecryption = new Decryption("HI", 21);
        assertTrue(testDecryption instanceof Decryption);
    }

    @Test
    public void decryption_testDecryptionOfWords_String(){
        Decryption testDecryption = new Decryption("yhe owh uoy", 23);
        assertEquals("yhe owh uoy", testDecryption.setDecryptWord());
    }

    @Test
    public void decryption_returnsError_String(){
        Decryption testDecryption = new Decryption("Hello Dude", 32);
        assertEquals("Error Key must be between 0 and 26", testDecryption.getErrorMessage());
    }


//
//    @Test
//    public void decryption_returnsError_true(){
//        Decryption testDecryption = new Decryption();
//        boolean expected = true;
//        assertEquals(expected, testDecryption.Decryption(false));
//    }


}