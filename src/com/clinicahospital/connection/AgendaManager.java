/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinicahospital.connection;

import com.clinicahospital.agenda.Agendar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author porti
 */
public class AgendaManager {
    // Nesta função se faz a inserção de dados em nosso banco.
    public void inserir(Agendar a) throws SQLException, ClassNotFoundException{
        Connection conn = ConectarBD.getInstance().getConnection();
        
        String sql = "INSERT INTO agenda (data, hora, id_medico, id_paciente, id) VALUES (?,?,?,?,?)";
        
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
           
            statement.setString(1, a.getData());
            statement.setString(2, a.getHorario());
            statement.setInt(3, a.getId_medico());
            statement.setInt(4, a.getId_paciente());
            statement.setInt(5, a.getId());

            
            statement.execute();
        }
        catch (Exception e){
        }
    }
    // Nesta função, se faz a remoção de um elemento de nossa tabela através do id. Essa ação não poderá ser desfeita. Tomar cuidado ao usar ao decorrer do programa.
    public void deletar(int id) throws SQLException, ClassNotFoundException{
        Connection conn = ConectarBD.getInstance().getConnection();
        String sql = "DELETE FROM agenda WHERE id = ?";
        
        try {
           
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setInt(1, id);
            
            statement.execute();
            
        } catch (Exception e) {
        }
         
    }
    // Nesta função, se faz a listagem total de todas os elementos inseridos em nosso banco de dados. Ela retornará uma lista.
    public List<Agendar> listar(){
        List<Agendar> listaAgendas = new ArrayList<Agendar>();
        try {
            Connection connection = ConectarBD.getInstance().getConnection();
            String sql = "SELECT * FROM agenda";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            
            ResultSet resultset = statement.executeQuery();
            
            while(resultset.next()){
                Agendar agenda = new Agendar();
                agenda.setData(resultset.getString("data"));
                agenda.setHorario(resultset.getString("hora"));
                agenda.setId_medico(resultset.getInt("id_medico"));
                agenda.setId_paciente(resultset.getInt("id_paciente"));
                agenda.setId(resultset.getInt("id"));
                
                listaAgendas.add(agenda);
            }
            
            connection.close();
        } catch (Exception e) {
        }
        
        return listaAgendas;
    }
    // Neste método, se faz a atualização de algum dado no nosso banco de dados, para que isso ocorra, se faz necessário enviar um objeto do tipo Pessoa em nosso parâmetro.
    public void atualizar(Agendar a){
        try {
            Connection conn = ConectarBD.getInstance().getConnection();
            
            String sql = "UPDATE agenda SET data = ?, hora = ?, id_medico = ?, id_paciente = ? WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1, a.getData());
            statement.setString(2, a.getHorario());
            statement.setInt(3, a.getId_medico());
            statement.setInt(4, a.getId_paciente());
            statement.setInt(5, a.getId());
            
        } catch (Exception e) {
        }
    }
    
}
