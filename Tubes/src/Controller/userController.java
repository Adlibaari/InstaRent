/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Pelanggan;
import Model.User;
import View.Login;
import java.sql.SQLException;
/**
 *
 * @author Barry
 */
public class userController {
    private Login login;
    
    public userController(Login login){
        this.login = login;
    }
    
    public void login(){
        try {
        DBConnection db = new DBConnection();
        db.connect();
        String Username = login.getusernameField().getText();
        String Password = login.getpasswordField().getText();
        
        if(Username.isEmpty()){
            login.getusernameField().setText("*");
            return;
        }
        
        if(Password.isEmpty()){
            login.getpasswordField().setText("*");
            return;
        }
        
        String sql = "SELECT * FROM rentalcar.pelanggan WHERE username='"+Username+"' AND `password`='"+Password+"';";
        db.view(sql);
        int id = 0;
        while(db.rs.next()){
            id = db.rs.getInt(1);
        }
        
        if(id==0){
            System.out.println("GADA");
        } else {
            System.out.println("ADAA");
        }
        
        } catch (SQLException ex){
            System.out.println("Gaada");
        }
    }
    
    public void registrasi(){
        //Ambil semua data yang diperlukan
        DBConnection db = new DBConnection();
        db.connect();
        String Username = login.getusernameField().getText();
        String Password = login.getpasswordField().getText();
        String Email = login.getemailField().getText();
        String Telepon = login.getteleponField().getText();
        
        if(Email.isEmpty()){
            return;
        }
        
        
        System.out.println(Username);
        System.out.println(Password);
        
        //Masukkan ke database
        String sql = "INSERT INTO pelanggan (username,password,email,noTelepon) VALUES ('"+Username+"','"+Password+"','"+Email+"','"+Telepon+"')";
        db.Query(sql);
        db.disconnect();
    }
    
}
