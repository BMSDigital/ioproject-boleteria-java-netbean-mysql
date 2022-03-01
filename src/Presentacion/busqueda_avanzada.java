
package Presentacion;

import Ajustes.Validaciones;
import Datos.vusuario;
import Logica.fusuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class busqueda_avanzada extends javax.swing.JPanel {

   
    public busqueda_avanzada() {
        initComponents();
        mostrar("");
    }
    vusuario dts  = new vusuario();
    fusuario func = new fusuario();
    Validaciones val = new Validaciones();
    
    public void mostrar(String buscar){
        try{
            DefaultTableModel modelo;
            modelo = func.mostrar(buscar, combobusqueda2.getSelectedItem().toString());
            
            tablalistado.setModel(modelo);
            jLabel1.setText("Total de registros " + Integer.toString(func.totalregistros));
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnreporte = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnreporte1 = new javax.swing.JButton();
        horariopanel = new javax.swing.JPanel();
        delinfo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        btbuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        combobusqueda1 = new javax.swing.JComboBox();
        combobusqueda2 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        txtbuscar = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(705, 520));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(705, 520));

        jPanel2.setBackground(new java.awt.Color(255,255,255,50)
        );
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Listado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(605, 440));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(605, 440));

        btnreporte.setBackground(new java.awt.Color(190, 74, 77));
        btnreporte.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnreporte.setForeground(new java.awt.Color(255, 255, 255));
        btnreporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Print_24px.png"))); // NOI18N
        btnreporte.setText("Imprimir Reporte");
        btnreporte.setContentAreaFilled(false);
        btnreporte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnreporte.setOpaque(true);

        btneliminar.setBackground(new java.awt.Color(190, 74, 77));
        btneliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Empty Trash_24px.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.setContentAreaFilled(false);
        btneliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btneliminar.setName("busqueda_eliminar "); // NOI18N
        btneliminar.setOpaque(true);

        btnreporte1.setBackground(new java.awt.Color(190, 74, 77));
        btnreporte1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnreporte1.setForeground(new java.awt.Color(255, 255, 255));
        btnreporte1.setText("Editar");
        btnreporte1.setContentAreaFilled(false);
        btnreporte1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnreporte1.setOpaque(true);
        btnreporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreporte1ActionPerformed(evt);
            }
        });

        horariopanel.setBackground(new java.awt.Color( 255, 255, 255, 75 ));
        horariopanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        horariopanel.setDoubleBuffered(false);

        delinfo.setBackground(new java.awt.Color( 255, 255, 255, 75 ));
        delinfo.setText("Haz Click en la celda donde se encuentra los datos!!");
        delinfo.setOpaque(true);

        tablalistado.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablalistado.setGridColor(new java.awt.Color(204, 204, 204));
        tablalistado.setOpaque(false);
        jScrollPane1.setViewportView(tablalistado);

        javax.swing.GroupLayout horariopanelLayout = new javax.swing.GroupLayout(horariopanel);
        horariopanel.setLayout(horariopanelLayout);
        horariopanelLayout.setHorizontalGroup(
            horariopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(horariopanelLayout.createSequentialGroup()
                .addGroup(horariopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(horariopanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(delinfo))
                    .addGroup(horariopanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        horariopanelLayout.setVerticalGroup(
            horariopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(horariopanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(delinfo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btbuscar.setBackground(new java.awt.Color(255 , 255, 255, 125));
        btbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Search_24px_1.png"))); // NOI18N
        btbuscar.setText("Buscar");
        btbuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btbuscar.setContentAreaFilled(false);
        btbuscar.setDoubleBuffered(true);
        btbuscar.setMaximumSize(new java.awt.Dimension(61, 25));
        btbuscar.setMinimumSize(new java.awt.Dimension(61, 25));
        btbuscar.setOpaque(true);
        btbuscar.setSelected(true);
        btbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btbuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btbuscarMouseExited(evt);
            }
        });
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Fingerprint_24px_1.png"))); // NOI18N
        jLabel1.setText("Registro Total:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true), "BÚSQUEDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 22), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(70, 43));
        jPanel1.setOpaque(false);

        combobusqueda1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        combobusqueda1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Usuario", "Boletos", " " }));
        combobusqueda1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        combobusqueda1.setOpaque(false);

        combobusqueda2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        combobusqueda2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NOMBRE", "APELLIDO", "TELEFONO", "EMAIL", "USUARIO", "NIVEL", "PREVILEGIO" }));
        combobusqueda2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        combobusqueda2.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(combobusqueda1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(combobusqueda2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobusqueda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobusqueda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel3.setOpaque(false);

        txtbuscar.setNextFocusableComponent(btbuscar);
        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(horariopanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnreporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnreporte, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btneliminar)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(horariopanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnreporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnreporte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnreporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreporte1ActionPerformed
       
    }//GEN-LAST:event_btnreporte1ActionPerformed

    private void btbuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbuscarMouseEntered
        val.limpiar1(btbuscar);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btbuscarMouseEntered

    private void btbuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbuscarMouseExited
        val.limpiar2(btbuscar);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btbuscarMouseExited

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
       mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btbuscarActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        txtbuscar.transferFocus();
    }//GEN-LAST:event_txtbuscarActionPerformed
    @Override
    public void paintComponent( java.awt.Graphics g )
    {
        super.paintComponent(g);
        
        if( Egoist.Swing.Animator.isBeingAnimated(this) == false )
            repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnreporte;
    private javax.swing.JButton btnreporte1;
    private javax.swing.JComboBox combobusqueda1;
    private javax.swing.JComboBox combobusqueda2;
    private javax.swing.JLabel delinfo;
    private javax.swing.JPanel horariopanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
