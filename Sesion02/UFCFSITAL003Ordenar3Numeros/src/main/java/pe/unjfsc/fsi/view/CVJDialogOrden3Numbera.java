package pe.unjfsc.fsi.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.entity.CEDatos;
import pe.unjfsc.fsi.entity.CEOrdenar;
import pe.unjfsc.fsi.logical.CLOrdenar;

public class CVJDialogOrden3Numbera extends javax.swing.JDialog {

    private static final Logger LOG = LoggerFactory.getLogger("CVJDialogOrden3Numbera");
    private CEDatos oDatosEntrada;
    private CEOrdenar oDatoSalida;
    private CLOrdenar oCLOrdenar;

    public CVJDialogOrden3Numbera(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.setTitle("[FSI] Controles Swing");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPrimerNumero = new javax.swing.JTextField();
        jTextFieldSegundoNumero = new javax.swing.JTextField();
        jTextFieldTercerNumero = new javax.swing.JTextField();
        jButtonIniciar = new javax.swing.JButton();
        jButtonOrdenar = new javax.swing.JButton();
        jLabelMayor = new javax.swing.JLabel();
        jLabelMedio = new javax.swing.JLabel();
        jLabelMenor = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Primer Número");

        jLabel3.setText("Segundo Número");

        jLabel4.setText("Tercer Número");

        jTextFieldPrimerNumero.setText("17");

        jTextFieldSegundoNumero.setText("20");

        jTextFieldTercerNumero.setText("15");

        jButtonIniciar.setText("Iniciar");
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });

        jButtonOrdenar.setText("Ordenar");
        jButtonOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarActionPerformed(evt);
            }
        });

        jLabelMayor.setText("Mayor");

        jLabelMedio.setText("Medio");

        jLabelMenor.setText("Menor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldPrimerNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jTextFieldSegundoNumero)
                            .addComponent(jTextFieldTercerNumero))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelMedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelMayor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelMenor, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldPrimerNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMayor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldSegundoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMedio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldTercerNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMenor))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
        this.jTextFieldPrimerNumero.setText("");
        this.jTextFieldSegundoNumero.setText("");
        this.jTextFieldTercerNumero.setText("");
    }//GEN-LAST:event_jButtonIniciarActionPerformed

    private void jButtonOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarActionPerformed
        oDatosEntrada = new CEDatos();

        oDatosEntrada.setA(Integer.parseInt(this.jTextFieldPrimerNumero.getText()));
        oDatosEntrada.setB(Integer.parseInt(this.jTextFieldSegundoNumero.getText()));
        oDatosEntrada.setC(Integer.parseInt(this.jTextFieldTercerNumero.getText()));
        LOG.info("[FSI] Datos entrada : {}", oDatosEntrada);

        oCLOrdenar = new CLOrdenar();
        oDatoSalida = oCLOrdenar.ordenarNumeros(oDatosEntrada);
        LOG.info("[FSI] Datos Salida : {}", oDatoSalida);
        
        this.jLabelMayor.setText(String.valueOf(oDatoSalida.getMayor()));
        this.jLabelMedio.setText(String.valueOf(oDatoSalida.getMedio()));
        this.jLabelMenor.setText(String.valueOf(oDatoSalida.getMenor()));
    }//GEN-LAST:event_jButtonOrdenarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CVJDialogOrden3Numbera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CVJDialogOrden3Numbera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CVJDialogOrden3Numbera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CVJDialogOrden3Numbera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CVJDialogOrden3Numbera dialog = new CVJDialogOrden3Numbera(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JButton jButtonOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelMayor;
    private javax.swing.JLabel jLabelMedio;
    private javax.swing.JLabel jLabelMenor;
    private javax.swing.JTextField jTextFieldPrimerNumero;
    private javax.swing.JTextField jTextFieldSegundoNumero;
    private javax.swing.JTextField jTextFieldTercerNumero;
    // End of variables declaration//GEN-END:variables
}
