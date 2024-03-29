/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Taiga;

import static Taiga.Koneksi.getConnection;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author mansy
 */
public class Tagihan extends javax.swing.JFrame {

    /**
     * Creates new form DashboardMain
     */
private DefaultTableModel model;
    public Tagihan() {
        initComponents();
        
         // Initialize the model for jTable2
    model = new DefaultTableModel(
        new Object[][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String[] {
            "Bulan", "Nominal", "Untuk", "Keterangan"
        }
    );

    // Set the model for jTable2
    jTable2.setModel(model);
    
        // Add a MouseListener to jTable2
    jTable2.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            int selectedRow = jTable2.getSelectedRow();
            if (selectedRow != -1) {
                // Perform an action with the selected row data
                String bulan = model.getValueAt(selectedRow, 0).toString();
                int nominal = Integer.parseInt(model.getValueAt(selectedRow, 1).toString());
                String untuk = model.getValueAt(selectedRow, 2).toString();
                String keterangan = model.getValueAt(selectedRow, 3).toString();

                // Example action: display the selected row data in a dialog box
                String message = "Bulan: " + bulan + "\n"
                        + "Nominal: " + nominal + "\n"
                        + "Untuk: " + untuk + "\n"
                        + "Keterangan: " + keterangan;
                JOptionPane.showMessageDialog(null, message);
            }
        }
    });

    // Refresh the table data
    refreshTableData();
        
        jTable2 = new javax.swing.JTable();


            
        // Mengatur ukuran default untuk tablet
        int tabletWidth = 800;
        int tabletHeight = 600;
        
        // Menambah faktor skala
        double scale = 1.2; // Faktor skala 1.2 akan membesarkan ukuran frame sebesar 20%
        int scaledWidth = (int) (tabletWidth * scale);
        int scaledHeight = (int) (tabletHeight * scale);
        
        Dimension scaledSize = new Dimension(scaledWidth, scaledHeight);
        setPreferredSize(scaledSize);
        
        // Mengatur warna latar belakang menjadi putih
        getContentPane().setBackground(Color.WHITE);
        
        pack(); // Atur ukuran frame secara otomatis
        setVisible(true);





        
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
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnDataBayar = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        btnDataWarga = new javax.swing.JButton();
        btnPengeluaran = new javax.swing.JButton();
        btnPengaturan = new javax.swing.JButton();
        btnPemasukan = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxBulan = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNominal = new javax.swing.JTextField();
        jComboBoxUntuk = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKeterangan = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButtonSimpan = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnCari = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 153, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TAI");
        jPanel1.add(jLabel4);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("GA");
        jPanel1.add(jLabel3);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel1.setText("Tagihan dan Iuran Warga");
        jPanel1.add(jLabel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnDataBayar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnDataBayar.setText("Data Bayar");
        btnDataBayar.setMaximumSize(new java.awt.Dimension(90, 35));
        btnDataBayar.setMinimumSize(new java.awt.Dimension(90, 30));
        btnDataBayar.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDataBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataBayarActionPerformed(evt);
            }
        });

        btnDashboard.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnDashboard.setText("Dashboard");
        btnDashboard.setMaximumSize(new java.awt.Dimension(90, 35));
        btnDashboard.setMinimumSize(new java.awt.Dimension(90, 30));
        btnDashboard.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnDataWarga.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnDataWarga.setText("Data Warga");
        btnDataWarga.setMaximumSize(new java.awt.Dimension(90, 35));
        btnDataWarga.setMinimumSize(new java.awt.Dimension(90, 30));
        btnDataWarga.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDataWarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataWargaActionPerformed(evt);
            }
        });

        btnPengeluaran.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnPengeluaran.setText("Pengeluaran");
        btnPengeluaran.setMaximumSize(new java.awt.Dimension(90, 35));
        btnPengeluaran.setMinimumSize(new java.awt.Dimension(90, 30));
        btnPengeluaran.setPreferredSize(new java.awt.Dimension(90, 30));
        btnPengeluaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPengeluaranActionPerformed(evt);
            }
        });

        btnPengaturan.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnPengaturan.setText("Pengaturan");
        btnPengaturan.setMaximumSize(new java.awt.Dimension(90, 35));
        btnPengaturan.setMinimumSize(new java.awt.Dimension(90, 30));
        btnPengaturan.setPreferredSize(new java.awt.Dimension(90, 30));
        btnPengaturan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPengaturanActionPerformed(evt);
            }
        });

        btnPemasukan.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnPemasukan.setText("Tagihan");
        btnPemasukan.setMaximumSize(new java.awt.Dimension(90, 35));
        btnPemasukan.setMinimumSize(new java.awt.Dimension(90, 30));
        btnPemasukan.setPreferredSize(new java.awt.Dimension(90, 30));
        btnPemasukan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPemasukanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPengaturan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDataBayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDataWarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPengeluaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnPemasukan, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDataWarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDataBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnPemasukan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
                .addComponent(btnPengaturan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 670));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Keterangan");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel6.setText("Untuk");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jComboBoxBulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        jPanel3.add(jComboBoxBulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 210, -1));

        jLabel7.setText("Bulan");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel8.setText("Nominal");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtNominal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNominalActionPerformed(evt);
            }
        });
        jPanel3.add(txtNominal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 210, -1));

        jComboBoxUntuk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih" }));
        jComboBoxUntuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUntukActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBoxUntuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 210, -1));

        jScrollPane1.setViewportView(txtKeterangan);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 210, 70));

        jButton1.setText("Hapus");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 100, -1));

        jButtonSimpan.setText("Simpan");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 100, -1));

        jButton3.setText("Bersihkan");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 720, 320));

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        jPanel3.add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 100, -1));
        jPanel3.add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 330, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 760, 620));

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("TAGIHAN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jLabel2)
                .addContainerGap(348, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 760, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDataBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataBayarActionPerformed
        // TODO add your handling code here:
        this.dispose(); // Menutup frame saat ini
        DataBayar databayar = new DataBayar();
        databayar.setVisible(true);
    }//GEN-LAST:event_btnDataBayarActionPerformed

    private void btnPengaturanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPengaturanActionPerformed
        // TODO add your handling code here:
        this.dispose(); // Menutup frame saat ini
        Pengaturan pengaturan = new Pengaturan();
        pengaturan.setVisible(true);
    }//GEN-LAST:event_btnPengaturanActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        // TODO add your handling code here:DataWarga dataWarga = new DataWarga();
        this.dispose(); // Menutup frame saat ini
        Tagihan dashboardmain = new Tagihan();
        dashboardmain.setVisible(true);
        

            
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnDataWargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataWargaActionPerformed
        // TODO add your handling code here:
        this.dispose(); // Menutup frame saat ini
        DataWarga datawarga = new DataWarga();
        datawarga.setVisible(true);
    }//GEN-LAST:event_btnDataWargaActionPerformed

    private void btnPengeluaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPengeluaranActionPerformed
        // TODO add your handling code here:
        this.dispose(); // Menutup frame saat ini
        Pengeluaran pengeluaran = new Pengeluaran();
        pengeluaran.setVisible(true);
    }//GEN-LAST:event_btnPengeluaranActionPerformed

    private void btnPemasukanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPemasukanActionPerformed
        // TODO add your handling code here:
        this.dispose(); // Menutup frame saat ini
        Tagihan pemasukan = new Tagihan();
        pemasukan.setVisible(true);
    }//GEN-LAST:event_btnPemasukanActionPerformed

    private void txtNominalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNominalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNominalActionPerformed

    private void jComboBoxUntukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUntukActionPerformed
        // TODO add your handling code here:
          String selectedOption = jComboBoxUntuk.getSelectedItem().toString();
    
    // Memanggil kelas Koneksi untuk melakukan koneksi ke database
    Connection conn = null;
    try {
        conn = Koneksi.getConnection();
    } catch (SQLException ex) {
        Logger.getLogger(Tagihan.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    if (conn != null) {
        try {
            // Query untuk mengambil data nama dari tabel data_warga
            String query = "SELECT nama FROM data_warga";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            // Mengosongkan combo box sebelum menambahkan data baru
            jComboBoxUntuk.removeAllItems();
            
            // Menambahkan opsi "Semua Warga" ke combo box
            jComboBoxUntuk.addItem("Semua Warga");
            
            // Menambahkan nama-nama dari tabel data_warga ke combo box
            while (resultSet.next()) {
                String nama = resultSet.getString("nama");
                jComboBoxUntuk.addItem(nama);
            }
            
            // Memeriksa apakah selectedOption adalah "Semua Warga"
            if (selectedOption.equals("Semua Warga")) {
                jComboBoxUntuk.setSelectedIndex(0); // Mengatur pilihan pertama sebagai "Semua Warga"
            } else {
                // Memeriksa apakah selectedOption ada dalam combo box
                if (jComboBoxUntuk.getItemCount() > 0 && selectedOption != null) {
                    for (int i = 0; i < jComboBoxUntuk.getItemCount(); i++) {
                        String item = jComboBoxUntuk.getItemAt(i);
                        if (item.equals(selectedOption)) {
                            jComboBoxUntuk.setSelectedIndex(i);
                            break;
                        }
                    }
                }
            }
            
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_jComboBoxUntukActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        // refresh
        refreshTableData();
        
        // Mengambil data yang dipilih dari komponen GUI
        String selectedOption = jComboBox2.getSelectedItem().toString();

        // Memanggil kelas Koneksi untuk melakukan koneksi ke database
        Connection conn = null;
        try {
            conn = Koneksi.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Tagihan.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (conn != null) {
            try {
                // Query untuk menghapus data dari tabel tagihan berdasarkan nama
                String query = "DELETE FROM tagihan WHERE nama = ?";
                PreparedStatement statement = conn.prepareStatement(query);
                statement.setString(1, selectedOption);

                // Melakukan eksekusi statement untuk menghapus data
                int rowsAffected = statement.executeUpdate();

                if (rowsAffected > 0) {
                    // Menampilkan pesan berhasil
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus.");

                    // Refresh combo box setelah data dihapus
                    refreshComboBox();
                } else {
                    // Menampilkan pesan jika data tidak ditemukan
                    JOptionPane.showMessageDialog(null, "Data tidak ditemukan.");
                }

                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        // TODO add your handling code here:
          // Mengambil data dari komponen GUI
            String bulan = jComboBoxBulan.getSelectedItem().toString();
            String nominal = txtNominal.getText();
            String untuk = jComboBoxUntuk.getSelectedItem().toString();
            String keterangan = txtNominal.getText();
        //refresh
        refreshTableData();





            // Memanggil kelas Koneksi untuk melakukan koneksi ke database
            Connection conn = null;
            try {
                conn = Koneksi.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(Tagihan.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (conn != null) {
            try {
                 // Refresh the table data
                refreshTableData();
    
                // Query untuk menyimpan data ke tabel tagihan
                String query = "INSERT INTO tagihan (bulan, nominal, untuk, keterangan) VALUES (?, ?, ?, ?)";
                PreparedStatement statement = conn.prepareStatement(query);

                // Mengatur parameter pada statement prepared statement
                statement.setString(1, bulan);
                statement.setString(2, nominal);
                statement.setString(3, untuk);
                statement.setString(4, keterangan);

                // Melakukan eksekusi statement untuk menyimpan data
                statement.executeUpdate();

                // Menampilkan pesan berhasil
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan.");

                // Mengosongkan inputan setelah data disimpan
                txtNominal.setText("");
                txtKeterangan.setText("");

                conn.close();
            } catch (SQLException e) {
            }
        }

    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          // Mengosongkan inputan
        jComboBoxBulan.setSelectedIndex(0);
        txtNominal.setText("");
        jComboBoxUntuk.setSelectedIndex(0);
        txtKeterangan.setText("");
        
        //refresh
        refreshTableData();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
            // Get the search criteria from the input field
        String searchCriteria = txtCari.getText();

        try {
            // Check if the data is found in the tagihan table
            boolean dataFound = checkDataExistsInTagihan(searchCriteria);

            if (dataFound) {
                JOptionPane.showMessageDialog(null, "Data ditemukan.");

                // Retrieve the phone number from the data_warga table
                String phoneNumber = retrievePhoneNumberFromDataWarga(searchCriteria);

                // Generate the invoice details from the tagihan table
                String invoiceDetails = generateInvoiceDetailsFromTagihan(searchCriteria);

                // Prompt the user to enter the WhatsApp message content
                String message = "Rincian Tagihan:\n" + invoiceDetails + "\n\nMasukkan pesan WhatsApp:";
                String userMessage = JOptionPane.showInputDialog(null, message);

                // Replace "08" with "62" in the phone number if present
                phoneNumber = phoneNumber.replaceFirst("^08", "62");

                // Open the default web browser with the WhatsApp Web URL
                String whatsappURL = "https://web.whatsapp.com/send?phone=" + phoneNumber + "&text=" + userMessage;
                java.awt.Desktop.getDesktop().browse(java.net.URI.create(whatsappURL));
            } else {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
        Logger.getLogger(Tagihan.class.getName()).log(Level.SEVERE, null, ex);
    }
    

    }//GEN-LAST:event_btnCariActionPerformed

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
            java.util.logging.Logger.getLogger(Tagihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tagihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tagihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tagihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Tagihan().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnDataBayar;
    private javax.swing.JButton btnDataWarga;
    private javax.swing.JButton btnPemasukan;
    private javax.swing.JButton btnPengaturan;
    private javax.swing.JButton btnPengeluaran;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JComboBox<String> jComboBoxBulan;
    private javax.swing.JComboBox<String> jComboBoxUntuk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextPane txtKeterangan;
    private javax.swing.JTextField txtNominal;
    // End of variables declaration//GEN-END:variables
  
   // Fungsi untuk mengambil ulang data nama dari tabel data_warga
    private void refreshComboBox() {
        // Memanggil kelas Koneksi untuk melakukan koneksi ke database
        Connection conn = null;
        try {
            conn = Koneksi.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Tagihan.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (conn != null) {
            try {
                // Query untuk mengambil data nama dari tabel data_warga
                String query = "SELECT nama FROM data_warga";
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(query);

                // Mengosongkan combo box sebelum menambahkan data baru
                jComboBox2.removeAllItems();

                // Menambahkan nama-nama dari tabel data_warga ke combo box
                while (resultSet.next()) {
                    String nama = resultSet.getString("nama");
                    jComboBox2.addItem(nama);
                }

                conn.close();
            } catch (SQLException e) {
            }
        }
    }

        private void refreshTableData() {
            try {
                // Clear the existing rows in the model
                model.setRowCount(0);

                // Connect to the database
                Connection conn = getConnection();

                // Query to retrieve data from the tagihan table
                String query = "SELECT * FROM tagihan";

                // Create a statement
                Statement stmt = conn.createStatement();

                // Execute the query and get the result set
                ResultSet rs = stmt.executeQuery(query);

                // Iterate through the result set and add rows to the model
                while (rs.next()) {
                    String bulan = rs.getString("bulan");
                    int nominal = rs.getInt("nominal");
                    String untuk = rs.getString("untuk");
                    String keterangan = rs.getString("keterangan");

                    model.addRow(new Object[]{bulan, nominal, untuk, keterangan});
                }

                // Close the result set, statement, and connection
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Tagihan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }



 
        private static class jComboBox2 {

            private static void removeAllItems() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }


            private static Object getSelectedItem() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            private static void addItem(String nama) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            public jComboBox2() {
            }



        }

private boolean checkDataExistsInTagihan(String searchCriteria) throws SQLException {
        // Query to check if the data exists in the tagihan table
        String query = "SELECT * FROM tagihan WHERE untuk = '" + searchCriteria + "'";

        Connection conn = Koneksi.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        boolean dataFound = rs.next();

        rs.close();
        stmt.close();
        conn.close();

        return dataFound;
    }

        private String retrievePhoneNumberFromDataWarga(String searchCriteria) throws SQLException {
            // Query to retrieve the phone number from the data_warga table
            String query = "SELECT no_hp FROM data_warga WHERE <your_search_criteria>";

            Connection conn = Koneksi.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            String phoneNumber = "";

            if (rs.next()) {
                phoneNumber = rs.getString("no_hp");
            }

            rs.close();
            stmt.close();
            conn.close();

            return phoneNumber;
        }

        private String generateInvoiceDetailsFromTagihan(String searchCriteria) throws SQLException {
            // Query to retrieve the invoice details from the tagihan table
            String query = "SELECT nama, nominal, keterangan FROM tagihan WHERE <your_search_criteria>";

            Connection conn = Koneksi.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            String invoiceDetails = "";

            while (rs.next()) {
                String nama = rs.getString("nama");
                int nominal = rs.getInt("nominal");
                String keterangan = rs.getString("keterangan");

                // Append the invoice details to the invoiceDetails string
                invoiceDetails += "Nama: " + nama + ", Nominal: " + nominal + ", Keterangan: " + keterangan + "\n";
            }

            rs.close();
            stmt.close();
            conn.close();

            return invoiceDetails;
        }

}







