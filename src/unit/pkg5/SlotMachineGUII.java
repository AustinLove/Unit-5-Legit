
package unit.pkg5;

import javax.swing.JOptionPane;


public class SlotMachineGUII extends javax.swing.JFrame {
    int quarters;
	SlotMachinee one,two,three;
	int num1,num2,num3;
	int totaltimes;
    
    public SlotMachineGUII() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtnumq = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txts1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txts2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txts3 = new javax.swing.JTextField();
        txttillnone = new javax.swing.JTextField();
        btnuntilout = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Number of Quarters");

        jLabel2.setText("Spins Since Slot Machine #1 Paid Out");

        jLabel3.setText("Spins Since Slot Machine #2 Paid Out");

        jLabel4.setText("Spins Since Slot Machine #3 Paid Out");

        txttillnone.setEditable(false);

        btnuntilout.setText("Spins Until Out of Quarters");
        btnuntilout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuntiloutActionPerformed(evt);
            }
        });

        jButton2.setText("Quit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(btnuntilout, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnumq)
                            .addComponent(txts1)
                            .addComponent(txts2)
                            .addComponent(txts3)
                            .addComponent(txttillnone, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnumq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txts1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txts2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txts3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttillnone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnuntilout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnuntiloutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuntiloutActionPerformed
        // TODO add your handling code here:
        if(txtnumq.getText()==null||txts1.getText()==null||txts2.getText()==null||txts3.getText()==null){
    		JOptionPane.showMessageDialog(this,"Must enter an amount for each text box.");
    		return;
    	}
    	else if (txtnumq.getText().equals(0)){
    		JOptionPane.showMessageDialog(this,"Must enter an amount of quarters greater than zero.");
    		return;
    	}
    	else{
    		quarters = Integer.parseInt(txtnumq.getText());
    		num1 = Integer.parseInt(txts1.getText());
    		num2 = Integer.parseInt(txts2.getText());
    		num3 = Integer.parseInt(txts3.getText());
    		one = new SlotMachinee(num1,30,20);
    		two = new SlotMachinee(num2,10,9);
    		three = new SlotMachinee(num3,90,60);
    		while(quarters>=1){
    			one.play(quarters);
    			two.play(quarters);
    			three.play(quarters);
    			if(one.getTurns()<=0){
    				quarters = one.getPayout();
    				one.resetturns(30);
    			}
    			if(two.getTurns()<=0){
    				quarters = two.getPayout();
    				two.resetturns(10);
    			}
    			if(three.getTurns()<=0){
    				quarters = three.getPayout();
    				three.resetturns(90);
    			}
    			//added a second out to see if that was why i cant get out of the loop...
    			if(quarters==0)break;
    		}
    		totaltimes=one.getbroke()+two.getbroke()+three.getbroke();
    		txttillnone.setText(""+totaltimes);
    		System.out.println(one.getbroke());
    		System.out.println(two.getbroke());
    		System.out.println(three.getbroke());
    	}
    }//GEN-LAST:event_btnuntiloutActionPerformed

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
            java.util.logging.Logger.getLogger(SlotMachineGUII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SlotMachineGUII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SlotMachineGUII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SlotMachineGUII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SlotMachineGUII().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnuntilout;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtnumq;
    private javax.swing.JTextField txts1;
    private javax.swing.JTextField txts2;
    private javax.swing.JTextField txts3;
    private javax.swing.JTextField txttillnone;
    // End of variables declaration//GEN-END:variables
}
