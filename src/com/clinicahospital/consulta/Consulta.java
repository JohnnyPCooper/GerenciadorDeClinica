/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinicahospital.consulta;

/**
 *
 * @author porti
 */
public class Consulta {
    private int id;
    private int id_medico;
    private int id_paciente;
    private int id_receita;
    private String descricao;
    private String data;

    public Consulta(int id_medico, int id_paciente, String descricao, String data) {
        this.id_medico = id_medico;
        this.id_paciente = id_paciente;
        this.descricao = descricao;
        this.data = data;
    }

    public Consulta() {
    }
    
    public Consulta(int id_medico, int id_paciente, String data){
        this.id_medico = id_medico;
        this.id_paciente = id_paciente;
        this.data = data;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getId_medico() {
        return id_medico;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    public int getId_receita() {
        return id_receita;
    }

    public void setId_receita(int id_receita) {
        this.id_receita = id_receita;
    }
    
    
}
