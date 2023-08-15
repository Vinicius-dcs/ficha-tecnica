/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Controller.CadastroController;
import FiveCodMover.FiveCodMoverJFrame;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author vinic
 */
public class Cadastro extends javax.swing.JFrame {

    CadastroController controller = new CadastroController(this);

    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        initComponents();
        this.setLocationRelativeTo(null);//Abre JFrame no meio da página

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        entre = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        preencherNome = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        usuario1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        cadastrar_botao = new javax.swing.JPanel();
        cadastrar_txt = new javax.swing.JLabel();
        usuario2 = new javax.swing.JLabel();
        preencherSenha = new javax.swing.JPasswordField();
        jSeparator7 = new javax.swing.JSeparator();
        preencherUsuario = new javax.swing.JTextField();
        x = new javax.swing.JLabel();
        usuario3 = new javax.swing.JLabel();
        confirmarSenha = new javax.swing.JPasswordField();
        jSeparator8 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(36, 46, 68));

        entre.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        entre.setForeground(new java.awt.Color(255, 255, 255));
        entre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entre.setText("Cadastre-se");

        usuario.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("USUÁRIO");

        preencherNome.setBackground(new java.awt.Color(36, 46, 68));
        preencherNome.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        preencherNome.setForeground(new java.awt.Color(255, 255, 255));
        preencherNome.setBorder(null);

        usuario1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        usuario1.setForeground(new java.awt.Color(255, 255, 255));
        usuario1.setText("NOME");

        cadastrar_botao.setBackground(new java.awt.Color(89, 199, 198));

        cadastrar_txt.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        cadastrar_txt.setForeground(new java.awt.Color(255, 255, 255));
        cadastrar_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cadastrar_txt.setText("Cadastrar");
        cadastrar_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrar_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrar_txtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cadastrar_txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cadastrar_txtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cadastrar_botaoLayout = new javax.swing.GroupLayout(cadastrar_botao);
        cadastrar_botao.setLayout(cadastrar_botaoLayout);
        cadastrar_botaoLayout.setHorizontalGroup(
            cadastrar_botaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadastrar_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
        );
        cadastrar_botaoLayout.setVerticalGroup(
            cadastrar_botaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadastrar_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        usuario2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        usuario2.setForeground(new java.awt.Color(255, 255, 255));
        usuario2.setText("SENHA");

        preencherSenha.setBackground(new java.awt.Color(36, 46, 68));
        preencherSenha.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        preencherSenha.setForeground(new java.awt.Color(255, 255, 255));
        preencherSenha.setBorder(null);
        preencherSenha.setPreferredSize(new java.awt.Dimension(111, 21));

        preencherUsuario.setBackground(new java.awt.Color(36, 46, 68));
        preencherUsuario.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        preencherUsuario.setForeground(new java.awt.Color(255, 255, 255));
        preencherUsuario.setBorder(null);

        x.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        x.setForeground(new java.awt.Color(89, 199, 198));
        x.setText("X");
        x.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        x.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                xAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        x.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                xMouseMoved(evt);
            }
        });
        x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xMouseExited(evt);
            }
        });

        usuario3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        usuario3.setForeground(new java.awt.Color(255, 255, 255));
        usuario3.setText("CONFIRMAR SENHA");

        confirmarSenha.setBackground(new java.awt.Color(36, 46, 68));
        confirmarSenha.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        confirmarSenha.setForeground(new java.awt.Color(255, 255, 255));
        confirmarSenha.setBorder(null);
        confirmarSenha.setPreferredSize(new java.awt.Dimension(111, 21));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(entre, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(preencherNome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(preencherUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                            .addComponent(usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(preencherSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(usuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(confirmarSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(x)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cadastrar_botao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(x)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entre)
                .addGap(32, 32, 32)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(preencherUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(preencherNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(preencherSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cadastrar_botao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_xAncestorAdded

    }//GEN-LAST:event_xAncestorAdded

    private void xMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseMoved

    }//GEN-LAST:event_xMouseMoved

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        dispose();
    }//GEN-LAST:event_xMouseClicked

    private void xMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseEntered
        x.setForeground(Color.red); //Ao passar mouse pelo X deixa vermelho
    }//GEN-LAST:event_xMouseEntered

    private void xMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseExited
        x.setForeground(new java.awt.Color(89, 199, 198)); //Volta a cor padrão do X ao tirar o mouse
    }//GEN-LAST:event_xMouseExited

    private void cadastrar_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrar_txtMouseClicked
        try {
            controller.salvarUsuario();
        } catch (SQLException | ClassNotFoundException ex) {
            System.err.println("Erro: " + ex);
            //Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cadastrar_txtMouseClicked

    private void cadastrar_txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrar_txtMouseEntered
        cadastrar_txt.setForeground(new java.awt.Color(36, 46, 68));
    }//GEN-LAST:event_cadastrar_txtMouseEntered

    private void cadastrar_txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrar_txtMouseExited
        cadastrar_txt.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrar_txtMouseExited

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        FiveCodMoverJFrame.MousePressed(evt);
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
    }//GEN-LAST:event_formMouseDragged

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    public JTextField getPreencherNome() {
        return preencherNome;
    }

    public void setPreencherNome(JTextField preencherNome) {
        this.preencherNome = preencherNome;
    }

    public JPasswordField getPreencherSenha() {
        return preencherSenha;
    }

    public void setPreencherSenha(JPasswordField preencherSenha) {
        this.preencherSenha = preencherSenha;
    }

    public JTextField getPreencherUsuario() {
        return preencherUsuario;
    }

    public void setPreencherUsuario(JTextField preencherUsuario) {
        this.preencherUsuario = preencherUsuario;
    }

    public JPasswordField getConfirmarSenha() {
        return confirmarSenha;
    }

    public void setConfirmarSenha(JPasswordField confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cadastrar_botao;
    private javax.swing.JLabel cadastrar_txt;
    private javax.swing.JPasswordField confirmarSenha;
    private javax.swing.JLabel entre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField preencherNome;
    private javax.swing.JPasswordField preencherSenha;
    private javax.swing.JTextField preencherUsuario;
    private javax.swing.JLabel usuario;
    private javax.swing.JLabel usuario1;
    private javax.swing.JLabel usuario2;
    private javax.swing.JLabel usuario3;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
