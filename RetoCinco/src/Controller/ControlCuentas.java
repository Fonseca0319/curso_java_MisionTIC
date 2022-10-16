/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Class.*;
import View.FormularioPrincipal;
import Model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ControlCuentas implements ActionListener {

    CuentasDAO dao = new CuentasDAO();
    Cuentas c1 = new Cuentas();
    FormularioPrincipal formulario = new FormularioPrincipal();
    DefaultTableModel modelo = new DefaultTableModel();

    public ControlCuentas(FormularioPrincipal fp) {
        this.formulario = fp;
        this.formulario.btnguardarCuenta.addActionListener(this);
        this.formulario.btnlistarCuenta.addActionListener(this);
        this.formulario.btneditarCuenta.addActionListener(this);
        this.formulario.btnEliminarCuenta.addActionListener(this);
        this.formulario.btnokCuenta.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //manejo de condicionales para que se active la funcionalidad  de los botones.
        if (e.getSource() == formulario.btnguardarCuenta) {
             agregarCuenta();
        }
        if (e.getSource() == formulario.btnlistarCuenta) {
            listarCuenta(formulario.tabla1);
        }

        if (e.getSource() == formulario.btneditarCuenta) {
            int fila = formulario.tabla1.getSelectedRow();//Devuelve el numero de fila seleccionada.
            if (fila == -1) {
                JOptionPane.showMessageDialog(formulario, "Debe seleccionar una fila");
            } else {
                int id_cuenta =Integer.parseInt((String)formulario.tabla1.getValueAt(fila,0).toString());//Asi se muestra en las cajas de texto todos los datos que contiene la persona seleccioanda.
                String banco = (String) formulario.tabla1.getValueAt(fila, 1);
                double saldo =  Double.parseDouble((String) formulario.tabla1.getValueAt(fila, 2).toString());;
                double documento = Double.parseDouble((String) formulario.tabla1.getValueAt(fila, 3).toString());
               
                //LLena las cajas de texto.
                formulario.txtidCuenta.setText("" + id_cuenta);
                formulario.txtbanco.setText(banco);
                formulario.txtsaldo.setText(""+saldo);
                formulario.txtdocumentoCliente.setText("" + documento);
               

            }
        }
        if (e.getSource() == formulario.btnokCuenta) {
                EditarCuenta();
                limpiarTablaCuenta();
                listarCuenta(formulario.tabla1);

            }
            if (e.getSource() == formulario.btnEliminarCuenta) {
                int fila = formulario.tabla1.getSelectedRow();
                if (fila == -1) {
                    JOptionPane.showMessageDialog(formulario, "Debe seleccionar una persona");
                } else {
                    int id_cuenta = Integer.parseInt((String) formulario.tabla1.getValueAt(fila, 0).toString());
                    dao.deleteCuenta(id_cuenta);
                    JOptionPane.showMessageDialog(formulario, "Persona Eliminada con éxito");

                }
                limpiarTablaCuenta();
                listarCuenta(formulario.tabla1);
            }
    }

    void limpiarTablaCuenta() {
        for (int i = 0; i < formulario.tabla1.getRowCount(); i++) {//i sera menor a la vista y con getRowCount se cuenta todas las filas de la  tabla.
            modelo.removeRow(i);//Remueve las filas.
            i = i - 1;
        }
        }
    
 public void listarCuenta(JTable tabla1) {
        modelo = (DefaultTableModel) tabla1.getModel();//Muestra la tabla al ejecutar el proyecto.
        List<Cuentas> listaCuenta = dao.ListarCuentas();
        Object[] object = new Object[4];//objectes un arreglo, y ahi está le numero de columnas de la tabla.
        for (int i = 0; i < listaCuenta.size(); i++) {//llega hasta el limite de la cantidad de filas de la tabla.
            object[0] = listaCuenta.get(i).getId_cuenta();
            object[1] = listaCuenta.get(i).getBanco();
            object[2] = listaCuenta.get(i).getSaldo();
            object[3] = listaCuenta.get(i).getDocumento();
          
            modelo.addRow(object);
        }
        formulario.tabla1.setModel(modelo);

    }



    public void agregarCuenta() {
        //obtener los datos del formulario
        int idCuenta = Integer.parseInt(formulario.txtidCuenta.getText());
        String banco = formulario.txtbanco.getText();
        double saldo = Double.parseDouble(formulario.txtsaldo.getText());
        double documento = Double.parseDouble(formulario.txtdocumentoCliente.getText());
    

        //enviar los datos al DAO
        c1.setId_cuenta(idCuenta);
        c1.setBanco(banco);
        c1.setSaldo(saldo);
        c1.setDocumento(documento);
        
        int r = dao.agregarCuenta(c1);
        if (r == 1) {
            JOptionPane.showMessageDialog(formulario, "Cuenta agregada con exito");
        } else {
            JOptionPane.showMessageDialog(formulario, "Error al agregar la cuenta");
        }

    }

    public void EditarCuenta() {
        //Recibe los campos.
        int id_cuenta = Integer.parseInt(formulario.txtidCuenta.getText());
        String banco = formulario.txtbanco.getText();
        double saldo = Double.parseDouble(formulario.txtsaldo.getText());
        double documento = Double.parseDouble(formulario.txtdocumentoCliente.getText());

        //Se envia los datos.
        c1.setId_cuenta(id_cuenta);
        c1.setBanco(banco);
        c1.setSaldo(saldo);
        c1.setDocumento(documento);
        double r = dao.EditarCuenta(c1);
        if (r == 1) {
            JOptionPane.showMessageDialog(formulario, "Cuenta Actualizado con éxito");
        } else {
            JOptionPane.showMessageDialog(formulario, "Error");
        }

    }
}
