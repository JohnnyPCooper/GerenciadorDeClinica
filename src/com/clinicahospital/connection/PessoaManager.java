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
public class PessoaManager {
    // Nesta função se faz a inserção de dados em nosso banco.
    public void inserir(Pessoa p) throws SQLException, ClassNotFoundException{
        Connection conn = ConectarBD.getInstance().getConnection();
        
        String sql = "INSERT INTO pessoa (nome, sobrenome, telefone, endereco, doencas, nascimento, convenio, nivel_acesso) VALUES (?,?,?,?,?,?,?,?)";
        
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            int nivelAcesso;
            nivelAcesso = p.getNivelAcesso();
            statement.setString(1, p.getNome());
            statement.setString(2, p.getSobrenome());
            statement.setString(3, p.getTelefone());
            statement.setString(4, p.getEndereco());
            statement.setString(5, p.getDoencas());
            statement.setString(6, p.getNascimento());
            statement.setString(7, p.getConvenio());
            statement.setString(8, Integer.toString(nivelAcesso));
            statement.execute();
            System.out.print("Cadastrado com sucesso!");
            conn.close();
        }
        catch (Exception e){
        }
    }
    // Nesta função, se faz a remoção de um elemento de nossa tabela através do id. Essa ação não poderá ser desfeita. Tomar cuidado ao usar ao decorrer do programa.
    public void deletar(int id) throws SQLException, ClassNotFoundException{
        Connection conn = ConectarBD.getInstance().getConnection();
        String sql = "DELETE FROM pessoa WHERE id = ?";
        
        try {
           
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setInt(1, id);
            
            statement.execute();
            
        } catch (Exception e) {
        }
         
    }
    // Nesta função, se faz a listagem total de todas os elementos inseridos em nosso banco de dados. Ela retornará uma lista.
    public List<Pessoa> listar(){
        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
        try {
            Connection connection = ConectarBD.getInstance().getConnection();
            String sql = "SELECT * FROM pessoa";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            
            ResultSet resultset = statement.executeQuery();
            
            while(resultset.next()){
                
                Pessoa pessoa = new Pessoa();
                pessoa.setId(resultset.getInt("id"));
                pessoa.setNome(resultset.getString("nome"));
                pessoa.setSobrenome(resultset.getString("sobrenome"));
                pessoa.setTelefone(resultset.getString("telefone"));
                pessoa.setEndereco(resultset.getString("endereco"));
                pessoa.setDoencas(resultset.getString("doencas"));
                pessoa.setNascimento(resultset.getString("nascimento"));
                pessoa.setConvenio(resultset.getString("convenio"));
                pessoa.setNivelAcesso(resultset.getInt("nivel_acesso"));
                
                listaPessoas.add(pessoa);
            }
            
            connection.close();
        } catch (Exception e) {
        }
        
        return listaPessoas;
    }
    // Neste método, se faz a atualização de algum dado no nosso banco de dados, para que isso ocorra, se faz necessário enviar um objeto do tipo Pessoa em nosso parâmetro.
    public void atualizar(Pessoa p){
        try {
            Connection conn = ConectarBD.getInstance().getConnection();
            
            String sql = "UPDATE pessoa SET nome = ?, sobrenome = ?, telefone = ?, endereco = ?, doencas = ?, nascimento = ?, convenio = ?, nivel_acesso = ? WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1, p.getNome());
            statement.setString(2, p.getSobrenome());
            statement.setString(3, p.getTelefone());
            statement.setString(4, p.getEndereco());
            statement.setString(5, p.getDoencas());
            statement.setString(6, p.getNascimento());
            statement.setString(7, p.getConvenio());
            statement.setInt(8, p.getNivelAcesso());
            statement.setInt(9, p.getId());
            
        } catch (Exception e) {
        }
    }
public List<Pessoa> selecionar(String nome){
        List<Pessoa> pessoa = new ArrayList<Pessoa>();
        try {
            Connection connection = ConectarBD.getInstance().getConnection();
            String sql = "SELECT * FROM pessoa WHERE nome = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nome);
            ResultSet resultset = statement.executeQuery();
            
            while(resultset.next()){
                Pessoa paux = new Pessoa();
                paux.setId(resultset.getInt("id"));
                paux.setNome(resultset.getString("nome"));
                paux.setSobrenome(resultset.getString("sobrenome"));
                paux.setTelefone(resultset.getString("telefone"));
                paux.setEndereco(resultset.getString("endereco"));
                paux.setDoencas(resultset.getString("doencas"));
                paux.setNascimento(resultset.getString("nascimento"));
                paux.setConvenio(resultset.getString("convenio"));
                paux.setNivelAcesso(resultset.getInt("nivel_acesso"));    
                pessoa.add(paux);
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
