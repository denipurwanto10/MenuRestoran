/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu.restoran;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Deni Purwanto
 */
public class UserManager {
    private List<User> users;
    
    public UserManager() {
        users = new ArrayList<>();
    }
    
    public void registerUser(String username, String password) {
        // Hash password menggunakan BcryptUtil
        String hashedPassword = BcryptUtil.hashPassword(password);
        
        // Buat objek User dan tambahkan ke daftar pengguna
        User user = new User();
        user.setUsername(username);
        user.setPassword(hashedPassword);
        
        users.add(user);
    }
    
    public User loginUser(String username, String password) {
        // Cari pengguna dengan username yang cocok
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                // Verifikasi password menggunakan BcryptUtil
                boolean passwordMatch = BcryptUtil.checkPassword(password, user.getPassword());
                if (passwordMatch) {
                    return user; // Password cocok, login berhasil
                } else {
                    return null; // Password tidak cocok, login gagal
                }
            }
        }
        
        return null; // Pengguna tidak ditemukan
    }
}
