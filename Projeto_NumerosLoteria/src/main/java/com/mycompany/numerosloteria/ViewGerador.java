/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.numerosloteria;

import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author Gustavo Mendes
 */
public class ViewGerador extends javax.swing.JDialog {

    /**
     * Creates new form ViewGerador
     */
    public ViewGerador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldValorMaximo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldQuantidadeNumeros = new javax.swing.JTextField();
        jButtonGerar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonZerar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResultado = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GeradorDeNumerosParaLoteria");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 2, true), "Gerador de Numeros para Loteria", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(0, 51, 204))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Qual o valor Máximo?:");

        jTextFieldValorMaximo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Quantidade de Numeros:");

        jTextFieldQuantidadeNumeros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jButtonGerar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButtonGerar.setForeground(new java.awt.Color(0, 51, 204));
        jButtonGerar.setText("Gerar");
        jButtonGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarActionPerformed(evt);
            }
        });

        jButtonSair.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButtonSair.setForeground(new java.awt.Color(0, 51, 204));
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonZerar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButtonZerar.setForeground(new java.awt.Color(0, 51, 204));
        jButtonZerar.setText("Zerar");
        jButtonZerar.setEnabled(false);
        jButtonZerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZerarActionPerformed(evt);
            }
        });

        jTextAreaResultado.setColumns(20);
        jTextAreaResultado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextAreaResultado.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResultado);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("Desenvolvido por: Gustavo do Carmo Mendes");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("GitHub: gustavocarmomendes");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Linkedin: www.linkedin.com/in/gustavo-mendes-ads/");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldValorMaximo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldQuantidadeNumeros))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonZerar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldValorMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldQuantidadeNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGerar)
                    .addComponent(jButtonSair)
                    .addComponent(jButtonZerar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonZerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZerarActionPerformed
        limpar();
    }//GEN-LAST:event_jButtonZerarActionPerformed

    public void limpar() {
        jTextFieldValorMaximo.setText("");
        jTextFieldQuantidadeNumeros.setText("");
        jTextAreaResultado.setText("");
        jButtonZerar.setEnabled(false);
    }
    
    private void jButtonGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarActionPerformed

        jButtonZerar.setEnabled(true);
        
        try {
            Integer maiorValor = Integer.valueOf(jTextFieldValorMaximo.getText());
            Integer quantidadeValores = Integer.valueOf(jTextFieldQuantidadeNumeros.getText());
            
            if (maiorValor >= quantidadeValores) {
                Integer[] numeros = new Integer[quantidadeValores];
                Random sorteio = new Random();   

                for (int i = 0; i < numeros.length; i++) {
                    int valor = sorteio.nextInt(maiorValor) + 1;

                    boolean verificarExistencia = Arrays.asList(numeros).contains(valor);

                    if (verificarExistencia) {
                        i = i-1;
                    } else {
                        numeros[i] = valor;
                    }

                }

                String resultado = "";

                for (int i = 0; i < numeros.length; i++) {

                    if(i == numeros.length-1) {
                        resultado = resultado.concat(" " + numeros[i]);
                    } else {
                        resultado = resultado.concat(" " + numeros[i] + " |");
                    }

                }

                jTextAreaResultado.setText(resultado);
            } else {
                jButtonZerar.setEnabled(false);
                JOptionPane.showMessageDialog(null, "A quantidade de números sorteados NÃO pode ser maior\n"
                                                                + "que a quantidade de números que tem na Loteria.");
            }
            
            
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Insira apenas números válidos!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema no código fonte!");
        }
        
    }//GEN-LAST:event_jButtonGerarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGerar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonZerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaResultado;
    private javax.swing.JTextField jTextFieldQuantidadeNumeros;
    private javax.swing.JTextField jTextFieldValorMaximo;
    // End of variables declaration//GEN-END:variables
}
