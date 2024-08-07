/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.efraildokme.vakifmuhasebe.DBConnection;
import com.efraildokme.vakifmuhasebe.entities.KasalarEntity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Okul
 */
public class KasalarDao {
    Connection conn=DBConnection.db();
    PreparedStatement psmt;
    ResultSet rs;
    KasalarEntity kasa;

    public KasalarDao() {
        kasa=new KasalarEntity();
    }
    
    public KasalarEntity kasaEkle(KasalarEntity yeniKasa){
        try {
            
            kasa.setKasaAdi(yeniKasa.getKasaAdi());
            kasa.setParaBirimi(yeniKasa.getParaBirimi());
            kasa.setAciklama(yeniKasa.getAciklama());
            psmt=conn.prepareStatement("INSERT INTO kasalar(kasaAdi,paraBirimi,aciklama) VALUES(?,?,?); ");
            psmt.setString(1, kasa.getKasaAdi());
            psmt.setString(2, kasa.getParaBirimi());
            psmt.setString(3, kasa.getAciklama());
            psmt.executeUpdate();
            
            System.out.println("Kasa Eklendi");
            
           
        } catch (SQLException ex) {
            Logger.getLogger(KasalarDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         return kasa;
    }
    public ResultSet tumKasalar(){
        try {
            
            
            psmt=conn.prepareStatement("SELECT * FROM kasalar; ");
            
            rs=psmt.executeQuery();
            
            System.out.println("Kasalar Listelendi");
            
           
        } catch (SQLException ex) {
            Logger.getLogger(KasalarDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         return rs;
    }
    public void kasaSil(int id){
        try {        
            psmt=conn.prepareStatement("DELETE FROM kasalar WHERE id=?; ");
            psmt.setInt(1, id);
            
            int sonuc=psmt.executeUpdate();
            if(sonuc>0){
                System.out.println("Kasa Silindi");
            }else{
                System.out.println("Hata oluştu");
            }
        } catch (SQLException ex) {
            Logger.getLogger(KasalarDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    public void kasaGuncelle(KasalarEntity kasa){
        try {        
            psmt=conn.prepareStatement("UPDATE kasalar SET kasaAdi=?, paraBirimi=?, aciklama=? WHERE id=?; ");
            psmt.setString(1, kasa.getKasaAdi());
            psmt.setString(2, kasa.getParaBirimi());
            psmt.setString(3, kasa.getAciklama());
            psmt.setInt(4, kasa.getId());
            
            int sonuc=psmt.executeUpdate();
            if(sonuc>0){
                System.out.println("Kasa Güncellendi");
            }else{
                System.out.println("Hata oluştu");
            }
        } catch (SQLException ex) {
            Logger.getLogger(KasalarDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
}
