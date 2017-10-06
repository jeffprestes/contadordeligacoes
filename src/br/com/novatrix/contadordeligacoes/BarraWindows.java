/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.novatrix.contadordeligacoes;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author jeffprestes
 */
public class BarraWindows extends javax.swing.JFrame {

    public MongoClient mongo ;
    public MongoDatabase db ;

    public MongoCollection<Document> collection;

    
    /**
     * Creates new form BarraWindows
     */
    public BarraWindows() {
        mongo = new MongoClient( "localhost" , 27017 );
        db = mongo.getDatabase("myNewDatabase");
        collection = db.getCollection("ligacoesrh");
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

        btnFerias = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        btnLicMaternidade = new javax.swing.JButton();
        btnFolha = new javax.swing.JButton();
        btnRecisao = new javax.swing.JButton();
        btnBeneficioGeral = new javax.swing.JButton();
        btnPlanoSaude = new javax.swing.JButton();
        btnContratacao = new javax.swing.JButton();
        btnTokioSaber = new javax.swing.JButton();
        btnTrilhaCarreira = new javax.swing.JButton();
        btnRemuneracao = new javax.swing.JButton();
        btnMobilidade = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contador de ligações - RH Tokio Marine Seguradora");
        setName("frmBotoes"); // NOI18N
        getContentPane().setLayout(new java.awt.FlowLayout());

        btnFerias.setText("Ferias");
        btnFerias.setName("btnFerias"); // NOI18N
        btnFerias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeriasActionPerformed(evt);
            }
        });
        getContentPane().add(btnFerias);

        btnPonto.setText("Ponto");
        btnPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPonto);

        btnLicMaternidade.setText("Licenças");
        btnLicMaternidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLicMaternidadeActionPerformed(evt);
            }
        });
        getContentPane().add(btnLicMaternidade);

        btnFolha.setText("Folha");
        btnFolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFolhaActionPerformed(evt);
            }
        });
        getContentPane().add(btnFolha);

        btnRecisao.setText("Previdência");
        btnRecisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecisaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRecisao);

        btnBeneficioGeral.setText("Benefícios Geral");
        btnBeneficioGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeneficioGeralActionPerformed(evt);
            }
        });
        getContentPane().add(btnBeneficioGeral);

        btnPlanoSaude.setText("Plano Saúde");
        btnPlanoSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanoSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlanoSaude);

        btnContratacao.setText("Gympass");
        btnContratacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratacaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnContratacao);

        btnTokioSaber.setText("Tokio Saber");
        btnTokioSaber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTokioSaberActionPerformed(evt);
            }
        });
        getContentPane().add(btnTokioSaber);

        btnTrilhaCarreira.setText("Trilha");
        btnTrilhaCarreira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrilhaCarreiraActionPerformed(evt);
            }
        });
        getContentPane().add(btnTrilhaCarreira);

        btnRemuneracao.setText("Remuneração");
        btnRemuneracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemuneracaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemuneracao);

        btnMobilidade.setText("Mobilidade");
        btnMobilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMobilidadeActionPerformed(evt);
            }
        });
        getContentPane().add(btnMobilidade);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFeriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeriasActionPerformed
        insereLigacao(1);
    }//GEN-LAST:event_btnFeriasActionPerformed

    private void btnPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoActionPerformed
        insereLigacao(2);
    }//GEN-LAST:event_btnPontoActionPerformed

    private void btnLicMaternidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLicMaternidadeActionPerformed
        insereLigacao(3);
    }//GEN-LAST:event_btnLicMaternidadeActionPerformed

    private void btnFolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFolhaActionPerformed
        insereLigacao(4);
    }//GEN-LAST:event_btnFolhaActionPerformed

    private void btnRecisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecisaoActionPerformed
        insereLigacao(5);
    }//GEN-LAST:event_btnRecisaoActionPerformed

    private void btnPlanoSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanoSaudeActionPerformed
        insereLigacao(6);
    }//GEN-LAST:event_btnPlanoSaudeActionPerformed

    private void btnBeneficioGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeneficioGeralActionPerformed
        insereLigacao(7);
    }//GEN-LAST:event_btnBeneficioGeralActionPerformed

    private void btnContratacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratacaoActionPerformed
        insereLigacao(8);
    }//GEN-LAST:event_btnContratacaoActionPerformed

    private void btnTokioSaberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTokioSaberActionPerformed
        insereLigacao(9);
    }//GEN-LAST:event_btnTokioSaberActionPerformed

    private void btnTrilhaCarreiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrilhaCarreiraActionPerformed
        insereLigacao(10);
    }//GEN-LAST:event_btnTrilhaCarreiraActionPerformed

    private void btnRemuneracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemuneracaoActionPerformed
        insereLigacao(11);
    }//GEN-LAST:event_btnRemuneracaoActionPerformed

    private void btnMobilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMobilidadeActionPerformed
        insereLigacao(12);
    }//GEN-LAST:event_btnMobilidadeActionPerformed

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
            java.util.logging.Logger.getLogger(BarraWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BarraWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BarraWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BarraWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BarraWindows().setVisible(true);
            }
        });
    }
    
    private void insereLigacao(int origemID) {
        long unixTime = System.currentTimeMillis() / 1000L;
        String json = "{'assunto': " + origemID + ", 'quando': " + unixTime + "}";
        System.out.println(json);
        collection.insertOne(Document.parse(json));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeneficioGeral;
    private javax.swing.JButton btnContratacao;
    private javax.swing.JButton btnFerias;
    private javax.swing.JButton btnFolha;
    private javax.swing.JButton btnLicMaternidade;
    private javax.swing.JButton btnMobilidade;
    private javax.swing.JButton btnPlanoSaude;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnRecisao;
    private javax.swing.JButton btnRemuneracao;
    private javax.swing.JButton btnTokioSaber;
    private javax.swing.JButton btnTrilhaCarreira;
    // End of variables declaration//GEN-END:variables
}
