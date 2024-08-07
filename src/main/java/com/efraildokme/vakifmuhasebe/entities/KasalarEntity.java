/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.efraildokme.vakifmuhasebe.entities;

/**
 *
 * @author Okul
 */
public class KasalarEntity {
    private int id;
    private String kasaAdi;
    private String paraBirimi;
    private String aciklama;

    public KasalarEntity(String kasaAdi, String paraBirimi, String aciklama) {
        this.kasaAdi = kasaAdi;
        this.paraBirimi = paraBirimi;
        this.aciklama = aciklama;
    }

    public KasalarEntity() {
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKasaAdi() {
        return kasaAdi;
    }

    public void setKasaAdi(String kasaAdi) {
        this.kasaAdi = kasaAdi;
    }

    public String getParaBirimi() {
        return paraBirimi;
    }

    public void setParaBirimi(String paraBirimi) {
        this.paraBirimi = paraBirimi;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
    
    
}
