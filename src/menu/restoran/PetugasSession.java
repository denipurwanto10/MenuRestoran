/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu.restoran;

/**
 *
 * @author Deni Purwanto
 */
public class PetugasSession {
    private static String username;
    private static String password;
    private static String confirm_password;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        PetugasSession.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        PetugasSession.password = password;
    }

    public static String getConfirm_password() {
        return confirm_password;
    }

    public static void setConfirm_password(String confirm_password) {
        PetugasSession.confirm_password = confirm_password;
    }
    
}
