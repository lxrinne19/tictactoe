


import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

    int turn=2;
    
    int usedbutton[] = {0,0,0,0,0,0,0,0,0};
    public NewJFrame() {
        initComponents();
        
    }
    
    
   

  


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        L1 = new javax.swing.JButton();
        L2 = new javax.swing.JButton();
        L3 = new javax.swing.JButton();
        L4 = new javax.swing.JButton();
        L5 = new javax.swing.JButton();
        L6 = new javax.swing.JButton();
        L7 = new javax.swing.JButton();
        L8 = new javax.swing.JButton();
        L9 = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setForeground(new java.awt.Color(102, 102, 0));

        L1.setBackground(new java.awt.Color(255, 213, 214));
        L1.setFont(new java.awt.Font("Snap ITC", 1, 48)); // NOI18N
        L1.setForeground(new java.awt.Color(51, 51, 0));
        L1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L1ActionPerformed(evt);
            }
        });

        L2.setBackground(new java.awt.Color(255, 213, 214));
        L2.setFont(new java.awt.Font("Snap ITC", 1, 48)); // NOI18N
        L2.setForeground(new java.awt.Color(51, 51, 0));
        L2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L2ActionPerformed(evt);
            }
        });

        L3.setBackground(new java.awt.Color(255, 213, 214));
        L3.setFont(new java.awt.Font("Snap ITC", 1, 48)); // NOI18N
        L3.setForeground(new java.awt.Color(51, 51, 0));
        L3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L3ActionPerformed(evt);
            }
        });

        L4.setBackground(new java.awt.Color(255, 213, 214));
        L4.setFont(new java.awt.Font("Snap ITC", 1, 48)); // NOI18N
        L4.setForeground(new java.awt.Color(51, 51, 0));
        L4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L4ActionPerformed(evt);
            }
        });

        L5.setBackground(new java.awt.Color(255, 213, 214));
        L5.setFont(new java.awt.Font("Snap ITC", 1, 48)); // NOI18N
        L5.setForeground(new java.awt.Color(51, 51, 0));
        L5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L5ActionPerformed(evt);
            }
        });

        L6.setBackground(new java.awt.Color(255, 213, 214));
        L6.setFont(new java.awt.Font("Snap ITC", 1, 48)); // NOI18N
        L6.setForeground(new java.awt.Color(51, 51, 0));
        L6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L6ActionPerformed(evt);
            }
        });

        L7.setBackground(new java.awt.Color(255, 213, 214));
        L7.setFont(new java.awt.Font("Snap ITC", 1, 48)); // NOI18N
        L7.setForeground(new java.awt.Color(51, 51, 0));
        L7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L7ActionPerformed(evt);
            }
        });

        L8.setBackground(new java.awt.Color(255, 213, 214));
        L8.setFont(new java.awt.Font("Snap ITC", 1, 48)); // NOI18N
        L8.setForeground(new java.awt.Color(51, 51, 0));
        L8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L8ActionPerformed(evt);
            }
        });

        L9.setBackground(new java.awt.Color(255, 213, 214));
        L9.setFont(new java.awt.Font("Snap ITC", 1, 48)); // NOI18N
        L9.setForeground(new java.awt.Color(51, 51, 0));
        L9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L9ActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        Reset.setForeground(new java.awt.Color(255, 102, 102));
        Reset.setText("PLAY AGAIN");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(L2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(L3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(L4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(L5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(L6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(L7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(L8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(L9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        L1.setText("");
        L2.setText("");
        L3.setText("");
        L4.setText("");
        L5.setText("");
        L6.setText("");
        L7.setText("");
        L8.setText("");
        L9.setText("");

        for (int i = 0; i < usedbutton.length; i++) {
            usedbutton[i] = 0;
        }

        turn = 0;
    }//GEN-LAST:event_ResetActionPerformed

    private void L9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L9ActionPerformed
        
     

    }//GEN-LAST:event_L9ActionPerformed

    private void L8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L8ActionPerformed
        // TODO add your handling code here:
        if (usedbutton[7]==0)
        if( turn %2==0)

        {
            turn ++;
            L8.setText("X");
            usedbutton[7]=1;
        }else{
            turn++;
            L8.setText("O");
            usedbutton[7]=1;
          
        }
        else {
            JOptionPane.showMessageDialog(rootPane,"!This Button is used ALREADY!");
        }

    }//GEN-LAST:event_L8ActionPerformed

    private void L7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L7ActionPerformed
        // TODO add your handling code here:
        if (usedbutton[6]==0)
        if( turn %2==0)

        {
            turn ++;
            L7.setText("X");
            usedbutton[6]=1;
        }else{
            turn++;
            L7.setText("O");
            usedbutton[6]=1;
          

        }
        else {
            JOptionPane.showMessageDialog(rootPane,"!This Button is used ALREADY!");
        }

    }//GEN-LAST:event_L7ActionPerformed

    private void L6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L6ActionPerformed
        // TODO add your handling code here:
        if (usedbutton[5]==0)
        if( turn %2==0)

        {
            turn ++;
            L6.setText("X");
            usedbutton[5]=1;
        }else{
            turn++;
            L6.setText("O");
            usedbutton[5]=1;
        
        }
        else {
            JOptionPane.showMessageDialog(rootPane,"!This Button is used ALREADY!");
        }

    }//GEN-LAST:event_L6ActionPerformed

    private void L5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L5ActionPerformed
        // TODO add your handling code here:
        if (usedbutton[4]==0)
        if( turn %2==0)

        {
            turn ++;
            L5.setText("X");
            usedbutton[4]=1;
        }else{
            turn++;
            L5.setText("O");
            usedbutton[4]=1;
          

        }
        else {
            JOptionPane.showMessageDialog(rootPane,"!This Button is used ALREADY!");
        }

    }//GEN-LAST:event_L5ActionPerformed

    private void L4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L4ActionPerformed
        // TODO add your handling code here:
        if (usedbutton[3]==0)
        if( turn %2==0)

        {
            turn ++;
            L4.setText("X");
            usedbutton[3]=1;
        }else{
            turn++;
            L4.setText("O");
            usedbutton[3]=1;
           

        }
        else {
            JOptionPane.showMessageDialog(rootPane,"!This Button is used ALREADY!");
        }

    }//GEN-LAST:event_L4ActionPerformed

    private void L3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L3ActionPerformed
        // TODO add your handling code here:
        if (usedbutton[2]==0)
        if( turn %2==0)

        {
            turn ++;
            L3.setText("X");
            usedbutton[2]=1;
        }else{
            turn++;
            L3.setText("O");
            usedbutton[2]=1;
           
        }
        else {

            JOptionPane.showMessageDialog(rootPane,"!This Button is used ALREADY!");
        }
    }//GEN-LAST:event_L3ActionPerformed

    private void L2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L2ActionPerformed
        // TODO add your handling code here:
        if (usedbutton[1]==0)
        if( turn %2==0)

        {
            turn ++;
            L2.setText("X");
            usedbutton[1]=1;
        }else{
            turn++;
            L2.setText("O");
            usedbutton[1]=1;
            

        }
        else {

            JOptionPane.showMessageDialog(rootPane,"!This Button is used ALREADY!");
        }
    }//GEN-LAST:event_L2ActionPerformed

    private void L1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L1ActionPerformed
        // TODO add your handling code here:
        if (usedbutton[0]==0)
        if( turn %2==0)

        {
            turn ++;
            L1.setText("X");
            usedbutton[0]=1;
        }else{
            turn++;
            L1.setText("O");
            usedbutton[1]=1;
           
        }
        else {

            JOptionPane.showMessageDialog(rootPane,"!This Button is used ALREADY!");
        }
    }//GEN-LAST:event_L1ActionPerformed

    
    
    
    

    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton L1;
    private javax.swing.JButton L2;
    private javax.swing.JButton L3;
    private javax.swing.JButton L4;
    private javax.swing.JButton L5;
    private javax.swing.JButton L6;
    private javax.swing.JButton L7;
    private javax.swing.JButton L8;
    private javax.swing.JButton L9;
    private javax.swing.JButton Reset;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
