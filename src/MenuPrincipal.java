/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Alexiyolokooooo
 */
public class MenuPrincipal extends javax.swing.JFrame {
    File nombreProyecto,nombreDirectorio,F;
    JFileChooser chooser;
    int checker;
    FileNameExtensionFilter filtro1,filtro2;
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        F= new File("C:/");
        setTitle("ANÁLISIS DE MARCOS PLANOS");
        nombreProyecto=null;
        chooser=new JFileChooser();
        // aquí creas los filtros 
        filtro1 = new FileNameExtensionFilter("Archivos DOCX", "docx"); 
        filtro2 = new FileNameExtensionFilter("Archivos TXT", "txt"); 

//Una vez creados los filtros, sólo debes asignárselos al cuadro de diálogo 
        chooser.setFileFilter(filtro1); 
        chooser.addChoosableFileFilter(filtro2); 

        chooser.setCurrentDirectory(null);
        checker=chooser.showOpenDialog(null);
        if(checker==JFileChooser.APPROVE_OPTION){
            nombreProyecto= chooser.getSelectedFile();
            nombreDirectorio= chooser.getCurrentDirectory();
        }
        initComponents();
        
        
         buttonGroup1.add(opcionPrincipal1);
         buttonGroup1.add(opcionPrincipal2);
         buttonGroup1.add(opcionPrincipal3);
         buttonGroup1.add(opcionPrincipal4);
         buttonGroup1.add(opcionPrincipal5);
         buttonGroup1.add(opcionPrincipal6);
         buttonGroup1.add(opcionPrincipal7);
         
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        opcionPrincipal1 = new javax.swing.JRadioButton();
        opcionPrincipal2 = new javax.swing.JRadioButton();
        opcionPrincipal3 = new javax.swing.JRadioButton();
        opcionPrincipal4 = new javax.swing.JRadioButton();
        opcionPrincipal5 = new javax.swing.JRadioButton();
        opcionPrincipal6 = new javax.swing.JRadioButton();
        opcionPrincipal7 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        button1 = new java.awt.Button();

        jRadioButton3.setText("jRadioButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("<html><p>Nombre de proyecto y directorio: "+nombreProyecto);

        jLabel2.setText("<html>*****  OPCIONES :  *****<p><p>"
        );

        opcionPrincipal1.setText(" Datos de la Estructura");

        opcionPrincipal2.setText("Generación de matriz de Rigidez");

        opcionPrincipal3.setText("Condiciones de Carga");

        opcionPrincipal4.setText("Calculo de Resultados");

        opcionPrincipal5.setText("Impresion");

        opcionPrincipal6.setText("Terminar");

        opcionPrincipal7.setText("Iniciar Nuevo Proyecto");

        jLabel3.setText("<html><p><p><p>Seleccione la opcion que desee luego precione 'Aceptar'");

        button1.setLabel("Aceptar");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(opcionPrincipal7)
                                .addGap(84, 84, 84)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(opcionPrincipal6)
                            .addComponent(opcionPrincipal5)
                            .addComponent(opcionPrincipal4)
                            .addComponent(opcionPrincipal1)
                            .addComponent(opcionPrincipal3)
                            .addComponent(opcionPrincipal2))
                        .addGap(197, 280, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(opcionPrincipal1)
                .addGap(18, 18, 18)
                .addComponent(opcionPrincipal2)
                .addGap(18, 18, 18)
                .addComponent(opcionPrincipal3)
                .addGap(18, 18, 18)
                .addComponent(opcionPrincipal4)
                .addGap(18, 18, 18)
                .addComponent(opcionPrincipal5)
                .addGap(18, 18, 18)
                .addComponent(opcionPrincipal6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(opcionPrincipal7)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        if(opcionPrincipal1.isSelected()){
            System.out.println("1");
        }
        if(opcionPrincipal2.isSelected()){
            System.out.println("2");
        }
        if(opcionPrincipal3.isSelected()){
            System.out.println("3");
        }
        if(opcionPrincipal4.isSelected()){
            System.out.println("4");
        }
        if(opcionPrincipal5.isSelected()){
            System.out.println("5");
        }
        if(opcionPrincipal6.isSelected()){
            System.out.println("6");
        }
        if(opcionPrincipal7.isSelected()){
            System.out.println("7");
        }
    }//GEN-LAST:event_button1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton opcionPrincipal1;
    private javax.swing.JRadioButton opcionPrincipal2;
    private javax.swing.JRadioButton opcionPrincipal3;
    private javax.swing.JRadioButton opcionPrincipal4;
    private javax.swing.JRadioButton opcionPrincipal5;
    private javax.swing.JRadioButton opcionPrincipal6;
    private javax.swing.JRadioButton opcionPrincipal7;
    // End of variables declaration//GEN-END:variables
}
