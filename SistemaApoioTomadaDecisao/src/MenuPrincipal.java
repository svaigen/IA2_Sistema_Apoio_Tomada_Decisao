/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import javax.swing.JFileChooser;

/**
 *
 * @author 'Alisson
 */
public class MenuPrincipal extends javax.swing.JFrame {

    final static String CAMINHO_ARQUIVO_STOP_WORDS = "stop_words/lista_stop_words.txt";
    final static String CAMINHO_OBJETIVOS = "metadados/objetivo.txt";
    final static String CAMINHO_INSTITUICOES_AUTORES = "metadados/instituicoes.txt";
    final static String CAMINHO_CONTRIBUICAO = "metadados/contribuicao.txt";
    final static String CAMINHO_METODO = "metadados/metodo.txt";
    final static String CAMINHO_PROBLEMA = "metadados/problema.txt";
    final static String CAMINHO_REFERENCIAS = "metadados/referencias.txt";

    String caminhoEntrada;
    String textoArquivo;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        jLabelTitulo = new javax.swing.JLabel();
        jLabelCriadores = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelSelecaoArquivo = new javax.swing.JLabel();
        jTextFieldSelecaoArquivo = new javax.swing.JTextField();
        jButtonSelecionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de apoio à tomada de decisão - IA II");
        setMinimumSize(new java.awt.Dimension(1000, 700));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Sistema de apoio à tomada de decisão");
        jLabelTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabelTitulo, java.awt.BorderLayout.PAGE_START);

        jLabelCriadores.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCriadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCriadores.setText("Desenvolvido por Alisson R. Svaigen, Filipe G. Genu e Lailla M. S. Bine");
        jLabelCriadores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelCriadores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelCriadores, java.awt.BorderLayout.PAGE_END);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabelSelecaoArquivo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSelecaoArquivo.setText("Selecione a base de dados");

        jTextFieldSelecaoArquivo.setEditable(false);

        jButtonSelecionar.setIcon(new javax.swing.ImageIcon("C:\\Users\\'Alisson\\Documents\\NetBeansProjects\\AnaliseArtigosIA\\AnaliseArtigosIA\\src\\analiseartigosia\\icones\\search.png")); // NOI18N
        jButtonSelecionar.setText("Selecionar");
        jButtonSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSelecaoArquivo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldSelecaoArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(491, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSelecionar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelSelecaoArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldSelecaoArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(566, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1016, 739));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setApproveButtonToolTipText("Selecionar");
        fileChooser.setCurrentDirectory(new File("arquivos/"));
        fileChooser.setApproveButtonText("Selecionar");
        fileChooser.setDialogTitle("Selecione um arquivo");
        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            jTextFieldSelecaoArquivo.setText(fileChooser.getSelectedFile().getPath());
            caminhoEntrada = jTextFieldSelecaoArquivo.getText();
            try {
                textoArquivo = Utils.lerArquivo(caminhoEntrada);
                //System.out.println(textoArquivo);
            } catch (IOException ex) {
                System.err.println("Erro ao ler o arquivo!");
            }
            Relacao relacao = Utils.tabulaDados(textoArquivo);
        }
    }//GEN-LAST:event_jButtonSelecionarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSelecionar;
    private javax.swing.JLabel jLabelCriadores;
    private javax.swing.JLabel jLabelSelecaoArquivo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldSelecaoArquivo;
    // End of variables declaration//GEN-END:variables

    
}
