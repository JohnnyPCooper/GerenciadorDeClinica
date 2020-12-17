/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinicahospital.pessoas;

/**
 *
 * @author porti
 */
public class Pessoa {
    private int id;
    private String nome;
    private String sobrenome;
    private String telefone;
    private String endereco;
    private String doencas ;
    private String nascimento;
    private String convenio ;
    private int nivelAcesso = 0;
    

    public Pessoa(String nome, String sobrenome, String telefone, String endereco, String doencas, String nascimento, String convenio, int nivelAcesso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.doencas = doencas;
        this.nascimento = nascimento;
        this.convenio = convenio;
        this.nivelAcesso = nivelAcesso;
    }
    public Pessoa(int id, String nome, String sobrenome, String telefone, String endereco, String doencas, String nascimento, String convenio, int nivelAcesso) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.doencas = doencas;
        this.nascimento = nascimento;
        this.convenio = convenio;
        this.nivelAcesso = nivelAcesso;
    }
    public Pessoa(){
    }
    
    public int getNivelAcesso() {
        return nivelAcesso;
    }
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getDoencas() {
        return doencas;
    }

    public String getNascimento() {
        return nascimento;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDoencas(String doencas) {
        this.doencas = doencas;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
    
}
