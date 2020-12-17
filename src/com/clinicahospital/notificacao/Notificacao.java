/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinicahospital.notificacao;

/**
 *
 * @author porti
 */
public class Notificacao{
    private int id_destino;
    private int id_emissor;
    private int id;
    private String mensagem;
    private String data;
    private int aberta;
    private String nome_emissor;

    public int getId_destino() {
        return id_destino;
    }

    public void setId_destino(int id_medico) {
        this.id_destino = id_medico;
    }

    public int getId_emissor() {
        return id_emissor;
    }

    public void setId_emissor(int id_emissor) {
        this.id_emissor = id_emissor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int isAberta() {
        return aberta;
    }

    public void setAberta(int aberta) {
        this.aberta = aberta;
    }

    public String getNome_emissor() {
        return nome_emissor;
    }

    public void setNome_emissor(String nome_emissor) {
        this.nome_emissor = nome_emissor;
    }
    
    
    
}
