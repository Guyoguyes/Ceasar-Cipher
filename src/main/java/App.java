import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------Caeser Cipher ----------------");

        System.out.println("Enter what you would like to encrypt");
        String encryptWord = scanner.next();
        System.out.println("Enter Key");
        Integer encryptionKey = scanner.nextInt();
        Encryption encryption = new Encryption(encryptWord, encryptionKey);
        System.out.println("Your Encrypted word is ");
        System.out.println(encryption);
    }
}
