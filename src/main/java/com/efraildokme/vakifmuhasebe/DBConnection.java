/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.efraildokme.vakifmuhasebe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Okul
 */
public class DBConnection {

    public static Connection db() {
        Connection connection = null;

        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:vakifdb.db");
            System.out.println("Bağlantı Sağlandı");
        } catch (Exception e) {
            System.out.println("Bağlantı Hatası");
            e.printStackTrace();
        }

        return connection;
    }
}
