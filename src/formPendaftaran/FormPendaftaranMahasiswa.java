package formPendaftaran;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.ImageIcon;

public class FormPendaftaranMahasiswa extends javax.swing.JFrame { 
    
    // reset kolom menjadi kosong setelah klik daftar
    private void resetKolom() {
        kolom_nopendaftar.setText("");
        inputNama.setText("");
        inputTglLahir.setText("");
        inputAlamat.setText("");
        gender.setSelectedItem("");
        inputKewarganegara.setSelectedItem("");
        inputAsalSekolah.setText("");
        inputLulus.setText("");
        inputKerjaan.setText("");
        inputStatus.setSelectedItem("");
        inputFakultas.setSelectedItem("");
        inputProdi.setSelectedItem("");  
    }
    
    // config database
    private static Connection MySQLconfig;
    
    // koneksi ke database
    private static Connection configDB()throws SQLException {
        try {
            String host = "jdbc:mysql://localhost:3306/pendaftaran_mhs";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLconfig = DriverManager.getConnection(host, user, pass);
            
        }
        
        // jika gagal / terjadi kesalahan
        catch(SQLException e) {
            System.out.print("Koneksi failed " + e.getMessage());
        }
        
        return MySQLconfig;
    }
     
    public FormPendaftaranMahasiswa() {
        initComponents();
        
        // menampilkan frame di tengah
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label9 = new javax.swing.JLabel();
        inputFakultas = new javax.swing.JComboBox<>();
        label10 = new javax.swing.JLabel();
        inputProdi = new javax.swing.JComboBox<>();
        btnDaftar = new javax.swing.JButton();
        inputAlamat = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        gender = new javax.swing.JComboBox<>();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        inputKewarganegara = new javax.swing.JComboBox<>();
        label6 = new javax.swing.JLabel();
        inputAsalSekolah = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        inputLulus = new javax.swing.JTextField();
        label7 = new javax.swing.JLabel();
        inputKerjaan = new javax.swing.JTextField();
        label8 = new javax.swing.JLabel();
        subTitle1 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();
        label2 = new javax.swing.JLabel();
        inputTglLahir = new javax.swing.JTextField();
        label3 = new javax.swing.JLabel();
        inputStatus = new javax.swing.JComboBox<>();
        subTitle2 = new javax.swing.JLabel();
        no_pendaftar = new javax.swing.JLabel();
        kolom_nopendaftar = new javax.swing.JTextField();
        title3 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        background1 = new formPendaftaran.background();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Penerimaan Mahasiswa Baru");
        setResizable(false);
        setSize(new java.awt.Dimension(656, 533));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        label9.setForeground(new java.awt.Color(255, 255, 255));
        label9.setText("Fakultas Yang Dipilih");
        jPanel1.add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 478, 205, -1));

        inputFakultas.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        inputFakultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FIPPS (Fakultas Ilmu Pendidikan & Pengetahuan Sosial)", "FMIPA (Fakultas Matematika & IPA)", "FTIK (Fakultas Teknik & Ilmu Komputer)", "FBS (Fakultas Bahasa & Seni)" }));
        jPanel1.add(inputFakultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 477, -1, -1));

        label10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        label10.setForeground(new java.awt.Color(255, 255, 255));
        label10.setText("Prodi Yang Dipilih");
        jPanel1.add(label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 504, 205, -1));

        inputProdi.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        inputProdi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendidikan Sejarah (FIPPS)", "Pendidikan Ekonomi (FIPPS) ", "Bimbingan & Konseling (FIPPS)", "Pendidikan Matematika (FMIPA)", "Pendidikan Biologi (FMIPA)", "Pendidikan Fisika (FMIPA)", "Arsitektur (FTIK)", "Teknik Industri (FTIK)", "Informatika (FTIK)", "Pendidkan Bahasa Indonesia (FBS)", "Pendidkan Bahasa Inggris (FBS)", "Desain Komunikasi Visual (FBS)" }));
        jPanel1.add(inputProdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 504, 308, -1));

        btnDaftar.setText("Daftar");
        btnDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarActionPerformed(evt);
            }
        });
        jPanel1.add(btnDaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 543, 143, -1));
        jPanel1.add(inputAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 227, 308, 67));

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 543, 143, -1));

        gender.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pria", "Wanita" }));
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 304, 308, -1));

        label4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Jenis Kelamin");
        jPanel1.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 305, 205, -1));

        label5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Kewarganegaraan");
        jPanel1.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 334, 205, -1));

        inputKewarganegara.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        inputKewarganegara.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Indonesia", "WNA" }));
        jPanel1.add(inputKewarganegara, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 333, 308, -1));

        label6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("Asal Sekolah");
        jPanel1.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 360, 205, -1));
        jPanel1.add(inputAsalSekolah, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 360, 125, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tahun Lulus");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 360, -1, 20));
        jPanel1.add(inputLulus, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 361, 90, -1));

        label7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText("Pekerjaan");
        jPanel1.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 387, 205, -1));
        jPanel1.add(inputKerjaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 387, 308, -1));

        label8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setText("Status");
        jPanel1.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 413, 205, 21));

        subTitle1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        subTitle1.setForeground(new java.awt.Color(255, 255, 255));
        subTitle1.setText("Data Pribadi");
        jPanel1.add(subTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 145, 113, -1));

        label1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Nama Lengkap");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 175, 205, -1));
        jPanel1.add(inputNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 175, 308, -1));

        label2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Tempat & Tanggal Lahir");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 201, 205, -1));
        jPanel1.add(inputTglLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 201, 308, -1));

        label3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Alamat");
        jPanel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 227, 205, -1));

        inputStatus.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        inputStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Menikah", "Belum Menikah", "Lainnya" }));
        jPanel1.add(inputStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 413, 308, -1));

        subTitle2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        subTitle2.setForeground(new java.awt.Color(255, 255, 255));
        subTitle2.setText("Data Fakultas & Prodi");
        jPanel1.add(subTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 452, 205, -1));

        no_pendaftar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        no_pendaftar.setForeground(new java.awt.Color(255, 255, 255));
        no_pendaftar.setText("No. Pendaftaran");
        jPanel1.add(no_pendaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 83, -1, -1));
        jPanel1.add(kolom_nopendaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 107, 99, 27));

        title3.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N
        title3.setForeground(new java.awt.Color(255, 255, 255));
        title3.setText("Universitas Indraprasta PGRI");
        jPanel1.add(title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        title2.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N
        title2.setForeground(new java.awt.Color(255, 255, 255));
        title2.setText("Penerimaan Mahasiswa Baru Strata 1 (S1)");
        jPanel1.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        jPanel1.add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 0, 1040, 650));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(672, 678));
    }// </editor-fold>//GEN-END:initComponents

    // button daftar ketika ditekan    
    private void btnDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarActionPerformed
        
        try {
            // memasukan data dari form ke database
            String sql_query = "INSERT INTO data_mahasiswa VALUES ('"+kolom_nopendaftar.getText()+"','"+inputNama.getText()+"','"+inputTglLahir.getText()+"','"
            +inputAlamat.getText()+"','"+gender.getSelectedItem()+"','"+inputKewarganegara.getSelectedItem()+"','"
            +inputAsalSekolah.getText()+"','"+inputLulus.getText()+"','"+inputKerjaan.getText()+"','"
            +inputStatus.getSelectedItem()+"','"+inputFakultas.getSelectedItem()+"','"+inputProdi.getSelectedItem()+"')";

            java.sql.Connection koneksi = (Connection)FormPendaftaranMahasiswa.configDB();
            java.sql.PreparedStatement pre = koneksi.prepareStatement(sql_query);
            pre.execute();
            resetKolom();
            
            // konfirmasi setelah button daftar ditekan
            JOptionPane.showMessageDialog(null,"Pendaftaran Berhasil", "Informasi",JOptionPane.INFORMATION_MESSAGE);

        }
        
        // jika gagal / terjadi kesalahan
        catch (SQLException e) {
            System.out.print("Daftar gagal "+ e.getMessage());
        }        
        
    }//GEN-LAST:event_btnDaftarActionPerformed

    // button cancel ketika ditekan
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // menutup form
        System.exit(0);
        
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(FormPendaftaranMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaranMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaranMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaranMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPendaftaranMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private formPendaftaran.background background1;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDaftar;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField inputAlamat;
    private javax.swing.JTextField inputAsalSekolah;
    private javax.swing.JComboBox<String> inputFakultas;
    private javax.swing.JTextField inputKerjaan;
    private javax.swing.JComboBox<String> inputKewarganegara;
    private javax.swing.JTextField inputLulus;
    private javax.swing.JTextField inputNama;
    private javax.swing.JComboBox<String> inputProdi;
    private javax.swing.JComboBox<String> inputStatus;
    private javax.swing.JTextField inputTglLahir;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField kolom_nopendaftar;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JLabel no_pendaftar;
    private javax.swing.JLabel subTitle1;
    private javax.swing.JLabel subTitle2;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    // End of variables declaration//GEN-END:variables

}
