/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Sebastian
 */
public class Adminframe extends javax.swing.JFrame {

    /**
     * Creates new form Adminframe
     */
   
   int contador;
    public Adminframe() {
        initComponents();
        jTextField1.show(false);
          jPasswordField1.show(false);
          jLabel2.show(false);
          jLabel3.show(false);
          jButton5.show(false);
           jButton6.show(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 190, 300));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/exportar.png"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, 190, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/borrar clientes.png"))); // NOI18N
        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 190, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/volver.png"))); // NOI18N
        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 190, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/cambiar.jpg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 190, 40));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 190, 30));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setText("Nuevo usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setText("Nueva contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, 40));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/listo.jpg"))); // NOI18N
        jButton5.setText("Listo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 170, 40));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/volver.png"))); // NOI18N
        jButton6.setText("jButton6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 180, 40));

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 190, 30));

        jButton7.setBackground(new java.awt.Color(100, 240, 240));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/pdf.jpg"))); // NOI18N
        jButton7.setText("jButton7");
        jButton7.setDefaultCapable(false);
        jButton7.setMargin(new java.awt.Insets(2, 12, 2, 1));
        jButton7.setMaximumSize(new java.awt.Dimension(10, 349));
        jButton7.setMinimumSize(new java.awt.Dimension(117, 349));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 100, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/vector-gratis-pizza-llevar_23-2147498585.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -20, 610, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        PrintWriter printWriter;

        try {
            String temp = "";
            FileWriter archivo = new FileWriter("Clientes.txt");
            FileReader lector = new FileReader("Clientes.txt");
            BufferedReader Br = new BufferedReader(lector);
            printWriter = new PrintWriter(archivo);
            while (Br.readLine() != null) {
                printWriter.println((""));

            }
            JOptionPane.showMessageDialog(this, "Se han borrado todos los datos");
            //archivo.write(jTextField1.getText());
            //  archivo.write(jTextField2.getText());
            archivo.close();

        } catch (Throwable e) {
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String texto = "";
        int numeroclientes = 0;
        int contador = 0;

        try {

            FileReader lector = new FileReader("Clientes.txt");
            BufferedReader Br = new BufferedReader(lector);
            String temp = "";
            String bfRead;
            while ((bfRead = Br.readLine()) != null) {
                temp = temp + bfRead + "\n";
                contador++;
                if (contador == 5) {
                    numeroclientes = numeroclientes + 1;
                    contador = 0;
                }
            }
            texto = temp;
//jTextArea1.setText("clientes: " + numeroclientes);
            jTextArea1.setText("Ganancias: " + numeroclientes * 10000 + "\n" + "Clientes: " + numeroclientes + "\n" + texto);
        } catch (Throwable e) {
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        login c = new login();
        c.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton1.show(false);
        jButton2.show(false);
        jButton3.show(false);
        jButton4.show(false);
        jTextArea1.show(false);   
         jScrollPane1.show(false);
         jTextField1.show(true);
          jPasswordField1.show(true);
          jLabel2.show(true);
          jLabel3.show(true);
          jButton5.show(true);
           jButton6.show(true);
           jButton7.show(false);
         
          
         
         
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         
        if(jTextField1.getText().equals("")  || jPasswordField1.getText().equals("")){
        JOptionPane.showMessageDialog(this, "Uno de los campos esta vacio");
        }
        
        else{
        PrintWriter printWriter;
          try {
           
               FileWriter archivo = new FileWriter("Admin.txt");
                    FileReader lector = new FileReader("Admin.txt");
                    BufferedReader Br = new BufferedReader(lector);
                    printWriter = new PrintWriter(archivo);
  String userencriptado= DigestUtils.md5Hex(jTextField1.getText());
   String contraencriptada= DigestUtils.md5Hex(jPasswordField1.getText());
  
                    printWriter.println(userencriptado);
                    printWriter.println(contraencriptada);
                    
                   
                    archivo.close();
                     JOptionPane.showMessageDialog(this, "Se cambio el usuario y contraseña");
              
        } catch (Exception e) {
        }
          
            jButton1.show(true);
        jButton2.show(true);
        jButton3.show(true);
        jButton4.show(true);
        jTextArea1.show(true);
        jScrollPane1.show(true);
         jTextField1.show(false);
          jPasswordField1.show(false);
          jLabel2.show(false);
          jLabel3.show(false);
          jButton5.show(false);
          jButton6.show(false);
          jButton7.show(true);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton1.show(true);
        jButton2.show(true);
        jButton3.show(true);
        jButton4.show(true);
        jTextArea1.show(true);
        jScrollPane1.show(true);
         jTextField1.show(false);
          jPasswordField1.show(false);
          jLabel2.show(false);
          jLabel3.show(false);
          jButton5.show(false);
          jButton6.show(false);
          jButton7.show(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
 String texto = "";
        
        int contador = 0;

        try {

            FileReader lector = new FileReader("Sugerencias.txt");
            BufferedReader Br = new BufferedReader(lector);
            String temp = "";
            String bfRead;
            while ((bfRead = Br.readLine()) != null) {
                temp = temp + bfRead + "\n";
                contador++;
                
            }
            texto = temp;
            
        } catch (Throwable e) {
        }    
        
        
        String contenido = texto;          
        
          try {
             FileOutputStream archivo = new FileOutputStream("Sugerencias.pdf");
              contador++;
              Document doc= new Document();
             PdfWriter.getInstance(doc, archivo);
             doc.open();
             doc.add(new  Paragraph(contenido) );
             
             doc.close();
             JOptionPane.showMessageDialog(this, "Se creo el archivo pdf con las sugerencias del dia");
        } catch (Exception e) {
        }
          
         
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Adminframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adminframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adminframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adminframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
