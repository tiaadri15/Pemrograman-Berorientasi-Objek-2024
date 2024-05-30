package com.mycompany.tugas_1_maven;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class HotelReservation extends javax.swing.JFrame {
    Connection conn;
    PreparedStatement pst;
    
    public HotelReservation() throws SQLException {
        initComponents();
        this.setVisible(true);
        loadDataToTable();
        
    }
    
     int reservationId;
    
    // Metode untuk mengambil data dari basis data dan menampilkannya ada tabel
    private void loadDataToTable() {
        DefaultTableModel model = (DefaultTableModel) tbRsvHistory.getModel();
        model.setRowCount(0); // Bersihkan tabel

        String query = "SELECT id_reservation, CONCAT(first_name, ' ', last_name) AS full_name, email, phone, rsv_date, check_in, check_out, room_type FROM reservation";

        try (Connection conn = DatabaseConnection.configDB();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                reservationId = rs.getInt("id_reservation");
                String fullName = rs.getString("full_name");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                Date rsv_date = rs.getDate("rsv_date");
                Date checkInDate = rs.getDate("check_in");
                Date checkOutDate = rs.getDate("check_out");
                String room_type = rs.getString("room_type");

                model.addRow(new Object[]{reservationId, fullName, email, phone, rsv_date, room_type, checkInDate, checkOutDate});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbAdult = new javax.swing.JComboBox<>();
        txtPhone = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        cbCity = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cbChildren = new javax.swing.JComboBox<>();
        dcCheckIn = new com.toedter.calendar.JDateChooser();
        dcCheckOut = new com.toedter.calendar.JDateChooser();
        btnReservasi = new javax.swing.JButton();
        rbSingleRoom = new javax.swing.JRadioButton();
        rbDeluxeRoom = new javax.swing.JRadioButton();
        rbSuiteRoom = new javax.swing.JRadioButton();
        btnUbah = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbRsvHistory = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reservation Form");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 255));
        jLabel9.setText("Check-out Date");

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 255));
        jLabel10.setText("Room Type");

        jLabel11.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 153, 255));
        jLabel11.setText("Adult");

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("City");

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("Phone");

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 255));
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 255));
        jLabel8.setText("Check-in Date");

        cbAdult.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        cbAdult.setForeground(new java.awt.Color(51, 153, 255));
        cbAdult.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        cbAdult.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 1, true));
        cbAdult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbAdultMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbAdultMouseExited(evt);
            }
        });
        cbAdult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAdultActionPerformed(evt);
            }
        });

        txtPhone.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtPhone.setForeground(new java.awt.Color(51, 153, 255));
        txtPhone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 1, true));
        txtPhone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPhoneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPhoneMouseExited(evt);
            }
        });
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        txtLastName.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtLastName.setForeground(new java.awt.Color(51, 153, 255));
        txtLastName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 1, true));
        txtLastName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtLastNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtLastNameMouseExited(evt);
            }
        });
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(51, 153, 255));
        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 1, true));
        txtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEmailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEmailMouseExited(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtAddress.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(51, 153, 255));
        txtAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 1, true));
        txtAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtAddressMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtAddressMouseExited(evt);
            }
        });
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        txtFirstName.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtFirstName.setForeground(new java.awt.Color(51, 153, 255));
        txtFirstName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 1, true));
        txtFirstName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtFirstNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFirstNameMouseExited(evt);
            }
        });
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        txtFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFirstNameKeyPressed(evt);
            }
        });

        cbCity.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        cbCity.setForeground(new java.awt.Color(51, 153, 255));
        cbCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jakarta", "Surabaya", "Kediri", "Sumbawa ", "Samarinda ", "Balikpapan" }));
        cbCity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 1, true));
        cbCity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbCityMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbCityMouseExited(evt);
            }
        });
        cbCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCityActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel12.setText("Children");

        cbChildren.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        cbChildren.setForeground(new java.awt.Color(51, 153, 255));
        cbChildren.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        cbChildren.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 1, true));
        cbChildren.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbChildrenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbChildrenMouseExited(evt);
            }
        });
        cbChildren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChildrenActionPerformed(evt);
            }
        });

        dcCheckIn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 1, true));
        dcCheckIn.setForeground(new java.awt.Color(51, 153, 255));
        dcCheckIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dcCheckInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dcCheckInMouseExited(evt);
            }
        });

        dcCheckOut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 1, true));
        dcCheckOut.setForeground(new java.awt.Color(51, 153, 255));
        dcCheckOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dcCheckOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dcCheckOutMouseExited(evt);
            }
        });

        btnReservasi.setBackground(new java.awt.Color(51, 153, 255));
        btnReservasi.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnReservasi.setForeground(new java.awt.Color(255, 255, 255));
        btnReservasi.setText("Reservasi");
        btnReservasi.setBorder(null);
        btnReservasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservasiActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbSingleRoom);
        rbSingleRoom.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        rbSingleRoom.setForeground(new java.awt.Color(51, 153, 255));
        rbSingleRoom.setText("Single Room");
        rbSingleRoom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbSingleRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rbSingleRoomMouseEntered(evt);
            }
        });

        buttonGroup1.add(rbDeluxeRoom);
        rbDeluxeRoom.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        rbDeluxeRoom.setForeground(new java.awt.Color(51, 153, 255));
        rbDeluxeRoom.setText("Deluxe Room");
        rbDeluxeRoom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(rbSuiteRoom);
        rbSuiteRoom.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        rbSuiteRoom.setForeground(new java.awt.Color(51, 153, 255));
        rbSuiteRoom.setText("Suite Room");
        rbSuiteRoom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnUbah.setBackground(new java.awt.Color(51, 153, 255));
        btnUbah.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnUbah.setForeground(new java.awt.Color(255, 255, 255));
        btnUbah.setText("Ubah");
        btnUbah.setBorder(null);
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 153, 255));
        jLabel13.setText("HOTEL RESERVATION HISTORY");

        tbRsvHistory.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tbRsvHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID RESERVATION", "NAME", "EMAIL", "PHONE", "RESERVATION DATE", "ROOM TYPE", "CHECK IN", "CHECK OUT"
            }
        ));
        tbRsvHistory.setCellSelectionEnabled(true);
        tbRsvHistory.setSelectionBackground(new java.awt.Color(51, 153, 255));
        tbRsvHistory.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tbRsvHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRsvHistoryMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbRsvHistory);
        if (tbRsvHistory.getColumnModel().getColumnCount() > 0) {
            tbRsvHistory.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel14.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 153, 255));
        jLabel14.setText("HOTEL RESERVATION SYSTEM");

        btnDelete.setBackground(new java.awt.Color(51, 153, 255));
        btnDelete.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Hapus");
        btnDelete.setBorder(null);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbSingleRoom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbDeluxeRoom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbSuiteRoom))
                    .addComponent(dcCheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dcCheckIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAddress)
                    .addComponent(txtPhone)
                    .addComponent(txtEmail)
                    .addComponent(txtLastName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbAdult, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(cbChildren, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnReservasi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(219, 219, 219))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dcCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbSingleRoom)
                                .addComponent(rbDeluxeRoom)
                                .addComponent(rbSuiteRoom)))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbAdult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(cbChildren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReservasi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbChildrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChildrenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbChildrenActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void cbAdultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAdultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAdultActionPerformed

    private void cbCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCityActionPerformed
   
    // Metode untuk tambah reservasi kedalam tabel dan basis data
    private void btnReservasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasiActionPerformed
        // TODO add your handling code here:
        try {
            try {
            conn = DatabaseConnection.configDB();
            // gunakan conn di sini
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal membuat reservasi: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
            
            String first_name, last_name, email, address, city, room_type, phone;
            int adult, children;
            LocalDate rsv_date;
            
            rsv_date = LocalDate.now();
            
            first_name = txtFirstName.getText();
            last_name = txtLastName.getText();
            email = txtEmail.getText();
            phone = txtPhone.getText();
            if (phone.length() > 15) {  
                throw new IllegalArgumentException("Nomor telepon terlalu panjang");
            }
            address = txtAddress.getText();
            city = cbCity.getSelectedItem().toString();
            room_type = getSelectedRoomType();
            adult = Integer.parseInt(cbAdult.getSelectedItem().toString());
            children = Integer.parseInt(cbChildren.getSelectedItem().toString());
            
            final String formattanggal = "yyyy-MM-dd";
            SimpleDateFormat sdf = new SimpleDateFormat(formattanggal);
            String formattedCheckIn = sdf.format(dcCheckIn.getDate());
            String formattedCheckOut = sdf.format(dcCheckOut.getDate());

            pst = conn.prepareStatement("insert into reservation (first_name, last_name, email, phone, address, city, rsv_date, check_in, check_out, room_type, adult, children) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1,first_name);
            pst.setString(2,last_name);
            pst.setString(3,email);
            pst.setString(4,phone);
            pst.setString(5,address);
            pst.setString(6,city);
            pst.setObject(7, rsv_date);
            pst.setObject(8, formattedCheckIn);
            pst.setObject(9, formattedCheckOut);
            pst.setString(10, room_type);
            pst.setInt(11,adult);
            pst.setInt(12,children);
            
            pst.executeUpdate();
            
            int result = JOptionPane.showConfirmDialog(this, "Reservasi berhasil", "Pemberitahuan", JOptionPane.YES_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                loadDataToTable();
                addTableSelectionListener();
            }

            txtFirstName.setText(" ");
            txtLastName.setText(" ");
            txtEmail.setText(" ");
            txtPhone.setText(" ");
            txtAddress.setText(" ");
            cbCity.setSelectedIndex(0);
            clearRadioButtons();
            dcCheckIn.setDate(null);
            dcCheckOut.setDate(null);
            cbAdult.setSelectedIndex(0);
            cbChildren.setSelectedIndex(0);
            
            txtFirstName.requestFocus();
            
        } catch (SQLException ex) {
            Logger.getLogger(HotelReservation.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnReservasiActionPerformed
    
    //Metode untuk warna inputan
    private void txtFirstNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFirstNameMouseEntered
        // TODO add your handling code here:
        Color color1 = new Color(68, 153, 244);
        Color color2 = new Color(255, 255, 255);
        txtFirstName.setBackground(color1);
        txtFirstName.setForeground(color2);
    }//GEN-LAST:event_txtFirstNameMouseEntered

    private void txtFirstNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFirstNameMouseExited
        // TODO add your handling code here:
        Color color1 = new Color(68, 153, 244);
        Color color2 = new Color(255, 255, 255);
        txtFirstName.setBackground(color2);
        txtFirstName.setForeground(color1);
        
    }//GEN-LAST:event_txtFirstNameMouseExited

    private void txtLastNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLastNameMouseEntered
        // TODO add your handling code here:
        Color color1 = new Color(68, 153, 244);
        Color color2 = new Color(255, 255, 255);
        txtLastName.setBackground(color1);
        txtLastName.setForeground(color2);
    }//GEN-LAST:event_txtLastNameMouseEntered

    private void txtLastNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLastNameMouseExited
        // TODO add your handling code here:
        Color color1 = new Color(68, 153, 244);
        Color color2 = new Color(255, 255, 255);
        txtLastName.setBackground(color2);
        txtLastName.setForeground(color1);
    }//GEN-LAST:event_txtLastNameMouseExited

    private void txtEmailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseEntered
        // TODO add your handling code here:
        Color color1 = new Color(68, 153, 244);
        Color color2 = new Color(255, 255, 255);
        txtEmail.setBackground(color1);
        txtEmail.setForeground(color2);
    }//GEN-LAST:event_txtEmailMouseEntered

    private void txtEmailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseExited
        // TODO add your handling code here:
        Color color1 = new Color(68, 153, 244);
        Color color2 = new Color(255, 255, 255);
        txtEmail.setBackground(color2);
        txtEmail.setForeground(color1);
    }//GEN-LAST:event_txtEmailMouseExited

    private void txtPhoneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPhoneMouseEntered
        // TODO add your handling code here:
         Color color1 = new Color(68, 153, 244);
        Color color2 = new Color(255, 255, 255);
        txtPhone.setBackground(color1);
        txtPhone.setForeground(color2);
    }//GEN-LAST:event_txtPhoneMouseEntered

    private void txtPhoneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPhoneMouseExited
        Color color1 = new Color(68, 153, 244);
        Color color2 = new Color(255, 255, 255);
        txtPhone.setBackground(color2);
        txtPhone.setForeground(color1);
    }//GEN-LAST:event_txtPhoneMouseExited

    private void txtAddressMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddressMouseEntered
        // TODO add your handling code here:
        Color color1 = new Color(68, 153, 244);
        Color color2 = new Color(255, 255, 255);
        txtAddress.setBackground(color1);
        txtAddress.setForeground(color2);
    }//GEN-LAST:event_txtAddressMouseEntered

    private void txtAddressMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddressMouseExited
        // TODO add your handling code here:
        Color color1 = new Color(68, 153, 244);
        Color color2 = new Color(255, 255, 255);
        txtAddress.setBackground(color2);
        txtAddress.setForeground(color1);
    }//GEN-LAST:event_txtAddressMouseExited

    private void cbCityMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbCityMouseEntered
        // TODO add your handling code here:
         Color color1 = new Color(68, 153, 244);
         Color color2 = new Color(255, 255, 255);
        cbCity.setBackground(color1);
        cbCity.setForeground(color2);
    }//GEN-LAST:event_cbCityMouseEntered

    private void cbCityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbCityMouseExited
        // TODO add your handling code here:
        Color color1 = new Color(68, 153, 244);
        Color color2 = new Color(255, 255, 255);
        cbCity.setForeground(color1);
        cbCity.setBackground(color2);
    }//GEN-LAST:event_cbCityMouseExited

    private void dcCheckInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dcCheckInMouseEntered
        // TODO add your handling code here:
        Color color1 = new Color(68, 153, 244);
        Color color2 = new Color(255, 255, 255);
        dcCheckIn.setBackground(color1);
        dcCheckIn.setForeground(color2);
    }//GEN-LAST:event_dcCheckInMouseEntered

    private void dcCheckInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dcCheckInMouseExited
        // TODO add your handling code here:
        Color color = new Color(255, 255, 255);
        dcCheckIn.setBackground(color);
    }//GEN-LAST:event_dcCheckInMouseExited

    private void dcCheckOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dcCheckOutMouseEntered
        // TODO add your handling code here:
        Color color1 = new Color(68, 153, 244);
        Color color2 = new Color(255, 255, 255);
        dcCheckOut.setBackground(color1);
        dcCheckOut.setForeground(color2);
    }//GEN-LAST:event_dcCheckOutMouseEntered

    private void dcCheckOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dcCheckOutMouseExited
        // TODO add your handling code here:
        Color color = new Color(255, 255, 255);
        dcCheckOut.setBackground(color);
    }//GEN-LAST:event_dcCheckOutMouseExited

    private void rbSingleRoomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbSingleRoomMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSingleRoomMouseEntered

    private void cbAdultMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbAdultMouseEntered
        // TODO add your handling code here:
        Color color1 = new Color(68, 153, 244);
        Color color2 = new Color(255, 255, 255);
        cbAdult.setBackground(color1);
        cbAdult.setForeground(color2);
    }//GEN-LAST:event_cbAdultMouseEntered

    private void cbAdultMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbAdultMouseExited
        // TODO add your handling code here:
        Color color1 = new Color(68, 153, 244);
        Color color2 = new Color(255, 255, 255);
        cbAdult.setForeground(color1);
        cbAdult.setBackground(color2);
    }//GEN-LAST:event_cbAdultMouseExited

    private void cbChildrenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbChildrenMouseEntered
        // TODO add your handling code here:
        Color color1 = new Color(68, 153, 244);
        Color color2 = new Color(255, 255, 255);
        cbChildren.setBackground(color1);
        cbChildren.setForeground(color2);
    }//GEN-LAST:event_cbChildrenMouseEntered
    
    //END WARNA
    private void cbChildrenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbChildrenMouseExited
        // TODO add your handling code here:
        Color color1 = new Color(68, 153, 244);
        Color color2 = new Color(255, 255, 255);
        cbChildren.setForeground(color1);
        cbChildren.setBackground(color2);
    }//GEN-LAST:event_cbChildrenMouseExited
    
    // Metode untuk button ubah
    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed

        // TODO add your handling code here:
            editData();
    }//GEN-LAST:event_btnUbahActionPerformed
    
    // Metode button hapus
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        deleteData();
    }//GEN-LAST:event_btnDeleteActionPerformed
    
    private void addTableSelectionListener() {
        tbRsvHistory.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedIndex = tbRsvHistory.getSelectedRow();
                if (selectedIndex != -1) {
                    fillFormFromSelectedRow();
                }
            }
        });
    }
    
    // Metode untuk menampilkan data dari row tabel yang dipilih
    private void fillFormFromSelectedRow() {
        int selectedIndex = tbRsvHistory.getSelectedRow();
        if (selectedIndex == -1) {
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tbRsvHistory.getModel();
        int reservationId = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());

        String query = "SELECT first_name, last_name, email, phone, address, city, check_in, check_out, room_type, adult, children FROM reservation WHERE id_reservation=" + reservationId;

        try (Connection conn = DatabaseConnection.configDB();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query)) {
        
            if (rs.next()) {
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                String city = rs.getString("city");
                Date checkIn = rs.getDate("check_in");
                Date checkOut = rs.getDate("check_out");
                String roomType = rs.getString("room_type");
                switch (roomType) {
                    case "Single Room":
                        rbSingleRoom.setSelected(true);
                        break;
                    case "Deluxe Room":
                        rbDeluxeRoom.setSelected(true);
                        break;
                    case "Suite":
                        rbSuiteRoom.setSelected(true);
                        break;
                    default:
                        System.out.println("Pilihan tidak sesuai");
                        break;
                }
                int adult = rs.getInt("adult");
                int children = rs.getInt("children");
            
                // Set values to UI components
                txtFirstName.setText(firstName);
                txtLastName.setText(lastName);
                txtEmail.setText(email);
                txtPhone.setText(phone);
                txtAddress.setText(address);
                cbCity.setSelectedItem(city); 
                dcCheckIn.setDate(checkIn);
                dcCheckOut.setDate(checkOut);
                cbAdult.setSelectedItem(String.valueOf(adult));
                cbChildren.setSelectedItem(String.valueOf(children));
            }
        } catch (SQLException ex) {
            Logger.getLogger(HotelReservation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Metode untuk mengubah data dari tabel dan basis data
    private void editData() {
        int selectedIndex = tbRsvHistory.getSelectedRow();
        if (selectedIndex == -1) {
            return;
        }
        
        try{
            conn = DatabaseConnection.configDB();
            DefaultTableModel model = (DefaultTableModel) tbRsvHistory.getModel();
            
            
            String first_name, last_name, email, address, city, room_type, phone;
            int adult, children;
            LocalDate rsv_date;
            
            rsv_date = LocalDate.now();
            
            first_name = txtFirstName.getText();
            last_name = txtLastName.getText();
            email = txtEmail.getText();
            phone = txtPhone.getText();
            if (phone.length() > 15) {  
                throw new IllegalArgumentException("Nomor telepon terlalu panjang");
            }
            address = txtAddress.getText();
            city = cbCity.getSelectedItem().toString();
            room_type = getSelectedRoomType();
            adult = Integer.parseInt(cbAdult.getSelectedItem().toString());
            children = Integer.parseInt(cbChildren.getSelectedItem().toString());
            
            final String formattanggal = "yyyy-MM-dd";
            SimpleDateFormat sdf = new SimpleDateFormat(formattanggal);
            String formattedCheckIn = sdf.format(dcCheckIn.getDate());
            String formattedCheckOut = sdf.format(dcCheckOut.getDate());
            int reservationId = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
            
            int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda ingin megubah data dengan ID Reservasi " + reservationId +"?", "Pemberitahuan ", JOptionPane.YES_NO_OPTION);
            
            if (confirm == JOptionPane.YES_OPTION){
            pst = conn.prepareStatement("UPDATE reservation SET first_name=?, last_name=?, email=?, phone=?, address=?, city=?, rsv_date=?, check_in=?, check_out=?, room_type=?, adult=?, children=? WHERE id_reservation=" + reservationId);
            pst.setString(1,first_name);
            pst.setString(2,last_name);
            pst.setString(3,email);
            pst.setString(4,phone);
            pst.setString(5,address);
            pst.setString(6,city);
            pst.setObject(7, rsv_date);
            pst.setObject(8, formattedCheckIn);
            pst.setObject(9, formattedCheckOut);
            pst.setString(10, room_type);
            pst.setInt(11,adult);
            pst.setInt(12,children);
            
            pst.executeUpdate();
            
            int result = JOptionPane.showConfirmDialog(this, "Ubah data reservasi berhasil", "Pemberitahuan", JOptionPane.YES_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                loadDataToTable();
                addTableSelectionListener();
            }

            txtFirstName.setText(" ");
            txtLastName.setText(" ");
            txtEmail.setText(" ");
            txtPhone.setText(" ");
            txtAddress.setText(" ");
            cbCity.setSelectedIndex(0);
            clearRadioButtons();
            dcCheckIn.setDate(null);
            dcCheckOut.setDate(null);
            cbAdult.setSelectedIndex(0);
            cbChildren.setSelectedIndex(0);
            
            txtFirstName.requestFocus();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(HotelReservation.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    
    // Metode untuk menghapus data dari tabel dan basis data
    private void deleteData() {
        int selectedIndex = tbRsvHistory.getSelectedRow();
        if (selectedIndex != -1) {
            int reservationId = Integer.parseInt(tbRsvHistory.getValueAt(selectedIndex, 0).toString());
            int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin ingin menghapus data dengan ID Reservasi " + reservationId + "?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    String query = "DELETE FROM reservation WHERE id_reservation = ?";
                    try (Connection conn = DatabaseConnection.configDB();
                        PreparedStatement pstmt = conn.prepareStatement(query)) {
                        pstmt.setInt(1, reservationId);
                        int rowsAffected = pstmt.executeUpdate();
                            if (rowsAffected > 0) {
                                DefaultTableModel model = (DefaultTableModel) tbRsvHistory.getModel();
                                model.removeRow(selectedIndex);
                                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);
                                txtFirstName.setText(" ");
                                txtLastName.setText(" ");
                                txtEmail.setText(" ");
                                txtPhone.setText(" ");
                                txtAddress.setText(" ");
                                cbCity.setSelectedIndex(0);
                                clearRadioButtons();
                                dcCheckIn.setDate(null);
                                dcCheckOut.setDate(null);
                                cbAdult.setSelectedIndex(0);
                                cbChildren.setSelectedIndex(0);
            
                                txtFirstName.requestFocus();
                            } else {
                                JOptionPane.showMessageDialog(this, "Gagal menghapus data dari database", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                    } catch (SQLException ex) {
                        Logger.getLogger(HotelReservation.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
        }

    }
    
    // Metode untuk memilih data pada cell tabel
    private void tbRsvHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRsvHistoryMouseClicked
        // TODO add your handling code here:
        fillFormFromSelectedRow();
        
    }//GEN-LAST:event_tbRsvHistoryMouseClicked

    private void txtFirstNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFirstNameKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtFirstNameKeyPressed
     
    // Metode untuk mengambil tipe data yang dimasukkan
    private String getSelectedRoomType() {
        if (rbSingleRoom.isSelected()) {
            return "Single";
        } else if (rbDeluxeRoom.isSelected()) {
            return "Double";
        } else if (rbSuiteRoom.isSelected()) {
            return "Suite";
        }
        return null;
    }
    
    // Metode untuk menghapus pilihan radio button
    public void clearRadioButtons() {
        rbSingleRoom.setSelected(false);
        rbDeluxeRoom.setSelected(false);
        rbSuiteRoom.setSelected(false);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new HotelReservation().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(HotelReservation.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReservasi;
    private javax.swing.JButton btnUbah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbAdult;
    private javax.swing.JComboBox<String> cbChildren;
    private javax.swing.JComboBox<String> cbCity;
    private com.toedter.calendar.JDateChooser dcCheckIn;
    private com.toedter.calendar.JDateChooser dcCheckOut;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbDeluxeRoom;
    private javax.swing.JRadioButton rbSingleRoom;
    private javax.swing.JRadioButton rbSuiteRoom;
    private javax.swing.JTable tbRsvHistory;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables


    
    
}
