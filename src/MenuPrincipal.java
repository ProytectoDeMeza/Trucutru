/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;

import java.awt.Panel;
import java.awt.TextField;
import java.io.*;
import javax.swing.*;


import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Alexiyolokooooo
 */
public class MenuPrincipal extends javax.swing.JFrame {
    private File nombreProyecto,nombreDirectorio,F;
    private JFileChooser chooser;
    private int checker;
    private FileNameExtensionFilter filtro1,filtro2;
    public static MenuPrincipal menu;
    ImageIcon imagen,boton;
    
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        imagen= new ImageIcon("src/Imagenes/88.png");
        boton=new ImageIcon(imagen.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT));
        
        this.setTitle("ANÁLISIS DE MARCOS PLANOS");
        jLabel1.setText("<html><p>Nombre de proyecto y directorio: ");
        
        this.setBounds(500, 300, this.getWidth(), this.getHeight());
        setLayout(new BorderLayout());
        Panel q=new Panel( new GridLayout(1,2) );
        
        q.add(jLabel2);  
        q.add(jLabel3); 
        Panel p = new Panel( new GridLayout(7,1) );
        p.add(opcionPrinc1);
        p.add(opcionPrinc2);
        p.add(opcionPrinc3);
        p.add(opcionPrinc4);
        p.add(opcionPrinc5);
        p.add(opcionPrinc6);
        p.add(opcionPrinc7);
        add(p,BorderLayout.CENTER); 
        add(q,BorderLayout.NORTH); 
        add(jLabel1,BorderLayout.SOUTH);
        add(jLabel5,BorderLayout.EAST);
        add(jLabel6,BorderLayout.WEST);
        imagen= new ImageIcon("src/Imagenes/11.png");
        boton=new ImageIcon(imagen.getImage().getScaledInstance(460, 52, Image.SCALE_DEFAULT));
        opcionPrinc1.setIcon(boton);
        
        imagen= new ImageIcon("src/Imagenes/2.png");
        boton=new ImageIcon(imagen.getImage().getScaledInstance(460, 52, Image.SCALE_DEFAULT));
        opcionPrinc2.setIcon(boton);
        
        imagen= new ImageIcon("src/Imagenes/33.png");
        boton=new ImageIcon(imagen.getImage().getScaledInstance(460, 52, Image.SCALE_DEFAULT));
        opcionPrinc3.setIcon(boton);
        
        imagen= new ImageIcon("src/Imagenes/44.png");
        boton=new ImageIcon(imagen.getImage().getScaledInstance(460, 52, Image.SCALE_DEFAULT));
        opcionPrinc4.setIcon(boton);
        
        imagen= new ImageIcon("src/Imagenes/55.png");
        boton=new ImageIcon(imagen.getImage().getScaledInstance(460, 52, Image.SCALE_DEFAULT));
        opcionPrinc5.setIcon(boton);
        
        imagen= new ImageIcon("src/Imagenes/66.png");
        boton=new ImageIcon(imagen.getImage().getScaledInstance(460, 52, Image.SCALE_DEFAULT));
        opcionPrinc6.setIcon(boton);
        
        imagen= new ImageIcon("src/Imagenes/77.png");
        boton=new ImageIcon(imagen.getImage().getScaledInstance(460, 52, Image.SCALE_DEFAULT));
        opcionPrinc7.setIcon(boton);
        // este metodo dimensiona y setea el tamanio exacto
        // necesario para contener todos los componentes del Frame
        
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
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        opcionPrinc1 = new javax.swing.JButton();
        opcionPrinc2 = new javax.swing.JButton();
        opcionPrinc3 = new javax.swing.JButton();
        opcionPrinc4 = new javax.swing.JButton();
        opcionPrinc5 = new javax.swing.JButton();
        opcionPrinc6 = new javax.swing.JButton();
        opcionPrinc7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jRadioButton3.setText("jRadioButton3");

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("<html><p>Nombre de proyecto y directorio: ");

        jLabel2.setText("<html>*****  OPCIONES :  *****<p><p>"
        );

        jLabel3.setText("<html><p><p><p>De Clic sobre la opcion que desee: ");

        opcionPrinc1.setText(null);
        opcionPrinc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionPrinc1ActionPerformed(evt);
            }
        });

        opcionPrinc2.setText(null);

        opcionPrinc3.setText(null);

        opcionPrinc4.setText(null);

        opcionPrinc6.setText(null);

        jLabel5.setForeground(new java.awt.Color(153, 51, 0));
        jLabel5.setText("<html>-                    -<p>}"
            + "-                    -<p>");

        jLabel6.setForeground(new java.awt.Color(153, 51, 0));
        jLabel6.setText("<html>-                    -<p>}"
            + "-                    -<p>");

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Abrir Proyecto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Guardar");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Guardar como...");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opcionPrinc7)
                    .addComponent(opcionPrinc6)
                    .addComponent(opcionPrinc5)
                    .addComponent(opcionPrinc4)
                    .addComponent(opcionPrinc3)
                    .addComponent(opcionPrinc2)
                    .addComponent(opcionPrinc1))
                .addGap(124, 124, 124))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addComponent(opcionPrinc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionPrinc2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionPrinc3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcionPrinc4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcionPrinc5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcionPrinc6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcionPrinc7)
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
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
        if(nombreProyecto==null){
            jLabel1.setText("<html><p>Nombre de proyecto y directorio: ");
        }else{
            jLabel1.setText("<html><p>Nombre de proyecto y directorio: "+nombreProyecto);
        }
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void opcionPrinc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionPrinc1ActionPerformed
         
        new DatosDeLaEstructura().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_opcionPrinc1ActionPerformed

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
                menu = new MenuPrincipal();
                menu.setVisible(true);
                
            }
        });
    }

    public static MenuPrincipal getMenu() {
        return menu;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JButton opcionPrinc1;
    private javax.swing.JButton opcionPrinc2;
    private javax.swing.JButton opcionPrinc3;
    private javax.swing.JButton opcionPrinc4;
    private javax.swing.JButton opcionPrinc5;
    private javax.swing.JButton opcionPrinc6;
    private javax.swing.JButton opcionPrinc7;
    // End of variables declaration//GEN-END:variables
}
