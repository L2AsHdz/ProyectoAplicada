/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomate;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class frmTransformadas extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    public frmTransformadas() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        listadoTransformadas = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        textoArea = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listadoTransformadas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        listadoTransformadas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " 1", " t", " t^n", " e^(at)", " t^(n)*e^(at)", " cos (kt)", " sin (kt)", " cosh (kt)", " sinh (kt)", " e^(at) * cos (kt)", " e^(at) * sin (kt)", " (1/(2k)^3 ) * (sin (kt) -kt * cos(kt)) ", " (1/2k) * sin (kt)", " (1/2k) * (sin (kt) + kt * cos(kt))", " u* (t-a)" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listadoTransformadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listadoTransformadasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listadoTransformadas);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Funcion:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Resultado:");

        textoArea.setColumns(20);
        textoArea.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        textoArea.setRows(5);
        jScrollPane6.setViewportView(textoArea);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/if_logout_173050.png"))); // NOI18N
        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public static int factorial(int numeros){//pide como parametro el numero del factorial
        int respuesta=1; //creacion e inicializacion de una variable
        String retorno="";
        int numero=numeros;
        for(int contador=1;contador<=numero;contador++){//ciclo que inicia en un y termina en el numero que se pide por parametro
            respuesta=respuesta*contador;            //multiplica todos los numeros desde el 1 hasta el numero
        }
        retorno+=respuesta;
        return respuesta;//regresa la respuesta
    }
    private void listadoTransformadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listadoTransformadasMouseClicked
        try {
        if(listadoTransformadas.getSelectedIndex()>=0){
            int opcion=listadoTransformadas.getSelectedIndex();
            int a;
            int n;
            int k;
            switch(opcion){
                case 0:                    
                    textoArea.setText("1/s");
                    break;
                case 1:
                    textoArea.setText("1/s^2");
                    break;
                case 2:
                    n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el n"));
                    textoArea.setText(factorial(n)+"/s^"+(n+1));
                    break;
                case 3:                    
                    a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el a"));
                    textoArea.setText("1/(s -"+a+")");
                    break;
                case 4:
                    a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el  a"));
                    n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el  n"));
                    textoArea.setText(factorial(n)+"/(s - "+a+")^"+(n+1));
                    break;
                case 5:
                    k=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el k"));
                    textoArea.setText("s/(s^2 + "+Math.pow(k,2)+")");
                    break;
                case 6:
                    k=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el k"));
                    textoArea.setText(k+" /(s^2 + "+Math.pow(k,2)+")");
                    break;
                case 7:
                    k=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el k"));
                    textoArea.setText("s/(s^2 - "+Math.pow(k,2)+")");                    
                    break;
                case 8:
                    k=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el k"));
                    textoArea.setText(k+"/(s^2 - "+Math.pow(k,2)+")");
                    break;
                case 9:                    
                    a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el a"));
                    k=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el k"));
                    textoArea.setText("s - "+a+"/((s - "+a+")^2 + "+Math.pow(k,2)+")");
                    break;
                case 10:
                    a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el a"));
                    k=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el k"));
                    textoArea.setText(k+" /((s - "+a+")^2 + "+Math.pow(k,2)+")");
                    break;
                case 11:                    
                    k=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el k"));
                    textoArea.setText("1/((s^2 + "+Math.pow(k,2)+")^2");                   
                    break;
                case 12:
                    k=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el k"));
                    textoArea.setText("s/((s^2 + "+Math.pow(k,2)+")^2");
                    break;
                case 13:                    
                    k=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el k"));
                    textoArea.setText("s^2/((s^2 + "+Math.pow(k,2)+")^2");                    
                    break;                
                case 14:                    
                    a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el a"));
                    textoArea.setText("e^(-"+a+"s)/s");                    
                    break;                
            }           
        }
        }catch(java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Ingrese el valor correcto");
        }
    }//GEN-LAST:event_listadoTransformadasMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        frmMenu nueva1 =new frmMenu();
        nueva1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(frmTransformadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTransformadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTransformadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTransformadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTransformadas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JList<String> listadoTransformadas;
    private javax.swing.JTextArea textoArea;
    // End of variables declaration//GEN-END:variables
}
