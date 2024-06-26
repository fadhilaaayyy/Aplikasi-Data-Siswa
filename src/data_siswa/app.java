package data_siswa;

import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class app extends javax.swing.JFrame {

    public app() {
        initComponents();
        Reset();
    }
    void Reset(){
        tNis.setText("");
        tNama.setText("");
        tTempatLahir.setText("");
        tAlamat.setText("");
        tFoto.setText("");
        vNis.setText("");
        vNama.setText("");
        vAlamat.setText("");
        vNis.setText("");
        vKelamin.setText("");
        vTtl.setText("");
        vFoto.setText("");
        vJurusan.setText("");
        
        Kelamin.clearSelection();
        tTanggalLahir.setCalendar(null);
        tJurusan.setSelectedItem(null);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kelamin = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tNis = new javax.swing.JTextField();
        tNama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tTempatLahir = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tJurusan = new javax.swing.JComboBox<>();
        tTanggalLahir = new com.toedter.calendar.JDateChooser();
        rL = new javax.swing.JRadioButton();
        rP = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAlamat = new javax.swing.JTextArea();
        pFoto = new javax.swing.JLabel();
        tFoto = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        vNis = new javax.swing.JLabel();
        vNama = new javax.swing.JLabel();
        vKelamin = new javax.swing.JLabel();
        vTtl = new javax.swing.JLabel();
        vJurusan = new javax.swing.JLabel();
        vAlamat = new javax.swing.JLabel();
        vFoto = new javax.swing.JLabel();
        bReset = new javax.swing.JButton();
        bSimpan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("DATA SISWA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel1)
                .addContainerGap(220, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(17, 17, 17))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        tNis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNisActionPerformed(evt);
            }
        });
        tNis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tNisKeyTyped(evt);
            }
        });

        tNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNamaActionPerformed(evt);
            }
        });
        tNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tNamaKeyTyped(evt);
            }
        });

        jLabel2.setText("NIS");

        jLabel3.setText("NAMA");

        jLabel4.setText("JENIS KELAMIN");

        jLabel5.setText("TEMPAT LAHIR");

        tTempatLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTempatLahirActionPerformed(evt);
            }
        });
        tTempatLahir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tTempatLahirKeyTyped(evt);
            }
        });

        jLabel6.setText("TANGGAL LAHIR");

        jLabel7.setText("JURUSAN");

        tJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IPS", "IPA", "BAHASA" }));

        Kelamin.add(rL);
        rL.setText("LAKI-LAKI");
        rL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rLActionPerformed(evt);
            }
        });

        Kelamin.add(rP);
        rP.setText("PEREMPUAN");
        rP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPActionPerformed(evt);
            }
        });

        jLabel8.setText("ALAMAT");

        tAlamat.setColumns(20);
        tAlamat.setRows(5);
        jScrollPane1.setViewportView(tAlamat);

        pFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pFoto.setText("FOTO");
        pFoto.setToolTipText("");
        pFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pFoto.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                pFotoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        pFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pFotoMouseClicked(evt);
            }
        });

        tFoto.setBackground(new java.awt.Color(204, 204, 204));
        tFoto.setForeground(new java.awt.Color(204, 204, 204));
        tFoto.setText("jLabel17");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(48, 48, 48)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rL)
                                .addGap(58, 58, 58)
                                .addComponent(rP))
                            .addComponent(tTanggalLahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tNis)
                            .addComponent(tNama)
                            .addComponent(tJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tFoto)
                    .addComponent(pFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tNis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(rL)
                            .addComponent(rP))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel8))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(pFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tFoto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        vNis.setText("jLabel9");

        vNama.setText("jLabel10");

        vKelamin.setText("jLabel11");

        vTtl.setText("jLabel12");

        vJurusan.setText("jLabel13");

        vAlamat.setText("jLabel14");

        vFoto.setText("jLabel15");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vFoto)
                    .addComponent(vAlamat)
                    .addComponent(vJurusan)
                    .addComponent(vTtl)
                    .addComponent(vKelamin)
                    .addComponent(vNama)
                    .addComponent(vNis))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(vNis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vKelamin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vTtl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vJurusan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vAlamat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vFoto)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        bReset.setBackground(new java.awt.Color(255, 0, 0));
        bReset.setText("RESET");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        bSimpan.setBackground(new java.awt.Color(0, 102, 255));
        bSimpan.setText("SIMPAN");
        bSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(bReset)
                .addGap(33, 33, 33)
                .addComponent(bSimpan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bReset)
                    .addComponent(bSimpan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tNisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNisActionPerformed

    private void tNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNamaActionPerformed

    private void tTempatLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTempatLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tTempatLahirActionPerformed

    private void rLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rLActionPerformed

    private void rPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rPActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        Reset();
        pFoto.setIcon(null);
        pFoto.setText("");
    }//GEN-LAST:event_bResetActionPerformed

    private void pFotoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_pFotoAncestorAdded
    
    }//GEN-LAST:event_pFotoAncestorAdded

    private void bSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpanActionPerformed
        vNis.setText("Nis : "+tNis.getText());
        vNama.setText("Nama : "+tNama.getText());
        vJurusan.setText("Jurusan : "+tJurusan.getSelectedItem().toString());
        vAlamat.setText("Alamat : "+tAlamat.getText());
        if (rL.isSelected()){
            vKelamin.setText("Jenis kelamin : Laki-laki");
        }else if (rP.isSelected()){
            vKelamin.setText("Jenis kelamin : Perempuan");
        }else{
            vKelamin.setText("Jenis kelamin : Tidak terdefinisi");
        }
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        String TglLahir = String.valueOf(sd.format(tTanggalLahir.getDate()));
        vTtl.setText("Ttl : "+tTempatLahir.getText()+","+ TglLahir);
        String Filename;
        try {
            Filename = tFoto.getText();
            String filepath = "src/foto/";
            File folder = new File(filepath);
            if (!folder.exists()){
                folder.mkdir();
            }
            File sourceFile = null;
            File destFile = null;
            String ekstensi = Filename.substring(Filename.lastIndexOf('.')+1);
            sourceFile = new File(Filename);
            Date tglUpload = new Date();
            SimpleDateFormat fr = new SimpleDateFormat("yyyyMMddhhss");
            String tglBaru = String.valueOf(fr.format(tglUpload));
            destFile = new File(filepath+tglBaru.toString()+ "."+ ekstensi);
            Files.copy(sourceFile.toPath(), destFile.toPath());
            vFoto.setText("Foto : "+destFile.toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "UPLOAD GAGAL"+e);
        }

    }//GEN-LAST:event_bSimpanActionPerformed

    private void pFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pFotoMouseClicked
         try {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File file = chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(file.toString());
            Image image = icon.getImage().getScaledInstance(pFoto.getWidth(),pFoto.getHeight(),Image.SCALE_SMOOTH );
            ImageIcon ic = new ImageIcon(image);
            pFoto.setText(null);
            pFoto.setIcon(ic);
            String filename = file.getAbsolutePath();
            tFoto.setText(filename);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "UPLOAD GAGAL "+e);
        }
    }//GEN-LAST:event_pFotoMouseClicked

    private void tNisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tNisKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_tNisKeyTyped

    private void tNamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tNamaKeyTyped
        // TODO add your handling code here:
        if (!Character.isAlphabetic(evt.getKeyChar()) &&
               !Character.isSpaceChar(evt.getKeyChar())){
        }
    }//GEN-LAST:event_tNamaKeyTyped

    private void tTempatLahirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tTempatLahirKeyTyped
        // TODO add your handling code here:
        if (!Character.isAlphabetic(evt.getKeyChar()) && 
               !Character.isSpaceChar(evt.getKeyChar())) {
        }
    }//GEN-LAST:event_tTempatLahirKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new app().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Kelamin;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bSimpan;
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
    private javax.swing.JLabel pFoto;
    private javax.swing.JRadioButton rL;
    private javax.swing.JRadioButton rP;
    private javax.swing.JTextArea tAlamat;
    private javax.swing.JLabel tFoto;
    private javax.swing.JComboBox<String> tJurusan;
    private javax.swing.JTextField tNama;
    private javax.swing.JTextField tNis;
    private com.toedter.calendar.JDateChooser tTanggalLahir;
    private javax.swing.JTextField tTempatLahir;
    private javax.swing.JLabel vAlamat;
    private javax.swing.JLabel vFoto;
    private javax.swing.JLabel vJurusan;
    private javax.swing.JLabel vKelamin;
    private javax.swing.JLabel vNama;
    private javax.swing.JLabel vNis;
    private javax.swing.JLabel vTtl;
    // End of variables declaration//GEN-END:variables
}
