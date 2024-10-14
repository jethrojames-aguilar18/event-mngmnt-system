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
import java.sql.*;
import java.sql.Date;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import static javax.swing.JOptionPane.*;
import javax.swing.table.DefaultTableModel;
import java.text.*;


public class dashboard extends javax.swing.JFrame {

    String url = "jdbc:mysql://localhost:3306/planorama";
    String dbUsername = "root";
    String dbPassword = "";
    public int eventId;
    private String username;
    private String currentEventName;
    private String currentEventDesc;
    private String currentEventLoc;
    private String currentEventDate;
    private String currentEventTime;
    private int currentEventId; // Store the ID of the currently loaded event
    private JTextField searchField;
    private JTextField searchFieldCreatedd;
    private JPanel eventContainer;
    private JPanel eventsPanelCreated;
    private JScrollPane scrollPane;
    private JScrollPane scrollPaneCreatedd;
    private Map<String, JPanel> eventPanels = new HashMap<>();
    private Map<String, JPanel> eventPanelsLoaded = new HashMap<>();
    JLabel back1 = new JLabel("<html><a href=''>⮌</a></html>");
    JLabel back11 = new JLabel("<html><a href=''>⮌</a></html>");
    JLabel back111 = new JLabel("<html><a href=''>⮌</a></html>");
    JLabel back1111 = new JLabel("<html><a href=''>⮌</a></html>");

