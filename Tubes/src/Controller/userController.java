/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Login;

/**
 *
 * @author Barry
 */
public class userController {
    private Login login;
    
    public userController(Login login){
        this.login = login;
    }
    
    public void registrasi(){
        //Ambil semua data yang diperlukan
        DBConnection db = new DBConnection();
        db.connect();
        String Username = login.getusernameField().getText();
        String Password = login.getpasswordField().getText();
        String Email = login.getemailField().getText();
        String Alamat = login.getalamatField().getText();
        String Telepon = login.getteleponField().getText();
        
        if(Email.isEmpty()){
            login.getJLabel6().setVisible(true);
            return;
        }
        
        System.out.println(Username);
        System.out.println(Password);
        
        //Masukkan ke database
        String sql = "INSERT INTO pelanggan (username,password,email,alamat,noTelepon) VALUES ('"+Username+"','"+Password+"','"+Email+"','"+Alamat+"','"+Telepon+"')";
        db.Query(sql);
        db.disconnect();
    }
    
}
