import java.io.*;

public class CaesarCipher {
    
    // Method to encrypt a message using Caesar cipher
    public static String encrypt(String text, int shift) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char shifted = (char) ((c - base + shift) % 26 + base);
                if (shifted < base) {
                    shifted += 26; // Ensure the character is in the valid range
                }
                encrypted.append(shifted);
            } else {
                encrypted.append(c); // Non-alphabet characters are added unchanged
            }
        }
        return encrypted.toString();
    }

    // Method to decrypt a message using Caesar cipher
    public static String decrypt(String text, int shift) {
        return encrypt(text, -shift); // Decryption is the inverse of encryption
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any string: ");
        String text = br.readLine();
        System.out.print("Enter the key: ");
        int key = Integer.parseInt(br.readLine());

        String encrypted = encrypt(text, key);
        String decrypted = decrypt(encrypted, key);

        System.out.println("Encrypted string is: " + encrypted);
        System.out.println("Decrypted string is: " + decrypted);
    }
}

