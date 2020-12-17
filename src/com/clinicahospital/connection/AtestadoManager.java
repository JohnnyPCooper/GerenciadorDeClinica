/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinicahospital.connection;

import com.clinicahospital.receita.Atestado;
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
public class AtestadoManager {
    // Nesta função se faz a inserção de dados em nosso banco.
    public void inserir(Atestado t) throws SQLException, ClassNotFoundException{
        Connection conn = ConectarBD.getInstance().getConnection();
        
        String sql = "INSERT INTO atestado (id, id_consulta, descricao, data) VALUES (?,?,?,?)";
        
        try (PreparedStatement statement = conn.prepareStatement(sql)) {

            statement.setInt(1, t.getId());
            statement.setInt(2, t.getId_consulta());
            statement.setString(3, t.getDescricao());
            statement.setString(4, t.getData());
            
            statement.execute();
        }
        catch (Exception e){
        }
    }
    // Nesta função, se faz a remoção de um elemento de nossa tabela através do id. Essa ação não poderá ser desfeita. Tomar cuidado ao usar ao decorrer do programa.
    public void deletar(int id) throws SQLException, ClassNotFoundException{
        Connection conn = ConectarBD.getInstance().getConnection();
        String sql = "DELETE FROM atestado WHERE id = ?";
        
        try {
           
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setInt(1, id);
            
            statement.execute();
            
        } catch (Exception e) {
        }
         
    }
    // Nesta função, se faz a listagem total de todas os elementos inseridos em nosso banco de dados. Ela retornará uma lista.
    public List<Atestado> listar(){
        List<Atestado> listaAtestados = new ArrayList<Atestado>();
        try {
            Connection connection = ConectarBD.getInstance().getConnection();
            String sql = "SELECT * FROM atestado";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            
            ResultSet resultset = statement.executeQuery();
            
            while(resultset.next()){
                Atestado atestado = new Atestado();
                atestado.setId(resultset.getInt("id"));
                atestado.setId_consulta(resultset.getInt("id_consulta"));
                atestado.setDescricao(resultset.getString("descricao"));
                atestado.setData(resultset.getString("data"));
                
                listaAtestados.add(atestado);
            }
            
            connection.close();
        } catch (Exception e) {
        }
        
        return listaAtestados;
    }
    
}
