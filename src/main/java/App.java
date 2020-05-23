import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("------------Caeser Cipher ----------------");

        System.out.println("Enter what you would like to encrypt");
        String encryptWord = bufferedReader.readLine();
        System.out.println("Enter Key");
        String stringEncryptionKey = bufferedReader.readLine();
        int encryptionKey = Integer.parseInt(stringEncryptionKey);
        Encryption encryption = new Encryption(encryptWord, encryptionKey);
        String cipher = encryption.getEncryptWord();
        System.out.println("Your Encrypted word is ");
        System.out.println(encryption);
    }
}
