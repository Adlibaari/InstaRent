/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instarent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class DBConnection {
    Connection conn;
    Statement stmt;
    
    public DBConnection() throws ClassNotFoundException, SQLException{
        //Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_instarent","root","Slemania22*");
        stmt = conn.createStatement();
    }
    
    public ResultSet query(String query) throws SQLException{
        return stmt.executeQuery(query);
    }
    
    public int runQuery(String query) throws SQLException{
        return stmt.executeUpdate(query);
    }
    
    public void deleteKendaraan(int id) throws SQLException{
        String insertQuery ="DELETE FROM kendaraan WHERE (id) = (?)";
        
        try (PreparedStatement preparedStatement = conn.prepareStatement(insertQuery)){
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
        }
    }
    
    public void deleteAdmin(int id_admin) throws SQLException{
        String insertQuery ="DELETE FROM admin WHERE (id_admin) = (?)";
        
        try (PreparedStatement preparedStatement = conn.prepareStatement(insertQuery)){
            preparedStatement.setInt(1, id_admin);
            
            preparedStatement.executeUpdate();
        }
    }
    
    public void deletePelanggan(int id_pelanggan) throws SQLException{
        String insertQuery ="DELETE FROM pelanggan WHERE (id_pelanggan) = (?)";
        
        try (PreparedStatement preparedStatement = conn.prepareStatement(insertQuery)){
            preparedStatement.setInt(1, id_pelanggan);
            
            preparedStatement.executeUpdate();
        }
    }
    
    public void deletePembayaran(int id_pembayaran) throws SQLException{
        String insertQuery ="DELETE FROM pembayaran WHERE (id_pembayaran) = (?)";
        
        try (PreparedStatement preparedStatement = conn.prepareStatement(insertQuery)){
            preparedStatement.setInt(1, id_pembayaran);
            
            preparedStatement.executeUpdate();
        }
    }
    
    public void deletePenyewaan(int id_penyewaan) throws SQLException{
        String insertQuery ="DELETE FROM penyewaan WHERE (id_penyewaan) = (?)";
        
        try (PreparedStatement preparedStatement = conn.prepareStatement(insertQuery)){
            preparedStatement.setInt(1, id_penyewaan);
            
            preparedStatement.executeUpdate();
        }
    }
    
    
    // daripada bikin function, mending bikin sintaksnya aja dah buat entar dipanggil pas di button2nya
    
    // ----- insert user admin ----
    // DBConnection db = new DBConnection();
    // String username = textFieldUsername.getText();
    // String password = textFieldPassword.getText();
    // String email = textFieldEmail.getText();
    // 
    // db.runQuery("INSERT INTO admin (username, password, email) 
    //              VALUES ('" + username + "','" + password + "','" + email + "');");
    //
    // update
    // DBConnection db = new DBConnection();
    //  db.runQuery("UPDATE admin SET username = '" + username + 
    //              "', password = '" + password + "', email = '" + email + "' WHERE id_admin = " + admin.getId());
    
    
    // ----- insert user pelanggan ----
    // DBConnection db = new DBConnection();
    // String username = textFieldUsername.getText();
    // String password = textFieldPassword.getText();
    // String email = textFieldEmail.getText();
    // String alamat = textFieldAlamat.getText();
    // String noTelepon = textFieldNoTelepon.getText();
    // 
    // db.runQuery("INSERT INTO pelanggan (username, password, email, alamat, noTelepon) 
    //              VALUES ('" + username + "','" + password + "','" + email + "','" + alamat + "','" + noTelepon + "');");
    //
    // update
    // DBConnection db = new DBConnection();
    //  db.runQuery("UPDATE pelanggan SET username = '" + username + 
    //              "', password = '" + password + "', email = '" + email + "', alamat = '" + alamat + "', noTelepon = '" + noTelepon + "' WHERE id_pelanggan = " + pelanggan.getId());

    
    // ------ insert kendaraan untuk admin -------
    // DBConnection db = new DBConnection();
    // String namaKendaraan = textFieldNama.getText();
    // String merekKendaraan = textFieldMerek.getText();
    // String platNomer = textFieldPlat.getText();
    // String tahunProduksi = textFieldTahunProduksi.getText();
    // String statusKetersediaan = "";
    // if(radioAda.isSelected()){
    //      statusKetersediaan = "Ada";
    // }else if (radioTdkAda.isSelected()){
    //      statusKetersediaan = "Tidak";
    // String warnaKendaraan = textFieldWarna.getText();
    // String kapasitasPenumpang = textFieldKapasitas.getInt();
    // String jenisTransmisi = textFieldTransmisi.getText();
    // Double hargaSewa = (double)spinnerHarga.getValue();
    // String supir = "";
    // if(radioSupirYa.isSelected()){
    //      supir = "Ya";
    // }else if (radioSupirTidak.isSelected()){
    //      supir = "Tidak";
    // String jasHujan = "";
    // if(radioJasHujanYa.isSelected()){
    //      jasHujan = "Ya";
    // }else if (radioJasHujanTidak.isSelected()){
    //      jasHujan = "Tidak";
    // String helm = "";
    // if(radioHelmYa.isSelected()){
    //      helm = "Ya";
    // }else if (radioHelmTidak.isSelected()){
    //      helm = "Tidak";
    //
    // db.runQuery("INSERT INTO kendaraan (nama, merek, platNomer, tahunProduksi, statusKetersediaan, warnaKendaraan, kapasitasPenumpang, jenisTransmisi, hargaSewa, supir, jasHujan, helm)
    //              VALUES("'"+ nama + "','" + merek + "','" + platNomer + "','" + tahunProduksi + "','" + statusKetersediaan + "','" + warnaKendaraan + "','" + kapasitasPenumpang + "','" + jenisTransmisi + "','" + hargaSewa + "','" + supir + "','" + jasHujan + "','" + helm + "'");";
    //
    // update
    // DBConnection db = new DBConnection();
    // db.runQuery("UPDATE kendaraan SET nama = '" + nama + "', merek = '" + merek + "', platNomer = '" + platNomer + "', tahunProduksi = '" + tahunProduksi + "'
    //             , statusKetersediaan = '" + statusKetersediaan + "', warnaKendaraan = '" + warnaKendaraan + "', kapasitasPenumpang = '" + kapasitasPenumpang + "', jenisTransmisi = '" + jenisTransmisi + "'
    //             , hargaSewa = '" + hargaSewa + "' , supir = '" + supir + "', jasHujan = '" + jasHujan + "', helm = '" + helm + "'WHERE id_kendaraan = " + kendaraan.getId());
    
    // ----- insert Pembayaran
    // DBConnection db = new DBConnection();
    // date tanggalPembayaran = tanggal.getGatau()???
    // String metodePembayaran = "";
    // if(radioOvo.isSelected()){
    //      metodePembayaran = "OVO";
    // }else if (radioGopay.isSelected()){
    //      metodePembayaran = "Gopay";
    // String statusPembayaran = "";
    // if(radioSudahBayar.isSelected()){
    //      statusPembayaran = "Lunas";
    // }else if (radioBelumBayar.isSelected()){
    //      statusPembayaran = "Belum Lunas";
    //
    // db.runQuery("INSERT INTO pembayaran (tanggalPembayaran, metodePembayaran, statusPembayaran)
    //              VALUES ("'" + tanggalPembayaran + "','" + metodePembayaran + "','" + statusPembayaran + "'");";
    //
    // update
    // DBConnection db = new DBConnection();
    // db.runQuery("UPDATE pembayaran SET tanggalPembayaran = '" + tanggalPembayaran + 
    //              "', metodePembayaran = '" + metodePembayaran + "', statusPembayaran = '" + statusPembayaran + "' WHERE id_pembayaran = " + pembayaran.getId());
    
    // ----- insert dan update penyewaan
    // insert
    // DBConnection db = new DBConnection();
    // int idPelanggan = selected.getIdPelanggan()????
    // int idKendaraan = selected.getIdKendaraan()????
    // int idPembayaran = selected.getIdPembayaran()????
    // date mulai = date.get???
    // date selesai = date.get???
    //
    // db.runQuery("INSERT INTO penyewaan (id_pelanggan, id_kendaraan, id_pembayaran, mulaiSewa, selesaiSewa)
    //              VALUES (" + idPelanggan + "," + idKendaraan + "," + idPembayaran + "," + mulai + "," + selesai + ");";
    // 
    // update
    // DBConnection db = new DBConnection();
    // db.runQuery("UPDATE penyewaan SET id_pelanggan = " + idPelanggan + 
    //              ", id_kendaraan = " + idKendaraan + ", id_pembayaran = " + idPembayaran + ", mulaiSewa = " + mulai + ", selesaiSewa = " + selesai + "WHERE id_penyewaan = " + penyewaan.getId());
}
