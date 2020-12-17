/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinicahospital.agenda;
/**
 *
 * @author porti
 */
public class Agendar {
    private int id;
    private String data;
    private String horario;
    private int id_medico;
    private int id_paciente;

    public Agendar( String data, String horario, int id_paciente, int id_medico) {
        this.id = (int)(Math.random()*1000000);
        this.data = data;
        this.horario = horario;
        this.id_medico = id_medico;
        this.id_paciente = id_paciente;
    }
    public Agendar(){
        
    }
    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
    
}
