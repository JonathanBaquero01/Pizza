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
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author informatica
 */
public class pizza2 extends javax.swing.JFrame {

    int contador;
    ArrayList<String> lista = new ArrayList<String>();
     Date date = new Date();
    
    public pizza2() {
        initComponents();
        jTextArea1.show(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/volver.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 170, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/salir.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 170, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/ver recibo.png"))); // NOI18N
        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 170, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        getContentPane().add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 180, 260));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/sugerencias.png"))); // NOI18N
        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 170, 40));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/imprimir.jpg"))); // NOI18N
        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 170, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/89249be8-64bf-460e-b66d-2aaa391759ff.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -40, 610, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.setVisible(false);
        pizzaform c = new pizzaform();
        c.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        login c = new login();
        c.setVisible(true);
        jTextArea1.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
jTextArea1.setVisible(true);

 //String nombre = "";
   
        try {
          
             FileReader lector = new FileReader("Recibo.txt");
            BufferedReader Br = new BufferedReader(lector);
            String nombretemp = "";
            String bfRead;
            while ((bfRead = Br.readLine()) != null) {
                 
                 lista.add(bfRead);
               
            }
            //nombre = nombretemp;
        } catch (Exception e) {
        }



      jTextArea1.setText("-----------------------------------------------------"+"\n"+"                       PIZZAS"+"\n"+"                       NIGHT"+"\n"+"-----------------------------------------------------"+"\n"+"Fecha: "+ date+"\n"+"Departamento: Santander"+ "\n"+"Ciudad: Bucaramanga"+"\n"+"Valor pizza: 10.000$"+"\n"+"Nombre completo: " + lista.get(0)+ " "+ lista.get(1)+"\n"+"telefono: "+lista.get(2)+"\n"+"Direccion: "+lista.get(3));
         
       
          
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          this.setVisible(false);
        Sugerencias c = new Sugerencias();
        c.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String texto = "";
        
        

        try {

            FileReader lector = new FileReader("Recibo.txt");
            BufferedReader Br = new BufferedReader(lector);
            String temp = "";
            String bfRead;
            while ((bfRead = Br.readLine()) != null) {
                temp = temp + bfRead + "\n";
               
                
            }
            texto = temp;
            
        } catch (Throwable e) {
        }    
        
        
        String contenido = texto;          
        
          try {
             contador++;
             FileOutputStream archivo = new FileOutputStream(contador+"Recibo.pdf");
              
              Document doc= new Document();
             PdfWriter.getInstance(doc, archivo);
             doc.open(); 
             doc.add(new  Paragraph("-------------------------------------------------------------------------------------------------------------------------------"+"\n"+"                                                                      PIZZAS"+"\n"+"                                                                       NIGHT"+"\n"+"-------------------------------------------------------------------------------------------------------------------------------"+"\n"+"Fecha: "+ date+"\n"+"Departamento: Santander"+ "\n"+"Ciudad: Bucaramanga"+"\n"+"Valor pizza: 10.000$"+"\n"+"Nombre completo: " + lista.get(0)+ " "+ lista.get(1)+"\n"+"telefono: "+lista.get(2)+"\n"+"Direccion: "+lista.get(3)) );
             
             doc.close();
             JOptionPane.showMessageDialog(this, "Se genero el recibo en pdf");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Debe ver el recibo primero para poder verificar su pdf");
        contador--;
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(pizza2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pizza2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pizza2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pizza2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pizza2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
