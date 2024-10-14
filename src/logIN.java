/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Jethro James Aguilar
 */

import java.awt.event.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class logIN extends javax.swing.JFrame {

    /**
     * Creates new form logIN
     */
    public logIN() {
        initComponents();
        setResizable(false);
        
        jLabel8.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            int response = JOptionPane.showConfirmDialog(null, 
            "Are you sure you wish to go to the sign-up page?", 
            "Confirm", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE);

            if (response == JOptionPane.YES_OPTION) {
                signUP signUpFrame = new signUP();
                dispose();
                signUpFrame.setVisible(true);
            } else if (response == JOptionPane.NO_OPTION) {
            // Do nothing, stay on the sign-up page
    }}});
        
        jButton1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            boolean a = false;
            if(txt1.getText().equals("")){ a = true; }
            if(txt2.getText().equals("")){ a = true; }
            if(a == true){
                JOptionPane.showMessageDialog(null, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    });  
    }
    
    @Override
    public void addNotify() {
        super.addNotify();
        // This code removes the maximize button
        setResizable(true); // Temporarily enable it to access the frame's peer
        setResizable(false); // Then disable it again
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt2 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(310, 110));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(186, 79, 84));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 90, 460));

        jPanel2.setBackground(new java.awt.Color(186, 79, 84));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 90, 460));

        jPanel3.setBackground(new java.awt.Color(74, 31, 61));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\jetty\\Documents\\NetBeansProjects\\EventSystem\\logo.png")); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 19, 176, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Your Events, Our Expertise");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 101, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Planorama");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 45, -1, -1));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 210, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\jetty\\Documents\\NetBeansProjects\\EventSystem\\line.png")); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, 48));

        txt1.setBackground(new java.awt.Color(186, 79, 84));
        txt1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        jPanel3.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 170, -1));

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 277, -1, -1));

        jButton1.setBackground(new java.awt.Color(186, 79, 84));
        jButton1.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(74, 31, 61));
        jButton1.setText("Log-In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, -1));

        txt2.setBackground(new java.awt.Color(186, 79, 84));
        txt2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txt2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 170, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("<html>   <body style='font-family: Consolas; font-size: 11px; font-weight: bold; text-decoration: none;'>     <span style='color: white;'>Don't have an account?</span>     <span style='color: rgb(186, 79, 84);'> Sign Up</span>   </body> </html> ");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 260, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 550, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int response = JOptionPane.showConfirmDialog(null, 
        "Do you wish to submit?", 
        "Confirm", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE);
                    
        if (response == JOptionPane.YES_OPTION) {
            String username = txt1.getText();
            String password = new String(txt2.getPassword());

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Database connection details
        String url = "jdbc:mysql://localhost:3306/planorama"; 
        String dbUsername = "root"; 
        String dbPassword = ""; 

        String query = "SELECT * FROM users WHERE username = ? AND password = ?";

        try (Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, username);
            pstmt.setString(2, password);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                dashboard dashboardframe = new dashboard(username); 
                dashboardframe.setVisible(true);
                dispose(); 
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database connection error.", "Error", JOptionPane.ERROR_MESSAGE);
        } 
            } else if (response == JOptionPane.NO_OPTION) {
                // Do nothing, stay on the sign-up page
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

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
            java.util.logging.Logger.getLogger(logIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt1;
    private javax.swing.JPasswordField txt2;
    // End of variables declaration//GEN-END:variables
}
