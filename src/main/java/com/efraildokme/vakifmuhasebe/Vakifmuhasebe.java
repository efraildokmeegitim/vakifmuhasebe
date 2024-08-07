/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.efraildokme.vakifmuhasebe;

import com.efraildokme.vakifmuhasebe.entities.KasalarEntity;
import dao.KasalarDao;
import forms.FrmKasalar;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Okul
 */
public class Vakifmuhasebe {
    
    
    public static void main(String[] args) {
       FrmKasalar frmKasalar=new FrmKasalar();
       frmKasalar.setResizable(false);
       frmKasalar.setVisible(true);
 //       KasalarEntity yeniKasa = new KasalarEntity();
//        yeniKasa.setKasaAdi("Zekat Kasası (Dolar)");
//        yeniKasa.setParaBirimi("Dolar");
//        yeniKasa.setAciklama("Dolar zekatların işlem gördüğü kasa");
//        KasalarDao kdao = new KasalarDao();
//        kdao.kasaEkle(yeniKasa);
    }
}
