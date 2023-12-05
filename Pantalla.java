package javaapplication13;

import java.awt.Color;
import javax.swing.*;

public class Pantalla extends JFrame implements DualDataReceiver {

    private Pedir pedir;// JLabel para el segundo dato

    int xMouse, yMouse;

    public Pantalla() {
        initComponents();

        // Crear la instancia de Pedir y pasar 'this' como DualDataReceiver
        pedir = new Pedir(this);
        pedir.pedir();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Barra = new javax.swing.JPanel();
        cerrar = new javax.swing.JPanel();
        cerrarTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        temp = new javax.swing.JLabel();
        hum = new javax.swing.JLabel();
        panelRound2 = new Clases.PanelRound();
        panelRound1 = new Clases.PanelRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WhatsApp Image 2023-11-29 at 2.08.18 PM.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 133, 301));

        Barra.setBackground(new java.awt.Color(255, 255, 255));
        Barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraMouseDragged(evt);
            }
        });
        Barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraMousePressed(evt);
            }
        });

        cerrar.setBackground(new java.awt.Color(255, 255, 255));

        cerrarTxt.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        cerrarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrarTxt.setText("X");
        cerrarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cerrarLayout = new javax.swing.GroupLayout(cerrar);
        cerrar.setLayout(cerrarLayout);
        cerrarLayout.setHorizontalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrarTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );
        cerrarLayout.setVerticalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BarraLayout = new javax.swing.GroupLayout(Barra);
        Barra.setLayout(BarraLayout);
        BarraLayout.setHorizontalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BarraLayout.setVerticalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Termohigrometro");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 170, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 170, 10));

        temp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        temp.setText("Temperatura");
        jPanel1.add(temp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 136, 170, 30));

        hum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hum.setText("Humedad");
        jPanel1.add(hum, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 186, 170, 30));

        panelRound2.setRoundBottomLeft(100);
        panelRound2.setRoundBottomRight(100);
        panelRound2.setRoundTopLeft(100);
        panelRound2.setRoundTopRight(100);

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 20, 20));

        panelRound1.setRoundBottomLeft(100);
        panelRound1.setRoundBottomRight(100);
        panelRound1.setRoundTopLeft(100);
        panelRound1.setRoundTopRight(100);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 20, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>                        

    private void BarraMousePressed(java.awt.event.MouseEvent evt) {                                   
        xMouse = evt.getX();
        yMouse = evt.getY();

    }                                  

    private void BarraMouseDragged(java.awt.event.MouseEvent evt) {                                   
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }                                  

    private void cerrarTxtMouseClicked(java.awt.event.MouseEvent evt) {                                       
        System.exit(0);
    }                                      

    private void cerrarTxtMouseEntered(java.awt.event.MouseEvent evt) {                                       
        cerrarTxt.setForeground(Color.red);
    }                                      

    private void cerrarTxtMouseExited(java.awt.event.MouseEvent evt) {                                      
        cerrarTxt.setForeground(Color.black);
    }                                     

    @Override
    public void receiveData(String data1, String data2) {
        // Actualizar el contenido de los JLabels con los datos recibidos
        temp.setText("Temperatura: " + data1 + " C°");
        hum.setText("Humedad: " + data2 + " %");

        double data1Int = Double.parseDouble(data1);
        double data2Int = Double.parseDouble(data2);

// Configurar colores para temperatura (data1Int)
        if (data1Int >= 20 && data1Int <= 25) {
            panelRound1.setBackground(Color.green);
        } else if (data1Int <= 16 || data1Int >= 29) {
            panelRound1.setBackground(Color.red);
        } else if ((data1Int >= 17 && data1Int < 20) || (data1Int >= 25 && data1Int <= 28)) {
            panelRound1.setBackground(Color.yellow);
        }

// Configurar colores para humedad (data2Int)
        if (data2Int >= 60 && data2Int <= 75) {
            panelRound2.setBackground(Color.green);
        } else if (data2Int <= 56 || data2Int >= 79) {
            panelRound2.setBackground(Color.red);
        } else if ((data2Int >= 57 && data2Int <= 59) || (data2Int >= 76 && data2Int <= 78)) {
            panelRound2.setBackground(Color.yellow);
        }

    }

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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel Barra;
    private javax.swing.JPanel cerrar;
    private javax.swing.JLabel cerrarTxt;
    private javax.swing.JLabel hum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private Clases.PanelRound panelRound1;
    private Clases.PanelRound panelRound2;
    private javax.swing.JLabel temp;
    // End of variables declaration                   
}
