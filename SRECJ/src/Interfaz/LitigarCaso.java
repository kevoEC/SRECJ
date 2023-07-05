/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

import Clases.Arbol;
import Clases.ColaConPrioridad;
import Clases.Denuncia;
import Clases.Lista;
import Clases.Usuario;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rosco
 */
public class LitigarCaso extends javax.swing.JPanel {
    Usuario usu = new Usuario();
    Lista lt = new Lista();
    Denuncia denuncia = new Denuncia();
    Arbol denuncias = new Arbol();
    DefaultListModel dlm=new DefaultListModel();
    ColaConPrioridad colacpusu = new ColaConPrioridad();
    ColaConPrioridad colatotal = new ColaConPrioridad();
    ColaConPrioridad colaabg = new ColaConPrioridad();
    
    
    /**
     * Creates new form Princ
     */
    public LitigarCaso() {
        initComponents();
        jListDenuncias.setModel(dlm);
        ArrayList<Denuncia> listado = colacpusu.obtenerTodos();

            Collections.sort(listado);
            for (Denuncia obj : listado) {
                dlm.addElement(obj.toString());
            }
    }
        public void Listar(){
        dlm.removeAllElements();
        dlm.addElement(denuncias.toString());
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
        Title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListDenuncias = new javax.swing.JList<>();
        btnMostrar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        Title.setText("Casos completos");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setText("Realiza un doble click sobre la denuncia que hayas culminado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Una ves culminadas el administrador podra verlas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jListDenuncias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListDenunciasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListDenuncias);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 690, 190));

        btnMostrar.setBackground(new java.awt.Color(18, 90, 173));
        btnMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMostrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMostrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMostrarMousePressed(evt);
            }
        });
        btnMostrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Mostrar");
        btnMostrar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel1.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 160, 50));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setText("Estado");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setText("Codigo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setText("Gravedad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setText("Caracter");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel8.setText("Asistencia");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel9.setText("Instancia");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel10.setText("Responsables/Carta");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarMouseClicked
        // TODO add your handling code here:
        MenuAbogado ma = new MenuAbogado();
        LitigarCaso elimDen = new LitigarCaso();
        ModificarDenuncia modDen = new ModificarDenuncia();
        MostrarDenunciasUsuario mdu = new MostrarDenunciasUsuario();
       
        if (!colacpusu.esVacia()) {
            //den = new Denuncia((String)cmbCaracter.getSelectedItem(),(String)cmbInstancia.getSelectedItem(),(String)cmbAsistencia.getSelectedItem(),txtResponsables.getText(),txtHechos.getText());
            //colacpusu.encolar(new Denuncia((String) cmbCaracter.getSelectedItem(), (String) cmbAsistencia.getSelectedItem(), (String) cmbAsistencia.getSelectedItem(), txtResponsables.getText(), txaCarta.getText(), usu.getCedula(), gravedad, "En revision"));
            //colatotal.encolar(new Denuncia((String) cmbCaracter.getSelectedItem(), (String) cmbAsistencia.getSelectedItem(), (String) cmbAsistencia.getSelectedItem(), txtResponsables.getText(), txaCarta.getText(), usu.getCedula(), gravedad, "En revision"));
            //usu.setColaden(colacpusu);
            dlm.removeAllElements();
            ArrayList<Denuncia> listado = colacpusu.obtenerTodos();

            Collections.sort(listado);
            for (Denuncia obj : listado) {
                dlm.addElement(obj.toString());
            }    
            


            /*mdu.usu = usu;
            mdu.lt = lt;
            mdu.denuncia = denuncia;
            mdu.denuncias = denuncias;
            mdu.colacpusu = colacpusu;
            mdu.colatotal = colatotal;
            
            modDen.usu = usu;
            modDen.lt = lt;
            modDen.denuncia = denuncia;
            modDen.denuncias = denuncias;
            modDen.colacpusu = colacpusu;
            modDen.colatotal = colatotal;
            
            elimDen.usu = usu;
            elimDen.lt = lt;
            elimDen.denuncia = denuncia;
            elimDen.denuncias = denuncias;
            elimDen.colacpusu = colacpusu;
            elimDen.colatotal = colatotal;*/

            ma.usu = usu;
            ma.lt = lt;
            ma.denuncia = denuncia;
            ma.denuncias = denuncias;
            ma.colacpusu = colacpusu;
            ma.colatotal = colatotal;
            
           

            //txaDenuncias.setText(denuncias.mo);
            //Listar();
            
            
        } else {
            JOptionPane.showMessageDialog(null, "ACTUALMENTE NO TIENE DENUNCIAS DISPONIBLES");
        }
        
    }//GEN-LAST:event_btnMostrarMouseClicked

    private void btnMostrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarMouseEntered
        setColor(btnMostrar);
    }//GEN-LAST:event_btnMostrarMouseEntered

    private void btnMostrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarMouseExited
        resetColor(btnMostrar);
    }//GEN-LAST:event_btnMostrarMouseExited

    private void btnMostrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarMousePressed

    }//GEN-LAST:event_btnMostrarMousePressed

    private void jListDenunciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListDenunciasMouseClicked
        // TODO add your handling code here:
        MenuAbogado ma = new MenuAbogado();
        if (evt.getClickCount() == 2 && evt.getButton() == MouseEvent.BUTTON1) {
                int response = JOptionPane.showConfirmDialog(this, "¿Haz culminado este caso?", "Caso terminado", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(response == JOptionPane.YES_OPTION){
                colacpusu.remove(jListDenuncias.getSelectedIndex());
                colatotal.remove(jListDenuncias.getSelectedIndex());
                dlm.removeAllElements();
                ArrayList<Denuncia> listado = colacpusu.obtenerTodos();

                Collections.sort(listado);
                for (Denuncia obj : listado) {
                dlm.addElement(obj.toString());
                }    
            }
            ma.usu = usu;
            ma.lt = lt;
            ma.denuncia = denuncia;
            ma.denuncias = denuncias;
            ma.colacpusu = colacpusu;
            ma.colatotal = colatotal;    
        }        
    }//GEN-LAST:event_jListDenunciasMouseClicked

    void setColor(JPanel panel) {
        panel.setBackground(new Color(21, 101, 192));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(18, 90, 173));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JPanel btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListDenuncias;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
