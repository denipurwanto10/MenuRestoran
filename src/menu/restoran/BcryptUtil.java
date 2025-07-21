/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu.restoran;

import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Deni Purwanto
 */
public class BcryptUtil {
    private static final int SALT_ROUNDS = 10;
    public static String hashPassword(String password) {
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt(SALT_ROUNDS));
        return hashedPassword;
    }
    
    public static boolean checkPassword(String password, String hashedPassword) {
        boolean passwordMatch = BCrypt.checkpw(password, hashedPassword);
        return passwordMatch;
    }
}
