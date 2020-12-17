/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinicahospital.connection;

import com.clinicahospital.pessoas.Medico;
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
public class MedicoManager {
    // Nesta função se faz a inserção de dados em nosso banco.
    public void inserir(Medico m) throws SQLException, ClassNotFoundException{
        Connection conn = ConectarBD.getInstance().getConnection();
        System.out.println("Rodou até aqui");
        String sql = "INSERT INTO medico (nome, sobrenome, telefone, endereco, doencas, nascimento, convenio, nivel_acesso, crm) VALUES (?,?,?,?,?,?,?,?,?)";
        
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            int nivelAcesso;
            nivelAcesso = m.getNivelAcesso();
            statement.setString(1, m.getNome());
            statement.setString(2, m.getSobrenome());
            statement.setString(3, m.getTelefone());
            statement.setString(4, m.getEndereco());
            statement.setString(5, m.getDoencas());
            statement.setString(6, m.getNascimento());
            statement.setString(7, m.getConvenio());
            statement.setInt(8, nivelAcesso);
            statement.setInt(9, m.getCrm());
            
            statement.execute();
            System.out.print("Cadastrado com sucesso!");
            conn.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    // Nesta função, se faz a listagem total de todas os elementos inseridos em nosso banco de dados. Ela retornará uma lista.
    public List<Medico> listar(){
        List<Medico> listaMedicos = new ArrayList<Medico>();
        try {
            Connection connection = ConectarBD.getInstance().getConnection();
            String sql = "SELECT * FROM medico";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            
            ResultSet resultset = statement.executeQuery();
            
            while(resultset.next()){
                
                Medico medico = new Medico();
                medico.setId(resultset.getInt("id"));
                medico.setNome(resultset.getString("nome"));
                medico.setSobrenome(resultset.getString("sobrenome"));
                medico.setTelefone(resultset.getString("telefone"));
                medico.setEndereco(resultset.getString("endereco"));
                medico.setDoencas(resultset.getString("doencas"));
                medico.setNascimento(resultset.getString("nascimento"));
                medico.setConvenio(resultset.getString("convenio"));
                medico.setNivelAcesso(resultset.getInt("nivel_acesso"));
                medico.setCrm(resultset.getInt("crm"));
                listaMedicos.add(medico);
            }
            
            connection.close();
        } catch (Exception e) {
        }
        
        return listaMedicos;
    }
    // Neste método, se faz a atualização de algum dado no nosso banco de dados, para que isso ocorra, se faz necessário enviar um objeto do tipo Pessoa em nosso parâmetro.
    public void atualizar(Medico m){
        try {
            Connection conn = ConectarBD.getInstance().getConnection();
            
            String sql = "UPDATE medico SET nome = ?, sobrenome = ?, telefone = ?, endereco = ?, doencas = ?, nascimento = ?, convenio = ?, nivel_acesso = ?, crm = ? WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            int nivelAcesso;
            nivelAcesso = m.getNivelAcesso();
            statement.setString(1, m.getNome());
            statement.setString(2, m.getSobrenome());
            statement.setString(3, m.getTelefone());
            statement.setString(4, m.getEndereco());
            statement.setString(5, m.getDoencas());
            statement.setString(6, m.getNascimento());
            statement.setString(7, m.getConvenio());
            statement.setString(8, Integer.toString(nivelAcesso));
            statement.setInt(9, m.getCrm());
            statement.setInt(10, m.getId());
            
        } catch (Exception e) {
        }
    }
    public Medico selecionar(String telefone){
            Medico pessoa = new Medico();
            try {
                Connection connection = ConectarBD.getInstance().getConnection();
                String sql = "SELECT * FROM medico WHERE telefone = ?";
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
    public boolean temCrm(int crm){
        int crmBD = 0000;
        Medico pessoa = new Medico();
            try {
                Connection connection = ConectarBD.getInstance().getConnection();
                String sql = "SELECT crm FROM medico WHERE crm = ?";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1, crm);
                ResultSet resultset = statement.executeQuery();

                while(resultset.next()){
                    crm = (resultset.getInt("crm"));     
                }
                connection.close();
                if(crm == crmBD){
                    return true;
                }
                else{
                    return false;
                }
            } catch (Exception e) {
            }
            return false;
    }
    public Medico selecionarCrm(int crm){
            Medico pessoa = new Medico();
            try {
                Connection connection = ConectarBD.getInstance().getConnection();
                String sql = "SELECT * FROM medico WHERE crm = ?";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1, crm);
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
