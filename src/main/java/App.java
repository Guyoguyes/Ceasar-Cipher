import models.Decryption;
import models.Encryption;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("------------Caesar Cipher ----------------");
        System.out.println("Would you like to Encrypt OR Decrypt ");

        String choosenOption = bufferedReader.readLine();

        if(choosenOption.equals("Encrypt")){
            System.out.println("Type word to be Encrypted");
            String encryptionWord = bufferedReader.readLine();
            System.out.println("Type the key");
            String stringEncryptionKey = bufferedReader.readLine();
            int encryptKey = Integer.parseInt(stringEncryptionKey);
            Encryption encryption = new Encryption(encryptionWord, encryptKey);
            System.out.println("Your Encrypt Word is");
            System.out.println(encryption.setEncryptWord());
        }else if(choosenOption.equals("Decrypt")){
            System.out.println("Type word to be Decrypt");
            String decryptionWord = bufferedReader.readLine();
            System.out.println("Type the description key");
            String stringDecryptionKey = bufferedReader.readLine();
            int decryptionKey = Integer.parseInt(stringDecryptionKey);
            Decryption decryption = new Decryption(decryptionWord, decryptionKey);
            System.out.println("Your decrypted word is");
            System.out.println(decryption.setDecryptWord());
        }
    }
}
