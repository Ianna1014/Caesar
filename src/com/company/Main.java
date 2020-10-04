package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Cipher text: ");
        String ciphertext = keyboard.nextLine();
        String decrypt = "";
        for(int i=0; i < ciphertext.length();i++)
        {
            char letters = ciphertext.charAt(i);
            if(letters >= 'a' && letters <= 'z')
            {
                letters = (char) (letters + 1);

                if(letters < 'a') {
                    letters = (char) (letters -'a'+'z'+1);
                }
                decrypt = decrypt + letters;
            }
            else if(letters >= 'A' && letters <= 'Z')
            {
                letters = (char) (letters + 1);

                if (letters < 'A') {
                    letters = (char) (letters -'A'+'Z'+1);
                }
                decrypt = decrypt + letters;
            }
            else
            {
                decrypt = decrypt + letters;
            }
        }
        System.out.println("The agents decrypted message is : " + decrypt);
    }
}

