/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto.integrador.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author patricia
 */
public class Tela_Verbal extends javax.swing.JFrame {

    /** Creates new form Dados_Aluno */
    public Tela_Verbal() {
        initComponents();
       
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBvoltar_veb = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBvoltar_veb.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jBvoltar_veb.setText("VOLTA");
        jBvoltar_veb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jBvoltar_veb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvoltar_vebActionPerformed(evt);
            }
        });
        getContentPane().add(jBvoltar_veb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 540, 100, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("VOCÊ É ALVO DE XINGAMENTOS E APELIDOS? E FICA TRISTE POR CAUSA DISSO?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 1290, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/APELIDOXINGAMENTO.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 390, 270));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/LogoTipoPequeno.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 280, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/logotipopequenoo.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/retroceder.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, -1, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/avancar.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 90, 40));

        jLabel9.setText("AVANÇAR");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, 50, 20));

        jLabel8.setText("RETROCEDER");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, -1, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/background.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 1180, 620));

        setSize(new java.awt.Dimension(1182, 649));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBvoltar_vebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvoltar_vebActionPerformed
        Tela_Psicologico psi= new Tela_Psicologico();
        psi.setVisible(true);
    }//GEN-LAST:event_jBvoltar_vebActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Verbal().setVisible(true); 
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBvoltar_veb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

}
