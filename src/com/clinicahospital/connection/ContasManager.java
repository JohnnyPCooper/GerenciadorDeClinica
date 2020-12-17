/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinicahospital.connection;

import com.clinicahospital.notificacao.Notificacao;
import com.clinicahospital.pessoas.Contas;
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
public class ContasManager {
    private int nivel_acesso;
    // Nesta função se faz a criação e envio da notificação.
    public void cadastrar(Contas c) throws SQLException, ClassNotFoundException{
        Connection conn = ConectarBD.getInstance().getConnection();
        
        String sql = "INSERT INTO contas (id_conta, login, senha, nivel_acesso) VALUES (?,?,?,?)";
        
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
           
            statement.setInt(1, c.getId_conta());
            statement.setString(2, c.getLogin());
            statement.setString(3, c.getSenha());
            statement.setInt(4, c.getNivel_acesso());


            
            statement.execute();
        }
        catch (Exception e){
        }
    }
    // Neste método, se faz a atualização de algum dado no nosso banco de dados, para que isso ocorra, se faz necessário enviar um objeto do tipo Pessoa em nosso parâmetro.
    public boolean autenticar(Contas c){
        boolean pode = false;
        Contas caux = new Contas();
        System.out.println(c.getLogin());
        System.out.println(c.getSenha());
        try {
            Connection conn = ConectarBD.getInstance().getConnection();
            
            
            String sql = "SELECT * FROM contas WHERE login = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, c.getLogin());
            ResultSet resultset = statement.executeQuery();
            while(resultset.next()){
                caux.setLogin(resultset.getString("login"));
                caux.setSenha(resultset.getString("senha"));
                nivel_acesso = resultset.getInt("nivel_acesso");
            }
            
            System.out.println("Login correto: " + caux.getLogin());
            if(c.getLogin().equals(caux.getLogin())){
                if((c.getSenha()).equals(caux.getSenha())){
                    System.out.print("Deu certo.");
                    pode = true;
                }
                else{
                    pode = false;
                }
               
            }else{
                pode = false;
            }

        } catch (Exception e) {
        }
        return pode;
    }

    public int getNivel_acesso() {
        return nivel_acesso;
    }
     public List<Contas> listar(){
        List<Contas> listaContas = new ArrayList<Contas>();
        try {
            Connection connection = ConectarBD.getInstance().getConnection();
            String sql = "SELECT * FROM contas";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            
            ResultSet resultset = statement.executeQuery();
            
            while(resultset.next()){
                
                Contas conta = new Contas();
                conta.setId(resultset.getInt("id"));
                conta.setId_conta(resultset.getInt("id_conta"));
                conta.setLogin(resultset.getString("login"));
                conta.setSenha(resultset.getString("senha"));
                conta.setNivel_acesso(resultset.getInt("nivel_acesso"));
                
                listaContas.add(conta);
            }
            
            connection.close();
        } catch (Exception e) {
        }
        
        return listaContas;
    }
    public void atualizar(Contas c){
        try {
            Connection conn = ConectarBD.getInstance().getConnection();
            
            String sql = "UPDATE contas SET id_conta = ?, login = ?, senha = ?, nivel_acesso = ? WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setInt(1, c.getId_conta());
            statement.setString(2, c.getLogin());
            statement.setString(3, c.getSenha());
            statement.setInt(4, c.getNivel_acesso());
            statement.setInt(5, c.getId());
            statement.execute();
        } catch (Exception e) {
        }
    
}
}
