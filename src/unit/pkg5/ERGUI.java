
package unit.pkg5;

import javax.swing.JOptionPane;


public class ERGUI extends javax.swing.JFrame {

    Patient p;
    LinkedPriorityQueue q;
    int priority;
    int BATMAN=10;
    boolean t;
    String stat="";
    public ERGUI() {
        initComponents();
        q=new LinkedPriorityQueue(3);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        btnfair = new javax.swing.JRadioButton();
        btnser = new javax.swing.JRadioButton();
        btncrit = new javax.swing.JRadioButton();
        btnsch = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnall = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtpatients = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel1.setText("Patient Name: ");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnfair);
        btnfair.setText("Fair Condition");
        btnfair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfairActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnser);
        btnser.setText("Serious Condition");

        buttonGroup1.add(btncrit);
        btncrit.setText("Critical Condition");
        btncrit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncritActionPerformed(evt);
            }
        });

        btnsch.setText("Schedule");
        btnsch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnschActionPerformed(evt);
            }
        });

        btnnext.setText("Treat Next");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnall.setText("Treat All");
        btnall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnallActionPerformed(evt);
            }
        });

        txtpatients.setEditable(false);
        txtpatients.setColumns(20);
        txtpatients.setRows(5);
        jScrollPane1.setViewportView(txtpatients);

        jButton1.setText("Quit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(41, 41, 41)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnser)
                                .addComponent(btncrit)
                                .addComponent(btnfair))
                            .addGap(120, 120, 120)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnsch, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnnext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnfair)
                    .addComponent(btnsch))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnser)
                    .addComponent(btnnext))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncrit)
                    .addComponent(btnall))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtnameActionPerformed

    private void btnschActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnschActionPerformed
        // TODO add your handling code here:
        
         // Get name and Priority
	String name = txtname.getText();
	stat ="";
	if (btncrit.isSelected()) {
	    priority = 0;
	} else if (btnser.isSelected()) {
	    priority = 1;
	} else {
	    priority = 2;
	}
	
	// Put in patient object
	Patient p = new Patient(name, priority);
	
	// Add to Queue
	q.enqueue(p, priority);
	
	txtpatients.append("\n" + p.toString());
       
        
        
        
        // TODO add your handling code here:
    

       
        
        
    }//GEN-LAST:event_btnschActionPerformed

    private void btnfairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnfairActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here:
       
            
       try {
            txtpatients.append("\n--------------------------------------------------------------------------------\n" + q.dequeue().toString() + " has been treated...");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No more patients to treat");
        }

      
   			 


    }//GEN-LAST:event_btnnextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnallActionPerformed
        // TODO add your handling code here:
         try {
	    while(true) {
                txtpatients.append("\n" + q.dequeue().toString() + " has been treated...");
            }
	} catch (Exception e) {
            // Kind of hacky, but it works.
	    JOptionPane.showMessageDialog(this, "All patients have been treated");
	}

    }//GEN-LAST:event_btnallActionPerformed

    private void btncritActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncritActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncritActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ERGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ERGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ERGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ERGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ERGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnall;
    private javax.swing.JRadioButton btncrit;
    private javax.swing.JRadioButton btnfair;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnsch;
    private javax.swing.JRadioButton btnser;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextArea txtpatients;
    // End of variables declaration//GEN-END:variables
}