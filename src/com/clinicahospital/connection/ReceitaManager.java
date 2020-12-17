/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinicahospital.connection;

import com.clinicahospital.receita.Receita;
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
public class ReceitaManager {
    // Nesta função se faz a inserção de dados em nosso banco.
    public void inserir(Receita r) throws SQLException, ClassNotFoundException{
        Connection conn = ConectarBD.getInstance().getConnection();
        
        String sql = "INSERT INTO receita (id, id_consulta, descricao, data) VALUES (?,?,?,?)";
        
        try (PreparedStatement statement = conn.prepareStatement(sql)) {

            statement.setInt(1, r.getId());
            statement.setInt(2, r.getId_consuta());
            statement.setString(3, r.getDescricao());
            statement.setString(4, r.getData());
            
            statement.execute();
        }
        catch (Exception e){
        }
    }
    // Nesta função, se faz a listagem total de todas os elementos inseridos em nosso banco de dados. Ela retornará uma lista.
    public List<Receita> listar(){
        List<Receita> listaReceitas = new ArrayList<Receita>();
        try {
            Connection connection = ConectarBD.getInstance().getConnection();
            String sql = "SELECT * FROM receita";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            
            ResultSet resultset = statement.executeQuery();
            
            while(resultset.next()){
                Receita receita = new Receita();
                receita.setId(resultset.getInt("id"));
                receita.setId_consuta(resultset.getInt("id_consulta"));
                receita.setDescricao(resultset.getString("descricao"));
                receita.setData(resultset.getString("data"));
                
                listaReceitas.add(receita);
            }
            
            connection.close();
        } catch (Exception e) {
        }
        
        return listaReceitas;
    }
    
}
