/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadjdbc;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author USUARIO]]
 */
public class Formulario extends JFrame {
    
    private JPanel contentPane; // area de trabajo
    private JTextField tf1; // descripcion del articulo
    private JTextField tf2; // precio del articulo
    private JLabel labelResultado;
    private JButton btnConsultaPorCdigo;
    private JLabel lblIngreseCdigoDe;
    private JTextField tf3; //consulta de codigo;
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EventQueue.invokeLater(new Runnable(){
        public void run(){
            try{
                Formulario frame = new Formulario();
                frame.setVisible(true);
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    });
    }
    public Formulario(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 606, 405);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel lblDescripcinDelArtculo = new JLabel("Descripción del artículo:"); // JLABEL
    lblDescripcinDelArtculo.setBounds(23, 38, 193, 14);
    contentPane.add(lblDescripcinDelArtculo);
    
    tf1 = new JTextField(); // JTEXTFIELD DESCRIPCION
    tf1.setBounds(247, 35, 193, 20);
    contentPane.add(tf1);
    tf1.setColumns(10);
    
    JLabel lblPrecio = new JLabel("Precio:");// JLABEL
    lblPrecio.setBounds(23, 74, 95, 14);
    contentPane.add(lblPrecio);
    
    tf2 = new JTextField();// JTEXTFIELD PRECIO
    tf2.setBounds(247, 71, 107, 20);
    contentPane.add(tf2);
    tf2.setColumns(10);
    
    JButton btnAlta= new JButton("Alta");
    btnAlta.addActionListener(new ActionListener(){
        
        public void actionPerformed(ActionEvent arg){
            labelResultado.setText("");
            try{
                /*
                conexion con la base datos lo implementamos en una sola linea 
                */
  Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/clasejdbc","root","");
  Statement comando = conexion.createStatement();
  comando.executeUpdate("insert into articulos (descripcion, precio) values ('"+tf1.getText()+"','"+tf2.getText()+"')");
  conexion.close();
  labelResultado.setText("Se registraron los datos");
  tf1.setText("");
  tf2.setText("");
            } catch(SQLException ex){
                setTitle(ex.toString());
            }
        }
    });
    btnAlta.setBounds(247,118,89,24);
    contentPane.add(btnAlta);
    
    labelResultado = new JLabel("Resultado");
    labelResultado.setBounds(360, 122, 230, 15);
    contentPane.add(labelResultado);
    
    btnConsultaPorCdigo = new JButton("Consulta por código");
    btnConsultaPorCdigo.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        labelResultado.setText("");
        tf1.setText("");
        tf2.setText("");        
        try {
  Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/clasejdbc","root","");
  Statement comando = conexion.createStatement();
  ResultSet registro = comando.executeQuery("select * from articulos where codigo="+tf3.getText());
    
            if (registro.next()== true) {
                tf1.setText(registro.getString("descripcion"));
                tf2.setText(registro.getString("precio"));
            } else{
                labelResultado.setText("No existe en la base de datos");
            }
            conexion.close();
    }catch(SQLException ex){
        setTitle(ex.toString());
    }
}
    });
    btnConsultaPorCdigo.setBounds(23, 212, 177, 23);
    contentPane.add(btnConsultaPorCdigo);
    
    lblIngreseCdigoDe = new JLabel("Ingrese código de articulo a consultar:");
    lblIngreseCdigoDe.setBounds(10, 179, 243, 14);
    contentPane.add(lblIngreseCdigoDe);
    
    tf3 = new JTextField();
    tf3.setBounds(247, 176, 86, 20);
    contentPane.add(tf3);
    tf3.setColumns(10);
    
    JButton btnBorrar = new JButton("Borrar");
    btnBorrar.addActionListener(new ActionListener(){
      
        public void actionPerformed(ActionEvent arg0){
            labelResultado.setText("");
            try{
  Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/clasejdbc","root","");
  Statement comando = conexion.createStatement();
  int cantidad = comando.executeUpdate("DELETE FROM articulos WHERE codigo="+tf3.getText());
                if (cantidad == 1) {
                    tf1.setText("");
                    tf2.setText("");
                    tf3.setText("");
                    labelResultado.setText("Se borro el articulo con dicho codigo");
                } else{
                    labelResultado.setText("No existe un articulo con dicho codigo");
                }
                conexion.close();
            } catch(SQLException ex){
                setTitle(ex.toString());
            }
        }
    });
    /*
    btnAlta.setBounds(247,118,89,24);
   btnConsultaPorCdigo.setBounds(23, 212, 177, 23);

    */
    btnBorrar.setBounds(24, 156, 177, 23);
    contentPane.add(btnBorrar);
    
    
    JButton btnModificar = new JButton("Modificar");
    btnModificar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        labelResultado.setText("");
        try {
          Connection conexion=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/clasejdbc","root","");
          Statement comando=conexion.createStatement();
          int cantidad = comando.executeUpdate("UPDATE articulos SET descripcion='"+tf1.getText()+"',"+"precio="+tf2.getText()+" where codigo="+tf3.getText());
          
            if (cantidad == 1) {
                labelResultado.setText("Se actualizo la descripcion y el precio");
            } else{
                labelResultado.setText("No existe un articulo con el codigo ingresado");
            }
            conexion.close();
    } catch(SQLException ex){
        setTitle(ex.toString());
    }
    }
    });
    btnModificar.setBounds(21, 190, 179, 23);
    contentPane.add(btnModificar);
    
    }
    private void cargarDriver(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch(Exception ex){
            setTitle(ex.toString());
        }
    }
}
    
      
