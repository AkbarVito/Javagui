/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasidesain;

/**
 *
 * @author asus
 */
public class kakulatorkomplit extends javax.swing.JFrame {
    String angka;
    double jumlah,angka1,angka2;
    int pilih;
    int persen = 100;
    /**
     * Creates new form kakulatorkomplit
     */
    public kakulatorkomplit() {
        initComponents();
        angka = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnce = new javax.swing.JButton();
        btnc = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        btnbagi = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnkali = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnkurang = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnkoma = new javax.swing.JButton();
        btnsaadengan = new javax.swing.JButton();
        btnpersen = new javax.swing.JButton();
        btnakar = new javax.swing.JButton();
        btnpangkat = new javax.swing.JButton();
        atas = new javax.swing.JLabel();
        display = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator");
        setResizable(false);
        getContentPane().setLayout(null);

        btnce.setBackground(new java.awt.Color(153, 153, 153));
        btnce.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnce.setForeground(new java.awt.Color(0, 0, 0));
        btnce.setText("CE");
        btnce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnceActionPerformed(evt);
            }
        });
        getContentPane().add(btnce);
        btnce.setBounds(100, 220, 100, 80);

        btnc.setBackground(new java.awt.Color(153, 153, 153));
        btnc.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnc.setForeground(new java.awt.Color(0, 0, 0));
        btnc.setText("C");
        btnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncActionPerformed(evt);
            }
        });
        getContentPane().add(btnc);
        btnc.setBounds(0, 220, 100, 80);

        btndel.setBackground(new java.awt.Color(153, 153, 153));
        btndel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btndel.setForeground(new java.awt.Color(0, 0, 0));
        btndel.setText("Del");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });
        getContentPane().add(btndel);
        btndel.setBounds(200, 220, 100, 80);

        btnbagi.setBackground(new java.awt.Color(153, 153, 153));
        btnbagi.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnbagi.setForeground(new java.awt.Color(0, 0, 0));
        btnbagi.setText(":");
        btnbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbagiActionPerformed(evt);
            }
        });
        getContentPane().add(btnbagi);
        btnbagi.setBounds(300, 220, 100, 80);

        btn7.setBackground(new java.awt.Color(255, 255, 255));
        btn7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn7.setForeground(new java.awt.Color(0, 0, 0));
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7);
        btn7.setBounds(0, 300, 100, 80);

        btn8.setBackground(new java.awt.Color(255, 255, 255));
        btn8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn8.setForeground(new java.awt.Color(0, 0, 0));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8);
        btn8.setBounds(100, 300, 100, 80);

        btn9.setBackground(new java.awt.Color(255, 255, 255));
        btn9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn9.setForeground(new java.awt.Color(0, 0, 0));
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9);
        btn9.setBounds(200, 300, 100, 80);

        btnkali.setBackground(new java.awt.Color(153, 153, 153));
        btnkali.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnkali.setForeground(new java.awt.Color(0, 0, 0));
        btnkali.setText("X");
        btnkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnkali);
        btnkali.setBounds(300, 300, 100, 80);

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn4.setForeground(new java.awt.Color(0, 0, 0));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(0, 380, 100, 80);

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn5.setForeground(new java.awt.Color(0, 0, 0));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5);
        btn5.setBounds(100, 380, 100, 80);

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn6.setForeground(new java.awt.Color(0, 0, 0));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6);
        btn6.setBounds(200, 380, 100, 80);

        btnkurang.setBackground(new java.awt.Color(153, 153, 153));
        btnkurang.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnkurang.setForeground(new java.awt.Color(0, 0, 0));
        btnkurang.setText("_");
        btnkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkurangActionPerformed(evt);
            }
        });
        getContentPane().add(btnkurang);
        btnkurang.setBounds(300, 380, 100, 80);

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(0, 0, 0));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(0, 460, 100, 80);

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(0, 0, 0));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(100, 460, 100, 80);

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(0, 0, 0));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(200, 460, 100, 80);

        btntambah.setBackground(new java.awt.Color(153, 153, 153));
        btntambah.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btntambah.setForeground(new java.awt.Color(0, 0, 0));
        btntambah.setText("+");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });
        getContentPane().add(btntambah);
        btntambah.setBounds(300, 460, 100, 80);

        btn0.setBackground(new java.awt.Color(255, 255, 255));
        btn0.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn0.setForeground(new java.awt.Color(0, 0, 0));
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0);
        btn0.setBounds(100, 540, 100, 80);

        btnkoma.setBackground(new java.awt.Color(153, 153, 153));
        btnkoma.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnkoma.setForeground(new java.awt.Color(0, 0, 0));
        btnkoma.setText(",");
        btnkoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkomaActionPerformed(evt);
            }
        });
        getContentPane().add(btnkoma);
        btnkoma.setBounds(0, 540, 100, 80);

        btnsaadengan.setBackground(new java.awt.Color(153, 153, 153));
        btnsaadengan.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnsaadengan.setForeground(new java.awt.Color(0, 0, 0));
        btnsaadengan.setText("=");
        btnsaadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaadenganActionPerformed(evt);
            }
        });
        getContentPane().add(btnsaadengan);
        btnsaadengan.setBounds(200, 540, 200, 80);

        btnpersen.setBackground(new java.awt.Color(153, 153, 153));
        btnpersen.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnpersen.setForeground(new java.awt.Color(0, 0, 0));
        btnpersen.setText("%");
        btnpersen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpersenActionPerformed(evt);
            }
        });
        getContentPane().add(btnpersen);
        btnpersen.setBounds(0, 140, 100, 80);

        btnakar.setBackground(new java.awt.Color(153, 153, 153));
        btnakar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnakar.setForeground(new java.awt.Color(0, 0, 0));
        btnakar.setText("√");
        btnakar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnakarActionPerformed(evt);
            }
        });
        getContentPane().add(btnakar);
        btnakar.setBounds(200, 140, 100, 80);

        btnpangkat.setBackground(new java.awt.Color(153, 153, 153));
        btnpangkat.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnpangkat.setForeground(new java.awt.Color(0, 0, 0));
        btnpangkat.setText("^");
        btnpangkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpangkatActionPerformed(evt);
            }
        });
        getContentPane().add(btnpangkat);
        btnpangkat.setBounds(100, 140, 100, 80);

        atas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        getContentPane().add(atas);
        atas.setBounds(0, 0, 400, 40);

        display.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        getContentPane().add(display);
        display.setBounds(0, 40, 400, 100);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("1/X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 140, 100, 80);

        setSize(new java.awt.Dimension(419, 667));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaadenganActionPerformed
        // TODO add your handling code here:
        switch(pilih){
   case 1:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 + angka2;
            angka = Double.toString(jumlah);
            display.setText(angka);
            atas.setText(angka1+" + "+angka2);
            break;
   case 2:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 - angka2;
            angka = Double.toString(jumlah);
            display.setText(angka);
            atas.setText(angka1+" - "+angka2);
            break;
   case 3:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 * angka2;
            angka = Double.toString(jumlah);
            display.setText(angka);
            atas.setText(angka1+" x "+angka2);
            break;
   case 4:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 / angka2;
            angka = Double.toString(jumlah);
            display.setText(angka);
            atas.setText(angka1+" : "+angka2);
            break;
   case 5:
          angka2 = Double.parseDouble(angka);
          jumlah = Math.pow(angka1, angka2);
          angka = Double.toString(jumlah);
          display.setText(angka);
          atas.setText(angka1+" ^ "+angka2);
          break;
   /*case 6:
          jumlah =angka1 / 100;
          angka = Double.toString(jumlah);
          display.setText(" "+jumlah);
          atas.setText(angka1+" % ");/*/
       } 
      
    }//GEN-LAST:event_btnsaadenganActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
         angka += "2";
        display.setText(angka);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        angka += "0";
        display.setText(angka);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
         angka += "1";
        display.setText(angka);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
         angka += "3";
        display.setText(angka);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
         angka += "6";
        display.setText(angka);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
         angka += "5";
        display.setText(angka);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
         angka += "4";
        display.setText(angka);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
         angka += "9";
        display.setText(angka);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
         angka += "8";
        display.setText(angka);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
         angka += "7";
        display.setText(angka);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btnkomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkomaActionPerformed
        // TODO add your handling code here:
         angka += ".";
        display.setText(angka);
        atas.setText(angka1+(" . "));
    }//GEN-LAST:event_btnkomaActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        display.setText("+");
        atas.setText(angka1+" + ");
        angka=" ";
        pilih=1;
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkurangActionPerformed
        // TODO add your handling code here:
         angka1=Double.parseDouble(angka);
         display.setText("-");
         atas.setText(angka+" - ");
         angka=" ";
         pilih=2;
    }//GEN-LAST:event_btnkurangActionPerformed

    private void btnkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaliActionPerformed
        // TODO add your handling code here:
         angka1=Double.parseDouble(angka);
         display.setText("x");
         atas.setText(angka1+" x ");
         angka="";
         pilih=3;
    }//GEN-LAST:event_btnkaliActionPerformed

    private void btnbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbagiActionPerformed
        // TODO add your handling code here:
         angka1=Double.parseDouble(angka);
         display.setText(":");
         atas.setText(angka1+" : ");
         angka="";
         pilih=4;
    }//GEN-LAST:event_btnbagiActionPerformed

    private void btnpangkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpangkatActionPerformed
        // TODO add your handling code here:
         angka1=Double.parseDouble(angka);
         display.setText("^");
         atas.setText(angka1+" ^ ");
         angka="";
         pilih=5;
    }//GEN-LAST:event_btnpangkatActionPerformed

    private void btncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncActionPerformed
        // TODO add your handling code here:
        display.setText("0");
        atas.setText("");
        angka1=0.0;
        angka2=0.0;
        jumlah=0.0;
        angka="";
    }//GEN-LAST:event_btncActionPerformed

    private void btnceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnceActionPerformed
        // TODO add your handling code here:
        display.setText("0");
        angka = " ";
    }//GEN-LAST:event_btnceActionPerformed

    private void btnpersenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpersenActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        
        jumlah =angka1 / 100;
          angka = Double.toString(jumlah);
          display.setText(" "+jumlah);
          atas.setText(angka1+" % ");        
    }//GEN-LAST:event_btnpersenActionPerformed

    private void btnakarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnakarActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        jumlah =Math.sqrt(angka1);
        angka = Double.toString(jumlah);
        display.setText(angka);
        atas.setText(" √ ("+angka1+")");
    }//GEN-LAST:event_btnakarActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
        // TODO add your handling code here:
        angka = angka.substring(0,angka.length()-1);
        display.setText(angka);
    }//GEN-LAST:event_btndelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        
        jumlah =1 / angka1;
        angka = Double.toString(jumlah);
        display.setText(" "+jumlah);
        atas.setText(" 1 / ("+angka1+")");        

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(kakulatorkomplit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kakulatorkomplit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kakulatorkomplit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kakulatorkomplit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kakulatorkomplit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atas;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnakar;
    private javax.swing.JButton btnbagi;
    private javax.swing.JButton btnc;
    private javax.swing.JButton btnce;
    private javax.swing.JButton btndel;
    private javax.swing.JButton btnkali;
    private javax.swing.JButton btnkoma;
    private javax.swing.JButton btnkurang;
    private javax.swing.JButton btnpangkat;
    private javax.swing.JButton btnpersen;
    private javax.swing.JButton btnsaadengan;
    private javax.swing.JButton btntambah;
    private javax.swing.JLabel display;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}