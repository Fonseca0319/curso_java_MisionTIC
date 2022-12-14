/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Classes.*;
import Controller.ControlClientes;
import java.awt.BorderLayout;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author USUARIO
 */
public class frmPet extends javax.swing.JFrame {

    ControlClientes Clientes;
    LinkedList<Clientes> ClienteObjectList = new LinkedList<>();

    /**
     * Creates new form frmPet
     */
    public frmPet() {
        initComponents();
        this.Clientes = new ControlClientes();
        this.ClienteObjectList = Clientes.ListaCliente("preferencial");
        
        this.ReportesCompras();
    }
    
    private void ReportesCompras(){
        LinkedList<ReportesClientes> report = Clientes.ListaCompraDeClientes();
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (ReportesClientes record : report) {
            dataset.setValue(record.getNombre(), record.getCanridad());
        }
        JFreeChart chart = ChartFactory.createPieChart("Compra de Nuestros Clientes", dataset, true, true, true);
        ChartPanel panel = new ChartPanel(chart);
        panel.setMouseWheelEnabled(true);
        jpReportByHealthStatus.setLayout(new java.awt.BorderLayout());
        jpReportByHealthStatus.add(panel, BorderLayout.CENTER);
        jpReportByHealthStatus.validate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clienList = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        txtDocumento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnguardarCliente = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        btneditarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        txtdireccion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtidCuenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtbanco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtsaldo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtdocumentoCliente = new javax.swing.JTextField();
        btnguardarCuenta = new javax.swing.JButton();
        btnBuscarCuenta = new javax.swing.JButton();
        btnEditarCuenta = new javax.swing.JButton();
        btnEliminarCuenta = new javax.swing.JButton();
        jpReportByHealthStatus = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        clienList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Pet 1", "Pet 2", "Pet 3" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(clienList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Lista", jPanel1);

        jLabel8.setText("Documento");

        jLabel9.setText("Direccion");

        jLabel10.setText("Email");

        jLabel11.setText("Nombre");

        jLabel12.setText("Telefono");

        btnguardarCliente.setText("Guardar");
        btnguardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarClienteActionPerformed(evt);
            }
        });

        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btneditarCliente.setText("Editar");
        btneditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setText("Eliminar");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(btnguardarCliente)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarCliente)
                .addGap(18, 18, 18)
                .addComponent(btneditarCliente)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarCliente)
                .addGap(113, 113, 113))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(34, 34, 34)
                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(1, 1, 1)
                        .addComponent(txtnombre))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtemail)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardarCliente)
                    .addComponent(btnBuscarCliente)
                    .addComponent(btneditarCliente)
                    .addComponent(btnEliminarCliente))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Clientes", jPanel4);

        jLabel2.setText("ID_Cuenta");

        jLabel3.setText("Banco");

        jLabel4.setText("Saldo");

        txtsaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsaldoActionPerformed(evt);
            }
        });

        jLabel5.setText("Documento Cliente");

        btnguardarCuenta.setText("Guardar");

        btnBuscarCuenta.setText("Buscar");

        btnEditarCuenta.setText("Editar");

        btnEliminarCuenta.setText("Eliminar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtidCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdocumentoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(txtbanco))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnguardarCuenta)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarCuenta)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarCuenta)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarCuenta)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtidCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtbanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtdocumentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardarCuenta)
                    .addComponent(btnBuscarCuenta)
                    .addComponent(btnEditarCuenta)
                    .addComponent(btnEliminarCuenta))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cuentas", jPanel2);

        javax.swing.GroupLayout jpReportByHealthStatusLayout = new javax.swing.GroupLayout(jpReportByHealthStatus);
        jpReportByHealthStatus.setLayout(jpReportByHealthStatusLayout);
        jpReportByHealthStatusLayout.setHorizontalGroup(
            jpReportByHealthStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );
        jpReportByHealthStatusLayout.setVerticalGroup(
            jpReportByHealthStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 263, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Reporte Grafica", jpReportByHealthStatus);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarClienteActionPerformed
        // JOptionPane.showMessageDialog(this, "Esto es una prueba desde crear perro");
        try {
            double documento = Double.parseDouble((String) txtDocumento.getText());
            String nombre = txtnombre.getText();
            String direccion = txtdireccion.getText();
            double telefono = Double.parseDouble((String) txttelefono.getText());
            String email = txtemail.getText();
         

            if (nombre.equals("") || direccion.equals("")  || email.equals("")) {
                JOptionPane.showMessageDialog(this, "Fill all fields");
            } else {
                Clientes cliente = new Clientes(documento, nombre, direccion, telefono, email);
                Clientes.CreateCliente(cliente);
//dogObjectList.add(dog);
                this.FillJlist();
                this.clearCliente();
                JOptionPane.showMessageDialog(this, "The record has been saved");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please add a valid born year");
        }
    }//GEN-LAST:event_btnguardarClienteActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        double documento = Double.parseDouble((String) txtDocumento.getText());
        Clientes cliente = (Clientes) Clientes.BuscarCliente(documento, "preferencial");
        if (cliente == null) {
            JOptionPane.showMessageDialog(this, "Code not found");
        } else {
            txtDocumento.setText(cliente.getDocumento() + "");
            txtnombre.setText(cliente.getNombre());
            txtdireccion.setText(cliente.getDireccion());
            txtemail.setText(cliente.getEmail());
            txttelefono.setText(cliente.getTelefono() + "");
            
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btneditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarClienteActionPerformed
       double documento = Double.parseDouble((String) txtDocumento.getText());
            String nombre = txtnombre.getText();
            String direccion = txtdireccion.getText();
            double telefono = Double.parseDouble((String) txttelefono.getText());
            String email = txtemail.getText();
        try {
            int document = Integer.parseInt(txtDocumento.getText());
            Clientes cliente = new Clientes(documento, nombre, direccion, telefono, email);
            boolean response = Clientes.EditCliente(cliente);
            if(response){
                this.clearCliente();
                JOptionPane.showMessageDialog(this, "Record updated");
            }else{
                JOptionPane.showMessageDialog(this, "Error updating the record");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "You have to search the record to update");
        }
    }//GEN-LAST:event_btneditarClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        double documento = Double.parseDouble((String) txtDocumento.getText());
        boolean found = false;
        
        if (!found) {
            JOptionPane.showMessageDialog(this, "Code not found");
        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void txtsaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsaldoActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void clearCliente() {
        txtDocumento.setText("");
        txtnombre.setText("");
        txtdireccion.setText("");
        txtemail.setText("");
        txttelefono.setText("");
       
    }

   

    private void FillJlist() {
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        for (Clientes cliente : ClienteObjectList) {
            String data = cliente.getNombre() + " - " + cliente.getTipoCLiente() + " - Preferencial";
            model.add(index, data);
            index++;
        }
        clienList.setModel(model);
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
            java.util.logging.Logger.getLogger(frmPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarCuenta;
    private javax.swing.JButton btnEditarCuenta;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarCuenta;
    private javax.swing.JButton btneditarCliente;
    private javax.swing.JButton btnguardarCliente;
    private javax.swing.JButton btnguardarCuenta;
    private javax.swing.JList<String> clienList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpReportByHealthStatus;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtbanco;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdocumentoCliente;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtidCuenta;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtsaldo;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
