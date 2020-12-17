/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinicahospital.receita;

/**
 *
 * @author porti
 */
public class Receita {

    private int id_consuta;
    private int id;
    private String descricao;
    private String data;

    public Receita(int id_consuta, String descricao, String data) {
        this.id_consuta = id_consuta;
        this.id = (int) (Math.random() * 1000000);
        this.descricao = descricao;
        this.data = data;
    }

    public Receita() {

    }

    public int getId_consuta() {
        return id_consuta;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getData() {
        return data;
    }


    public void setId_consuta(int id_consuta) {
        this.id_consuta = id_consuta;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData(String data) {
        this.data = data;
    }

}
