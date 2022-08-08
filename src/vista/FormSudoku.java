package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import modelo.Sudoku;

public class FormSudoku extends javax.swing.JFrame {

    public static TableroSudoku tableroSudoku;
    private TableroNumeros tableroNumeros;
    private FromNiveles fromNiveles;
    private boolean estadoCrear;

    private int xPos;
    private int yPos;

    public FormSudoku() {
        initComponents();
        iniciarComponentes();
        panelFondo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }

    public void iniciarComponentes() {
        tableroSudoku = new TableroSudoku();
        tableroSudoku.setTxtAltura(36);
        tableroSudoku.setTxtAncho(36);
        tableroSudoku.setTxtMargen(4);
        tableroSudoku.setTxtTamañoLetra(27);

        tableroSudoku.setPanelBackground(new Color(89, 43, 25));

        tableroSudoku.setTxtBackground1(Color.WHITE);
        tableroSudoku.setTxtForeground1(new Color(153, 1, 1));
        tableroSudoku.setTxtBackground2(new Color(232, 186, 186));
        tableroSudoku.setTxtForeground2(Color.BLACK);
        tableroSudoku.setTxtBackground3(new Color(203, 102, 102));
        tableroSudoku.setTxtForeground3(Color.WHITE);
        tableroSudoku.setTxtBackground4(new Color(238, 227, 227));
        tableroSudoku.setTxtForeground4(Color.BLACK);

        panelFondo.add(tableroSudoku);
        tableroSudoku.setLocation(70, 60);
        tableroSudoku.setVisible(true);
        tableroSudoku.crearSudoku();

        tableroNumeros = new TableroNumeros();
        tableroNumeros.setTxtAncho(36);
        tableroNumeros.setTxtAltura(36);
        tableroNumeros.setTxtMargen(4);
        tableroNumeros.setTxtTamañoLetra(27);
        tableroNumeros.setPanelBackground(new Color(89, 43, 25));
        tableroNumeros.setTxtBackground1(new Color(239, 229, 216));
        tableroNumeros.setTxtForeground1(new Color(89, 43, 25));
        tableroNumeros.setTxtBackground2(new Color(143, 72, 72));
        tableroNumeros.setTxtForeground2(Color.WHITE);
        panelFondo.add(tableroNumeros);
        tableroNumeros.crearTablero();
        tableroNumeros.setLocation(20, 60);
        tableroNumeros.setVisible(true);

        tableroSudoku.generarSudoku(2);
        estadoCrear = true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelNuevaPartida = new javax.swing.JPanel();
        lblNuevaPartida = new javax.swing.JLabel();
        panelLimpiar = new javax.swing.JPanel();
        lblLimpiar = new javax.swing.JLabel();
        panelCrear = new javax.swing.JPanel();
        lblCrear = new javax.swing.JLabel();
        panelComprobar = new javax.swing.JPanel();
        lblComprobar = new javax.swing.JLabel();
        panelResolver = new javax.swing.JPanel();
        lblResolver = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(203, 102, 102));
        panelFondo.setPreferredSize(new java.awt.Dimension(540, 420));
        panelFondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelFondoMouseDragged(evt);
            }
        });
        panelFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelFondoMousePressed(evt);
            }
        });
        panelFondo.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SUDOKU");
        panelFondo.add(jLabel1);
        jLabel1.setBounds(20, 30, 120, 20);

        panelNuevaPartida.setBackground(new java.awt.Color(89, 43, 25));

        lblNuevaPartida.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblNuevaPartida.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevaPartida.setText("    NUEVA PARTIDA");
        lblNuevaPartida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNuevaPartida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNuevaPartidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNuevaPartidaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblNuevaPartidaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelNuevaPartidaLayout = new javax.swing.GroupLayout(panelNuevaPartida);
        panelNuevaPartida.setLayout(panelNuevaPartidaLayout);
        panelNuevaPartidaLayout.setHorizontalGroup(
            panelNuevaPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNuevaPartidaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblNuevaPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelNuevaPartidaLayout.setVerticalGroup(
            panelNuevaPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNuevaPartidaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblNuevaPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelNuevaPartida);
        panelNuevaPartida.setBounds(420, 60, 150, 40);

        panelLimpiar.setBackground(new java.awt.Color(89, 43, 25));

        lblLimpiar.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        lblLimpiar.setText("            LIMPIAR");
        lblLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLimpiarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLimpiarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelLimpiarLayout = new javax.swing.GroupLayout(panelLimpiar);
        panelLimpiar.setLayout(panelLimpiarLayout);
        panelLimpiarLayout.setHorizontalGroup(
            panelLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLimpiarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelLimpiarLayout.setVerticalGroup(
            panelLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLimpiarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelLimpiar);
        panelLimpiar.setBounds(420, 120, 150, 40);

        panelCrear.setBackground(new java.awt.Color(89, 43, 25));

        lblCrear.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblCrear.setForeground(new java.awt.Color(255, 255, 255));
        lblCrear.setText("              CREAR");
        lblCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCrearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCrearMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCrearMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelCrearLayout = new javax.swing.GroupLayout(panelCrear);
        panelCrear.setLayout(panelCrearLayout);
        panelCrearLayout.setHorizontalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelCrearLayout.setVerticalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelCrear);
        panelCrear.setBounds(420, 180, 150, 40);

        panelComprobar.setBackground(new java.awt.Color(89, 43, 25));

        lblComprobar.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblComprobar.setForeground(new java.awt.Color(255, 255, 255));
        lblComprobar.setText("       COMPROBAR");
        lblComprobar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblComprobar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblComprobarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblComprobarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblComprobarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelComprobarLayout = new javax.swing.GroupLayout(panelComprobar);
        panelComprobar.setLayout(panelComprobarLayout);
        panelComprobarLayout.setHorizontalGroup(
            panelComprobarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelComprobarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelComprobarLayout.setVerticalGroup(
            panelComprobarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelComprobarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelComprobar);
        panelComprobar.setBounds(420, 240, 150, 40);

        panelResolver.setBackground(new java.awt.Color(89, 43, 25));

        lblResolver.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblResolver.setForeground(new java.awt.Color(255, 255, 255));
        lblResolver.setText("         RESOLVER");
        lblResolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblResolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblResolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblResolverMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblResolverMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelResolverLayout = new javax.swing.GroupLayout(panelResolver);
        panelResolver.setLayout(panelResolverLayout);
        panelResolverLayout.setHorizontalGroup(
            panelResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResolverLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelResolverLayout.setVerticalGroup(
            panelResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResolverLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelResolver);
        panelResolver.setBounds(420, 300, 150, 40);

        jLabel2.setBackground(new java.awt.Color(89, 43, 25));
        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(89, 43, 25));
        jLabel2.setText("x");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        panelFondo.add(jLabel2);
        jLabel2.setBounds(550, 0, 30, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblNuevaPartidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevaPartidaMousePressed
        if (fromNiveles != null) {
            fromNiveles.setVisible(true);
        } else {
            fromNiveles = new FromNiveles(tableroSudoku);
            fromNiveles.setVisible(true);
        }
    }//GEN-LAST:event_lblNuevaPartidaMousePressed

    private void lblLimpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimpiarMousePressed
        tableroSudoku.limpiar();
    }//GEN-LAST:event_lblLimpiarMousePressed

    private void lblCrearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrearMousePressed

        if (estadoCrear) {
            lblNuevaPartida.setVisible(false);
            lblLimpiar.setVisible(false);
            lblComprobar.setVisible(false);
            lblResolver.setVisible(false);
            estadoCrear = false;
            tableroSudoku.limpiarTxt();
            lblCrear.setText("              LISTO");

        } else {
            if (tableroSudoku.crearSudokuPersonalizado()) {
                lblNuevaPartida.setVisible(true);
                lblLimpiar.setVisible(true);
                lblComprobar.setVisible(true);
                lblResolver.setVisible(true);
                estadoCrear = true;
                lblCrear.setText("              CREAR");
            }

        }

    }//GEN-LAST:event_lblCrearMousePressed

    private void lblComprobarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprobarMousePressed
        tableroSudoku.comprobar();
    }//GEN-LAST:event_lblComprobarMousePressed

    private void panelFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMousePressed

        xPos = evt.getX();
        yPos = evt.getY();
    }//GEN-LAST:event_panelFondoMousePressed

    private void panelFondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMouseDragged
        this.setLocation(evt.getXOnScreen() - xPos, evt.getYOnScreen() - yPos);
    }//GEN-LAST:event_panelFondoMouseDragged

    private void lblResolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResolverMousePressed
        tableroSudoku.resolver();
    }//GEN-LAST:event_lblResolverMousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel2MousePressed

    private void lblNuevaPartidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevaPartidaMouseEntered
        panelNuevaPartida.setBackground(new Color(143, 72, 72));
    }//GEN-LAST:event_lblNuevaPartidaMouseEntered

    private void lblNuevaPartidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevaPartidaMouseExited
        panelNuevaPartida.setBackground(new Color(89,43,25));
    }//GEN-LAST:event_lblNuevaPartidaMouseExited

    private void lblLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimpiarMouseEntered
        panelLimpiar.setBackground(new Color(143, 72, 72));
    }//GEN-LAST:event_lblLimpiarMouseEntered

    private void lblLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimpiarMouseExited
        panelLimpiar.setBackground(new Color(89,43,25));
    }//GEN-LAST:event_lblLimpiarMouseExited

    private void lblCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrearMouseEntered
        panelCrear.setBackground(new Color(143, 72, 72));
    }//GEN-LAST:event_lblCrearMouseEntered

    private void lblCrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrearMouseExited
       panelCrear.setBackground(new Color(89,43,25));
    }//GEN-LAST:event_lblCrearMouseExited

    private void lblComprobarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprobarMouseEntered
       panelComprobar.setBackground(new Color(143, 72, 72));
    }//GEN-LAST:event_lblComprobarMouseEntered

    private void lblComprobarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprobarMouseExited
         panelComprobar.setBackground(new Color(89,43,25));
    }//GEN-LAST:event_lblComprobarMouseExited

    private void lblResolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResolverMouseEntered
         panelResolver.setBackground(new Color(143, 72, 72));
    }//GEN-LAST:event_lblResolverMouseEntered

    private void lblResolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResolverMouseExited
            panelResolver.setBackground(new Color(89,43,25));
    }//GEN-LAST:event_lblResolverMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblComprobar;
    private javax.swing.JLabel lblCrear;
    private javax.swing.JLabel lblLimpiar;
    private javax.swing.JLabel lblNuevaPartida;
    private javax.swing.JLabel lblResolver;
    private javax.swing.JPanel panelComprobar;
    private javax.swing.JPanel panelCrear;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelLimpiar;
    private javax.swing.JPanel panelNuevaPartida;
    private javax.swing.JPanel panelResolver;
    // End of variables declaration//GEN-END:variables

}
