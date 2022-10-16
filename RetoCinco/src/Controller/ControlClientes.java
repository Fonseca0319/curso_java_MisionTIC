package Controller;

import Class.*;
import View.FormularioPrincipal;
import Model.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Usuario
 */
public class ControlClientes implements ActionListener {

    ClientesDAO dao = new ClientesDAO();
    Clientes c = new Clientes();
    FormularioPrincipal formulario = new FormularioPrincipal();
    DefaultTableModel modelo = new DefaultTableModel();
    ControlClientes cr;

    public ControlClientes(FormularioPrincipal fp) {
        this.formulario = fp;
        this.formulario.btnguardarCliente.addActionListener(this);
        this.formulario.btnlistar.addActionListener(this);
        this.formulario.btneditarCliente.addActionListener(this);
        this.formulario.btnEliminarCliente.addActionListener(this);
        this.formulario.btnok.addActionListener(this);
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //manejo de condicionales para que se active la funcionalidad  de los botones.
        if (e.getSource() == formulario.btnguardarCliente) {
            agregarCliente();
        }
        if (e.getSource() == formulario.btnlistar) {
            listar(formulario.tabla);
        }

        if (e.getSource() == formulario.btneditarCliente) {
            int fila = formulario.tabla.getSelectedRow();//Devuelve el numero de fila seleccionada.
            if (fila == -1) {
                JOptionPane.showMessageDialog(formulario, "Debe seleccionar una fila");
            } else {
                double documento = Double.parseDouble((String) formulario.tabla.getValueAt(fila, 0).toString());//Asi se muestra en las cajas de texto todos los datos que contiene la persona seleccioanda.
                String nombre = (String) formulario.tabla.getValueAt(fila, 1);
                String direccion = (String) formulario.tabla.getValueAt(fila, 2);
                double telefono = Double.parseDouble((String) formulario.tabla.getValueAt(fila, 3).toString());
                String email = (String) formulario.tabla.getValueAt(fila, 4);
                //LLena las cajas de texto.
                formulario.txtdocumento.setText("" + documento);
                formulario.txtnombre.setText(nombre);
                formulario.txtdireccion.setText(direccion);
                formulario.txttelefono.setText("" + telefono);
                formulario.txtemail.setText("" + email);

            }
        }
        if (e.getSource() == formulario.btnok) {
            Editar();
            limpiarTabla();
            listar(formulario.tabla);

        }
        if (e.getSource() == formulario.btnEliminarCliente) {
            int fila = formulario.tabla.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(formulario, "Debe seleccionar un cliente");
            } else {
                double documento = Double.parseDouble((String) formulario.tabla.getValueAt(fila, 0).toString());
                dao.delete(documento);
                JOptionPane.showMessageDialog(formulario, "Cliente Eliminada con éxito");

            }
            limpiarTabla();
            listar(formulario.tabla);
        }
    }

    void limpiarTabla() {
        for (int i = 0; i < formulario.tabla.getRowCount(); i++) {//i sera menor a la vista y con getRowCount se cuenta todas las filas de la  tabla.
            modelo.removeRow(i);//Remueve las filas.
            i = i - 1;
        }
    }

    public void listar(JTable tabla) {
        modelo = (DefaultTableModel) tabla.getModel();//Muestra la tabla al ejecutar el proyecto.
        List<Clientes> lista = dao.Listar();
        Object[] object = new Object[5];//objectes un arreglo, y ahi está le numero de columnas de la tabla.
        for (int i = 0; i < lista.size(); i++) {//llega hasta el limite de la cantidad de filas de la tabla.
            object[0] = lista.get(i).getDocumento();
            object[1] = lista.get(i).getNombre();
            object[2] = lista.get(i).getDireccion();
            object[3] = lista.get(i).getTelefono();
            object[4] = lista.get(i).getEmail();
            modelo.addRow(object);
        }
        formulario.tabla.setModel(modelo);

    }

    public void agregarCliente() {
        //obtener los datos del formulario
        Double documento = Double.parseDouble(formulario.txtdocumento.getText());
        String nombre = formulario.txtnombre.getText();
        String direccion = formulario.txtdireccion.getText();
        Double telefono = Double.parseDouble(formulario.txttelefono.getText());
        String email = formulario.txtemail.getText();

        //enviar los datos al DAO
        c.setDocumento(documento);
        c.setNombre(nombre);
        c.setDireccion(direccion);
        c.setTelefono(telefono);
        c.setEmail(email);

        int r = dao.agregarCliente(c);
        if (r == 1) {
            JOptionPane.showMessageDialog(formulario, "Cliente creado con exito");
        } else {
            JOptionPane.showMessageDialog(formulario, "Error al crear el cliente");
        }

    }

    public void Editar() {
        //Recibe los campos.
        double documento = Double.parseDouble(formulario.txtdocumento.getText());
        String nombre = formulario.txtnombre.getText();
        String direccion = formulario.txtdireccion.getText();
        double telefono = Double.parseDouble(formulario.txtdocumento.getText());
        String email = formulario.txtemail.getText();

        //Se envia los datos.
        c.setDocumento(documento);
        c.setNombre(nombre);
        c.setDireccion(direccion);
        c.setTelefono(telefono);
        c.setEmail(email);
        double r = dao.Editar(c);
        if (r == 1) {
            JOptionPane.showMessageDialog(formulario, "Usuario Actualizado con éxito");
        } else {
            JOptionPane.showMessageDialog(formulario, "Error");
        }

    }

    

    public LinkedList<reporteComprasClientes> comprasClientes() {
        LinkedList<reporteComprasClientes> report = this.comprasClientes();
        return report;
    }

}
