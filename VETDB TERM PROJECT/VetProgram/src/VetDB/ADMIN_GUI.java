/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VetDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author charlesmullins
 */
public class ADMIN_GUI extends javax.swing.JFrame {

    /**
     * Creates new form ADMIN_GUI
     */
    public ADMIN_GUI() {
        initComponents();
    }

    public ADMIN_GUI(Connection conn) {
        initComponents();
        this.conn = conn;
        jLabel8.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        pwchangelab.setVisible(false);
        deletelab1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cpwusername = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        newpword = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        pwchangelab = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        delUN = new javax.swing.JLabel();
        delTB = new javax.swing.JTextField();
        delbut = new javax.swing.JButton();
        deletelab1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("User Name:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Password:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("Role:");

        buttonGroup1.add(jCheckBox1);
        jCheckBox1.setText("ADMINISTRATOR");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox2);
        jCheckBox2.setText("OWNER");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox3);
        jCheckBox3.setText("VETERINARIAN");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox4);
        jCheckBox4.setText("EMPLOYEE");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jButton1.setText("create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("Additional information");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setText("First Name:");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setText("Last Name:");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setText("Phone Number:");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("ACCOUNT ADDED!");

        jButton2.setText("LOGOUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(jTextField5))))
                        .addGap(103, 103, 103))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCheckBox4)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel7)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Create account", jPanel2);

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel9.setText("User Name:");

        cpwusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpwusernameActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel10.setText("New Password:");

        newpword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpwordActionPerformed(evt);
            }
        });

        jButton3.setText("Change");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        pwchangelab.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        pwchangelab.setForeground(new java.awt.Color(255, 0, 51));
        pwchangelab.setText("ACCOUNT PASSWORD CHANGED!");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(newpword)
                            .addComponent(cpwusername, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pwchangelab)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)))
                .addContainerGap(325, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cpwusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(newpword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pwchangelab)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Change account password", jPanel3);

        delUN.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        delUN.setText("User Name:");

        delTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delTBActionPerformed(evt);
            }
        });

        delbut.setText("DELETE");
        delbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbutActionPerformed(evt);
            }
        });

        deletelab1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        deletelab1.setForeground(new java.awt.Color(255, 0, 51));
        deletelab1.setText("ACCOUNT DELETED");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(delUN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delTB, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deletelab1)
                            .addComponent(delbut, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)))
                .addContainerGap(400, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delUN)
                    .addComponent(delTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(delbut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deletelab1)
                .addContainerGap(309, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Delete account", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        jLabel7.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
        jTextField5.setVisible(true);
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox2.isSelected()) {
            addowner();
        } else if (jCheckBox3.isSelected()) {
            try {
                String insertAcc = "insert into USERS(username,password) values ('" + jTextField2.getText() + "', '" + jTextField1.getText() + "');";
                Statement s1 = conn.createStatement();
                System.out.println(insertAcc);
                s1.executeUpdate(insertAcc);

                String getUID = "select user_id from USERS where username = '" + jTextField2.getText() + "';";
                Statement s3 = conn.createStatement();
                ResultSet r2 = s3.executeQuery(getUID);
                r2.next();
                int userID = r2.getInt("user_id");

                String insertPER = "insert into PERMISSIONS(user_id, role_id) values ('" + userID + "', " + 3 + ");";
                Statement s2 = conn.createStatement();
                s2.executeUpdate(insertPER);

                java.awt.EventQueue.invokeLater(() -> {
                    new AddVet_GUI(conn, userID).setVisible(true);
                });

                jTextField1.setText("");
                jTextField2.setText("");
                jCheckBox3.setSelected(false);
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error adding account, username already exists!");
            }
        } else {
            addelse();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        java.awt.EventQueue.invokeLater(() -> {
            new Login_GUI().setVisible(true);
        });
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cpwusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpwusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpwusernameActionPerformed

    private void newpwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpwordActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (verifyChange()) {
            try {
                // TODO add your handling code here:
                String changePW = "update USERS set password = '" + newpword.getText() + "' where username = '" + cpwusername.getText() + "';";
                Statement s8 = conn.createStatement();
                s8.executeUpdate(changePW);
                pwchangelab.setVisible(true);
                new java.util.Timer().schedule(
                        new java.util.TimerTask() {
                    @Override
                    public void run() {
                        pwchangelab.setVisible(false);
                    }
                },
                        3000
                );
                cpwusername.setText("");
                newpword.setText("");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error changing account\nUser does not exist!");
                Logger.getLogger(ADMIN_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error changing account\nPlease fill out all boxes");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void delTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delTBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delTBActionPerformed

    private void delbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbutActionPerformed
        // TODO add your handling code here:
        if (testString(delTB.getText())) {
            try {
                int userID;
                Statement s1 = conn.createStatement();
                Statement s2 = conn.createStatement();
                String getUID = "select user_id from USERS where username = '" + delTB.getText() + "';";
                Statement s5 = conn.createStatement();
                ResultSet r2 = s5.executeQuery(getUID);
                r2.next();
                userID = r2.getInt("user_id");

                String getRID = "select role_id from PERMISSIONS where user_id = " + userID + ";";
                Statement s10 = conn.createStatement();
                ResultSet r10 = s5.executeQuery(getRID);
                r10.next();
                int roleID = r10.getInt("role_id");
                System.out.println(roleID);

                String safek0 = "SET SQL_SAFE_UPDATES = 0;";
                String forkey0 = "SET FOREIGN_KEY_CHECKS = 0;";
                s1.execute(safek0);
                s2.execute(forkey0);
                String delete2 = "delete from PERMISSIONS where user_id = " + userID + ";";
                String delete = "delete from USERS where username = '" + delTB.getText() + "';";
                Statement s = conn.createStatement();
                Statement c = conn.createStatement();
                System.out.println(delete);
                s.executeUpdate(delete);
                c.executeUpdate(delete2);
                deletelab1.setVisible(true);

                if (roleID == 2) {
                    String removeAcct = "update OWNER set user_id = NULL where user_id=" + userID;
                    Statement b = conn.createStatement();
                    b.executeUpdate(removeAcct);
                } else if (roleID == 3) {
                    String removeAcct = "update VETERINARIAN set user_id = NULL where user_id=" + userID;
                    Statement b = conn.createStatement();
                    b.executeUpdate(removeAcct);

                }

                String safek1 = "SET SQL_SAFE_UPDATES = 1;";
                String forkey1 = "SET FOREIGN_KEY_CHECKS = 1;";
                Statement s3 = conn.createStatement();
                Statement s4 = conn.createStatement();
                s3.execute(safek1);
                s4.execute(forkey1);
                delTB.setText("");
                new java.util.Timer().schedule(
                        new java.util.TimerTask() {
                    @Override
                    public void run() {
                        deletelab1.setVisible(false);
                    }
                },
                        3000
                );

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error removing account\nUser does not exist!");
                System.out.println(ex.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error removing account\nPlease fill out all boxes");
        }
    }//GEN-LAST:event_delbutActionPerformed

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
            java.util.logging.Logger.getLogger(ADMIN_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADMIN_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADMIN_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADMIN_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ADMIN_GUI().setVisible(true);
        });
    }

    private boolean testString(String s) {
        return (s != null && !s.equals(""));
    }

    private boolean verifyChange() {
        if (!testString(cpwusername.getText())) {
            return false;
        }
        return testString(newpword.getText());
    }

    private boolean verifyAdd() {
        if (!testString(jTextField1.getText())) {
            return false;
        }
        return testString(jTextField2.getText());
    }

    private boolean verifyAddOwner() {
        if (!testString(jTextField1.getText())) {
            return false;
        }
        if (!testString(jTextField3.getText())) {
            return false;
        }
        if (!testString(jTextField4.getText())) {
            return false;
        }
        if (!testString(jTextField5.getText())) {
            return false;
        }
        return testString(jTextField2.getText());
    }

    private void addowner() {
        if (verifyAddOwner()) {
            try {
                int userID;

                String checkOwner = "select * from OWNER where fname = '" + jTextField3.getText() + "' and lname = '" + jTextField5.getText() + "' and phone = '" + jTextField4.getText() + "'";
                Statement s = conn.createStatement();
                ResultSet r = s.executeQuery(checkOwner);
                if (!r.next()) {
                    throw new SQLException();
                }

                String insertAcc = "insert into USERS(username,password) values ('" + jTextField2.getText() + "', '" + jTextField1.getText() + "')";
                Statement s1 = conn.createStatement();
                System.out.println(insertAcc);
                s1.executeUpdate(insertAcc);

                String getUID = "select user_id from USERS where username = '" + jTextField2.getText() + "'";
                Statement s3 = conn.createStatement();
                ResultSet r2 = s3.executeQuery(getUID);
                r2.next();
                userID = r2.getInt("user_id");

                String insertOwns = "update OWNER set user_id = '" + userID + "' where fname = '" + jTextField3.getText() + "' and lname = '" + jTextField5.getText() + "' and phone = '" + jTextField4.getText() + "'";
                Statement s4 = conn.createStatement();
                s4.executeUpdate(insertOwns);

                String insertPER = "insert into PERMISSIONS(user_id, role_id) values ('" + userID + "', 2);";
                Statement s2 = conn.createStatement();
                s2.executeUpdate(insertPER);

                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jLabel8.setVisible(true);
                new java.util.Timer().schedule(
                        new java.util.TimerTask() {
                    @Override
                    public void run() {
                        jLabel8.setVisible(false);
                    }
                },
                        3000
                );

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error adding account\nOwner does not exist!");
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error adding account\nEmpty field(s)");
        }
    }

    private void addelse() {
        if (verifyAdd()) {
            try {
                int userID;
                int role;
                if (jCheckBox4.isSelected()) {
                    role = 1;
                } else if (jCheckBox1.isSelected()) {
                    role = 4;
                } else {
                    JOptionPane.showMessageDialog(null, "Error adding account\nPlease select a role");
                    return;
                }

                String insertAcc = "insert into USERS(username,password) values ('" + jTextField2.getText() + "', '" + jTextField1.getText() + "');";
                Statement s1 = conn.createStatement();
                System.out.println(insertAcc);
                s1.executeUpdate(insertAcc);

                String getUID = "select user_id from USERS where username = '" + jTextField2.getText() + "';";
                Statement s3 = conn.createStatement();
                ResultSet r2 = s3.executeQuery(getUID);
                r2.next();
                userID = r2.getInt("user_id");

                String insertPER = "insert into PERMISSIONS(user_id, role_id) values ('" + userID + "', " + role + ");";
                Statement s2 = conn.createStatement();
                s2.executeUpdate(insertPER);

                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jLabel8.setVisible(true);
                new java.util.Timer().schedule(
                        new java.util.TimerTask() {
                    @Override
                    public void run() {
                        jLabel8.setVisible(false);
                    }
                },
                        3000
                );

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error adding account\nVet does not exist!");
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error adding account\nEmpty field(s)");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cpwusername;
    private javax.swing.JTextField delTB;
    private javax.swing.JLabel delUN;
    private javax.swing.JButton delbut;
    private javax.swing.JLabel deletelab1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField newpword;
    private javax.swing.JLabel pwchangelab;
    // End of variables declaration//GEN-END:variables
    private Connection conn;

}
