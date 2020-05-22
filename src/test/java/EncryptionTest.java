import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptionTest {

    @Test
    public void encrpyt_returnsEncryptedWord_String(){
        Encryption testEncryption = new Encryption();
        String  expected = "JK";
        assertEquals(expected, testEncryption.Encryption("HI", 2));
    }

    @Test
    public void encrpyt_returnsShiftNumberOrError_true(){
        Encryption testEncryption = new Encryption();
        boolean expectedOutPut = false;
        assertEquals(expectedOutPut, testEncryption.getErrorMessage());
    }

}