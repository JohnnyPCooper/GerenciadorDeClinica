/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinicahospital.connection;

import com.clinicahospital.notificacao.Notificacao;
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
public class NotificacaoManager {
    // Nesta função se faz a criação e envio da notificação.
    public void notificar(Notificacao n) throws SQLException, ClassNotFoundException{
        Connection conn = ConectarBD.getInstance().getConnection();
        
        String sql = "INSERT INTO notificacao (id_emissor, id_destino, mensagem, data, aberta, nome_emissor) VALUES (?,?,?,?,?,?)";
        
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
           
            statement.setInt(1, n.getId_emissor());
            statement.setInt(2, n.getId_destino());
            statement.setString(3, n.getMensagem());
            statement.setString(4, n.getData());
            statement.setInt(5, 0);
            statement.setString(6, n.getNome_emissor());

            System.out.println("Operação efetuada com sucesso.");
            statement.execute();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    // Nesta função, se faz a listagem total de todas os elementos inseridos em nosso banco de dados. Ela retornará uma lista.
    public List<Notificacao> listar(int id, boolean aberta){
        List<Notificacao> listaNotificacoes = new ArrayList<Notificacao>();
        try {
            Connection connection = ConectarBD.getInstance().getConnection();
            String sql = "SELECT * FROM notificacao WHERE id_destino = ? AND aberta = ?";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            if(aberta == true){
               statement.setInt(2, 1);
            }
            else if(aberta == false){
                statement.setInt(2, 0);
            }
            ResultSet resultset = statement.executeQuery();
            
            while(resultset.next()){
                Notificacao notificacao = new Notificacao();
                notificacao.setId(resultset.getInt("id"));
                notificacao.setId_emissor(resultset.getInt("id_emissor"));
                notificacao.setId_destino(resultset.getInt("id_destino"));
                notificacao.setMensagem(resultset.getString("mensagem"));
                notificacao.setData(resultset.getString("data"));
                notificacao.setAberta(resultset.getInt("aberta"));
                notificacao.setNome_emissor(resultset.getString("nome_emissor"));
                listaNotificacoes.add(notificacao);
            }
            System.out.println("Operação efetuada com sucesso.");
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return listaNotificacoes;
    }
    // Neste método, se faz a atualização de algum dado no nosso banco de dados, para que isso ocorra, se faz necessário enviar um objeto do tipo Pessoa em nosso parâmetro.
    public void abrir(int n){
        try {
            Connection conn = ConectarBD.getInstance().getConnection();
            
            String sql = "UPDATE notificacao SET aberta = '1' WHERE id = " + n;
            PreparedStatement statement = conn.prepareStatement(sql);
            System.out.println(n);
            System.out.println(sql);
            statement.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
