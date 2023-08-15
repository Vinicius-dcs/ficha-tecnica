/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Controller.ExcluirFichaController;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author vinic
 */
public class ExcluirFicha extends javax.swing.JInternalFrame {
    
    ExcluirFichaController controller = new ExcluirFichaController(this);
    /**
     * Creates new form Ficha
     */
    public ExcluirFicha() {
        initComponents();

        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null); //Oculta botão
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0)); //Oculta as bordas do internalFrame
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4_fundoAzul = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Codigo = new javax.swing.JTextField();
        excluir_botao = new javax.swing.JPanel();
        excluir_txt = new javax.swing.JLabel();

        setBorder(null);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(640, 520));
        setVisible(true);

        jPanel4_fundoAzul.setBackground(new java.awt.Color(36, 46, 68));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Código");

        jTextField_Codigo.setMinimumSize(new java.awt.Dimension(10, 20));
        jTextField_Codigo.setPreferredSize(new java.awt.Dimension(15, 25));

        excluir_botao.setBackground(new java.awt.Color(89, 199, 198));

        excluir_txt.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        excluir_txt.setForeground(new java.awt.Color(255, 255, 255));
        excluir_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        excluir_txt.setText("Excluir Ficha");
        excluir_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        excluir_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excluir_txtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                excluir_txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                excluir_txtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout excluir_botaoLayout = new javax.swing.GroupLayout(excluir_botao);
        excluir_botao.setLayout(excluir_botaoLayout);
        excluir_botaoLayout.setHorizontalGroup(
            excluir_botaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(excluir_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );
        excluir_botaoLayout.setVerticalGroup(
            excluir_botaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(excluir_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4_fundoAzulLayout = new javax.swing.GroupLayout(jPanel4_fundoAzul);
        jPanel4_fundoAzul.setLayout(jPanel4_fundoAzulLayout);
        jPanel4_fundoAzulLayout.setHorizontalGroup(
            jPanel4_fundoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4_fundoAzulLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel4_fundoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                    .addComponent(jTextField_Codigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(jPanel4_fundoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4_fundoAzulLayout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addComponent(excluir_botao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(109, Short.MAX_VALUE)))
        );
        jPanel4_fundoAzulLayout.setVerticalGroup(
            jPanel4_fundoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4_fundoAzulLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
            .addGroup(jPanel4_fundoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4_fundoAzulLayout.createSequentialGroup()
                    .addGap(238, 238, 238)
                    .addComponent(excluir_botao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(239, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4_fundoAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4_fundoAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void excluir_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluir_txtMouseClicked
        try {
            controller.excluirFicha();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExcluirFicha.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ExcluirFicha.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_excluir_txtMouseClicked

    private void excluir_txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluir_txtMouseEntered
        excluir_txt.setForeground(new java.awt.Color(36, 46, 68));
    }//GEN-LAST:event_excluir_txtMouseEntered

    private void excluir_txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluir_txtMouseExited
        excluir_txt.setForeground(Color.white);
    }//GEN-LAST:event_excluir_txtMouseExited

    public JTextField getjTextField_Codigo() {
        return jTextField_Codigo;
    }

    public void setjTextField_Codigo(JTextField jTextField_Codigo) {
        this.jTextField_Codigo = jTextField_Codigo;
    }

        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel excluir_botao;
    private javax.swing.JLabel excluir_txt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4_fundoAzul;
    private javax.swing.JTextField jTextField_Codigo;
    // End of variables declaration//GEN-END:variables
}
