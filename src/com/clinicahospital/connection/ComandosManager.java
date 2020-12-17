/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinicahospital.connection;

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
public class ComandosManager {
    public Pessoa selecionar(String telefone){
        Pessoa pessoa = new Pessoa();
        try {
            Connection connection = ConectarBD.getInstance().getConnection();
            String sql = "SELECT * FROM pessoa WHERE telefone = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, telefone);
            ResultSet resultset = statement.executeQuery();
            
            while(resultset.next()){
                pessoa.setId(resultset.getInt("id"));
                pessoa.setNome(resultset.getString("nome"));
                pessoa.setSobrenome(resultset.getString("sobrenome"));
                pessoa.setTelefone(resultset.getString("telefone"));
                pessoa.setEndereco(resultset.getString("endereco"));
                pessoa.setDoencas(resultset.getString("doencas"));
                pessoa.setNascimento(resultset.getString("nascimento"));
                pessoa.setConvenio(resultset.getString("convenio"));
                pessoa.setNivelAcesso(resultset.getInt("nivel_acesso"));     
            }
            connection.close();
            return pessoa;
        } catch (Exception e) {
        }
        
        return pessoa;
    }
    public Pessoa selecionarId(int id){
        Pessoa pessoa = new Pessoa();
        try {
            Connection connection = ConectarBD.getInstance().getConnection();
            String sql = "SELECT * FROM pessoa WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultset = statement.executeQuery();
            
            while(resultset.next()){
                pessoa.setId(resultset.getInt("id"));
                pessoa.setNome(resultset.getString("nome"));
                pessoa.setSobrenome(resultset.getString("sobrenome"));
                pessoa.setTelefone(resultset.getString("telefone"));
                pessoa.setEndereco(resultset.getString("endereco"));
                pessoa.setDoencas(resultset.getString("doencas"));
                pessoa.setNascimento(resultset.getString("nascimento"));
                pessoa.setConvenio(resultset.getString("convenio"));
                pessoa.setNivelAcesso(resultset.getInt("nivel_acesso"));     
            }
            connection.close();
            return pessoa;
        } catch (Exception e) {
        }
        
        return pessoa;
    }
}