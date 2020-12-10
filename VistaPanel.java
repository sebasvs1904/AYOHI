package Vista;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class VistaPanel extends javax.swing.JFrame {

  
    public VistaPanel() {
        initComponents();
    }

     

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnImportar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analizador lexico");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnImportar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnImportar.setText("Seleccionar tabla");
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });
        getContentPane().add(btnImportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 20, 171, 27));

        jtDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Título 5", "Título 6"
            }
        ));
        jtDatos.setAutoscrolls(false);
        jtDatos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtDatos.getTableHeader().setResizingAllowed(false);
        jScrollPane1.setViewportView(jtDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 679, 880));

        jButton2.setText("Archivo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, -1, -1));

        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("Analizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1063, 26, -1, -1));

        jPanel1.setBackground(new java.awt.Color(210, 235, 255));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(204, 240, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(204, 214, 221));
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane4.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
            .addComponent(jScrollPane4)
            .addComponent(jScrollPane3)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 470, 880));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -320, 1240, 1730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Leer();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImportarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextArea1.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //analizar
        validar();
    }//GEN-LAST:event_jButton1ActionPerformed

         private void Leer() {
 String aux = "";
 String texto = "";
 String resultado = "";
 try {
 JFileChooser file = new JFileChooser(System.getProperty("user.dir"));
 file.showOpenDialog(this);
 File archivo = file.getSelectedFile();
 if (archivo != null) {
 FileReader archivos = new FileReader(archivo);
 BufferedReader leer = new BufferedReader(archivos);
 while ((aux = leer.readLine()) != null) {
 texto += aux + "\n";
 }
 leer.close();
 }
 } catch (IOException ex) {
 JOptionPane.showMessageDialog(null, "Error Importando - " + ex);
 }
 jTextArea1.setText(texto);
 }
    
  private void validar(){   
// String cadena="--HOLSñ 12ed6d7[] !#?\"¡¡¡*--";
String cadena=jTextArea1.getText().replace("\n","");
//cadena.replace("\r","");
 System.out.println(cadena);
String error="q20 - Estado no aceptado";
//int i
String res="";
if('-'==cadena.charAt(0)){
    res+="Letra: "+cadena.charAt(0)+ " Estado: q0\n";
    if('-'==cadena.charAt(1)){
       res+="Letra: "+cadena.charAt(1)+ " Estado: q1\n";
        if('*'==cadena.charAt(2)){
           res+="Letra: "+cadena.charAt(2)+ " Estado: q2\n";
           String validac="";
           String c="";
           int b=0;
           for(b=3;b<(cadena.length()-3);b++) { 
            validac=cadena.charAt(b)+"";
        
            c="Letra: "+cadena.charAt(b)+ " Estado: q3\n";
             if(validac.matches("[A-Za-z]|[ñÑ]|[0-9]|[ ]|[!\"#$%&/()=?¡¿'|@<>-_.,°*+´{}\\[\\];¨:]"))
                        {
                                res+=c;}
             else{ res+=error;
                   System.exit(0);
             }
             
                                                 }
        
                                if(cadena.charAt(cadena.length()-3)=='*'){
                                        res+="Letra: "+cadena.charAt(cadena.length()-3)+ " Estado: q4\n";
                                       if(cadena.charAt(cadena.length()-2)=='-'){
                                               res+="Letra: "+cadena.charAt(cadena.length()-2)+ " Estado: q5\n";
                                               if(cadena.charAt(cadena.length()-1)=='-'){
                                                           res+="Letra: "+cadena.charAt(cadena.length()-1)+ " Estado FINAL: q6\n";
                                                           jTextArea3.setText("Se ejecuto correctamente");
                                                                                      } else{ res+=error;
                                                                                        jTextArea3.setText("Error de sintaxis");
                                                                                    }
                                                                                } else{ res+=error;
                                                                                    jTextArea3.setText("Error de sintaxis");
                                                                            }                  
                                                                         }else{ res+=error;
                                                                             jTextArea3.setText("Error de sintaxis");   
                                                                        }

                                                } else{ res+=error;
                                                  jTextArea3.setText("Error de sintaxis");
                                                 }
                                           } else{ res+=error;
                                             jTextArea3.setText("Error de sintaxis");   
    }
                                   }else{ res+=error;
                                    jTextArea3.setText("Error de sintaxis");
}
 jTextArea2.setText(res);
}
         
         
         
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPanel().setVisible(true);
            }
        });
    }

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnImportar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    public javax.swing.JTable jtDatos;
    // End of variables declaration//GEN-END:variables
}
