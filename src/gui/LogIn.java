package gui;

import com.formdev.flatlaf.FlatDarkLaf;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.JOptionPane;
import model.MySQL;
import java.sql.ResultSet;
import model.User;

/**
 *
 * @author sasanda
 */
public class LogIn extends javax.swing.JFrame implements Serializable {

    public LogIn() {
        initComponents();

        jCheckBox2.addActionListener(e -> loadUser());

        if (!jCheckBox2.isEnabled()) {
            loadUser();
        }

    }

    private void loadUser() {
        if (jCheckBox2.isSelected()) {
            try {
                File file = new File("user.ser");

                if (!file.exists()) {
                    JOptionPane.showMessageDialog(this, "You don't have last login details", "Message", JOptionPane.WARNING_MESSAGE);
                    jCheckBox2.setSelected(false);
                    return;
                }

                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

                User user = (User) inputStream.readObject();

                jTextField1.setText(user.getUserName());
                jPasswordField1.setText(user.getPassword());

                jButton1.requestFocus();

                inputStream.close();
                fileInputStream.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            jTextField1.setText("");
            jPasswordField1.setText("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In");
        setResizable(false);

        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("User Name");

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setText("Log In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Welcome, User Login");

        jCheckBox1.setText("Remember Me");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Last Login Details");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(128, 128, 128))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(jTextField1)
                                .addComponent(jLabel2)
                                .addComponent(jPasswordField1)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox2)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String userName = jTextField1.getText();
        String password = String.valueOf(jPasswordField1.getPassword());

        try {

            if (userName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter your user name", "Message", JOptionPane.WARNING_MESSAGE);
            } else if (password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter your password", "Message", JOptionPane.WARNING_MESSAGE);
            } else {

                ResultSet resultSet = MySQL.execute("SELECT * FROM `user` WHERE `username` = '" + userName + "' AND `password` = '" + password + "'");

                if (resultSet.next()) {

                    User user = new User();
                    user.setFirstName(resultSet.getString("firstName"));
                    user.setLastName(resultSet.getString("lastName"));
                    user.setUserName(resultSet.getString("userName"));
                    user.setPassword(resultSet.getString("password"));

                    if (jCheckBox1.isSelected()) {

                        File file = new File("user.ser");
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

                        objectOutputStream.writeObject(user);
                    }

                    this.dispose();
                    Home home = new Home(user);
                    home.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(this, "Invalid User Name or Password", "Message", JOptionPane.WARNING_MESSAGE);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jCheckBox2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatDarkLaf.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
