/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinicahospital.connection;

import com.clinicahospital.consulta.Consulta;
import com.clinicahospital.pessoas.Pessoa;
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
public class ConsultaManager {
    // Nesta função se faz a inserção de dados em nosso banco.
    public void inserir(Consulta c) throws SQLException, ClassNotFoundException{
        Connection conn = ConectarBD.getInstance().getConnection();
        
        String sql = "INSERT INTO consulta (id_medico, id_paciente, id_receita, descricao, data) VALUES (?,?,?,?,?)";
      
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, c.getId_medico());
            statement.setInt(2, c.getId_paciente());
            statement.setInt(3, c.getId_receita());
            statement.setString(4, c.getDescricao());
            statement.setString(5, c.getData());
            
            statement.execute();
        }
        catch (Exception e){
        }
    }
    
    
    // Nesta função, se faz a listagem total de todas os elementos inseridos em nosso banco de dados. Ela retornará uma lista.
    public List<Consulta> listar(){
        List<Consulta> listaConsultas = new ArrayList<Consulta>();
        try {
            Connection connection = ConectarBD.getInstance().getConnection();
            String sql = "SELECT * FROM consulta";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            
            ResultSet resultset = statement.executeQuery();
            
            while(resultset.next()){
                
                Consulta consulta = new Consulta();
                
                consulta.setId(resultset.getInt("id"));
                consulta.setId_medico(resultset.getInt("id_medico"));
                consulta.setId_paciente(resultset.getInt("id_paciente"));
                consulta.setId_receita(resultset.getInt("id_receita"));
                consulta.setDescricao(resultset.getString("descricao"));
                consulta.setData(resultset.getString("data"));
                
                listaConsultas.add(consulta);
            }
            
            connection.close();
        } catch (Exception e) {
        }
        
        return listaConsultas;
    }
    // Neste método, se faz a atualização de algum dado no nosso banco de dados, para que isso ocorra, se faz necessário enviar um objeto do tipo Pessoa em nosso parâmetro.
    public void atualizar(Consulta c){
        try {
            Connection conn = ConectarBD.getInstance().getConnection();
            
            String sql = "UPDATE consulta SET id_medico = ?, id_paciente = ?, id_receita = ?, descricao = ?, data = ? WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            
            
            statement.setInt(1, c.getId_medico());
            statement.setInt(2, c.getId_paciente());
            statement.setInt(3, c.getId_receita());
            statement.setString(4, c.getDescricao());
            statement.setString(5, c.getData());
            statement.setInt(6, c.getId());
            
        } catch (Exception e) {
        }
    }
   public Consulta selecionarId(int id){
        Consulta consulta = new Consulta();
        try {
            Connection connection = ConectarBD.getInstance().getConnection();
            String sql = "SELECT * FROM consulta WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultset = statement.executeQuery();
            
            while(resultset.next()){
                consulta.setId(resultset.getInt("id"));
                consulta.setData(resultset.getString("data"));
                consulta.setDescricao(resultset.getString("descricao"));
                consulta.setId_medico(resultset.getInt("id_medico"));
                consulta.setId_paciente(resultset.getInt("id_paciente"));
                consulta.setId_receita(resultset.getInt("id_receita"));
            }
            connection.close();
            return consulta;
        } catch (Exception e) {
        }
        
        return consulta;
    }
    
}