    /**
     * Creates new form homepage
     */
    public dashboard(String username) {
        this.username = username;
        initComponents();
        setResizable(false);
        loadUserProfile(username);
        loadCreatedEvents();
        
        back1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            c_track.setVisible(false); tracker.setVisible(true);
            j_track.setVisible(false); c_details.setVisible(false); 
            c_participants.setVisible(false);
        }
    });
        
        cdlbl7.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) { 
            c_track.setVisible(true); tracker.setVisible(false);
            j_track.setVisible(false); c_details.setVisible(false); 
            c_participants.setVisible(false);
        }
    });
        
        back11.addMouseListener(new MouseAdapter() {
        @Override 
        public void mouseClicked(MouseEvent e) {
            c_track.setVisible(false); tracker.setVisible(false);
            j_track.setVisible(false); c_details.setVisible(true); 
            c_participants.setVisible(false);
        }
    });
        
        back111.addMouseListener(new MouseAdapter() {
        @Override 
        public void mouseClicked(MouseEvent e) {
            c_track.setVisible(false); tracker.setVisible(true);
            j_track.setVisible(false); c_details.setVisible(false); 
            c_participants.setVisible(false);
        }
    });
        
        back1111.addMouseListener(new MouseAdapter() {
        @Override 
        public void mouseClicked(MouseEvent e) {
            c_track.setVisible(false); tracker.setVisible(true);
            j_track.setVisible(false); c_details.setVisible(false); 
            c_participants.setVisible(false); j_details.setVisible(false);
        }
    });
        
        logout.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            int response = JOptionPane.showConfirmDialog(null, 
                    "Are you sure you wish to go to the log-out?", 
                    "Confirm", 
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE);
                    
                if (response == JOptionPane.YES_OPTION) {
                    logIN login = new logIN();
                    dispose();
                    login.setVisible(true);
                } else if (response == JOptionPane.NO_OPTION) {
                    // Do nothing, stay on the sign-up page
                }
            }
        });

        dashboard.setVisible(false); profile.setVisible(false);
        create.setVisible(false); tracker.setVisible(false);
        c_track.setVisible(false); j_track.setVisible(false);
        c_details.setVisible(false); c_participants.setVisible(false);
        d_details.setVisible(false); j_details.setVisible(false);
        about.setVisible(false); guide.setVisible(false);
        
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
        java.awt.GridBagConstraints gridBagConstraints;

        menu = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        jlbl1 = new javax.swing.JLabel();
        apnl1 = new javax.swing.JPanel();
        albl1 = new javax.swing.JLabel();
        gpnl1 = new javax.swing.JPanel();
        glbl1 = new javax.swing.JLabel();
        ppnl1 = new javax.swing.JPanel();
        plbl1 = new javax.swing.JLabel();
        dpnl1 = new javax.swing.JPanel();
        dlbl1 = new javax.swing.JLabel();
        cpnl1 = new javax.swing.JPanel();
        clbl1 = new javax.swing.JLabel();
        tpnl1 = new javax.swing.JPanel();
        tlbl1 = new javax.swing.JLabel();
        landing = new javax.swing.JPanel();
        jlbl4 = new javax.swing.JLabel();
        jlbl2 = new javax.swing.JLabel();
        jlbl3 = new javax.swing.JLabel();
        about = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        aboutLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        guide = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        profile = new javax.swing.JPanel();
        plbl2 = new javax.swing.JLabel();
        plbl5 = new javax.swing.JLabel();
        ptxt3 = new javax.swing.JTextField();
        plbl7 = new javax.swing.JLabel();
        plbl3 = new javax.swing.JLabel();
        plbl6 = new javax.swing.JLabel();
        plbl10 = new javax.swing.JLabel();
        ptxt4 = new javax.swing.JTextField();
        ptxt5 = new javax.swing.JTextField();
        ptxt1 = new javax.swing.JTextField();
        plbl4 = new javax.swing.JLabel();
        ptxt2 = new javax.swing.JTextField();
        plbl8 = new javax.swing.JLabel();
        ptxt6 = new javax.swing.JTextField();
        plbl9 = new javax.swing.JLabel();
        ptxt7 = new javax.swing.JTextField();
        pbtn2 = new javax.swing.JButton();
        pbtn1 = new javax.swing.JButton();
        ptxt8 = new javax.swing.JPasswordField();
        dashboard = new javax.swing.JPanel();
        dlbl2 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        d_details = new javax.swing.JPanel();
        ddlbl1 = new javax.swing.JLabel();
        ddlbl7 = new javax.swing.JLabel();
        ddtxt1 = new javax.swing.JTextField();
        ddlbl2 = new javax.swing.JLabel();
        ddtxt2 = new javax.swing.JTextArea();
        ddlbl3 = new javax.swing.JLabel();
        ddtxt4 = new javax.swing.JTextField();
        ddlbl5 = new javax.swing.JLabel();
        ddtxt3 = new javax.swing.JTextField();
        ddlbl6 = new javax.swing.JLabel();
        ddtxt5 = new javax.swing.JTextField();
        ddbtn1 = new javax.swing.JButton();
        ddlbl8 = new javax.swing.JLabel();
        create = new javax.swing.JPanel();
        clbl2 = new javax.swing.JLabel();
        clbl7 = new javax.swing.JLabel();
        clbl3 = new javax.swing.JLabel();
        ctxt5 = new javax.swing.JTextField();
        ctxt1 = new javax.swing.JTextField();
        clbl4 = new javax.swing.JLabel();
        cbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ctxt2 = new javax.swing.JTextArea();
        clbl5 = new javax.swing.JLabel();
        ctxt3 = new javax.swing.JTextField();
        clbl6 = new javax.swing.JLabel();
        ctxt4 = new javax.swing.JTextField();
        tracker = new javax.swing.JPanel();
        tbtn2 = new javax.swing.JButton();
        tbtn1 = new javax.swing.JButton();
        tlbl2 = new javax.swing.JLabel();
        tlbl3 = new javax.swing.JLabel();
        c_track = new javax.swing.JPanel();
        c_details = new javax.swing.JPanel();
        cdlbl1 = new javax.swing.JLabel();
        cdlbl2 = new javax.swing.JLabel();
        cdtxt1 = new javax.swing.JTextField();
        cdlbl3 = new javax.swing.JLabel();
        cdtxt2 = new javax.swing.JTextArea();
        cdlbl4 = new javax.swing.JLabel();
        cdtxt4 = new javax.swing.JTextField();
        cdlbl5 = new javax.swing.JLabel();
        cdtxt3 = new javax.swing.JTextField();
        cdlbl6 = new javax.swing.JLabel();
        cdtxt5 = new javax.swing.JTextField();
        cdbtn1 = new javax.swing.JButton();
        cdbtn2 = new javax.swing.JButton();
        cdbtn3 = new javax.swing.JButton();
        cdlbl7 = new javax.swing.JLabel();
        cdbtn4 = new javax.swing.JButton();
        c_participants = new javax.swing.JPanel();
        j_track = new javax.swing.JPanel();
        j_details = new javax.swing.JPanel();
        jdlbl2 = new javax.swing.JLabel();
        jdlbl7 = new javax.swing.JLabel();
        jdtxt1 = new javax.swing.JTextField();
        jdlbl3 = new javax.swing.JLabel();
        jdtxt2 = new javax.swing.JTextArea();
        jdlbl4 = new javax.swing.JLabel();
        jdtxt4 = new javax.swing.JTextField();
        jdlbl5 = new javax.swing.JLabel();
        jdtxt3 = new javax.swing.JTextField();
        jdlbl6 = new javax.swing.JLabel();
        jdtxt5 = new javax.swing.JTextField();
        ddbtn2 = new javax.swing.JButton();
        jdlbl1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(270, 90));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(74, 31, 61));
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setFont(new java.awt.Font("Lucida Bright", 3, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("<- Log-out");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        menu.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 474, -1, -1));

        jlbl1.setIcon(new javax.swing.ImageIcon("C:\\Users\\jetty\\Documents\\NetBeansProjects\\EventSystem\\logo.png")); // NOI18N
        jlbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbl1MouseClicked(evt);
            }
        });
        menu.add(jlbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 6, 171, -1));

        apnl1.setBackground(new java.awt.Color(153, 0, 153));
        apnl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apnl1MouseClicked(evt);
            }
        });

        albl1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        albl1.setForeground(new java.awt.Color(255, 255, 255));
        albl1.setText("        ABOUT");
        albl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                albl1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout apnl1Layout = new javax.swing.GroupLayout(apnl1);
        apnl1.setLayout(apnl1Layout);
        apnl1Layout.setHorizontalGroup(
            apnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(albl1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        apnl1Layout.setVerticalGroup(
            apnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, apnl1Layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(albl1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menu.add(apnl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 180, 30));

        gpnl1.setBackground(new java.awt.Color(153, 0, 153));
        gpnl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gpnl1MouseClicked(evt);
            }
        });

        glbl1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        glbl1.setForeground(new java.awt.Color(255, 255, 255));
        glbl1.setText("        GUIDE");
        glbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                glbl1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout gpnl1Layout = new javax.swing.GroupLayout(gpnl1);
        gpnl1.setLayout(gpnl1Layout);
        gpnl1Layout.setHorizontalGroup(
            gpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gpnl1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(glbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        gpnl1Layout.setVerticalGroup(
            gpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(glbl1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        menu.add(gpnl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        ppnl1.setBackground(new java.awt.Color(153, 0, 153));
        ppnl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ppnl1MouseClicked(evt);
            }
        });

        plbl1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        plbl1.setForeground(new java.awt.Color(255, 255, 255));
        plbl1.setText("      PROFILE");
        plbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plbl1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ppnl1Layout = new javax.swing.GroupLayout(ppnl1);
        ppnl1.setLayout(ppnl1Layout);
        ppnl1Layout.setHorizontalGroup(
            ppnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ppnl1Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(plbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ppnl1Layout.setVerticalGroup(
            ppnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ppnl1Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(plbl1))
        );

        menu.add(ppnl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 180, 30));

        dpnl1.setBackground(new java.awt.Color(153, 0, 153));
        dpnl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dpnl1MouseClicked(evt);
            }
        });

        dlbl1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        dlbl1.setForeground(new java.awt.Color(255, 255, 255));
        dlbl1.setText("    DASHBOARD");
        dlbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dlbl1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dpnl1Layout = new javax.swing.GroupLayout(dpnl1);
        dpnl1.setLayout(dpnl1Layout);
        dpnl1Layout.setHorizontalGroup(
            dpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dpnl1Layout.createSequentialGroup()
                .addComponent(dlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dpnl1Layout.setVerticalGroup(
            dpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpnl1Layout.createSequentialGroup()
                .addComponent(dlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menu.add(dpnl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 180, 30));

        cpnl1.setBackground(new java.awt.Color(153, 0, 153));
        cpnl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpnl1MouseClicked(evt);
            }
        });

        clbl1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        clbl1.setForeground(new java.awt.Color(255, 255, 255));
        clbl1.setText("     CREATION");
        clbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clbl1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cpnl1Layout = new javax.swing.GroupLayout(cpnl1);
        cpnl1.setLayout(cpnl1Layout);
        cpnl1Layout.setHorizontalGroup(
            cpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cpnl1Layout.createSequentialGroup()
                .addComponent(clbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        cpnl1Layout.setVerticalGroup(
            cpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cpnl1Layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(clbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menu.add(cpnl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 180, 30));

        tpnl1.setBackground(new java.awt.Color(153, 0, 153));
        tpnl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tpnl1MouseClicked(evt);
            }
        });

        tlbl1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        tlbl1.setForeground(new java.awt.Color(255, 255, 255));
        tlbl1.setText("      TRACKER");
        tlbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tlbl1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tpnl1Layout = new javax.swing.GroupLayout(tpnl1);
        tpnl1.setLayout(tpnl1Layout);
        tpnl1Layout.setHorizontalGroup(
            tpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tpnl1Layout.createSequentialGroup()
                .addComponent(tlbl1)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        tpnl1Layout.setVerticalGroup(
            tpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tpnl1Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(tlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menu.add(tpnl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 180, -1));

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 0, 260, 510));

        landing.setBackground(new java.awt.Color(186, 79, 84));
        landing.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbl4.setFont(new java.awt.Font("Lucida Console", 2, 24)); // NOI18N
        jlbl4.setForeground(new java.awt.Color(255, 255, 255));
        jlbl4.setText("HOME TO AN EVENT MANAGEMENT SYSTEM");
        landing.add(jlbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 490, 40));

        jlbl2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jlbl2.setForeground(new java.awt.Color(255, 255, 255));
        jlbl2.setText("Welcome to ");
        landing.add(jlbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 200, 40));

        jlbl3.setFont(new java.awt.Font("Arial Black", 0, 75)); // NOI18N
        jlbl3.setForeground(new java.awt.Color(255, 255, 255));
        jlbl3.setText("Planorama");
        landing.add(jlbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 470, 110));

        getContentPane().add(landing, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 610, 510));

        about.setBackground(new java.awt.Color(186, 79, 84));
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });
        about.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("_________________");
        about.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        aboutLabel.setText("<html>   <body style='font-family: Consolas; color: rgb(255,255,255); font-size: 11px; font-weight: bold; text-decoration: none;'>     <div style='padding: 10px;'> <p>         Welcome to <strong>Planorama</strong>, your ultimate solution for event planning and management. Our application is designed to help you organize, manage, and execute events with ease and efficiency.       </p>       <br><br>       <p> <strong>Planorama</strong> is an intuitive and user-friendly app that brings all your event planning needs into one place. From creating schedules to managing guest lists, Planorama ensures every detail is taken care of. Whether you are planning a small gathering or a large conference, our event management system is equipped with features that allow you to handle everything from RSVPs to venue arrangements. Our goal is to make your event planning process seamless and stress-free.       </p>      </div>   </body> </html>");
        about.add(aboutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 550, 240));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("About Us");
        about.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Who we are");
        about.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel4.setText("<html>   <body style='font-family: Consolas;color: rgb(255,255,255); font-size: 11px; font-weight: bold; text-decoration: none;'>     <div style='padding: 10px;'>        <p>         With the abundance of events we have in our era, having an event management system is crucial           in organizing, planning, and sorting these out. Hence, a group of students from Polytechnic University          of the Philippines took this as an initiative to create an application using Java programming language          and its underlying technologies to promote ease and productivity.       </p>     </div>   </body> </html> ");
        about.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 520, -1));

        getContentPane().add(about, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 610, 510));

        guide.setBackground(new java.awt.Color(186, 79, 84));
        guide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("<html>   <body style='font-family: Consolas; font-size: 12px; font-weight: bold; text-decoration: none; color: rgb(255, 255, 255);'>     <div style='padding: 10px;'>       <ul>          <li><strong>About:</strong> Shows information about the application.</li><br>         <li><strong>Guide:</strong> Displays the system manual (this panel).</li><br>         <li><strong>Profile:</strong> Allows editing of user profile details. Click \"Details to Edit\" to enable editing, and submit changes with the \"Submit\" button.</li><br>         <li><strong>Dashboard:</strong> Displays events. Search for events and click \"Details\" for more information. Join an event and it will be removed upon joining.</li><br>         <li><strong>Event Creation:</strong> Create new events with details like name, description, location, date, and time. Publish to store in the database.</li><br>         <li><strong>Tracker:</strong> View created and joined events. Edit created events, publish changes, cancel events, and view participant lists. Cancel joined events.</li><br> \t<li><strong>Log-out:</strong> Button to return to the login screen.</li><br>       </ul>     </div>   </body> </html> ");
        guide.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 520, 420));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MANUAL");
        guide.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        getContentPane().add(guide, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 610, 510));

        profile.setBackground(new java.awt.Color(186, 79, 84));
        profile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        plbl2.setFont(new java.awt.Font("Consolas", 1, 60)); // NOI18N
        plbl2.setForeground(new java.awt.Color(255, 255, 255));
        plbl2.setText("PROFILE");
        profile.add(plbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        plbl5.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        plbl5.setText("Last Name");
        profile.add(plbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        ptxt3.setEditable(false);
        ptxt3.setBackground(new java.awt.Color(74, 31, 61));
        ptxt3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        ptxt3.setForeground(new java.awt.Color(255, 255, 255));
        ptxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptxt3ActionPerformed(evt);
            }
        });
        profile.add(ptxt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 250, -1));

        plbl7.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        plbl7.setText("Contact");
        profile.add(plbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        plbl3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        plbl3.setText("Reference No.");
        profile.add(plbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        plbl6.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        plbl6.setText("Age");
        profile.add(plbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        plbl10.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        plbl10.setText("Password");
        profile.add(plbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        ptxt4.setEditable(false);
        ptxt4.setBackground(new java.awt.Color(74, 31, 61));
        ptxt4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        ptxt4.setForeground(new java.awt.Color(255, 255, 255));
        profile.add(ptxt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 60, -1));

        ptxt5.setEditable(false);
        ptxt5.setBackground(new java.awt.Color(74, 31, 61));
        ptxt5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        ptxt5.setForeground(new java.awt.Color(255, 255, 255));
        profile.add(ptxt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 130, -1));

        ptxt1.setEditable(false);
        ptxt1.setBackground(new java.awt.Color(74, 31, 61));
        ptxt1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        ptxt1.setForeground(new java.awt.Color(255, 255, 255));
        ptxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ptxt1MouseExited(evt);
            }
        });
        ptxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptxt1ActionPerformed(evt);
            }
        });
        profile.add(ptxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 530, -1));

        plbl4.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        plbl4.setText("First Name");
        profile.add(plbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        ptxt2.setEditable(false);
        ptxt2.setBackground(new java.awt.Color(74, 31, 61));
        ptxt2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        ptxt2.setForeground(new java.awt.Color(255, 255, 255));
        ptxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptxt2ActionPerformed(evt);
            }
        });
        profile.add(ptxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 270, -1));

        plbl8.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        plbl8.setText("Email");
        profile.add(plbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        ptxt6.setEditable(false);
        ptxt6.setBackground(new java.awt.Color(74, 31, 61));
        ptxt6.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        ptxt6.setForeground(new java.awt.Color(255, 255, 255));
        profile.add(ptxt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 320, -1));

        plbl9.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        plbl9.setText("Username");
        profile.add(plbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        ptxt7.setEditable(false);
        ptxt7.setBackground(new java.awt.Color(74, 31, 61));
        ptxt7.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        ptxt7.setForeground(new java.awt.Color(255, 255, 255));
        ptxt7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ptxt7MouseExited(evt);
            }
        });
        ptxt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptxt7ActionPerformed(evt);
            }
        });
        profile.add(ptxt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 530, -1));

        pbtn2.setBackground(new java.awt.Color(74, 31, 61));
        pbtn2.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        pbtn2.setForeground(new java.awt.Color(255, 255, 255));
        pbtn2.setText("Update");
        pbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pbtn2MouseClicked(evt);
            }
        });
        profile.add(pbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        pbtn1.setBackground(new java.awt.Color(74, 31, 61));
        pbtn1.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        pbtn1.setForeground(new java.awt.Color(255, 255, 255));
        pbtn1.setText("Click to Edit Details");
        pbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pbtn1MouseClicked(evt);
            }
        });
        profile.add(pbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        ptxt8.setBackground(new java.awt.Color(74, 31, 61));
        ptxt8.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        ptxt8.setForeground(new java.awt.Color(255, 255, 255));
        profile.add(ptxt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 530, 30));

        getContentPane().add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 610, 510));

        dashboard.setBackground(new java.awt.Color(186, 79, 84));
        dashboard.setForeground(new java.awt.Color(74, 31, 61));
        dashboard.setLayout(new java.awt.GridBagLayout());

        dlbl2.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        dlbl2.setForeground(new java.awt.Color(255, 255, 255));
        dlbl2.setText("EVENTS DASHBOARD");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 30, 0, 0);
        dashboard.add(dlbl2, gridBagConstraints);

        jScrollBar1.setBackground(new java.awt.Color(74, 31, 61));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 505;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 149, 0, 0);
        dashboard.add(jScrollBar1, gridBagConstraints);

        getContentPane().add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 610, 510));

        d_details.setBackground(new java.awt.Color(186, 79, 84));
        d_details.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ddlbl1.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        ddlbl1.setForeground(new java.awt.Color(255, 255, 255));
        ddlbl1.setText("Event Details");
        d_details.add(ddlbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, 60));

        ddlbl7.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        ddlbl7.setForeground(new java.awt.Color(255, 255, 255));
        ddlbl7.setText("Time (HH:MM:SS)");
        d_details.add(ddlbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        ddtxt1.setEditable(false);
        ddtxt1.setBackground(new java.awt.Color(74, 31, 61));
        ddtxt1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        ddtxt1.setForeground(new java.awt.Color(255, 255, 255));
        ddtxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddtxt1ActionPerformed(evt);
            }
        });
        d_details.add(ddtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 510, -1));

        ddlbl2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        ddlbl2.setForeground(new java.awt.Color(255, 255, 255));
        ddlbl2.setText("Name");
        d_details.add(ddlbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        ddtxt2.setEditable(false);
        ddtxt2.setBackground(new java.awt.Color(74, 31, 61));
        ddtxt2.setColumns(20);
        ddtxt2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        ddtxt2.setForeground(new java.awt.Color(255, 255, 255));
        ddtxt2.setLineWrap(true);
        ddtxt2.setRows(5);
        d_details.add(ddtxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 510, -1));

        ddlbl3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        ddlbl3.setForeground(new java.awt.Color(255, 255, 255));
        ddlbl3.setText("Description");
        d_details.add(ddlbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        ddtxt4.setEditable(false);
        ddtxt4.setBackground(new java.awt.Color(74, 31, 61));
        ddtxt4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        ddtxt4.setForeground(new java.awt.Color(255, 255, 255));
        ddtxt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddtxt4ActionPerformed(evt);
            }
        });
        d_details.add(ddtxt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 240, -1));

        ddlbl5.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        ddlbl5.setForeground(new java.awt.Color(255, 255, 255));
        ddlbl5.setText("Location");
        d_details.add(ddlbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        ddtxt3.setEditable(false);
        ddtxt3.setBackground(new java.awt.Color(74, 31, 61));
        ddtxt3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        ddtxt3.setForeground(new java.awt.Color(255, 255, 255));
        ddtxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddtxt3ActionPerformed(evt);
            }
        });
        d_details.add(ddtxt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 510, -1));

        ddlbl6.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        ddlbl6.setForeground(new java.awt.Color(255, 255, 255));
        ddlbl6.setText("Date (YYY-MM-DD)");
        d_details.add(ddlbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        ddtxt5.setEditable(false);
        ddtxt5.setBackground(new java.awt.Color(74, 31, 61));
        ddtxt5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        ddtxt5.setForeground(new java.awt.Color(255, 255, 255));
        ddtxt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddtxt5ActionPerformed(evt);
            }
        });
        d_details.add(ddtxt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 250, -1));

        ddbtn1.setBackground(new java.awt.Color(74, 31, 61));
        ddbtn1.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        ddbtn1.setForeground(new java.awt.Color(255, 255, 255));
        ddbtn1.setText("Join");
        ddbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ddbtn1MouseClicked(evt);
            }
        });
        d_details.add(ddbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, -1, -1));

        ddlbl8.setFont(new java.awt.Font("Consolas", 2, 40)); // NOI18N
        ddlbl8.setText("<html><a href=''>⮌</a></html>");
        ddlbl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ddlbl8MouseClicked(evt);
            }
        });
        d_details.add(ddlbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(d_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 610, 510));

        create.setBackground(new java.awt.Color(186, 79, 84));
        create.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clbl2.setFont(new java.awt.Font("Consolas", 1, 55)); // NOI18N
        clbl2.setForeground(new java.awt.Color(255, 255, 255));
        clbl2.setText("EVENT CREATION");
        create.add(clbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        clbl7.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        clbl7.setForeground(new java.awt.Color(255, 255, 255));
        clbl7.setText("Time 24-hr(HH:MM:SS)");
        create.add(clbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        clbl3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        clbl3.setForeground(new java.awt.Color(255, 255, 255));
        clbl3.setText("Name");
        create.add(clbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        ctxt5.setBackground(new java.awt.Color(74, 31, 61));
        ctxt5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        ctxt5.setForeground(new java.awt.Color(255, 255, 255));
        ctxt5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ctxt5MouseExited(evt);
            }
        });
        ctxt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxt5ActionPerformed(evt);
            }
        });
        create.add(ctxt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 240, -1));

        ctxt1.setBackground(new java.awt.Color(74, 31, 61));
        ctxt1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        ctxt1.setForeground(new java.awt.Color(255, 255, 255));
        ctxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ctxt1MouseExited(evt);
            }
        });
        ctxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxt1ActionPerformed(evt);
            }
        });
        create.add(ctxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 510, -1));

        clbl4.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        clbl4.setForeground(new java.awt.Color(255, 255, 255));
        clbl4.setText("Description");
        create.add(clbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 20));

        cbtn.setBackground(new java.awt.Color(74, 31, 61));
        cbtn.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        cbtn.setForeground(new java.awt.Color(255, 255, 255));
        cbtn.setText("SUBMIT");
        cbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbtnMouseClicked(evt);
            }
        });
        cbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtnActionPerformed(evt);
            }
        });
        create.add(cbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, -1, -1));

        ctxt2.setBackground(new java.awt.Color(74, 31, 61));
        ctxt2.setColumns(20);
        ctxt2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        ctxt2.setForeground(new java.awt.Color(255, 255, 255));
        ctxt2.setLineWrap(true);
        ctxt2.setRows(5);
        jScrollPane1.setViewportView(ctxt2);

        create.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 510, -1));

        clbl5.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        clbl5.setForeground(new java.awt.Color(255, 255, 255));
        clbl5.setText("Location");
        create.add(clbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        ctxt3.setBackground(new java.awt.Color(74, 31, 61));
        ctxt3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        ctxt3.setForeground(new java.awt.Color(255, 255, 255));
        ctxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxt3ActionPerformed(evt);
            }
        });
        create.add(ctxt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 510, -1));

        clbl6.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        clbl6.setForeground(new java.awt.Color(255, 255, 255));
        clbl6.setText("Date (YYYY-MM-DD)");
        create.add(clbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 210, -1));

        ctxt4.setBackground(new java.awt.Color(74, 31, 61));
        ctxt4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        ctxt4.setForeground(new java.awt.Color(255, 255, 255));
        ctxt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ctxt4MouseExited(evt);
            }
        });
        ctxt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxt4ActionPerformed(evt);
            }
        });
        create.add(ctxt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 210, -1));

        getContentPane().add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 610, 510));

        tracker.setBackground(new java.awt.Color(186, 79, 84));
        tracker.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbtn2.setBackground(new java.awt.Color(74, 31, 61));
        tbtn2.setFont(new java.awt.Font("Consolas", 3, 36)); // NOI18N
        tbtn2.setForeground(new java.awt.Color(255, 255, 255));
        tbtn2.setText("Joined Events");
        tbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtn2MouseClicked(evt);
            }
        });
        tracker.add(tbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 310, -1));

        tbtn1.setBackground(new java.awt.Color(74, 31, 61));
        tbtn1.setFont(new java.awt.Font("Consolas", 3, 36)); // NOI18N
        tbtn1.setForeground(new java.awt.Color(255, 255, 255));
        tbtn1.setText("Created Events");
        tbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtn1MouseClicked(evt);
            }
        });
        tracker.add(tbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        tlbl2.setFont(new java.awt.Font("Consolas", 1, 60)); // NOI18N
        tlbl2.setForeground(new java.awt.Color(255, 255, 255));
        tlbl2.setText("Tracker");
        tracker.add(tlbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        tlbl3.setFont(new java.awt.Font("Consolas", 1, 60)); // NOI18N
        tlbl3.setForeground(new java.awt.Color(255, 255, 255));
        tlbl3.setText("Events");
        tracker.add(tlbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        getContentPane().add(tracker, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 610, 510));

        c_track.setBackground(new java.awt.Color(186, 79, 84));
        c_track.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(c_track, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 610, 510));

        c_details.setBackground(new java.awt.Color(186, 79, 84));
        c_details.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cdlbl1.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        cdlbl1.setForeground(new java.awt.Color(255, 255, 255));
        cdlbl1.setText("Event Details");
        c_details.add(cdlbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, 60));

        cdlbl2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        cdlbl2.setForeground(new java.awt.Color(255, 255, 255));
        cdlbl2.setText("Time (HH:MM:SS)");
        c_details.add(cdlbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        cdtxt1.setEditable(false);
        cdtxt1.setBackground(new java.awt.Color(74, 31, 61));
        cdtxt1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        cdtxt1.setForeground(new java.awt.Color(255, 255, 255));
        cdtxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdtxt1ActionPerformed(evt);
            }
        });
        c_details.add(cdtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 510, -1));

        cdlbl3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        cdlbl3.setForeground(new java.awt.Color(255, 255, 255));
        cdlbl3.setText("Name");
        c_details.add(cdlbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        cdtxt2.setEditable(false);
        cdtxt2.setBackground(new java.awt.Color(74, 31, 61));
        cdtxt2.setColumns(20);
        cdtxt2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        cdtxt2.setForeground(new java.awt.Color(255, 255, 255));
        cdtxt2.setLineWrap(true);
        cdtxt2.setRows(5);
        c_details.add(cdtxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 510, -1));

        cdlbl4.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        cdlbl4.setForeground(new java.awt.Color(255, 255, 255));
        cdlbl4.setText("Description");
        c_details.add(cdlbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        cdtxt4.setEditable(false);
        cdtxt4.setBackground(new java.awt.Color(74, 31, 61));
        cdtxt4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        cdtxt4.setForeground(new java.awt.Color(255, 255, 255));
        cdtxt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdtxt4ActionPerformed(evt);
            }
        });
        c_details.add(cdtxt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 240, -1));

        cdlbl5.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        cdlbl5.setForeground(new java.awt.Color(255, 255, 255));
        cdlbl5.setText("Location");
        c_details.add(cdlbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        cdtxt3.setEditable(false);
        cdtxt3.setBackground(new java.awt.Color(74, 31, 61));
        cdtxt3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        cdtxt3.setForeground(new java.awt.Color(255, 255, 255));
        cdtxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdtxt3ActionPerformed(evt);
            }
        });
        c_details.add(cdtxt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 510, -1));

        cdlbl6.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        cdlbl6.setForeground(new java.awt.Color(255, 255, 255));
        cdlbl6.setText("Date (YYY-MM-DD)");
        c_details.add(cdlbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        cdtxt5.setEditable(false);
        cdtxt5.setBackground(new java.awt.Color(74, 31, 61));
        cdtxt5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        cdtxt5.setForeground(new java.awt.Color(255, 255, 255));
        cdtxt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdtxt5ActionPerformed(evt);
            }
        });
        c_details.add(cdtxt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 250, -1));

        cdbtn1.setBackground(new java.awt.Color(74, 31, 61));
        cdbtn1.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        cdbtn1.setForeground(new java.awt.Color(255, 255, 255));
        cdbtn1.setText("Edit Details");
        cdbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cdbtn1MouseClicked(evt);
            }
        });
        c_details.add(cdbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        cdbtn2.setBackground(new java.awt.Color(74, 31, 61));
        cdbtn2.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        cdbtn2.setForeground(new java.awt.Color(255, 255, 255));
        cdbtn2.setText("Publish");
        cdbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cdbtn2MouseClicked(evt);
            }
        });
        c_details.add(cdbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, -1));

        cdbtn3.setBackground(new java.awt.Color(74, 31, 61));
        cdbtn3.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        cdbtn3.setForeground(new java.awt.Color(255, 255, 255));
        cdbtn3.setText("See Participant List");
        cdbtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cdbtn3MouseClicked(evt);
            }
        });
        cdbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdbtn3ActionPerformed(evt);
            }
        });
        c_details.add(cdbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        cdlbl7.setFont(new java.awt.Font("Consolas", 2, 40)); // NOI18N
        cdlbl7.setText("<html><a href=''>⮌</a></html>");
        c_details.add(cdlbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        cdbtn4.setBackground(new java.awt.Color(74, 31, 61));
        cdbtn4.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        cdbtn4.setForeground(new java.awt.Color(255, 255, 255));
        cdbtn4.setText("Cancel");
        cdbtn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cdbtn4MouseClicked(evt);
            }
        });
        cdbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdbtn4ActionPerformed(evt);
            }
        });
        c_details.add(cdbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 100, -1));

        getContentPane().add(c_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 610, 510));

        c_participants.setBackground(new java.awt.Color(186, 79, 84));

        javax.swing.GroupLayout c_participantsLayout = new javax.swing.GroupLayout(c_participants);
        c_participants.setLayout(c_participantsLayout);
        c_participantsLayout.setHorizontalGroup(
            c_participantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        c_participantsLayout.setVerticalGroup(
            c_participantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        getContentPane().add(c_participants, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 610, 510));

        j_track.setBackground(new java.awt.Color(186, 79, 84));
        j_track.setLayout(new java.awt.GridBagLayout());
        getContentPane().add(j_track, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 610, 510));

        j_details.setBackground(new java.awt.Color(186, 79, 84));
        j_details.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jdlbl2.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        jdlbl2.setForeground(new java.awt.Color(255, 255, 255));
        jdlbl2.setText("Event Details");
        j_details.add(jdlbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, 60));

        jdlbl7.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jdlbl7.setForeground(new java.awt.Color(255, 255, 255));
        jdlbl7.setText("Time (HH:MM:SS)");
        j_details.add(jdlbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        jdtxt1.setEditable(false);
        jdtxt1.setBackground(new java.awt.Color(74, 31, 61));
        jdtxt1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jdtxt1.setForeground(new java.awt.Color(255, 255, 255));
        jdtxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdtxt1ActionPerformed(evt);
            }
        });
        j_details.add(jdtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 510, -1));

        jdlbl3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jdlbl3.setForeground(new java.awt.Color(255, 255, 255));
        jdlbl3.setText("Name");
        j_details.add(jdlbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jdtxt2.setEditable(false);
        jdtxt2.setBackground(new java.awt.Color(74, 31, 61));
        jdtxt2.setColumns(20);
        jdtxt2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jdtxt2.setForeground(new java.awt.Color(255, 255, 255));
        jdtxt2.setLineWrap(true);
        jdtxt2.setRows(5);
        j_details.add(jdtxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 510, -1));

        jdlbl4.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jdlbl4.setForeground(new java.awt.Color(255, 255, 255));
        jdlbl4.setText("Description");
        j_details.add(jdlbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jdtxt4.setEditable(false);
        jdtxt4.setBackground(new java.awt.Color(74, 31, 61));
        jdtxt4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jdtxt4.setForeground(new java.awt.Color(255, 255, 255));
        jdtxt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdtxt4ActionPerformed(evt);
            }
        });
        j_details.add(jdtxt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 240, -1));

        jdlbl5.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jdlbl5.setForeground(new java.awt.Color(255, 255, 255));
        jdlbl5.setText("Location");
        j_details.add(jdlbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jdtxt3.setEditable(false);
        jdtxt3.setBackground(new java.awt.Color(74, 31, 61));
        jdtxt3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jdtxt3.setForeground(new java.awt.Color(255, 255, 255));
        jdtxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdtxt3ActionPerformed(evt);
            }
        });
        j_details.add(jdtxt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 510, -1));

        jdlbl6.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jdlbl6.setForeground(new java.awt.Color(255, 255, 255));
        jdlbl6.setText("Date (YYY-MM-DD)");
        j_details.add(jdlbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jdtxt5.setEditable(false);
        jdtxt5.setBackground(new java.awt.Color(74, 31, 61));
        jdtxt5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jdtxt5.setForeground(new java.awt.Color(255, 255, 255));
        jdtxt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdtxt5ActionPerformed(evt);
            }
        });
        j_details.add(jdtxt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 250, -1));

        ddbtn2.setBackground(new java.awt.Color(74, 31, 61));
        ddbtn2.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        ddbtn2.setForeground(new java.awt.Color(255, 255, 255));
        ddbtn2.setText("Cancel");
        ddbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ddbtn2MouseClicked(evt);
            }
        });
        j_details.add(ddbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));

        jdlbl1.setFont(new java.awt.Font("Consolas", 2, 40)); // NOI18N
        jdlbl1.setText("<html><a href=''>⮌</a></html>");
        jdlbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdlbl1MouseClicked(evt);
            }
        });
        j_details.add(jdlbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(j_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 610, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dpnl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dpnl1MouseClicked

    }//GEN-LAST:event_dpnl1MouseClicked

    private void ppnl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ppnl1MouseClicked
        
    }//GEN-LAST:event_ppnl1MouseClicked

    private void cpnl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpnl1MouseClicked
        
    }//GEN-LAST:event_cpnl1MouseClicked

    private void tpnl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpnl1MouseClicked
        
    }//GEN-LAST:event_tpnl1MouseClicked

    private void jlbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl1MouseClicked
        landing.setVisible(true); dashboard.setVisible(false); j_details.setVisible(false);
        profile.setVisible(false); create.setVisible(false); tracker.setVisible(false);
        c_track.setVisible(false); j_track.setVisible(false); d_details.setVisible(false);
        c_details.setVisible(false); c_participants.setVisible(false); guide.setVisible(false);
        jlbl3.setVisible(true);jlbl4.setVisible(true);jlbl2.setVisible(true);
        dlbl1.setBackground(new Color(128,128,128)); dlbl1.setForeground(Color.WHITE);
        dpnl1.setBackground(new Color(153,0,153));
        plbl1.setBackground(new Color(128,128,128)); plbl1.setForeground(Color.WHITE);
        ppnl1.setBackground(new Color(153,0,153));
        clbl1.setBackground(new Color(128,128,128)); clbl1.setForeground(Color.WHITE);
    }//GEN-LAST:event_jlbl1MouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutMouseClicked

    private void ctxt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxt5ActionPerformed

    }//GEN-LAST:event_ctxt5ActionPerformed

    private void ctxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctxt3ActionPerformed

    private void ctxt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxt4ActionPerformed

    }//GEN-LAST:event_ctxt4ActionPerformed

    private void ptxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ptxt1ActionPerformed

    private String originalRef;
    
    private void plbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plbl1MouseClicked
        ptxt1.setEditable(false); ptxt2.setEditable(false); ptxt3.setEditable(false);
        ptxt4.setEditable(false); ptxt5.setEditable(false); ptxt6.setEditable(false); 
        ptxt7.setEditable(false); ptxt8.setEditable(false); d_details.setVisible(false);
        landing.setVisible(false); dashboard.setVisible(false); 
        profile.setVisible(true); create.setVisible(false); tracker.setVisible(false);
        dlbl1.setForeground(Color.WHITE); plbl1.setForeground(Color.BLACK);
        clbl1.setForeground(Color.WHITE); tlbl1.setForeground(Color.WHITE);
        dpnl1.setBackground(new Color(153,0,153)); ppnl1.setBackground(new Color(186, 79, 84));
        cpnl1.setBackground(new Color(153,0,153)); tpnl1.setBackground(new Color(153,0,153)); 
        c_track.setVisible(false); j_track.setVisible(false); j_details.setVisible(false);
        c_details.setVisible(false); c_participants.setVisible(false);
        albl1.setForeground(Color.WHITE); glbl1.setForeground(Color.WHITE);
        apnl1.setBackground(new Color(153,0,153)); gpnl1.setBackground(new Color(153,0,153));
        about.setVisible(false); guide.setVisible(false);
    }//GEN-LAST:event_plbl1MouseClicked

    private void loadUserProfile(String username) {
        String query = "SELECT * FROM users WHERE username = ?";

        try (Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                originalRef = rs.getString("ref"); // Store the original ref
                ptxt1.setText(originalRef);
                ptxt2.setText(rs.getString("fName"));
                ptxt3.setText(rs.getString("lName"));
                ptxt4.setText(String.valueOf(rs.getInt("age"))); // Convert age to string
                ptxt5.setText(rs.getString("contact"));
                ptxt6.setText(rs.getString("email"));
                ptxt7.setText(rs.getString("username"));
                ptxt8.setText(rs.getString("password"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database connection error.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    private void pbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pbtn1MouseClicked
        int response = JOptionPane.showConfirmDialog(null, 
        "Are you sure you want to edit details?", 
        "Confirm", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE);
                    
        if (response == JOptionPane.YES_OPTION) {
            ptxt1.setEditable(true); ptxt2.setEditable(true); ptxt3.setEditable(true);
            ptxt4.setEditable(true); ptxt5.setEditable(true); ptxt6.setEditable(true); 
            ptxt7.setEditable(true); ptxt8.setEditable(true); 
        } else if (response == JOptionPane.NO_OPTION) {
            // Do nothing, stay on the sign-up page
        }
    }//GEN-LAST:event_pbtn1MouseClicked

    private void pbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pbtn2MouseClicked
        int response = JOptionPane.showConfirmDialog(null, 
        "Do you wish to submit?", 
        "Confirm", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE);
                    
        if (response == JOptionPane.YES_OPTION) {
            String newRef = ptxt1.getText().trim();
            String fName = ptxt2.getText().trim();
            String lName = ptxt3.getText().trim();
            String ageText = ptxt4.getText().trim();
            String contact = ptxt5.getText().trim();
            String email = ptxt6.getText().trim();
            String username = ptxt7.getText().trim();
            String password = ptxt8.getText().trim();

            // Convert age to int and handle potential exceptions
            int age;
            try {
                age = Integer.parseInt(ageText);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid integer for age.", "Invalid input", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String query = "UPDATE users SET ref = ?, fName = ?, lName = ?, age = ?, contact = ?, email = ?, username = ?, password = ? WHERE ref = ?";

            try (Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);
                 PreparedStatement pstmt = conn.prepareStatement(query)) {

                pstmt.setString(1, newRef);
                pstmt.setString(2, fName);
                pstmt.setString(3, lName);
                pstmt.setInt(4, age); // Set age as int
                pstmt.setString(5, contact);
                pstmt.setString(6, email);
                pstmt.setString(7, username);
                pstmt.setString(8, password);
                pstmt.setString(9, originalRef); // Use original ref to find the record

                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    // Update was successful
                    originalRef = newRef; // Update the originalRef to the new ref value
                    JOptionPane.showMessageDialog(null, "Profile updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Profile update failed.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Database connection error.", "Error", JOptionPane.ERROR_MESSAGE);
            }
                ptxt1.setEditable(false); ptxt2.setEditable(false); ptxt3.setEditable(false);
                ptxt4.setEditable(false); ptxt5.setEditable(false); ptxt6.setEditable(false); 
                ptxt7.setEditable(false); ptxt8.setEditable(false); 
        }  else if (response == JOptionPane.NO_OPTION) {
        // Do nothing, stay on the sign-up page
    }
    }//GEN-LAST:event_pbtn2MouseClicked

    private void ptxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ptxt2ActionPerformed

    private void ptxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ptxt3ActionPerformed

    private void ptxt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptxt7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ptxt7ActionPerformed

    private void cbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbtnMouseClicked
        int response = JOptionPane.showConfirmDialog(null, 
        "Do you wish to submit?", 
        "Confirm", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE);
                    
        if (response == JOptionPane.YES_OPTION){
            String eName = ctxt1.getText().trim();
            String eDesc = ctxt2.getText().trim();
            String eLoc = ctxt3.getText().trim();
            String eDate = ctxt4.getText().trim();
            String eTime = ctxt5.getText().trim();
            String ref = ptxt1.getText().trim(); // Assuming ptxt1 is where you get the user's reference

            String url = "jdbc:mysql://localhost:3306/planorama";
            String user = "root";
            String password = "";

            boolean a = thisName(eName);
            boolean b = validateDate(eDate);
            boolean c = validateTime(eTime);

            if(a && b && c){
                try (Connection con = DriverManager.getConnection(url, user, password)) {
                    // Insert into events table
                    String insertEventQuery = "INSERT INTO events (ref, eName) VALUES (?, ?)";
                    try (PreparedStatement pstmtEvent = con.prepareStatement(insertEventQuery, Statement.RETURN_GENERATED_KEYS)) {
                        pstmtEvent.setString(1, ref);
                        pstmtEvent.setString(2, eName);
                        pstmtEvent.executeUpdate();

                        // Retrieve the auto-generated event_id
                        ResultSet generatedKeys = pstmtEvent.getGeneratedKeys();
                        int id = -1;
                        if (generatedKeys.next()) {
                            id = generatedKeys.getInt(1);
                        } else {
                            throw new SQLException("Failed to retrieve auto-generated event ID.");
                        }

                        // Insert into descriptions table
                        String insertDescriptionQuery = "INSERT INTO descriptions (id, eDesc) VALUES (?, ?)";
                        try (PreparedStatement pstmtDesc = con.prepareStatement(insertDescriptionQuery)) {
                            pstmtDesc.setInt(1, id);
                            pstmtDesc.setString(2, eDesc);
                            pstmtDesc.executeUpdate();
                        }

                        // Insert into locations table
                        String insertLocationQuery = "INSERT INTO locations (id, eLoc, eDate, eTime) VALUES (?, ?, ?, ?)";
                        try (PreparedStatement pstmtLoc = con.prepareStatement(insertLocationQuery)) {
                            pstmtLoc.setInt(1, id);
                            pstmtLoc.setString(2, eLoc);
                            pstmtLoc.setString(3, eDate);
                            pstmtLoc.setString(4, eTime);
                            pstmtLoc.executeUpdate();
                        }

                        JOptionPane.showMessageDialog(null, "Event created successfully!");
                        ctxt1.setText(""); ctxt2.setText(""); ctxt3.setText(""); ctxt4.setText(""); ctxt5.setText(""); 
                        loadCreatedEvents();
                        loadLoadedEvents();

                    } catch (SQLException e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error creating event: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Database connection error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                if (!a) {
                    JOptionPane.showMessageDialog(null, "Event name is either already used or greater than 30-character limit.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                if (!b) {
                    JOptionPane.showMessageDialog(null, "Event date is either in the past or the date today.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                if (!c) {
                    JOptionPane.showMessageDialog(null, "Event time format is invalid.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            landing.setVisible(false); dashboard.setVisible(false); 
            profile.setVisible(false); create.setVisible(true); tracker.setVisible(false);
            c_track.setVisible(false); j_track.setVisible(false); d_details.setVisible(false);
            c_details.setVisible(false); c_participants.setVisible(false); 
        } else if (response == JOptionPane.NO_OPTION) {
            // Do nothing, stay on the sign-up page
        } 
    }//GEN-LAST:event_cbtnMouseClicked

    private boolean thisName(String eName) {
        // Check if the name exceeds 30 characters
        if (eName.length() > 30) {
            return false;
        }

        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/planorama";
        String user = "root";
        String password = "";

        String query = "SELECT COUNT(*) FROM events WHERE eName = ?";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = con.prepareStatement(query)) {

            pstmt.setString(1, eName);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next() && rs.getInt(1) > 0) {
                return false; // Event name already exists
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            // Handle database error
            return false;
        }

        return true; // Event name is valid
    }
    
    private void cbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbtnActionPerformed

    private void dlbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dlbl1MouseClicked
        about.setVisible(false); guide.setVisible(false);
        landing.setVisible(false); dashboard.setVisible(true); j_details.setVisible(false);
        profile.setVisible(false); create.setVisible(false); tracker.setVisible(false); 
        c_track.setVisible(false); j_track.setVisible(false); d_details.setVisible(false);
        c_details.setVisible(false); c_participants.setVisible(false);
        albl1.setForeground(Color.WHITE); glbl1.setForeground(Color.WHITE);
        about.setVisible(false); guide.setVisible(false);
        jlbl3.setVisible(false); jlbl4.setVisible(false); jlbl2.setVisible(false); 
        dlbl1.setForeground(Color.BLACK); plbl1.setForeground(Color.WHITE);
        clbl1.setForeground(Color.WHITE); tlbl1.setForeground(Color.WHITE);
        dpnl1.setBackground(new Color(186, 79, 84)); ppnl1.setBackground(new Color(153,0,153));
        cpnl1.setBackground(new Color(153,0,153)); tpnl1.setBackground(new Color(153,0,153));
        apnl1.setBackground(new Color(153,0,153)); gpnl1.setBackground(new Color(153,0,153));
        loadLoadedEvents();
    }//GEN-LAST:event_dlbl1MouseClicked

    private void loadLoadedEvents() {
        dashboard.removeAll(); // Clear existing panels
        dashboard.setLayout(new BorderLayout()); // Use BorderLayout for better control

        String url = "jdbc:mysql://localhost:3306/planorama";
        String user = "root";
        String password = "";

        // Query to fetch events excluding the ones created or joined by the logged-in user and sorted by eDate and eTime
        String query = "SELECT e.id, e.eName, l.eDate, l.eTime " +
                       "FROM events e " +
                       "JOIN locations l ON e.id = l.id " +
                       "WHERE e.ref != ? AND e.id NOT IN (SELECT id FROM participants WHERE ref = ?) " +
                       "ORDER BY l.eDate, l.eTime";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = con.prepareStatement(query)) {

            String userRef = ptxt1.getText().trim(); // Assuming ptxt1 is where you get the logged-in user's reference
            pstmt.setString(1, userRef);
            pstmt.setString(2, userRef);

            try (ResultSet rs = pstmt.executeQuery()) {
                int gridY = 0; // Start from the top of the grid

                eventContainer = new JPanel(new GridBagLayout());
                eventContainer.setBackground(new Color(186, 79, 84));

                // Create a headline
                JLabel headline = new JLabel("Event Dashboard");
                headline.setFont(new Font("Consolas", Font.BOLD, 60));
                headline.setForeground(new Color(255, 255, 255));
                GridBagConstraints headlineGbc = new GridBagConstraints();
                headlineGbc.gridx = 0;
                headlineGbc.gridy = gridY++;
                headlineGbc.insets = new Insets(20, 0, 20, 0); // Add space around the headline
                eventContainer.add(headline, headlineGbc);

                // Create a search panel
                JPanel searchPanel = new JPanel(new BorderLayout());
                searchPanel.setPreferredSize(new Dimension(400, 40));

                // Add search icon
                JLabel searchIcon = new JLabel(new ImageIcon("search.png")); // Assuming you have a search icon image
                searchPanel.add(searchIcon, BorderLayout.WEST);

                // Add search bar
                searchField = new JTextField(20);
                searchField.setFont(new Font("Consolas", Font.PLAIN, 20));
                searchField.addActionListener(e -> searchEvent());
                searchPanel.add(searchField, BorderLayout.CENTER);

                GridBagConstraints searchGbc = new GridBagConstraints();
                searchGbc.gridx = 0;
                searchGbc.gridy = gridY++;
                searchGbc.insets = new Insets(10, 0, 10, 0); // Add space around the search panel
                eventContainer.add(searchPanel, searchGbc);

                boolean hasEvents = false;

                while (rs.next()) {
                    dashboard.setVisible(true);
                    hasEvents = true;

                    int id = rs.getInt("id");
                    String eName = rs.getString("eName");
                    String eDate = rs.getString("eDate");
                    String eTime = rs.getString("eTime");

                    JPanel eventPanel = createLoadedEventsPanel(id, eName, eDate, eTime);
                    GridBagConstraints gbc = new GridBagConstraints();
                    gbc.gridx = 0;
                    gbc.gridy = gridY++;
                    gbc.fill = GridBagConstraints.HORIZONTAL;
                    gbc.insets = new Insets(10, 10, 10, 10); // Add space between panels

                    eventContainer.add(eventPanel, gbc);
                    eventPanels.put(eName.toLowerCase(), eventPanel); // Store the panel with the event name as the key (case insensitive)
                }

                if (!hasEvents) {
                    landing.setVisible(true);
                    JOptionPane.showMessageDialog(null, "No available events to display.\nPlease wait for new events.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                scrollPane = new JScrollPane(eventContainer);
                scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                scrollPane.getViewport().setBackground(new Color(186, 79, 84));
                scrollPane.setBorder(null); // Remove the border from the JScrollPane

                dashboard.add(scrollPane, BorderLayout.CENTER); // Add scrollPane to the center of the panel

                dashboard.revalidate();
                dashboard.repaint();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database connection error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private JPanel createLoadedEventsPanel(int id, String eName, String eDate, String eTime) {
        dashboard.setVisible(true);
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setPreferredSize(new Dimension(400, 150)); // Fixed size for event panel
        panel.setMaximumSize(new Dimension(500, 150));
        panel.setBackground(new Color(186, 120, 106));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 10, 5, 10); // Padding

        JLabel nameLabel = new JLabel("Event Name: " + eName);
        nameLabel.setFont(new Font("Consolas", Font.BOLD, 18));
        nameLabel.setForeground(Color.WHITE);
        panel.add(nameLabel, gbc);
        gbc.gridy++;

        JLabel dateLabel = new JLabel("Event Date: " + eDate);
        dateLabel.setFont(new Font("Consolas", Font.PLAIN, 16));
        dateLabel.setForeground(Color.WHITE);
        panel.add(dateLabel, gbc);
        gbc.gridy++;

        JLabel timeLabel = new JLabel("Event Time: " + eTime);
        timeLabel.setFont(new Font("Consolas", Font.PLAIN, 16));
        timeLabel.setForeground(Color.WHITE);
        panel.add(timeLabel, gbc);
        gbc.gridy++;

        JButton detailsButton = new JButton("Details");
        detailsButton.setFont(new Font("Consolas", Font.PLAIN, 16));
        detailsButton.setBackground(new Color(74, 31, 61));
        detailsButton.setForeground(Color.WHITE);
        detailsButton.addActionListener(e -> details(eName));
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridy++;
        panel.add(detailsButton, gbc);

        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.WHITE, 2), // Outer border
                BorderFactory.createEmptyBorder(10, 10, 10, 10))); // Inner padding
        return panel;
    }

    private void searchEvent() {
        String searchQuery = searchField.getText().trim().toLowerCase();
        if (eventPanels.containsKey(searchQuery)) {
            JPanel targetPanel = eventPanels.get(searchQuery);
            highlightPanel(targetPanel);
        } else {
            JOptionPane.showMessageDialog(null, "Event not found.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void highlightPanel(JPanel panel) {
        Color originalColor = panel.getBackground();
        panel.setBackground(Color.WHITE);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                panel.setBackground(originalColor);
            }
        }, 500);

        // Scroll to the highlighted panel
        scrollPane.getViewport().scrollRectToVisible(panel.getBounds());
    }

    private void details(String eName) {
        d_details.setVisible(true); dashboard.setVisible(true); 
        landing.setVisible(false); 
        profile.setVisible(false); create.setVisible(false); tracker.setVisible(false);  
        c_track.setVisible(false); j_track.setVisible(false); d_details.setVisible(false);
        c_details.setVisible(false); c_participants.setVisible(false);
        String url = "jdbc:mysql://localhost:3306/planorama";
        String user = "root";
        String password = "";

        String eventQuery = "SELECT e.eName, d.eDesc, l.eLoc, l.eDate, l.eTime " +
                            "FROM events e " +
                            "JOIN descriptions d ON e.id = d.id " +
                            "JOIN locations l ON e.id = l.id " +
                            "WHERE e.eName = ?";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = con.prepareStatement(eventQuery)) {

            pstmt.setString(1, eName);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                ddtxt1.setText(rs.getString("eName"));
                ddtxt2.setText(rs.getString("eDesc"));
                ddtxt3.setText(rs.getString("eLoc"));
                ddtxt4.setText(rs.getString("eDate"));
                ddtxt5.setText(rs.getString("eTime"));

                dashboard.setVisible(false);
                d_details.setVisible(true);

                ddbtn1.addActionListener(e -> joinEvent(eName));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database connection error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void joinEvent(String eName) {
        int response = JOptionPane.showConfirmDialog(null, 
        "Are you sure you wish to join this event?", 
        "Confirm", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE);
                    
        if (response == JOptionPane.YES_OPTION) {
            String url = "jdbc:mysql://localhost:3306/planorama";
            String user = "root";
            String password = "";

            String userRef = ptxt1.getText().trim(); // Assuming ptxt1 for ref
            // Assuming you no longer collect fName and lName
            // String fName = ptxt2.getText().trim(); // Assuming ptxt2 for fName
            // String lName = ptxt3.getText().trim(); // Assuming ptxt3 for lName

            // Query to fetch the correct event ID
            String eventIdQuery = "SELECT id FROM events WHERE eName = ?";

            // Query to insert participant into participants table
            String joinQuery = "INSERT INTO participants (id, ref) VALUES (?, ?)";

            try (Connection con = DriverManager.getConnection(url, user, password);
                 PreparedStatement eventIdStmt = con.prepareStatement(eventIdQuery);
                 PreparedStatement joinStmt = con.prepareStatement(joinQuery)) {

                // Get event ID
                eventIdStmt.setString(1, eName);
                ResultSet rs = eventIdStmt.executeQuery();

                if (rs.next()) {
                    int eventId = rs.getInt("id");

                    // Insert participant details
                    joinStmt.setInt(1, eventId); // Use the correct event ID
                    joinStmt.setString(2, userRef);

                    joinStmt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Successfully joined event!", "Success", JOptionPane.INFORMATION_MESSAGE);

                    // Assuming these are UI operations to handle visibility
                    d_details.setVisible(false);
                    dashboard.setVisible(true);
                    loadLoadedEvents(); // Refresh the dashboard with updated events
                } else {
                    JOptionPane.showMessageDialog(null, "Event not found.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else if (response == JOptionPane.NO_OPTION) {
            // Do nothing, stay on the sign-up page
        }   
    }



    private void clbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clbl1MouseClicked
        landing.setVisible(false); dashboard.setVisible(false); d_details.setVisible(false);
        profile.setVisible(false); create.setVisible(true); tracker.setVisible(false);
        dlbl1.setForeground(Color.WHITE); plbl1.setForeground(Color.WHITE); j_details.setVisible(false);
        clbl1.setForeground(Color.BLACK); tlbl1.setForeground(Color.WHITE);
        dpnl1.setBackground(new Color(153,0,153)); ppnl1.setBackground(new Color(153,0,153));
        cpnl1.setBackground(new Color(186, 79, 84)); tpnl1.setBackground(new Color(153,0,153));
        c_track.setVisible(false); j_track.setVisible(false); d_details.setVisible(false);
        c_details.setVisible(false); c_participants.setVisible(false);
        albl1.setForeground(Color.WHITE); glbl1.setForeground(Color.WHITE);
        apnl1.setBackground(new Color(153,0,153)); gpnl1.setBackground(new Color(153,0,153));
        about.setVisible(false); guide.setVisible(false);
    }//GEN-LAST:event_clbl1MouseClicked

    private void tlbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tlbl1MouseClicked
        tracker.setVisible(true); landing.setVisible(false); dashboard.setVisible(false); 
        profile.setVisible(false); create.setVisible(false); d_details.setVisible(false);
        c_track.setVisible(false);  j_track.setVisible(false); 
        c_details.setVisible(false); j_details.setVisible(false);
        c_participants.setVisible(false);
        dlbl1.setForeground(Color.WHITE); plbl1.setForeground(Color.WHITE);
        clbl1.setForeground(Color.WHITE); tlbl1.setForeground(Color.BLACK);
        dpnl1.setBackground(new Color(153,0,153)); ppnl1.setBackground(new Color(153,0,153));
        cpnl1.setBackground(new Color(153,0,153)); tpnl1.setBackground(new Color(186, 79, 84));
        albl1.setForeground(Color.WHITE); glbl1.setForeground(Color.WHITE);
        apnl1.setBackground(new Color(153,0,153)); gpnl1.setBackground(new Color(153,0,153));
        about.setVisible(false); guide.setVisible(false);
    }//GEN-LAST:event_tlbl1MouseClicked

    private void tbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtn1MouseClicked
        int response = JOptionPane.showConfirmDialog(null, 
        "Do you wish to track your created events?", 
        "Confirm", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            String ref = ptxt1.getText().trim(); // Assuming ptxt1 holds the reference number
            // Database connection details
            String url = "jdbc:mysql://localhost:3306/planorama";
            String user = "root";
            String password = "";

            // Query to check if the reference exists in the events table
            String query = "SELECT COUNT(*) FROM events WHERE ref = ?";

            try (Connection con = DriverManager.getConnection(url, user, password);
                 PreparedStatement pstmt = con.prepareStatement(query)) {

                pstmt.setString(1, ref);
                ResultSet rs = pstmt.executeQuery();

                if (rs.next() && rs.getInt(1) > 0) {
                    // If reference exists, proceed with the rest of the method
                    landing.setVisible(false);
                    d_details.setVisible(false);
                    dashboard.setVisible(false);
                    c_track.setVisible(true);
                    profile.setVisible(false);
                    create.setVisible(false);
                    tracker.setVisible(false);
                    dlbl1.setForeground(Color.WHITE);
                    plbl1.setForeground(Color.WHITE);
                    j_track.setVisible(false);
                    clbl1.setForeground(Color.WHITE);
                    tlbl1.setForeground(Color.BLACK);
                    dpnl1.setBackground(new Color(153, 0, 153));
                    ppnl1.setBackground(new Color(153, 0, 153));
                    cpnl1.setBackground(new Color(153, 0, 153));
                    tpnl1.setBackground(new Color(186, 79, 84));
                } else {
                    // If reference does not exist, show message dialog
                    JOptionPane.showMessageDialog(null, "Please create an event first before accessing this functionality.", "Information", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
	} else if (response == JOptionPane.NO_OPTION) {
            // Do nothing, stay on the sign-up page
        }
    }//GEN-LAST:event_tbtn1MouseClicked


    private void tbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtn2MouseClicked
        int response = JOptionPane.showConfirmDialog(null, 
        "Do you wish to track your joined events?", 
        "Confirm", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) { 
            String url = "jdbc:mysql://localhost:3306/planorama";
            String user = "root";
            String password = "";

            // Query to check if the user has joined any events
            String query = "SELECT COUNT(*) FROM participants WHERE ref = ?";

            try (Connection con = DriverManager.getConnection(url, user, password);
                 PreparedStatement pstmt = con.prepareStatement(query)) {

                pstmt.setString(1, ptxt1.getText().trim()); // Assuming ptxt1 is where you get the logged-in user's reference
                ResultSet rs = pstmt.executeQuery();

                if (rs.next() && rs.getInt(1) > 0) {
                    landing.setVisible(false);
                    d_details.setVisible(false);
                    dashboard.setVisible(false);
                    c_track.setVisible(false);
                    profile.setVisible(false);
                    create.setVisible(false);
                    tracker.setVisible(false);
                    dlbl1.setForeground(Color.WHITE);
                    plbl1.setForeground(Color.WHITE);
                    clbl1.setForeground(Color.WHITE);
                    tlbl1.setForeground(Color.BLACK);
                    dpnl1.setBackground(new Color(153, 0, 153));
                    ppnl1.setBackground(new Color(153, 0, 153));
                    cpnl1.setBackground(new Color(153, 0, 153));
                    tpnl1.setBackground(new Color(186, 79, 84));
                    j_track.setVisible(true);
                    j_track.removeAll();
                    loadJoinedEvents();
                } else {
                    // User has not joined any events, show info message
                    JOptionPane.showMessageDialog(null, "Please join an event first before accessing this functionality.", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Database connection error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (response == JOptionPane.NO_OPTION) {
            // Do nothing, stay on the sign-up page
        }
    }//GEN-LAST:event_tbtn2MouseClicked

private void loadJoinedEvents() {
    j_track.removeAll(); // Clear existing panels from j_track
    j_track.setLayout(new BorderLayout()); // Use BorderLayout for main container

    String url = "jdbc:mysql://localhost:3306/planorama";
    String user = "root";
    String password = "";

    String query = "SELECT e.id, e.eName, d.eDesc, l.eLoc, l.eDate, l.eTime " +
                   "FROM participants p " +
                   "JOIN events e ON p.id = e.id " +
                   "JOIN descriptions d ON e.id = d.id " +
                   "JOIN locations l ON e.id = l.id " +
                   "WHERE p.ref = ? " +
                   "ORDER BY l.eDate, l.eTime"; // Order by eDate and eTime

    try (Connection con = DriverManager.getConnection(url, user, password);
         PreparedStatement pstmt = con.prepareStatement(query)) {

        pstmt.setString(1, ptxt1.getText().trim()); // Assuming participantRefField is where you get the logged-in user's reference
        ResultSet rs = pstmt.executeQuery();

        JPanel eventsPanel = new JPanel();
        eventsPanel.setLayout(new BoxLayout(eventsPanel, BoxLayout.Y_AXIS));
        eventsPanel.setBackground(new Color(186, 79, 84));

        // Headline for Events Joined
        JLabel headline = new JLabel("Events Joined");
        headline.setFont(new Font("Consolas", Font.BOLD, 60));
        back1111.setFont(new Font("Consolas", Font.ITALIC, 40));
        headline.setForeground(Color.WHITE);
        back1111.setForeground(Color.WHITE);
        headline.setAlignmentX(Component.CENTER_ALIGNMENT);
        back1111.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align headline
        eventsPanel.add(back1111);
        eventsPanel.add(Box.createVerticalStrut(10));
        eventsPanel.add(headline);
        eventsPanel.add(Box.createVerticalStrut(20)); // Add space below headline

        // Create a search panel
        JPanel searchPanel = new JPanel(new BorderLayout());
        searchPanel.setPreferredSize(new Dimension(400, 40));
        searchPanel.setMaximumSize(new Dimension(400, 40));

        // Add search icon
        JLabel searchIcon = new JLabel(new ImageIcon("search.png")); // Assuming you have a search icon image
        searchPanel.add(searchIcon, BorderLayout.WEST);

        // Add search bar
        JTextField searchField = new JTextField(20); // Rename searchFieldJoined to searchField or as per your naming convention
        searchField.setFont(new Font("Consolas", Font.PLAIN, 20));
        searchField.addActionListener(e -> searchEvents(searchField, eventsPanel));
        searchPanel.add(searchField, BorderLayout.CENTER);

        searchPanel.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align search panel
        eventsPanel.add(searchPanel);
        eventsPanel.add(Box.createVerticalStrut(10)); // Add space below search panel

        // Check if user has joined any events
        if (!rs.isBeforeFirst()) {
            JLabel noEventsLabel = new JLabel("You have not joined any events.");
            noEventsLabel.setFont(new Font("Consolas", Font.PLAIN, 20));
            noEventsLabel.setForeground(Color.WHITE);
            noEventsLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            eventsPanel.add(noEventsLabel);
        }

        while (rs.next()) {
            int eventId = rs.getInt("id");
            String eventName = rs.getString("eName");
            String eventDesc = rs.getString("eDesc");
            String eventLocation = rs.getString("eLoc");
            Date eventDate = rs.getDate("eDate");
            Time eventTime = rs.getTime("eTime");

            JPanel eventPanel = createEventPanel(eventId, eventName, eventDesc, eventLocation, eventDate, eventTime);

            // Add event panel to eventsPanel
            eventsPanel.add(eventPanel);
            eventsPanel.add(Box.createVerticalStrut(10)); // Add space between events
        }

        // Create JScrollPane and add eventsPanel to it
        JScrollPane scrollPane = new JScrollPane(eventsPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBorder(null); // Remove border from scroll pane

        j_track.add(scrollPane, BorderLayout.CENTER); // Add scroll pane to j_track

        j_track.revalidate();
        j_track.repaint();

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database connection error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private JPanel createEventPanel(int id, String name, String desc, String location, Date date, Time time) {
    JPanel panel = new JPanel(new GridBagLayout());
    panel.setPreferredSize(new Dimension(400, 180)); // Fixed size for event panel
    panel.setMaximumSize(new Dimension(500, 180));
    panel.setBackground(new Color(186, 120, 106));

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.anchor = GridBagConstraints.WEST;
    gbc.insets = new Insets(5, 10, 5, 10); // Padding

    JLabel nameLabel = new JLabel("Event Name: " + name);
    nameLabel.setFont(new Font("Consolas", Font.BOLD, 20));
    nameLabel.setForeground(Color.WHITE);
    panel.add(nameLabel, gbc);
    gbc.gridy++;

    JLabel dateLabel = new JLabel("Event Date: " + date.toString());
    dateLabel.setFont(new Font("Consolas", Font.PLAIN, 16));
    dateLabel.setForeground(Color.WHITE);
    panel.add(dateLabel, gbc);
    gbc.gridy++;

    JLabel timeLabel = new JLabel("Event Time: " + time.toString());
    timeLabel.setFont(new Font("Consolas", Font.PLAIN, 16));
    timeLabel.setForeground(Color.WHITE);
    panel.add(timeLabel, gbc);
    gbc.gridy++;

    JButton detailsButton = new JButton("Details");
    detailsButton.setFont(new Font("Consolas", Font.PLAIN, 16));
    detailsButton.setBackground(new Color(74, 31, 61));
    detailsButton.setForeground(Color.WHITE);

    // Action listener to capture eventId when "Details" button is clicked
    detailsButton.addActionListener(e -> {
        showJoinedEventDetails(id, name, desc, location, date, time);
    });

    gbc.gridx = 0;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.anchor = GridBagConstraints.CENTER;
    gbc.gridy++;
    panel.add(detailsButton, gbc);

    panel.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.WHITE, 2), // Outer border
            BorderFactory.createEmptyBorder(10, 10, 10, 10))); // Inner padding

    return panel;
}

private void searchEvents(JTextField searchField, JPanel eventsPanel) {
    String searchText = searchField.getText().trim().toLowerCase();

    boolean found = false;

    for (Component comp : eventsPanel.getComponents()) {
        if (comp instanceof JPanel) {
            JPanel panel = (JPanel) comp;
            JLabel nameLabel = (JLabel) panel.getComponent(0); // Assuming first component is the event name label

            // Check if nameLabel text is null before calling getText()
            String eventName = nameLabel.getText();
            if (eventName != null) {
                eventName = eventName.replace("Event Name: ", "").toLowerCase(); // Handle null case here
            } else {
                continue; // Skip this panel if text is null
            }

            if (eventName.contains(searchText)) {
                highlightPanel(panel);

                // Scroll to the found panel
                scrollToPanel(panel, eventsPanel);

                found = true; // Set found flag to true
                break; // Exit loop since we found the panel
            }
        }
    }

    if (!found) {
        JOptionPane.showMessageDialog(null, "Event not found.", "Search", JOptionPane.INFORMATION_MESSAGE);
    }
}

private void scrollToPanel(JPanel panel, JPanel eventsPanel) {
    // Scroll to the found panel
    SwingUtilities.invokeLater(() -> {
        JScrollPane scrollPane = (JScrollPane) SwingUtilities.getAncestorOfClass(JScrollPane.class, eventsPanel);
        if (scrollPane != null) {
            JViewport viewport = scrollPane.getViewport();
            Rectangle rect = panel.getBounds();
            Rectangle viewRect = viewport.getViewRect();

            rect.setLocation(rect.x - viewRect.x, rect.y - viewRect.y);

            viewport.scrollRectToVisible(rect);
        }
    });
}


private void showJoinedEventDetails(int eventId, String eName, String eDesc, String eLoc, Date eDate, Time eTime) {
    // Hide j_track and make j_details visible
    j_track.setVisible(false);
    j_details.setVisible(true);

    // Set the details in the respective fields
    jdtxt1.setText(eName);
    jdtxt2.setText(eDesc);
    jdtxt3.setText(eLoc);
    jdtxt4.setText(eDate.toString());
    jdtxt5.setText(eTime.toString());
}

    private void cancelEventParticipation(int eventId) {
    String url = "jdbc:mysql://localhost:3306/planorama";
    String user = "root";
    String password = "";

    String deleteQuery = "DELETE FROM participants WHERE id = ? AND ref = ?";

    try (Connection con = DriverManager.getConnection(url, user, password);
         PreparedStatement pstmt = con.prepareStatement(deleteQuery)) {

        // Assuming ptxt1.getText().trim() retrieves the logged-in user's reference
        pstmt.setInt(1, eventId);
        pstmt.setString(2, ptxt1.getText().trim());

        int rowsAffected = pstmt.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Successfully canceled your participation in the event.",
                    "Cancellation Success", JOptionPane.INFORMATION_MESSAGE);

            // Refresh the joined events panel
            loadJoinedEvents();
        } else {
            JOptionPane.showMessageDialog(null, "Failed to cancel your participation. Please try again.",
                    "Cancellation Failed", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database connection error: " + e.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    private void cdtxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdtxt1ActionPerformed

    }//GEN-LAST:event_cdtxt1ActionPerformed

    private void cdtxt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdtxt4ActionPerformed

    }//GEN-LAST:event_cdtxt4ActionPerformed

    private void cdtxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdtxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdtxt3ActionPerformed

    private void cdtxt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdtxt5ActionPerformed

    }//GEN-LAST:event_cdtxt5ActionPerformed

    private boolean validateDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false); // Ensure strict parsing

        try {
            java.util.Date parsedDate = dateFormat.parse(date);
            java.util.Date currentDate = new java.util.Date();

            if (!parsedDate.after(currentDate)) {
                return false;
            }

            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    private boolean validateTime(String time) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        timeFormat.setLenient(false); // Ensure strict parsing

        try {
            timeFormat.parse(time);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    private void cdbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdbtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdbtn3ActionPerformed

    private void cdbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cdbtn1MouseClicked
        int response = JOptionPane.showConfirmDialog(null, 
        "Are you sure you want to edit details?", 
        "Confirm", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE);
                    
	if (response == JOptionPane.YES_OPTION) {
            cdtxt1.setEditable(true); cdtxt2.setEditable(true); cdtxt3.setEditable(true);
            cdtxt4.setEditable(true); cdtxt5.setEditable(true);
        } else if (response == JOptionPane.NO_OPTION) {
            // Do nothing, stay on the sign-up page
        } 
    }//GEN-LAST:event_cdbtn1MouseClicked

private void loadCreatedEvents() {
    c_track.removeAll(); // Clear existing panels from c_track
    c_track.setLayout(new BorderLayout()); // Use BorderLayout for main container

    String url = "jdbc:mysql://localhost:3306/planorama";
    String user = "root";
    String password = "";

    String query = "SELECT e.id, e.eName, l.eDate, l.eTime " +
                   "FROM events e " +
                   "JOIN users u ON e.ref = u.ref " +
                   "JOIN locations l ON e.id = l.id " +
                   "WHERE u.username = ? " +
                   "ORDER BY l.eDate, l.eTime"; // Order by eDate and eTime

    try (Connection con = DriverManager.getConnection(url, user, password);
         PreparedStatement pstmt = con.prepareStatement(query)) {

        pstmt.setString(1, username); // Set username parameter in the query
        ResultSet rs = pstmt.executeQuery();

        eventsPanelCreated = new JPanel();
        eventsPanelCreated.setLayout(new BoxLayout(eventsPanelCreated, BoxLayout.Y_AXIS));
        eventsPanelCreated.setBackground(new Color(186, 79, 84));

        // Headline for Events Created
        JLabel headline = new JLabel("Events Created");
        headline.setFont(new Font("Consolas", Font.BOLD, 60));
        back1111.setFont(new Font("Consolas", Font.ITALIC, 40));
        headline.setForeground(Color.WHITE);
        back1111.setForeground(Color.WHITE);
        headline.setAlignmentX(Component.CENTER_ALIGNMENT);
        back1111.setAlignmentX(Component.CENTER_ALIGNMENT);
        eventsPanelCreated.add(back1111);
        eventsPanelCreated.add(Box.createVerticalStrut(10));
        eventsPanelCreated.add(headline);
        eventsPanelCreated.add(Box.createVerticalStrut(20)); // Add space below headline

        // Create a search panel
        JPanel searchPanel = new JPanel(new BorderLayout());
        searchPanel.setPreferredSize(new Dimension(400, 40));
        searchPanel.setMaximumSize(new Dimension(400, 40));

        // Add search icon
        JLabel searchIcon = new JLabel(new ImageIcon("search.png")); // Assuming you have a search icon image
        searchPanel.add(searchIcon, BorderLayout.WEST);

        // Add search bar
        searchFieldCreatedd = new JTextField(20);
        searchFieldCreatedd.setFont(new Font("Consolas", Font.PLAIN, 20));
        searchFieldCreatedd.addActionListener(e -> searchEventt());
        searchPanel.add(searchFieldCreatedd, BorderLayout.CENTER);

        searchPanel.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align search panel
        eventsPanelCreated.add(searchPanel);
        eventsPanelCreated.add(Box.createVerticalStrut(10)); // Add space below search panel

        while (rs.next()) {
            int id = rs.getInt("id");
            String eName = rs.getString("eName");
            Date eDate = rs.getDate("eDate");
            Time eTime = rs.getTime("eTime");

            JPanel eventPanel = createEventsPanel(id, eName, eDate, eTime);

            // Add event panel to eventsPanelCreated
            eventsPanelCreated.add(eventPanel);
            eventsPanelCreated.add(Box.createVerticalStrut(10)); // Add space between events
            eventPanelsLoaded.put(eName.toLowerCase(), eventPanel); // Store the panel with the event name as the key (case insensitive)
        }

        // Create JScrollPane and add eventsPanelCreated to it
        scrollPaneCreatedd = new JScrollPane(eventsPanelCreated);
        scrollPaneCreatedd.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPaneCreatedd.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPaneCreatedd.setBorder(null); // Remove border from scroll pane

        c_track.add(scrollPaneCreatedd, BorderLayout.CENTER); // Add scroll pane to c_track

        c_track.revalidate();
        c_track.repaint();

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database connection error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}


    private JPanel createEventsPanel(int id, String eName, Date eDate, Time eTime) {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setPreferredSize(new Dimension(400, 150)); // Fixed size for event panel
        panel.setMaximumSize(new Dimension(500, 150));
        panel.setBackground(new Color(186, 120, 106));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 10, 5, 10); // Padding

        JLabel nameLabel = new JLabel("Event Name: " + eName);
        nameLabel.setFont(new Font("Consolas", Font.BOLD, 18));
        nameLabel.setForeground(Color.WHITE);
        panel.add(nameLabel, gbc);
        gbc.gridy++;

        JLabel dateLabel = new JLabel("Event Date: " + eDate.toString());
        dateLabel.setFont(new Font("Consolas", Font.PLAIN, 16));
        dateLabel.setForeground(Color.WHITE);
        panel.add(dateLabel, gbc);
        gbc.gridy++;

        JLabel timeLabel = new JLabel("Event Time: " + eTime.toString());
        timeLabel.setFont(new Font("Consolas", Font.PLAIN, 16));
        timeLabel.setForeground(Color.WHITE);
        panel.add(timeLabel, gbc);
        gbc.gridy++;

        JButton detailsButton = new JButton("Details");
        detailsButton.setFont(new Font("Consolas", Font.PLAIN, 16));
        detailsButton.setBackground(new Color(74, 31, 61));
        detailsButton.setForeground(Color.WHITE);

        // Action listener to capture eventId when "Details" button is clicked
        detailsButton.addActionListener(e -> {
            showEventDetails(id, eName);
        });

        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridy++;
        panel.add(detailsButton, gbc);

        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.WHITE, 2), // Outer border
                BorderFactory.createEmptyBorder(10, 10, 10, 10))); // Inner padding
        return panel;   
    }

    private void searchEventt() {
    String searchQuery = searchFieldCreatedd.getText().toLowerCase(); // Get search query text
    JPanel foundPanel = eventPanelsLoaded.get(searchQuery);

    if (foundPanel != null) {
        highlightPanelll(foundPanel); // Highlight the found panel
        scrollPaneCreatedd.getViewport().setViewPosition(foundPanel.getLocation()); // Scroll to the found panel
    } else {
        JOptionPane.showMessageDialog(null, "Event not found.", "Search", JOptionPane.INFORMATION_MESSAGE);
    }
}

private void highlightPanelll(JPanel panel) {
    Color originalColor = panel.getBackground();
    panel.setBackground(Color.WHITE);

    Timer timer = new Timer();
    timer.schedule(new TimerTask() {
        @Override
        public void run() {
            panel.setBackground(originalColor);
        }
    }, 500); // Highlight for 0.5 seconds

    // Scroll to the highlighted panel
    scrollPaneCreatedd.getViewport().scrollRectToVisible(panel.getBounds());
}


private void showEventDetails(int id, String eName) {
    String url = "jdbc:mysql://localhost:3306/planorama";
    String user = "root";
    String password = "";

    String query = "SELECT e.eName, d.eDesc, l.eLoc, l.eDate, l.eTime " +
                   "FROM events e " +
                   "JOIN descriptions d ON e.id = d.id " +
                   "JOIN locations l ON e.id = l.id " +
                   "WHERE e.id = ?";

    try (Connection con = DriverManager.getConnection(url, user, password);
         PreparedStatement pstmt = con.prepareStatement(query)) {

        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        

        if (rs.next()) {
            currentEventId = id; // Store the current event ID
            checkName(currentEventId, eName);

            currentEventName = rs.getString("eName");
            currentEventDesc = rs.getString("eDesc");
            currentEventLoc = rs.getString("eLoc");
            currentEventDate = rs.getDate("eDate").toString(); // Store as string
            currentEventTime = rs.getTime("eTime").toString(); // Store as string

            // Set the fetched details to the c_details panel components
            cdtxt1.setText(currentEventName);
            cdtxt2.setText(currentEventDesc);
            cdtxt3.setText(currentEventLoc);
            cdtxt4.setText(currentEventDate);
            cdtxt5.setText(currentEventTime);

            // Switch to the c_details panel
            c_track.setVisible(false);
            c_details.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Event details not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database connection error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private void checkEventName(String eventName) {
    String url = "jdbc:mysql://localhost:3306/planorama";
    String user = "root";
    String password = "";

    String query = "SELECT eName FROM events WHERE eName = ?";

    try (Connection con = DriverManager.getConnection(url, user, password);
         PreparedStatement pstmt = con.prepareStatement(query)) {

        pstmt.setString(1, eventName);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            // Event name exists
            cdtxt1.setText("");
            JOptionPane.showMessageDialog(null, "This event name is already taken.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (eventName.length() > 30) {
            // Event name exceeds 30 characters
            cdtxt1.setText("");
            JOptionPane.showMessageDialog(null, "Event name must be 30 characters or less.", "Error", JOptionPane.ERROR_MESSAGE);
        } 
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database connection error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}



    private void cdbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cdbtn2MouseClicked
        int response = JOptionPane.showConfirmDialog(null, 
        "Do you wish to update event details?", 
        "Confirm", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE);
                    
	if (response == JOptionPane.YES_OPTION) {
            String eName = cdtxt1.getText().trim();
            String eDesc = cdtxt2.getText().trim();
            String eLoc = cdtxt3.getText().trim();
            String eDate = cdtxt4.getText().trim();
            String eTime = cdtxt5.getText().trim();

            boolean isValidName = validateName(currentEventId, eName);
            boolean isValidDate = validateDate(eDate);
            boolean isValidTime = validateTime(eTime);

            if (isValidName && isValidDate && isValidTime) {
                // Ensure currentEventId is set
                if (currentEventId == 0) {
                    JOptionPane.showMessageDialog(null, "No event details loaded.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Database connection parameters
                String url = "jdbc:mysql://localhost:3306/planorama";
                String user = "root";
                String password = "";

                // SQL update queries for events, descriptions, and locations tables
                String updateEventQuery = "UPDATE events SET eName = ? WHERE id = ?";
                String updateDescriptionQuery = "UPDATE descriptions SET eDesc = ? WHERE id = ?";
                String updateLocationQuery = "UPDATE locations SET eLoc = ?, eDate = ?, eTime = ? WHERE id = ?";

                try (Connection con = DriverManager.getConnection(url, user, password);
                     PreparedStatement pstmtEvent = con.prepareStatement(updateEventQuery);
                     PreparedStatement pstmtDescription = con.prepareStatement(updateDescriptionQuery);
                     PreparedStatement pstmtLocation = con.prepareStatement(updateLocationQuery)) {

                    // Set parameters for event table update
                    pstmtEvent.setString(1, eName);
                    pstmtEvent.setInt(2, currentEventId);

                    // Set parameters for description table update
                    pstmtDescription.setString(1, eDesc);
                    pstmtDescription.setInt(2, currentEventId);

                    // Set parameters for location table update
                    pstmtLocation.setString(1, eLoc);
                    pstmtLocation.setString(2, eDate);
                    pstmtLocation.setString(3, eTime);
                    pstmtLocation.setInt(4, currentEventId);

                    // Execute updates
                    int eventUpdateCount = pstmtEvent.executeUpdate();
                    int descriptionUpdateCount = pstmtDescription.executeUpdate();
                    int locationUpdateCount = pstmtLocation.executeUpdate();

                    if (eventUpdateCount > 0 && descriptionUpdateCount > 0 && locationUpdateCount > 0) {
                        JOptionPane.showMessageDialog(null, "Event details updated successfully!");

                        // Refresh the created events panel
                        loadCreatedEvents();

                        // Disable text fields after publishing
                        cdtxt1.setEditable(false);
                        cdtxt2.setEditable(false);
                        cdtxt3.setEditable(false);
                        cdtxt4.setEditable(false);
                        cdtxt5.setEditable(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Update failed. No rows updated.");
                    }

                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                if (!isValidName) {
                    JOptionPane.showMessageDialog(null, "Event name is either already used or greater than 30-character limit.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                if (!isValidDate) {
                    JOptionPane.showMessageDialog(null, "Event date is either in the past or the date today.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                if (!isValidTime) {
                    JOptionPane.showMessageDialog(null, "Event time format is invalid.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
	} else if (response == JOptionPane.NO_OPTION) {
            // Do nothing, stay on the sign-up page
        } 
    }//GEN-LAST:event_cdbtn2MouseClicked

    private boolean validateName(int id, String eName) {
        if (eName.length() > 30) {
            return false;
        }

        String url = "jdbc:mysql://localhost:3306/planorama";
        String user = "root";
        String password = "";

        String query = "SELECT COUNT(*) FROM events WHERE eName = ? AND id != ?";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = con.prepareStatement(query)) {

            pstmt.setString(1, eName);
            pstmt.setInt(2, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next() && rs.getInt(1) > 0) {
                return false; // Event name already exists for a different event
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true; // Event name is valid
    }

    private boolean checkName(int id, String eName) {
        if (eName.length() > 30) {
            return false;
        }

        String url = "jdbc:mysql://localhost:3306/planorama";
        String user = "root";
        String password = "";

        String query = "SELECT eName FROM events WHERE eName = ? AND id != ?";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = con.prepareStatement(query)) {

            pstmt.setString(1, eName);
            pstmt.setInt(2, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database connection error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    private void cdbtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cdbtn3MouseClicked
        // Clear existing components in c_participants
        c_participants.removeAll();
        c_participants.setLayout(new GridBagLayout());
        c_participants.setBackground(new Color(186, 79, 84));

        // Initialize GridBagConstraints for layout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTHWEST; // Align to top-left corner
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0; // Horizontal weight to fill the available space
        gbc.insets = new Insets(0, 0, 10, 10); // Insets for spacing (adjust as needed)

        // Back button panel for uppermost and leftmost alignment
        back11.setFont(new Font("Consolas", Font.ITALIC, 40));
        back11.setForeground(Color.WHITE);

        // Add back11 to c_participants using GridBagConstraints
        c_participants.add(back11, gbc);

        // Headline for Event Participants
        JLabel headline = new JLabel("Event Participants");
        headline.setFont(new Font("Consolas", Font.BOLD, 50));
        headline.setForeground(new Color(255, 255, 255));
        headline.setHorizontalAlignment(SwingConstants.CENTER);

        // Adjust GridBagConstraints for headline
        gbc.gridy++;
        gbc.anchor = GridBagConstraints.CENTER; // Align headline to center horizontally
        gbc.fill = GridBagConstraints.HORIZONTAL; // Fill horizontally
        gbc.weightx = 1.0; // Reset horizontal weight to fill the available space
        c_participants.add(headline, gbc);

        // Create table model with columns
        String[] columnNames = {"#", "Reference No.", "First Name", "Last Name"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        String url = "jdbc:mysql://localhost:3306/planorama";
        String user = "root";
        String password = "";

        String eName = cdtxt1.getText().trim(); // Assuming cdtxt1 holds the event name

        // Query to fetch participants
        String query = "SELECT u.ref, u.fName, u.lName " +
                       "FROM participants p " +
                       "JOIN users u ON p.ref = u.ref " +
                       "JOIN events e ON p.id = e.id " +
                       "WHERE e.eName = ?";

        try (Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = con.prepareStatement(query)) {

            pstmt.setString(1, eName);
            ResultSet rs = pstmt.executeQuery();
            c_details.setVisible(true);
            int participantCount = 0;
            boolean hasEvents = false;
            while (rs.next()) {
                c_participants.setVisible(true);
                c_details.setVisible(false);
                participantCount++;
                String ref = rs.getString("ref");
                String fName = rs.getString("fName");
                String lName = rs.getString("lName");
                hasEvents = true;

                // Add row to the table model
                model.addRow(new Object[]{participantCount, ref, fName, lName});
            }
            
            if (!hasEvents) {
                JOptionPane.showMessageDialog(null, "No one has yet to join. This table is empty.", "Information", JOptionPane.INFORMATION_MESSAGE); 
                c_details.setVisible(true);
                return;
            }

            // Create JTable with the table model
            JTable table = new JTable(model);
            table.setBackground(new Color(186, 120, 106));
            table.setForeground(new Color(255, 255, 255));
            table.setFont(new Font("Consolas", Font.PLAIN, 16)); // Increase font size
            table.setRowHeight(40); // Increase row height
            table.getTableHeader().setFont(new Font("Consolas", Font.BOLD, 18)); // Increase header font size
            table.getTableHeader().setBackground(new Color(186, 79, 84));
            table.getTableHeader().setForeground(new Color(0,0,0)); // Set header text color to white

            // Create JScrollPane for the table
            JScrollPane scrollPane = new JScrollPane(table);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane.getViewport().setBackground(new Color(186, 79, 84));
            scrollPane.setBorder(null); // Remove the border from the JScrollPane

            // Adjust GridBagConstraints for table scrollPane
            gbc.gridy++;
            gbc.gridwidth = GridBagConstraints.REMAINDER; // Span across the entire row
            gbc.fill = GridBagConstraints.BOTH; // Fill both horizontal and vertical
            gbc.weighty = 1.0; // Vertical weight to fill the available space
            c_participants.add(scrollPane, gbc);

            // Refresh panel
            c_participants.revalidate();
            c_participants.repaint();

        } catch (SQLException ex) {
            ex.printStackTrace();
            c_details.setVisible(true);
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_cdbtn3MouseClicked

    private void cdbtn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cdbtn4MouseClicked
        int response = JOptionPane.showConfirmDialog(null, 
        "Do you wish to cancel this event?", 
        "Confirm", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE);
                    
	if (response == JOptionPane.YES_OPTION) {
            String eName = cdtxt1.getText().trim(); // Assuming cdtxt1 holds the event name
            // Database connection details
            String url = "jdbc:mysql://localhost:3306/planorama";
            String user = "root";
            String password = "";

            Connection con = null;

            try {
                con = DriverManager.getConnection(url, user, password);
                con.setAutoCommit(false); // Start transaction

                // Query to get the event ID from the event name
                String getEventIdQuery = "SELECT id FROM events WHERE eName = ?";
                int eventId = -1;
                try (PreparedStatement pstmt = con.prepareStatement(getEventIdQuery)) {
                    pstmt.setString(1, eName);
                    ResultSet rs = pstmt.executeQuery();
                    if (rs.next()) {
                        eventId = rs.getInt("id");
                    }
                }

                if (eventId == -1) {
                    throw new SQLException("Event not found: " + eName);
                }

                // Delete related records from participants table
                String deleteParticipantsQuery = "DELETE FROM participants WHERE id = ?";
                try (PreparedStatement pstmt = con.prepareStatement(deleteParticipantsQuery)) {
                    pstmt.setInt(1, eventId);
                    pstmt.executeUpdate();
                }

                // Delete related records from descriptions table
                String deleteDescriptionsQuery = "DELETE FROM descriptions WHERE id = ?";
                try (PreparedStatement pstmt = con.prepareStatement(deleteDescriptionsQuery)) {
                    pstmt.setInt(1, eventId);
                    pstmt.executeUpdate();
                }

                // Delete related records from locations table
                String deleteLocationsQuery = "DELETE FROM locations WHERE id = ?";
                try (PreparedStatement pstmt = con.prepareStatement(deleteLocationsQuery)) {
                    pstmt.setInt(1, eventId);
                    pstmt.executeUpdate();
                }

                // Delete the event record from events table
                String deleteEventQuery = "DELETE FROM events WHERE id = ?";
                try (PreparedStatement pstmt = con.prepareStatement(deleteEventQuery)) {
                    pstmt.setInt(1, eventId);
                    pstmt.executeUpdate();
                }

                // Reorder IDs in the events table
                String resetCountQuery = "SET @count = 0;";
                String reorderIdsQuery = "UPDATE events SET id = (@count:=@count+1) ORDER BY id;";
                try (Statement stmt = con.createStatement()) {
                    stmt.execute(resetCountQuery);
                    stmt.execute(reorderIdsQuery);
                }

                // Update the auto_increment value
                String resetAutoIncrementQuery = "ALTER TABLE events AUTO_INCREMENT = 1;";
                try (Statement stmt = con.createStatement()) {
                    stmt.execute(resetAutoIncrementQuery);
                }

                // Fetch updated event IDs and create a temporary table to store old and new IDs
                String createTempTableQuery = "CREATE TEMPORARY TABLE temp_event_ids AS " +
                                              "SELECT @old_id := @old_id + 1 AS old_id, id AS new_id " +
                                              "FROM events, (SELECT @old_id := 0) AS t ORDER BY id;";
                try (Statement stmt = con.createStatement()) {
                    stmt.execute(createTempTableQuery);
                }

                // Update related tables with new event IDs using the temporary table
                String updateParticipantsQuery = "UPDATE participants p " +
                                                 "JOIN temp_event_ids t ON p.id = t.old_id " +
                                                 "SET p.id = t.new_id;";
                try (PreparedStatement pstmt = con.prepareStatement(updateParticipantsQuery)) {
                    pstmt.executeUpdate();
                }

                String updateDescriptionsQuery = "UPDATE descriptions d " +
                                                 "JOIN temp_event_ids t ON d.id = t.old_id " +
                                                 "SET d.id = t.new_id;";
                try (PreparedStatement pstmt = con.prepareStatement(updateDescriptionsQuery)) {
                    pstmt.executeUpdate();
                }

                String updateLocationsQuery = "UPDATE locations l " +
                                              "JOIN temp_event_ids t ON l.id = t.old_id " +
                                              "SET l.id = t.new_id;";
                try (PreparedStatement pstmt = con.prepareStatement(updateLocationsQuery)) {
                    pstmt.executeUpdate();
                }

                con.commit(); // Commit transaction

                JOptionPane.showMessageDialog(null, "Event deleted successfully and IDs updated.", "Success", JOptionPane.INFORMATION_MESSAGE);

                // Refresh the events list
                loadCreatedEvents();
            } catch (SQLException ex) {
                if (con != null) {
                    try {
                        con.rollback(); // Rollback transaction on error
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                if (con != null) {
                    try {
                        con.setAutoCommit(true); // Reset autocommit
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
            c_details.setVisible(false); c_track.setVisible(true);
	} else if (response == JOptionPane.NO_OPTION) {
            // Do nothing, stay on the sign-up page
        } 
    }//GEN-LAST:event_cdbtn4MouseClicked

    private void cdbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdbtn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdbtn4ActionPerformed

    private void ctxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ctxt1MouseExited

    }//GEN-LAST:event_ctxt1MouseExited

    private void ptxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ptxt1MouseExited
        String newRef = ptxt1.getText().trim();
    if (!newRef.equals(originalRef)) { // Only check if the ref is being changed
        String query = "SELECT COUNT(*) FROM users WHERE ref = ?";

        try (Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, newRef);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next() && rs.getInt(1) > 0) {
                ptxt1.setText("");
                JOptionPane.showMessageDialog(null, "Reference number already exists, please use another one.", "Duplicate Reference", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database connection error.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_ptxt1MouseExited

    private void ptxt7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ptxt7MouseExited
       String newUsername = ptxt7.getText().trim();
    if (!newUsername.equals(this.username)) { // Only check if the username is being changed
        String query = "SELECT COUNT(*) FROM users WHERE username = ?";

        try (Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, newUsername);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next() && rs.getInt(1) > 0) {
                ptxt7.setText("");
                JOptionPane.showMessageDialog(null, "Username already exists, please use another one.", "Duplicate Username", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database connection error.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_ptxt7MouseExited

    private void ddtxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddtxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddtxt1ActionPerformed

    private void ddtxt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddtxt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddtxt4ActionPerformed

    private void ddtxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddtxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddtxt3ActionPerformed

    private void ddtxt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddtxt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddtxt5ActionPerformed

    private void ddbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ddbtn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ddbtn1MouseClicked

    private void ddlbl8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ddlbl8MouseClicked
        loadLoadedEvents(); landing.setVisible(false); dashboard.setVisible(true); 
        profile.setVisible(false); create.setVisible(false); tracker.setVisible(false);
        c_track.setVisible(false); j_track.setVisible(false); d_details.setVisible(false);
        c_details.setVisible(false); c_participants.setVisible(false); about.setVisible(false);
        guide.setVisible(false);
    }//GEN-LAST:event_ddlbl8MouseClicked

    private void jdtxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdtxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdtxt1ActionPerformed

    private void jdtxt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdtxt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdtxt4ActionPerformed

    private void jdtxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdtxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdtxt3ActionPerformed

    private void jdtxt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdtxt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdtxt5ActionPerformed

    private void ddbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ddbtn2MouseClicked
        int response = JOptionPane.showConfirmDialog(null, 
        "Do you wish to cancel you participation for this event?", 
        "Confirm", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE);
                    
	if (response == JOptionPane.YES_OPTION) {
            // Assume ptxt1 contains the logged-in user's reference
            String userRef = ptxt1.getText().trim();
            String eventName = jdtxt1.getText().trim(); // Get event name from jdtxt1

            String url = "jdbc:mysql://localhost:3306/planorama";
            String user = "root";
            String password = "";

            String checkQuery = "SELECT COUNT(*) FROM participants p " +
                                "JOIN events e ON p.id = e.id " +
                                "WHERE p.ref = ? AND e.eName = ?";
            String deleteQuery = "DELETE p FROM participants p " +
                                 "JOIN events e ON p.id = e.id " +
                                 "WHERE p.ref = ? AND e.eName = ?";

            try (Connection con = DriverManager.getConnection(url, user, password);
                 PreparedStatement checkStmt = con.prepareStatement(checkQuery);
                 PreparedStatement deleteStmt = con.prepareStatement(deleteQuery)) {

                checkStmt.setString(1, userRef);
                checkStmt.setString(2, eventName);

                ResultSet rs = checkStmt.executeQuery();
                rs.next();

                if (rs.getInt(1) > 0) { // If the event is found in participants table for the user
                    deleteStmt.setString(1, userRef);
                    deleteStmt.setString(2, eventName);
                    deleteStmt.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Event participation canceled successfully.");

                    // Hide j_details and refresh j_track panel
                    j_details.setVisible(false);
                    loadJoinedEvents(); // Refresh the joined events list
                    j_track.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Event not found in your joined events.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Database connection error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
	} else if (response == JOptionPane.NO_OPTION) {
            // Do nothing, stay on the sign-up page
    	}
    }//GEN-LAST:event_ddbtn2MouseClicked

    private void jdlbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdlbl1MouseClicked
        dashboard.setVisible(false); profile.setVisible(false);
        create.setVisible(false); loadJoinedEvents(); tracker.setVisible(false);
        c_track.setVisible(false); j_track.setVisible(true);
        c_details.setVisible(false); c_participants.setVisible(false);
        d_details.setVisible(false); j_details.setVisible(false);
        albl1.setForeground(Color.WHITE); glbl1.setForeground(Color.WHITE);
        apnl1.setBackground(new Color(153,0,153)); gpnl1.setBackground(new Color(153,0,153));
        about.setVisible(false); guide.setVisible(false);
    }//GEN-LAST:event_jdlbl1MouseClicked

    private void apnl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apnl1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_apnl1MouseClicked

    private void albl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_albl1MouseClicked
        ptxt1.setEditable(false); ptxt2.setEditable(false); ptxt3.setEditable(false);
        ptxt4.setEditable(false); ptxt5.setEditable(false); ptxt6.setEditable(false); 
        ptxt7.setEditable(false); ptxt8.setEditable(false); d_details.setVisible(false);
        landing.setVisible(false); dashboard.setVisible(false); about.setVisible(true);
        profile.setVisible(false); create.setVisible(false); tracker.setVisible(false);
        dlbl1.setForeground(Color.WHITE); plbl1.setForeground(Color.WHITE); tracker.setVisible(false);
        clbl1.setForeground(Color.WHITE); tlbl1.setForeground(Color.WHITE);
        albl1.setForeground(Color.BLACK); glbl1.setForeground(Color.WHITE);
        dpnl1.setBackground(new Color(153,0,153)); ppnl1.setBackground(new Color(153,0,153));
        cpnl1.setBackground(new Color(153,0,153)); tpnl1.setBackground(new Color(153,0,153)); 
        apnl1.setBackground(new Color(186, 79, 84)); gpnl1.setBackground(new Color(153,0,153)); 
        c_track.setVisible(false); j_track.setVisible(false); j_details.setVisible(false);
        c_details.setVisible(false); c_participants.setVisible(false);
    }//GEN-LAST:event_albl1MouseClicked

    private void gpnl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gpnl1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_gpnl1MouseClicked

    private void glbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_glbl1MouseClicked
        ptxt1.setEditable(false); ptxt2.setEditable(false); ptxt3.setEditable(false);
        ptxt4.setEditable(false); ptxt5.setEditable(false); ptxt6.setEditable(false); 
        ptxt7.setEditable(false); ptxt8.setEditable(false); d_details.setVisible(false);
        landing.setVisible(false); dashboard.setVisible(false); about.setVisible(false);
        profile.setVisible(false); create.setVisible(false); tracker.setVisible(false);
        dlbl1.setForeground(Color.WHITE); plbl1.setForeground(Color.WHITE); tracker.setVisible(false);
        clbl1.setForeground(Color.WHITE); tlbl1.setForeground(Color.WHITE); guide.setVisible(true);
        albl1.setForeground(Color.WHITE); glbl1.setForeground(Color.BLACK); 
        dpnl1.setBackground(new Color(153,0,153)); ppnl1.setBackground(new Color(153,0,153));
        cpnl1.setBackground(new Color(153,0,153)); tpnl1.setBackground(new Color(153,0,153)); 
        apnl1.setBackground(new Color(153,0,153)); gpnl1.setBackground(new Color(186, 79, 84)); 
        c_track.setVisible(false); j_track.setVisible(false); j_details.setVisible(false);
        c_details.setVisible(false); c_participants.setVisible(false); 
    }//GEN-LAST:event_glbl1MouseClicked

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        // TODO add your handling code here: x
    }//GEN-LAST:event_aboutMouseClicked

    private void ctxt4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ctxt4MouseExited
 
    }//GEN-LAST:event_ctxt4MouseExited

    private void ctxt5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ctxt5MouseExited

    }//GEN-LAST:event_ctxt5MouseExited

    private void ctxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxt1ActionPerformed

    }//GEN-LAST:event_ctxt1ActionPerformed

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel about;
    private javax.swing.JLabel aboutLabel;
    private javax.swing.JLabel albl1;
    private javax.swing.JPanel apnl1;
    private javax.swing.JPanel c_details;
    private javax.swing.JPanel c_participants;
    private javax.swing.JPanel c_track;
    private javax.swing.JButton cbtn;
    private javax.swing.JButton cdbtn1;
    private javax.swing.JButton cdbtn2;
    private javax.swing.JButton cdbtn3;
    private javax.swing.JButton cdbtn4;
    private javax.swing.JLabel cdlbl1;
    private javax.swing.JLabel cdlbl2;
    private javax.swing.JLabel cdlbl3;
    private javax.swing.JLabel cdlbl4;
    private javax.swing.JLabel cdlbl5;
    private javax.swing.JLabel cdlbl6;
    private javax.swing.JLabel cdlbl7;
    private javax.swing.JTextField cdtxt1;
    private javax.swing.JTextArea cdtxt2;
    private javax.swing.JTextField cdtxt3;
    private javax.swing.JTextField cdtxt4;
    private javax.swing.JTextField cdtxt5;
    private javax.swing.JLabel clbl1;
    private javax.swing.JLabel clbl2;
    private javax.swing.JLabel clbl3;
    private javax.swing.JLabel clbl4;
    private javax.swing.JLabel clbl5;
    private javax.swing.JLabel clbl6;
    private javax.swing.JLabel clbl7;
    private javax.swing.JPanel cpnl1;
    private javax.swing.JPanel create;
    private javax.swing.JTextField ctxt1;
    private javax.swing.JTextArea ctxt2;
    private javax.swing.JTextField ctxt3;
    private javax.swing.JTextField ctxt4;
    private javax.swing.JTextField ctxt5;
    private javax.swing.JPanel d_details;
    private javax.swing.JPanel dashboard;
    private javax.swing.JButton ddbtn1;
    private javax.swing.JButton ddbtn2;
    private javax.swing.JLabel ddlbl1;
    private javax.swing.JLabel ddlbl2;
    private javax.swing.JLabel ddlbl3;
    private javax.swing.JLabel ddlbl5;
    private javax.swing.JLabel ddlbl6;
    private javax.swing.JLabel ddlbl7;
    private javax.swing.JLabel ddlbl8;
    private javax.swing.JTextField ddtxt1;
    private javax.swing.JTextArea ddtxt2;
    private javax.swing.JTextField ddtxt3;
    private javax.swing.JTextField ddtxt4;
    private javax.swing.JTextField ddtxt5;
    private javax.swing.JLabel dlbl1;
    private javax.swing.JLabel dlbl2;
    private javax.swing.JPanel dpnl1;
    private javax.swing.JLabel glbl1;
    private javax.swing.JPanel gpnl1;
    private javax.swing.JPanel guide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel j_details;
    private javax.swing.JPanel j_track;
    private javax.swing.JLabel jdlbl1;
    private javax.swing.JLabel jdlbl2;
    private javax.swing.JLabel jdlbl3;
    private javax.swing.JLabel jdlbl4;
    private javax.swing.JLabel jdlbl5;
    private javax.swing.JLabel jdlbl6;
    private javax.swing.JLabel jdlbl7;
    private javax.swing.JTextField jdtxt1;
    private javax.swing.JTextArea jdtxt2;
    private javax.swing.JTextField jdtxt3;
    private javax.swing.JTextField jdtxt4;
    private javax.swing.JTextField jdtxt5;
    private javax.swing.JLabel jlbl1;
    private javax.swing.JLabel jlbl2;
    private javax.swing.JLabel jlbl3;
    private javax.swing.JLabel jlbl4;
    private javax.swing.JPanel landing;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel menu;
    private javax.swing.JButton pbtn1;
    private javax.swing.JButton pbtn2;
    private javax.swing.JLabel plbl1;
    private javax.swing.JLabel plbl10;
    private javax.swing.JLabel plbl2;
    private javax.swing.JLabel plbl3;
    private javax.swing.JLabel plbl4;
    private javax.swing.JLabel plbl5;
    private javax.swing.JLabel plbl6;
    private javax.swing.JLabel plbl7;
    private javax.swing.JLabel plbl8;
    private javax.swing.JLabel plbl9;
    private javax.swing.JPanel ppnl1;
    private javax.swing.JPanel profile;
    private javax.swing.JTextField ptxt1;
    private javax.swing.JTextField ptxt2;
    private javax.swing.JTextField ptxt3;
    private javax.swing.JTextField ptxt4;
    private javax.swing.JTextField ptxt5;
    private javax.swing.JTextField ptxt6;
    private javax.swing.JTextField ptxt7;
    private javax.swing.JPasswordField ptxt8;
    private javax.swing.JButton tbtn1;
    private javax.swing.JButton tbtn2;
    private javax.swing.JLabel tlbl1;
    private javax.swing.JLabel tlbl2;
    private javax.swing.JLabel tlbl3;
    private javax.swing.JPanel tpnl1;
    private javax.swing.JPanel tracker;
    // End of variables declaration//GEN-END:variables
}
