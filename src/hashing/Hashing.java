package hashing;

import java.security.MessageDigest;
import java.util.Scanner;

public class Hashing {

    public static void main(String args[]) {
        try {
            
            
            //Reading data from user
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the code you want to be hashed");
            String message = sc.nextLine();

            //Creating the MessageDigest object  
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            //Passing data to the created MessageDigest Object
            md.update(message.getBytes());

            //Compute the message digest
            byte[] digest = md.digest();

            //Converting the byte array in to HexString format
            StringBuffer hexString = new StringBuffer();

            for (int i = 0; i < digest.length; i++) {
                hexString.append(Integer.toHexString(0xFF & digest[i]));
            }
            System.out.println("Hex format : " + hexString.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
