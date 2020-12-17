/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.VerificaMensagens;

/**
 *
 * @author porti
 */
public class Verifica extends Thread{
    String login;
    public Verifica(String login) throws InterruptedException{
        this.login = login;
        Verificando verificando = new Verificando(login);
        Thread verificaNotificacoes = new Thread(verificando);
        verificaNotificacoes.start();
    }
    
    
    
}
