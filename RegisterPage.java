/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AtmSoftware;

/**
 *
 * @author admin
 */
import java.util.Random;
import javax.swing.JOptionPane;

public class RegisterPage extends javax.swing.JFrame {

    /**
     * Creates new form RegisterPage
     */
    public RegisterPage() {
        initComponents();
        specInfo.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        registerNameInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        registerAccountInput = new javax.swing.JTextField();
        registerBalanceInput = new javax.swing.JTextField();
        generatePinButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pinShowText = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        specInfo = new javax.swing.JLabel();
        returnBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Name");

        jLabel2.setText("Balance");

        jLabel3.setText("Account");

        generatePinButton.setText("Generate PIN");
        generatePinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePinButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("ATM PIN");

        jLabel6.setText("To register, Enter Details : -");

        specInfo.setText("Keep Your Pin Secure and Safe!!");

        returnBackButton.setText("Back To Main Page");
        returnBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(returnBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addGap(24, 24, 24))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(23, 23, 23)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pinShowText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(generatePinButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                .addComponent(registerNameInput, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(registerAccountInput, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(registerBalanceInput, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(specInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(registerNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(registerAccountInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(registerBalanceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(generatePinButton)
                        .addGap(18, 18, 18)
                        .addComponent(pinShowText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(32, 32, 32)
                .addComponent(specInfo)
                .addGap(34, 34, 34)
                .addComponent(returnBackButton)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generatePinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatePinButtonActionPerformed
        // TODO add your handling code here:
        String name,account,balance,pin;
        name=registerNameInput.getText();
        account=registerAccountInput.getText();
        balance=registerBalanceInput.getText();
        Random r1=new Random();
        if(!name.equals("")&&!account.equals("")&&!balance.equals(""))
        {
            int tempPin=r1.nextInt(9999-1000)+1000;
            pin=Integer.toString(tempPin);
            pinShowText.setText(pin);
            specInfo.setVisible(true);
            Database.storeDetails(name, account,pin, balance);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Fill Complete Details");
        }
    }//GEN-LAST:event_generatePinButtonActionPerformed

    private void returnBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBackButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new StartPage().setVisible(true);
    }//GEN-LAST:event_returnBackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton generatePinButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel pinShowText;
    private javax.swing.JTextField registerAccountInput;
    private javax.swing.JTextField registerBalanceInput;
    private javax.swing.JTextField registerNameInput;
    private javax.swing.JButton returnBackButton;
    private javax.swing.JLabel specInfo;
    // End of variables declaration//GEN-END:variables
}
