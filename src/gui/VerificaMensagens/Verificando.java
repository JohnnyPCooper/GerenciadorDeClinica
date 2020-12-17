/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.VerificaMensagens;

import com.clinicahospital.connection.NotificacaoManager;
import com.clinicahospital.notificacao.Notificacao;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author porti
 */
public class Verificando implements Runnable{
    String login;
    public Verificando(String login){
        this.login = login;
    }
    
    @Override
    public void run() {
        for(int i = 0; ;i++){
            NotificacaoManager notificacao  = new NotificacaoManager();
            List<Notificacao> notificacoes = new ArrayList<Notificacao>();
            notificacoes = notificacao.listar(Integer.parseInt(login), false);
            int size = notificacoes.size();
            if(size > 0){
                JOptionPane.showMessageDialog(null, "Você tem " + notificacoes.size() + " mensagens não lidas!");
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Verificando.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }

    }
    
}
