/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kalkulator;

/**
 *
 * @author WINDOWS 10
 */
public class Kalkulatorsederhana extends javax.swing.JFrame {

    String angka = "";
    double jumlah,angka1,angka2;
    int pilih;
    
    public Kalkulatorsederhana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Keluaran = new javax.swing.JTextField();
        btnSamadengan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBagi = new javax.swing.JButton();
        btnKali = new javax.swing.JButton();
        btnAngka0 = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnKurang = new javax.swing.JButton();
        btnKoma = new javax.swing.JButton();
        btnAngka9 = new javax.swing.JButton();
        btnAngka8 = new javax.swing.JButton();
        btnAngka7 = new javax.swing.JButton();
        btnAngka4 = new javax.swing.JButton();
        btnAngka5 = new javax.swing.JButton();
        btnAngka6 = new javax.swing.JButton();
        btnAngka1 = new javax.swing.JButton();
        btnAngka2 = new javax.swing.JButton();
        btnAngka3 = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnpersen = new javax.swing.JButton();
        btnAkar = new javax.swing.JButton();
        btnPangkat = new javax.swing.JButton();
        btnSin = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Keluaran.setEditable(false);
        Keluaran.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Keluaran.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(Keluaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 270, 80));

        btnSamadengan.setBackground(new java.awt.Color(255, 0, 0));
        btnSamadengan.setText("=");
        btnSamadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSamadenganActionPerformed(evt);
            }
        });
        jPanel1.add(btnSamadengan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 60, 40));

        btnHapus.setBackground(new java.awt.Color(0, 255, 255));
        btnHapus.setText("C");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 200, 40));

        btnBagi.setBackground(new java.awt.Color(255, 255, 51));
        btnBagi.setText("/");
        btnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBagiActionPerformed(evt);
            }
        });
        jPanel1.add(btnBagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 60, 40));

        btnKali.setBackground(new java.awt.Color(255, 255, 51));
        btnKali.setText("X");
        btnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaliActionPerformed(evt);
            }
        });
        jPanel1.add(btnKali, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 60, 40));

        btnAngka0.setBackground(new java.awt.Color(51, 255, 255));
        btnAngka0.setText("0");
        btnAngka0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka0ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAngka0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 130, 40));

        btnTambah.setBackground(new java.awt.Color(255, 255, 51));
        btnTambah.setText("+");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        jPanel1.add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 60, 40));

        btnKurang.setBackground(new java.awt.Color(255, 255, 51));
        btnKurang.setText("-");
        btnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangActionPerformed(evt);
            }
        });
        jPanel1.add(btnKurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 60, 40));

        btnKoma.setBackground(new java.awt.Color(255, 0, 255));
        btnKoma.setText(",");
        btnKoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKomaActionPerformed(evt);
            }
        });
        jPanel1.add(btnKoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 60, 40));

        btnAngka9.setBackground(new java.awt.Color(255, 255, 255));
        btnAngka9.setText("9");
        btnAngka9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka9ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAngka9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 60, 40));

        btnAngka8.setBackground(new java.awt.Color(255, 153, 153));
        btnAngka8.setText("8");
        btnAngka8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka8ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAngka8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 60, 40));

        btnAngka7.setBackground(new java.awt.Color(255, 255, 255));
        btnAngka7.setText("7");
        btnAngka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAngka7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 60, 40));

        btnAngka4.setBackground(new java.awt.Color(255, 153, 153));
        btnAngka4.setText("4");
        btnAngka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAngka4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 60, 40));

        btnAngka5.setBackground(new java.awt.Color(255, 255, 255));
        btnAngka5.setText("5");
        btnAngka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAngka5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 60, 40));

        btnAngka6.setBackground(new java.awt.Color(255, 153, 153));
        btnAngka6.setText("6");
        btnAngka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAngka6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 60, 40));

        btnAngka1.setBackground(new java.awt.Color(255, 255, 255));
        btnAngka1.setText("1");
        btnAngka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAngka1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 60, 40));

        btnAngka2.setBackground(new java.awt.Color(255, 153, 153));
        btnAngka2.setText("2");
        btnAngka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAngka2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 60, 40));

        btnAngka3.setBackground(new java.awt.Color(255, 255, 255));
        btnAngka3.setText("3");
        btnAngka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAngka3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 60, 40));

        btnMod.setBackground(new java.awt.Color(51, 255, 51));
        btnMod.setText("Mod");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });
        jPanel1.add(btnMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 60, 40));

        btnpersen.setBackground(new java.awt.Color(153, 153, 255));
        btnpersen.setText("%");
        btnpersen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpersenActionPerformed(evt);
            }
        });
        jPanel1.add(btnpersen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 60, 40));

        btnAkar.setBackground(new java.awt.Color(153, 153, 255));
        btnAkar.setText("Akar");
        btnAkar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAkarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAkar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 60, 40));

        btnPangkat.setBackground(new java.awt.Color(51, 255, 51));
        btnPangkat.setText("X^Y");
        btnPangkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPangkatActionPerformed(evt);
            }
        });
        jPanel1.add(btnPangkat, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 60, 40));

        btnSin.setBackground(new java.awt.Color(51, 255, 51));
        btnSin.setText("Sin");
        btnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinActionPerformed(evt);
            }
        });
        jPanel1.add(btnSin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 60, 40));

        btnCos.setBackground(new java.awt.Color(153, 153, 255));
        btnCos.setText("Cos");
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosActionPerformed(evt);
            }
        });
        jPanel1.add(btnCos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 60, 40));

        btnTan.setBackground(new java.awt.Color(102, 255, 51));
        btnTan.setText("Tan");
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });
        jPanel1.add(btnTan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 60, 40));

        btnLog.setBackground(new java.awt.Color(153, 153, 255));
        btnLog.setText("Log");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });
        jPanel1.add(btnLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 60, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kalkulator apa adanya");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 291, 480));

        setSize(new java.awt.Dimension(308, 516));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAngka9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka9ActionPerformed
        angka += "9";
        Keluaran.setText(angka);
    }//GEN-LAST:event_btnAngka9ActionPerformed
        
    private void btnAngka8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka8ActionPerformed
        angka += "8";
        Keluaran.setText(angka);
    }//GEN-LAST:event_btnAngka8ActionPerformed

    private void btnAngka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka7ActionPerformed
        angka += "7";
        Keluaran.setText(angka);
    }//GEN-LAST:event_btnAngka7ActionPerformed

    private void btnAngka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka6ActionPerformed
        angka += "6";
        Keluaran.setText(angka);
    }//GEN-LAST:event_btnAngka6ActionPerformed

    private void btnAngka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka5ActionPerformed
        angka += "5";
        Keluaran.setText(angka);
    }//GEN-LAST:event_btnAngka5ActionPerformed

    private void btnAngka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka4ActionPerformed
        angka += "4";
        Keluaran.setText(angka);
    }//GEN-LAST:event_btnAngka4ActionPerformed

    private void btnAngka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka3ActionPerformed
        angka += "3";
        Keluaran.setText(angka);
    }//GEN-LAST:event_btnAngka3ActionPerformed

    private void btnAngka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka2ActionPerformed
        angka += "2";
        Keluaran.setText(angka);
    }//GEN-LAST:event_btnAngka2ActionPerformed

    private void btnAngka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka1ActionPerformed
        angka += "1";
        Keluaran.setText(angka);
    }//GEN-LAST:event_btnAngka1ActionPerformed

    private void btnAngka0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka0ActionPerformed
        angka += "0";
        Keluaran.setText(angka);
    }//GEN-LAST:event_btnAngka0ActionPerformed

    private void btnKomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKomaActionPerformed
        angka += ".";
        Keluaran.setText(angka);
    }//GEN-LAST:event_btnKomaActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        Keluaran.setText("");
        angka1=0.0;
        angka2=0.0;
        jumlah=0.0;
        angka = "";
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
       angka1=Double.parseDouble(angka);
       Keluaran.setText("+");
       angka="";
       pilih=1;
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurangActionPerformed
        angka1=Double.parseDouble(angka);
       Keluaran.setText("-");
       angka="";
       pilih=2;
    }//GEN-LAST:event_btnKurangActionPerformed

    private void btnBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBagiActionPerformed
        angka1=Double.parseDouble(angka);
       Keluaran.setText("/");
       angka="";
       pilih=3;
    }//GEN-LAST:event_btnBagiActionPerformed

    private void btnKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaliActionPerformed
        angka1=Double.parseDouble(angka);
       Keluaran.setText("*");
       angka="";
       pilih=4;
    }//GEN-LAST:event_btnKaliActionPerformed

    private void btnSamadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSamadenganActionPerformed
        switch(pilih) {
            case 1:
                angka2=Double.parseDouble(angka);
                jumlah=angka1+angka2;
                angka=Double.toString(jumlah);
                Keluaran.setText(angka); 
                break;
            case 2:
                angka2=Double.parseDouble(angka);
                jumlah=angka1-angka2;
                angka=Double.toString(jumlah);
                Keluaran.setText(angka);
                break;
            case 3:
                angka2=Double.parseDouble(angka);
                jumlah=angka1/angka2;
                angka=Double.toString(jumlah);
                Keluaran.setText(angka);
                break;
            case 4:
                angka2=Double.parseDouble(angka);
                jumlah=angka1*angka2;
                angka=Double.toString(jumlah);
                Keluaran.setText(angka);
                break;
            case 5:
                angka2=Double.parseDouble(angka);
                jumlah=angka1%angka2;
                angka=Double.toString(jumlah);
                Keluaran.setText(angka);
                break;
            case 6:
                jumlah=angka1 / 100;
                angka=Double.toString(jumlah);
                Keluaran.setText(angka);
                break;
            case 7:
                   angka2 = Double.parseDouble(angka);
                   jumlah = Math.pow(angka1, angka2);
                   angka = Double.toString(jumlah);
                   Keluaran.setText(angka);  
                break;
            case 8:
                jumlah = Math.sqrt(angka1);
                angka = Double.toString(jumlah);
                Keluaran.setText(angka);  
                break;
            case 11:           
                jumlah = Math.sin(Math.toRadians(angka1));
                angka = Double.toString(jumlah);
                Keluaran.setText(angka); 
                break;
            case 10:           
                jumlah = Math.cos(Math.toRadians(angka1));
                angka = Double.toString(jumlah);
                Keluaran.setText(angka); 
                break;                          
            case 9:            
                jumlah = Math.tan(Math.toRadians(angka1));
                angka = Double.toString(jumlah);
                Keluaran.setText(angka); 
                break;
            case 12:
                angka2 = Double.parseDouble(angka);
                jumlah = Math.log(Math.toRadians(angka1));
                angka = Double.toString(jumlah);
                Keluaran.setText(angka);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnSamadenganActionPerformed

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        angka1=Double.parseDouble(angka);
       Keluaran.setText("%");
       angka="";
       pilih=5; 
    }//GEN-LAST:event_btnModActionPerformed

    private void btnpersenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpersenActionPerformed
       angka1=Double.parseDouble(angka);
       Keluaran.setText("%");
       angka="";
       pilih=6; 
    }//GEN-LAST:event_btnpersenActionPerformed

    private void btnPangkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPangkatActionPerformed
       angka1=Double.parseDouble(angka);
       Keluaran.setText("X2");
       angka="";
       pilih=7;
    }//GEN-LAST:event_btnPangkatActionPerformed

    private void btnAkarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAkarActionPerformed
        angka1=Double.parseDouble(angka);
        Keluaran.setText("^");
        angka="";
        pilih=8;
    }//GEN-LAST:event_btnAkarActionPerformed

    private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanActionPerformed
        angka1=Double.parseDouble(angka);
        Keluaran.setText(" Tan ");
        angka="";
        pilih=9;
    }//GEN-LAST:event_btnTanActionPerformed

    private void btnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosActionPerformed
        angka1=Double.parseDouble(angka);
        Keluaran.setText(" Cos ");
        angka="";
        pilih=10;
    }//GEN-LAST:event_btnCosActionPerformed

    private void btnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinActionPerformed
        angka1=Double.parseDouble(angka);
        Keluaran.setText(" Sin ");
        angka="";
        pilih=11;
    }//GEN-LAST:event_btnSinActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
     angka1=Double.parseDouble(angka);
        Keluaran.setText(" Log ");
        angka="";
        pilih=12;
    }//GEN-LAST:event_btnLogActionPerformed

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
            java.util.logging.Logger.getLogger(Kalkulatorsederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulatorsederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulatorsederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulatorsederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulatorsederhana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Keluaran;
    private javax.swing.JButton btnAkar;
    private javax.swing.JButton btnAngka0;
    private javax.swing.JButton btnAngka1;
    private javax.swing.JButton btnAngka2;
    private javax.swing.JButton btnAngka3;
    private javax.swing.JButton btnAngka4;
    private javax.swing.JButton btnAngka5;
    private javax.swing.JButton btnAngka6;
    private javax.swing.JButton btnAngka7;
    private javax.swing.JButton btnAngka8;
    private javax.swing.JButton btnAngka9;
    private javax.swing.JButton btnBagi;
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKali;
    private javax.swing.JButton btnKoma;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnPangkat;
    private javax.swing.JButton btnSamadengan;
    private javax.swing.JButton btnSin;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTan;
    private javax.swing.JButton btnpersen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
