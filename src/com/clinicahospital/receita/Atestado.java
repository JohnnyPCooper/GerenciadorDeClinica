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
public class Atestado {
    private int id;
    private int id_consulta;
    private String descricao;
    private String data;

    public Atestado(int id_consulta, String descricao, String data) {
        this.id = (int) (Math.random()*1000000);
        this.id_consulta = id_consulta;
        this.descricao = descricao;
        this.data = data;
    }
    public Atestado(){
        
    }
    public int getId() {
        return id;
    }

    public int getId_consulta() {
        return id_consulta;
    }


    public String getDescricao() {
        return descricao;
    }

    public String getData() {
        return data;
    }   

    public void setId(int id) {
        this.id = id;
    }

    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData(String data) {
        this.data = data;
    }
    
}
