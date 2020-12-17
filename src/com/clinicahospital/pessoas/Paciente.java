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
public class Paciente extends Pessoa{
    
    public Paciente(String nome, String sobrenome, String telefone, String endereco, String doencas, String nascimento, String convenio, int nivelAcesso) {
        super(nome, sobrenome, telefone, endereco, doencas, nascimento, convenio, nivelAcesso);
    }
    
}
