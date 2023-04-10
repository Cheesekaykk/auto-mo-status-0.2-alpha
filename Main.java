/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.auto.mo.status;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jp Miravalles
 */
public class Main extends javax.swing.JFrame {
    Implementation im = new Implementation(); 
    
    static String fname;
    static String lname;
    static String add;
    static String email;
    static String contact;
    static String car;
    static String park;
    static String process;
    static String date;
    int mousepX;
    int mousepY;
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        
        dataTable.getTableHeader().setFont (new Font("Monospaced", Font.PLAIN, 15));
        dataTable.getTableHeader().setOpaque(false);
        dataTable.getTableHeader().setBackground(new Color(255, 204, 0));
        dataTable.getTableHeader().setForeground(new Color(0, 0, 0));
        dataTable.setRowHeight(25);
        LoadTable();
    }
    
    public void Table( String fname,
     String lname,
     String add,
     String email,
     String contact,
     String car,
     String park,
     String process,
     String date){
    
        DefaultTableModel t;
        t = (DefaultTableModel) dataTable.getModel();
        t.addRow(new Object[]{
            fname,
            lname,
            add,
            email,
            contact,
            car,
            park,
            process,
            date
        });
    }
    public static void LoadTable(){
        File file = new File("information.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel model = (DefaultTableModel) dataTable.getModel();
            
            model.setRowCount(0);
            
            Object[] lines = br.lines().toArray();
            
            for (Object line1 : lines) {
                String[] line = line1.toString().trim().split(", ");
                model.addRow(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r5 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        rfname = new javax.swing.JLabel();
        fnameField = new javax.swing.JTextField();
        raddress = new javax.swing.JLabel();
        lnameField = new javax.swing.JTextField();
        rlname = new javax.swing.JLabel();
        remail = new javax.swing.JLabel();
        rctcar = new javax.swing.JLabel();
        addField = new javax.swing.JTextField();
        eField = new javax.swing.JTextField();
        contactField = new javax.swing.JTextField();
        carComboBox = new javax.swing.JComboBox<>();
        rcnumber = new javax.swing.JLabel();
        addcus = new javax.swing.JButton();
        rspspace = new javax.swing.JLabel();
        parkComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel2.setText("Exit");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel3.setText("Auto-mo-Status");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1121, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(jLabel3))
        );

        dataTable.setBackground(new java.awt.Color(51, 51, 51));
        dataTable.setForeground(new java.awt.Color(255, 204, 0));
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Address", "Email", "Contact No.", "Type of Car", "Size of Park Space", "Status", "Date"
            }
        ));
        dataTable.setFocusable(false);
        dataTable.setGridColor(new java.awt.Color(0, 0, 0));
        dataTable.setRowHeight(25);
        dataTable.setSelectionBackground(new java.awt.Color(255, 204, 0));
        dataTable.setShowHorizontalLines(true);
        dataTable.setShowVerticalLines(true);
        dataTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(dataTable);
        if (dataTable.getColumnModel().getColumnCount() > 0) {
            dataTable.getColumnModel().getColumn(0).setPreferredWidth(70);
            dataTable.getColumnModel().getColumn(1).setPreferredWidth(70);
            dataTable.getColumnModel().getColumn(2).setPreferredWidth(120);
            dataTable.getColumnModel().getColumn(3).setPreferredWidth(120);
            dataTable.getColumnModel().getColumn(4).setPreferredWidth(70);
            dataTable.getColumnModel().getColumn(5).setPreferredWidth(50);
            dataTable.getColumnModel().getColumn(6).setPreferredWidth(50);
            dataTable.getColumnModel().getColumn(7).setPreferredWidth(70);
        }

        jTabbedPane1.setBackground(new java.awt.Color(255, 204, 0));
        jTabbedPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 1, true));
        jTabbedPane1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        r1.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        r1.setForeground(new java.awt.Color(255, 204, 0));
        r1.setText("Sort by First Name");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        r2.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(r2);
        r2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        r2.setForeground(new java.awt.Color(255, 204, 0));
        r2.setText("Sort by Last Name");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        r3.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(r3);
        r3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        r3.setForeground(new java.awt.Color(255, 204, 0));
        r3.setText("Sort by Type of Car");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });

        r4.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(r4);
        r4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        r4.setForeground(new java.awt.Color(255, 204, 0));
        r4.setText("Sort by Size of Park Space");
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });

        r5.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(r5);
        r5.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        r5.setForeground(new java.awt.Color(255, 204, 0));
        r5.setText("Sort by Date");
        r5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(r1)
                    .addComponent(r2)
                    .addComponent(r3)
                    .addComponent(r4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(r1)
                .addGap(18, 18, 18)
                .addComponent(r2)
                .addGap(18, 18, 18)
                .addComponent(r3)
                .addGap(18, 18, 18)
                .addComponent(r4)
                .addGap(18, 18, 18)
                .addComponent(r5)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sort Applicants", jPanel3);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        rfname.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        rfname.setForeground(new java.awt.Color(255, 204, 0));
        rfname.setText("First Name:");

        fnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameFieldActionPerformed(evt);
            }
        });

        raddress.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        raddress.setForeground(new java.awt.Color(255, 204, 0));
        raddress.setText("Address:");

        rlname.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        rlname.setForeground(new java.awt.Color(255, 204, 0));
        rlname.setText("Last Name:");

        remail.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        remail.setForeground(new java.awt.Color(255, 204, 0));
        remail.setText("E-mail:");

        rctcar.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        rctcar.setForeground(new java.awt.Color(255, 204, 0));
        rctcar.setText("Type of Car:");

        eField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eFieldActionPerformed(evt);
            }
        });

        contactField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactFieldActionPerformed(evt);
            }
        });

        carComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedan", "Van", "Truck", "Motorcycle" }));
        carComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carComboBoxActionPerformed(evt);
            }
        });

        rcnumber.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        rcnumber.setForeground(new java.awt.Color(255, 204, 0));
        rcnumber.setText("Contact No.:");

        addcus.setBackground(new java.awt.Color(255, 204, 0));
        addcus.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        addcus.setText("Add Applicant");
        addcus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcusActionPerformed(evt);
            }
        });

        rspspace.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        rspspace.setForeground(new java.awt.Color(255, 204, 0));
        rspspace.setText("Size of Parking Space:");

        parkComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedan", "Van", "Truck", "Motorcycle" }));
        parkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parkComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rctcar)
                                        .addComponent(rcnumber))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(carComboBox, 0, 250, Short.MAX_VALUE)
                                        .addComponent(contactField)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(rspspace)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(parkComboBox, 0, 162, Short.MAX_VALUE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rfname)
                                    .addComponent(rlname))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(raddress)
                                    .addComponent(remail))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(addcus)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rfname)
                    .addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rlname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(raddress)
                    .addComponent(addField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remail)
                    .addComponent(eField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rcnumber)
                    .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rctcar)
                    .addComponent(carComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rspspace)
                    .addComponent(parkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(addcus)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Applicant", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 937, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1402, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        if(r2.isSelected()){
           im.readInfo();
           im.sortLname(im.getInfo());
           
       }
       File file = new File("insert2.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel model = (DefaultTableModel) dataTable.getModel();
            model.setRowCount(0);
            Object[] lines = br.lines().toArray();
            
            for(int i = 0; i < lines.length ; i++){
                String[] line = lines[i].toString().trim().split(", ");
                model.addRow(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_r2ActionPerformed
        
    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
           if(r3.isSelected()){
           im.readInfo();
           im.sortAdd(im.getInfo());
           
       }
       File file = new File("insert3.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel model = (DefaultTableModel) dataTable.getModel();
            model.setRowCount(0);
            Object[] lines = br.lines().toArray();
            
            for(int i = 0; i < lines.length ; i++){
                String[] line = lines[i].toString().trim().split(", ");
                model.addRow(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_r3ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
        if(r4.isSelected()){
           im.readInfo();
           im.sortCar(im.getInfo());
           
       }
       File file = new File("insert4.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel model = (DefaultTableModel) dataTable.getModel();
            model.setRowCount(0);
            Object[] lines = br.lines().toArray();
            
            for(int i = 0; i < lines.length ; i++){
                String[] line = lines[i].toString().trim().split(", ");
                model.addRow(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_r4ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int kordinatX = evt.getXOnScreen();
        int kordinatY = evt.getYOnScreen();
        
        this.setLocation(kordinatX - mousepX, kordinatY - mousepY);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
       if(r1.isSelected()){
           im.readInfo();
           im.sortFname(im.getInfo());
           
       }
       File file = new File("insert.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel model = (DefaultTableModel) dataTable.getModel();
            model.setRowCount(0);
            Object[] lines = br.lines().toArray();
            
            for(int i = 0; i < lines.length ; i++){
                String[] line = lines[i].toString().trim().split(", ");
                model.addRow(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_r1ActionPerformed

    private void fnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameFieldActionPerformed

    private void eFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eFieldActionPerformed

    private void contactFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactFieldActionPerformed

    private void carComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carComboBoxActionPerformed
        // TODO add your handling code here:
        Object sValue = carComboBox.getSelectedItem();
        String car = sValue.toString();

    }//GEN-LAST:event_carComboBoxActionPerformed

    private void addcusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcusActionPerformed

        fname = fnameField.getText();
        lname = lnameField.getText();
        add = addField.getText();
        email = eField.getText();
        contact = contactField.getText();
        car = (String) carComboBox.getSelectedItem();
        park = (String) parkComboBox.getSelectedItem();
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        Date curdate = new Date();
        date = dateformat.format(curdate);

        if (car.equals(park)) {
            process = ("Passed");

        } else if (car.equals("Sedan") && (park.equals("Van") || park.equals("Truck"))) {
            process = ("Passed");

        } else if (car.equals("Van") && park.equals("Truck")) {
            process = ("Passed");

        } else if (car.equals("Motorcycle") && (park.equals("Sedan") || park.equals("Van") || park.equals("Truck"))) {
            process = ("Passed");

        } else {
            process = ("Failed");

        }

        im.setFname(fname);
        im.setLname(lname);
        im.setAdd(add);
        im.setEmail(email);
        im.setContact(contact);
        im.setCar(car);
        im.setPark(park);
        im.setProcess(process);
        im.setDate(date);

        im.saveInfo();
        JOptionPane.showMessageDialog(this,"Registered Successfully!");

        Table( fname,
        lname,
        add,
        email,
        contact,
        car,
        park,
        process,
        date
        );
        
        fnameField.setText("");
        lnameField.setText("");
        addField.setText("");
        eField.setText("");
        contactField.setText("");
    }//GEN-LAST:event_addcusActionPerformed

    private void parkComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parkComboBoxActionPerformed
        // TODO add your handling code here:
        Object sValue1 = parkComboBox.getSelectedItem();
        String park = sValue1.toString();
    }//GEN-LAST:event_parkComboBoxActionPerformed

    private void r5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5ActionPerformed
        if(r5.isSelected()){
           im.readInfo();
           im.sortDate(im.getInfo());
           
       }
       File file = new File("insert5.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel model = (DefaultTableModel) dataTable.getModel();
            model.setRowCount(0);
            Object[] lines = br.lines().toArray();
            
            for(int i = 0; i < lines.length ; i++){
                String[] line = lines[i].toString().trim().split(", ");
                model.addRow(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_r5ActionPerformed
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
        LoadTable();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextField addField;
    private javax.swing.JButton addcus;
    private javax.swing.ButtonGroup buttonGroup1;
    private static javax.swing.JComboBox<String> carComboBox;
    private static javax.swing.JTextField contactField;
    public static javax.swing.JTable dataTable;
    private static javax.swing.JTextField eField;
    private static javax.swing.JTextField fnameField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private static javax.swing.JTextField lnameField;
    private static javax.swing.JComboBox<String> parkComboBox;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JLabel raddress;
    private javax.swing.JLabel rcnumber;
    private javax.swing.JLabel rctcar;
    private javax.swing.JLabel remail;
    private javax.swing.JLabel rfname;
    private javax.swing.JLabel rlname;
    private javax.swing.JLabel rspspace;
    // End of variables declaration//GEN-END:variables

    public JTable getDataTable() {
        return dataTable;
    }
    public void setDataTable(javax.swing.JTable dataTable) {
        this.dataTable = dataTable;
    }
    
    
}
