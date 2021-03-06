/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Weleson
 */
public class Tela_Atestado extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Inicio
     */
    public Tela_Atestado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botao_selecionar = new javax.swing.JButton();
        botao_sair = new javax.swing.JButton();
        campo_data = new javax.swing.JTextField();
        campo_id = new javax.swing.JTextField();
        campo_descricao = new javax.swing.JTextField();
        botao_criar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        icone = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botao_selecionar.setBackground(new java.awt.Color(86, 131, 176));
        botao_selecionar.setFont(new java.awt.Font("Source Code Pro", 1, 20)); // NOI18N
        botao_selecionar.setForeground(new java.awt.Color(255, 255, 255));
        botao_selecionar.setText("Selecionar ");
        botao_selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_selecionarActionPerformed(evt);
            }
        });
        getContentPane().add(botao_selecionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 280, 50));

        botao_sair.setBackground(new java.awt.Color(86, 131, 176));
        botao_sair.setFont(new java.awt.Font("Source Code Pro", 1, 20)); // NOI18N
        botao_sair.setForeground(new java.awt.Color(255, 255, 255));
        botao_sair.setText("Sair");
        getContentPane().add(botao_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 150, 50));

        campo_data.setBackground(new java.awt.Color(142, 193, 245));
        campo_data.setFont(new java.awt.Font("Source Code Pro", 1, 20)); // NOI18N
        campo_data.setForeground(new java.awt.Color(255, 255, 255));
        campo_data.setText("Data");
        campo_data.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        campo_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_dataActionPerformed(evt);
            }
        });
        getContentPane().add(campo_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 350, 40));

        campo_id.setBackground(new java.awt.Color(142, 193, 245));
        campo_id.setFont(new java.awt.Font("Source Code Pro", 1, 20)); // NOI18N
        campo_id.setForeground(new java.awt.Color(255, 255, 255));
        campo_id.setText("ID");
        campo_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        getContentPane().add(campo_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 350, 40));

        campo_descricao.setBackground(new java.awt.Color(142, 193, 245));
        campo_descricao.setFont(new java.awt.Font("Source Code Pro", 1, 20)); // NOI18N
        campo_descricao.setForeground(new java.awt.Color(255, 255, 255));
        campo_descricao.setText("Descrição");
        campo_descricao.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        getContentPane().add(campo_descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 350, 110));

        botao_criar.setBackground(new java.awt.Color(86, 131, 176));
        botao_criar.setFont(new java.awt.Font("Source Code Pro", 1, 20)); // NOI18N
        botao_criar.setForeground(new java.awt.Color(255, 255, 255));
        botao_criar.setText("Criar");
        getContentPane().add(botao_criar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 280, 50));

        titulo.setFont(new java.awt.Font("Source Code Pro", 1, 40)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("ATESTADO");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 200, 80));

        icone.setFont(new java.awt.Font("Source Code Pro", 1, 20)); // NOI18N
        icone.setForeground(new java.awt.Color(255, 255, 255));
        icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/logo.png"))); // NOI18N
        icone.setText("HAE");
        getContentPane().add(icone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 60));

        fundo.setForeground(new java.awt.Color(255, 255, 255));
        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Tela.png"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_dataActionPerformed

    private void botao_selecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_selecionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_selecionarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_Atestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Atestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Atestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Atestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Atestado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_criar;
    private javax.swing.JButton botao_sair;
    private javax.swing.JButton botao_selecionar;
    private javax.swing.JTextField campo_data;
    private javax.swing.JTextField campo_descricao;
    private javax.swing.JTextField campo_id;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel icone;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
