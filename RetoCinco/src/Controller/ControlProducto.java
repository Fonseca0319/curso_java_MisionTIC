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
public class ControlProducto implements ActionListener {

    ProductoDAO dao = new ProductoDAO();
    Producto pr = new Producto();
    FormularioPrincipal formulario = new FormularioPrincipal();
    DefaultTableModel modelo = new DefaultTableModel();

    public ControlProducto(FormularioPrincipal fp) {
        this.formulario = fp;
        this.formulario.btnguardarProducto.addActionListener(this);
        this.formulario.btnlistarProducto.addActionListener(this);
        this.formulario.btneditarProducto.addActionListener(this);
        this.formulario.btnEliminarProducto.addActionListener(this);
        this.formulario.btnokProducto.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //manejo de condicionales para que se active la funcionalidad  de los botones.
        if (e.getSource() == formulario.btnguardarProducto) {
            agregarProducto();
        }
        if (e.getSource() == formulario.btnlistarProducto) {
            listarProducto(formulario.tabla2);
        }

        if (e.getSource() == formulario.btneditarProducto) {
            int fila = formulario.tabla2.getSelectedRow();//Devuelve el numero de fila seleccionada.
            if (fila == -1) {
                JOptionPane.showMessageDialog(formulario, "Debe seleccionar una fila");
            } else {
                int id_producto = Integer.parseInt((String) formulario.tabla2.getValueAt(fila, 0).toString());//Asi se muestra en las cajas de texto todos los datos que contiene la persona seleccioanda.
                String nombre_producto = (String) formulario.tabla2.getValueAt(fila, 1);
                int cantidad_producto = Integer.parseInt((String) formulario.tabla2.getValueAt(fila, 2).toString());
                float precio = Float.parseFloat((String) formulario.tabla2.getValueAt(fila, 3).toString());
               
                //LLena las cajas de texto.
                formulario.txtidProducto.setText("" + id_producto);
                formulario.txtnombreProducto.setText(nombre_producto);
                formulario.txtcantidadProducto.setText(""+cantidad_producto);
                formulario.txtprecioProducto.setText("" + precio);
              

            }
        }
        if (e.getSource() == formulario.btnokProducto) {
                EditarProducto();
                limpiarTablaProducto();
                listarProducto(formulario.tabla2);

            }
            if (e.getSource() == formulario.btnEliminarProducto) {
                int fila = formulario.tabla2.getSelectedRow();
                if (fila == -1) {
                    JOptionPane.showMessageDialog(formulario, "Debe seleccionar una persona");
                } else {
                    int id_producto = Integer.parseInt((String) formulario.tabla2.getValueAt(fila, 0).toString());
                    dao.deleteProducto(id_producto);
                    JOptionPane.showMessageDialog(formulario, "Persona Eliminada con éxito");

                }
                limpiarTablaProducto();
                listarProducto(formulario.tabla2);
            }
    }

    void limpiarTablaProducto() {
        for (int i = 0; i < formulario.tabla2.getRowCount(); i++) {//i sera menor a la vista y con getRowCount se cuenta todas las filas de la  tabla.
            modelo.removeRow(i);//Remueve las filas.
            i = i - 1;
        }
        }
    
 public void listarProducto(JTable tabla2) {
        modelo = (DefaultTableModel) tabla2.getModel();//Muestra la tabla al ejecutar el proyecto.
        List<Producto> lista = dao.ListarProducto();
        Object[] object = new Object[5];//objectes un arreglo, y ahi está le numero de columnas de la tabla.
        for (int i = 0; i < lista.size(); i++) {//llega hasta el limite de la cantidad de filas de la tabla.
            object[0] = lista.get(i).getId_producto();
            object[1] = lista.get(i).getNombre_producto();
            object[2] = lista.get(i).getCantidad_producto();
            object[3] = lista.get(i).getPrecio();
        
            modelo.addRow(object);
        }
        formulario.tabla2.setModel(modelo);

    }



    public void agregarProducto() {
        //obtener los datos del formulario
        int id_producto = Integer.parseInt(formulario.txtidProducto.getText());
        String nombre_producto = formulario.txtnombreProducto.getText();
        int canridad_producto = Integer.parseInt(formulario.txtcantidadProducto.getText());
        int precio = Integer.parseInt(formulario.txtprecioProducto.getText());
      
      

        //enviar los datos al DAO
        pr.setId_producto(id_producto);
        pr.setNombre_producto(nombre_producto);
        pr.setCantidad_producto(canridad_producto);
        pr.setPrecio(precio);
       

        int r = dao.agregarProducto(pr);
        if (r == 1) {
            JOptionPane.showMessageDialog(formulario, "Producto creado con exito");
        } else {
            JOptionPane.showMessageDialog(formulario, "Error al crear el Producto");
        }

    }

    public void EditarProducto() {
        //Recibe los campos.
         int id_producto = Integer.parseInt(formulario.txtidProducto.getText());
        String nombre_producto = formulario.txtnombreProducto.getText();
        int canridad_producto = Integer.parseInt(formulario.txtcantidadProducto.getText());
        int precio = Integer.parseInt(formulario.txtprecioProducto.getText());
      
      

        //enviar los datos al DAO
        pr.setId_producto(id_producto);
        pr.setNombre_producto(nombre_producto);
        pr.setCantidad_producto(canridad_producto);
        pr.setPrecio(precio);
        Double r = dao.EditarProducto(pr);
        if (r == 1) {
            JOptionPane.showMessageDialog(formulario, "Usuario Actualizado con éxito");
        } else {
            JOptionPane.showMessageDialog(formulario, "Error");
        }

    }
}