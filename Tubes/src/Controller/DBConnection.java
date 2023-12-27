package Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class DBConnection {
    static final String url ="jdbc:mysql://localhost:3306/rentalcar";
    static final String user ="root";
    static final String pass = "Solum23.";
    Connection conn;
    public static Statement stmt;
    public static ResultSet rs;
    
    public void connect() {
        try{
            conn = DriverManager.getConnection(url,user,pass);
            stmt = conn.createStatement();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public ResultSet view(String query) {
        try{
            rs = stmt.executeQuery(query);
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return rs;
    }
    
    public void Query(String query) {
        try {
            stmt.executeUpdate(query);
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public void disconnect(){
        try{
            conn.close();
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
