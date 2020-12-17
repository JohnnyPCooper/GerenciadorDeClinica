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
public class Medico extends Pessoa{
    private int crm;
    
    public Medico(String nome, String sobrenome, String telefone, String endereco, String doencas, String nascimento, String convenio, int nivelAcesso, int crm) {
        super(nome, sobrenome, telefone, endereco, doencas, nascimento, convenio, nivelAcesso);
        this.crm = crm;
    }
    public Medico(){
        
    }
    public int getCrm() {
        return crm;
    }
    public void setCrm(int crm){
        this.crm = crm;
    }
    
}
