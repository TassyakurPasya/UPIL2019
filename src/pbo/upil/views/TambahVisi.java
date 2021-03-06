/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.upil.views;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import pbo.upil.koneksi.Koneksi;

/**
 *
 * @author Agung Nurhamidan
 */
public class TambahVisi extends javax.swing.JDialog {
    private static TambahVisi tambahVisi;
    private static java.awt.Frame parent;
    private static boolean modal;
    /**
     * Creates new form TambahVisi
     */
    public TambahVisi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        TambahVisi.parent = parent;
        TambahVisi.modal = modal;
        initComponents();
    }
    
    public static TambahVisi getInstance(java.awt.Frame parent, boolean modal) {
        if ((tambahVisi == null) || (TambahVisi.parent != parent) || (TambahVisi.modal != modal)) {
            tambahVisi = new TambahVisi(parent, modal);
        }
        return tambahVisi;
    }
    
    public void clearText() {
        txtNomorKandidat.setText("");
        textAreaVisi.setText("");
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
        jLabel7 = new javax.swing.JLabel();
        txtNomorKandidat = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaVisi = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tambah Visi");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 450, -1));

        txtNomorKandidat.setBackground(new java.awt.Color(250, 248, 240));
        txtNomorKandidat.setFont(new java.awt.Font("Montserrat SemiBold", 0, 10)); // NOI18N
        txtNomorKandidat.setForeground(new java.awt.Color(49, 173, 226));
        txtNomorKandidat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNomorKandidat.setEnabled(false);
        txtNomorKandidat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomorKandidatActionPerformed(evt);
            }
        });
        jPanel1.add(txtNomorKandidat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 510, 30));

        btnReset.setBackground(new java.awt.Color(255, 255, 255));
        btnReset.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setAlignmentY(1.0F);
        btnReset.setFocusable(false);
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnResetMouseExited(evt);
            }
        });
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        btnOk.setBackground(new java.awt.Color(255, 255, 255));
        btnOk.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnOk.setText("Ok");
        btnOk.setAlignmentY(1.0F);
        btnOk.setFocusable(false);
        btnOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOkMouseExited(evt);
            }
        });
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        jPanel1.add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 80, -1));

        btnBatal.setBackground(new java.awt.Color(255, 255, 255));
        btnBatal.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnBatal.setText("Batal");
        btnBatal.setAlignmentY(1.0F);
        btnBatal.setFocusable(false);
        btnBatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBatalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBatalMouseExited(evt);
            }
        });
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        jPanel1.add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Montserrat SemiBold", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Misi");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 139, 450, -1));

        jLabel9.setFont(new java.awt.Font("Montserrat SemiBold", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nomor Kandidat");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 410, -1));

        textAreaVisi.setColumns(20);
        textAreaVisi.setRows(5);
        jScrollPane1.setViewportView(textAreaVisi);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 510, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbo/upil/media/Dialog.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomorKandidatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomorKandidatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomorKandidatActionPerformed

    private void btnResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetMouseEntered

    private void btnResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetMouseExited

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        this.txtNomorKandidat.setText("");
        this.textAreaVisi.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnOkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseEntered
        // TODO add your handling code here:
        btnOk.setBackground(new java.awt.Color(6,62,97));
    }//GEN-LAST:event_btnOkMouseEntered

    private void btnOkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseExited
        // TODO add your handling code here:
        btnOk.setBackground(new java.awt.Color(49,173,226));
    }//GEN-LAST:event_btnOkMouseExited

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        String sql = "INSERT INTO visi (no_kandidat, teks_visi) VALUES (?, ?)";
        if (this.textAreaVisi.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Visi tidak boleh kosong.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                PreparedStatement ps = Koneksi.getConnection().prepareStatement(sql);
                ps.setInt(1, LihatVisi.getInstance().getNomorKandidat());
                ps.setString(2, textAreaVisi.getText());
                ps.executeUpdate();
                ps.close();
                JOptionPane.showMessageDialog(this, "Berhasil menyimpan.", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                LihatVisi.getInstance().setVisible(true);
                LihatVisi.getInstance().refreshTable();
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Gagal Menyimpan", "Gagal", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnBatalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBatalMouseEntered

    private void btnBatalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBatalMouseExited

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnBatalActionPerformed

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
            java.util.logging.Logger.getLogger(TambahVisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahVisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahVisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahVisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TambahVisi dialog = new TambahVisi(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAreaVisi;
    private javax.swing.JTextField txtNomorKandidat;
    // End of variables declaration//GEN-END:variables
}
