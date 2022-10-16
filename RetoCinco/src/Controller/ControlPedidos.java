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
public class ControlPedidos implements ActionListener {

    PedidosDAO dao = new PedidosDAO();
    Pedidos p = new Pedidos();
    FormularioPrincipal formulario = new FormularioPrincipal();
    DefaultTableModel modelo = new DefaultTableModel();

    public ControlPedidos(FormularioPrincipal fp) {
        this.formulario = fp;
        this.formulario.btnguardarPedido.addActionListener(this);
        this.formulario.btnlistaPedido.addActionListener(this);
        this.formulario.btneditarPedido.addActionListener(this);
        this.formulario.btnEliminarPedido.addActionListener(this);
        this.formulario.btnokPedido.addActionListener(this);
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void actionPerformed(ActionEvent e) {
        //manejo de condicionales para que se active la funcionalidad  de los botones.

        if (e.getSource() == formulario.btnlistaPedido) {
            listarPedidos(formulario.tabla3);
        }

        if (e.getSource() == formulario.btnguardarPedido) {
            agregarPedidos();
            limpiarTablaPedidos();
            listarPedidos(formulario.tabla3);

        }

        if (e.getSource() == formulario.btneditarPedido) {
            int fila = formulario.tabla3.getSelectedRow();//Devuelve el numero de fila seleccionada.
            if (fila == -1) {
                JOptionPane.showMessageDialog(formulario, "Debe seleccionar una fila");
            } else {
                //id_pedido, tipo_pedido, documentoCliente, idProducto, idCuenta, cantidad, valor
                int id_pedido = Integer.parseInt((String) formulario.tabla3.getValueAt(fila, 0).toString());
                String tipo_pedido = (String) formulario.tabla.getValueAt(fila, 1);
                double documentoCliente = Double.parseDouble((String) formulario.tabla.getValueAt(fila, 2).toString());
                int id_producto = Integer.parseInt((String) formulario.tabla3.getValueAt(fila, 3).toString());;
                int id_cuenta = Integer.parseInt((String) formulario.tabla3.getValueAt(fila, 4).toString());;
                int cantidad = Integer.parseInt((String) formulario.tabla3.getValueAt(fila, 5).toString());;
                float valor = Float.parseFloat((String) formulario.tabla2.getValueAt(fila, 6).toString());

                //LLena las cajas de texto.
                formulario.txtidPedido.setText("" + id_pedido);
                formulario.txttipoPedido.setText(tipo_pedido);
                formulario.txtdocumentoCliente2.setText("" + documentoCliente);
                formulario.txtidProducto2.setText("" + id_producto);
                formulario.txtidCuenta2.setText("" + id_cuenta);
                formulario.txtcantidadPedido.setText("" + cantidad);
                formulario.txtvalorPedido.setText("" + valor);

            }
        }
        if (e.getSource() == formulario.btnokPedido) {
            EditarPedidos();
            limpiarTablaPedidos();
            listarPedidos(formulario.tabla3);

        }
        if (e.getSource() == formulario.btnEliminarPedido) {
            int fila = formulario.tabla3.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(formulario, "Debe seleccionar un pedido");
            } else {
                int id_pedido = Integer.parseInt((String) formulario.tabla3.getValueAt(fila, 0).toString());
                dao.deletePedidos(id_pedido);
                JOptionPane.showMessageDialog(formulario, "Pedido Eliminado con éxito");

            }
            limpiarTablaPedidos();
            listarPedidos(formulario.tabla3);
        }
    }

    void limpiarTablaPedidos() {
        for (int i = 0; i < formulario.tabla3.getRowCount(); i++) {//i sera menor a la vista y con getRowCount se cuenta todas las filas de la  tabla.
            modelo.removeRow(i);//Remueve las filas.
            i = i - 1;
        }
    }
    //id_pedido, tipo_pedido, documentoCliente, idProducto, idCuenta, cantidad, valor

    public void listarPedidos(JTable tabla3) {
        modelo = (DefaultTableModel) tabla3.getModel();//Muestra la tabla al ejecutar el proyecto.
        List<Pedidos> lista = dao.ListarPedidos();
        Object[] object = new Object[7];//objectes un arreglo, y ahi está le numero de columnas de la tabla.
        for (int i = 0; i < lista.size(); i++) {//llega hasta el limite de la cantidad de filas de la tabla.
            object[0] = lista.get(i).getId_pedido();
            object[1] = lista.get(i).getTipo_pedido();
            object[2] = lista.get(i).getDocumentoCliente();
            object[3] = lista.get(i).getIdProducto();
            object[4] = lista.get(i).getIdCuenta();
            object[5] = lista.get(i).getCantidad();
            object[6] = lista.get(i).getValor();

            modelo.addRow(object);
        }
        formulario.tabla3.setModel(modelo);

    }

    public void agregarPedidos() {
        //obtener los datos del formulario
        int id_pedido = Integer.parseInt((String) (formulario.txtidPedido.getText().toString()));
        String tipo_pedido = formulario.txttipoPedido.getText();
        int cantidad = Integer.parseInt((String) (formulario.txtcantidadPedido.getText().toString()));
        float valor = Float.parseFloat((String) (formulario.txtvalorPedido.getText().toString()));
        Double documento_cliente = Double.parseDouble(formulario.txtdocumentoCliente2.getText());
        int id_cuenta = Integer.parseInt((String) (formulario.txtidCuenta2.getText().toString()));
        int id_producto = Integer.parseInt((String) (formulario.txtidProducto2.getText().toString()));

        //enviar los datos al DAO
        p.setId_pedido(id_pedido);
        p.setTipo_pedido(tipo_pedido);
        p.setCantidad(cantidad);
        p.setValor(valor);
        p.setDocumentoCliente(documento_cliente);
        p.setIdCuenta(id_cuenta);
        p.setIdProducto(id_producto);

        int r = dao.agregarPedidos(p);
        if (r == 1) {
            JOptionPane.showMessageDialog(formulario, "Pedido creado con exito");
        } else {
            JOptionPane.showMessageDialog(formulario, "Error al crear el Ped");
        }

    }

    public void EditarPedidos() {
        //Recibe los campos.
        int id_pedido = Integer.parseInt((String) (formulario.txtidPedido.getText().toString()));
        String tipo_pedido = formulario.txttipoPedido.getText();
        int cantidad = Integer.parseInt((String) (formulario.txtcantidadPedido.getText().toString()));
        float valor = Float.parseFloat((String) (formulario.txtvalorPedido.getText().toString()));
        Double documento_cliente = Double.parseDouble(formulario.txtdocumentoCliente2.getText());
        int id_cuenta = Integer.parseInt((String) (formulario.txtidCuenta2.getText().toString()));
        int id_producto = Integer.parseInt((String) (formulario.txtidProducto2.getText().toString()));

        //Se envia los datos.
        p.setId_pedido(id_pedido);
        p.setTipo_pedido(tipo_pedido);
        p.setCantidad(cantidad);
        p.setValor(valor);
        p.setDocumentoCliente(documento_cliente);
        p.setIdCuenta(id_cuenta);
        p.setIdProducto(id_producto);
        double r = dao.EditarPedidos(p);
        if (r == 1) {
            JOptionPane.showMessageDialog(formulario, "Pedido Actualizado con éxito");
        } else {
            JOptionPane.showMessageDialog(formulario, "Error");
        }

    }
}
