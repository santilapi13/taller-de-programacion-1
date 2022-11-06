package vista;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Mesa;
import modelo.Mozo;
import modelo.Operario;
import modelo.Producto;
import modelo.Promocion;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;
import java.awt.Color;

public class VProducto extends JFrame implements IVistaLogin{

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private JTextField textNombre;
	private JLabel lblNewLabel_2;
	private JTextField textCosto;
	private JLabel lblNewLabel_3;
	private JButton btnAPLICAR;
	private JTextField textVenta;
	private JLabel lblNewLabel_4;
	private JTextField textFieldStock;

	/**
	 * Create the frame.
	 */
	public VProducto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 383, 467);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(this.contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 0));
		
		this.lblNewLabel = new JLabel("PRODUCTO");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		this.lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		this.contentPane.add(this.lblNewLabel, BorderLayout.NORTH);
		
		this.panel = new JPanel();
		this.contentPane.add(this.panel, BorderLayout.CENTER);
		this.panel.setLayout(new GridLayout(9, 0, 0, 0));
		
		this.lblNewLabel_1 = new JLabel("Nombre");
		this.lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel.add(this.lblNewLabel_1);
		
		this.textNombre = new JTextField();
		this.panel.add(this.textNombre);
		this.textNombre.setColumns(10);
		
		this.lblNewLabel_2 = new JLabel("Precio de costo");
		this.lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel.add(this.lblNewLabel_2);
		
		this.textCosto = new JTextField();
		this.panel.add(this.textCosto);
		this.textCosto.setColumns(10);
		
		this.lblNewLabel_3 = new JLabel("Precio de venta");
		this.lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel.add(this.lblNewLabel_3);
		
		this.textVenta = new JTextField();
		this.panel.add(this.textVenta);
		this.textVenta.setColumns(10);
		
		this.lblNewLabel_4 = new JLabel("Stock");
		this.lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel.add(this.lblNewLabel_4);
		
		textFieldStock = new JTextField();
		panel.add(textFieldStock);
		textFieldStock.setColumns(10);
		
		this.btnAPLICAR = new JButton("ACEPTAR");
		this.btnAPLICAR.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.panel.add(this.btnAPLICAR);
		
		this.setVisible(true);
	}

	@Override
	public void setActionListener(ActionListener actionListener) {
		this.btnAPLICAR.addActionListener(actionListener);
		
	}

	@Override
	public void cerrarse() {
		this.dispose();
		
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPasswordActual() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNya() {
		return this.textNombre.getText();
	}

	@Override
	public int getHijos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String fecha() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getComensales() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double pCosto() {
		return Double.parseDouble(this.textCosto.getText());
	}

	@Override
	public double pVenta() {
		return Double.parseDouble(this.textVenta.getText());
		
	}

	@Override
	public int stock() {
		String text = this.textFieldStock.getText();
		return Integer.parseInt(text);
	}

	@Override
	public void ActualizarListaOperarios(ArrayList<Operario> operarios) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ActualizarMozos(ArrayList<Mozo> mozos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ActualizarMesas(ArrayList<Mesa> mesas) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ActualizarPromociones(ArrayList<Promocion> promociones) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ActualizarProductos(ArrayList<Producto> productos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getIsProductoEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Producto getProdSeleccionado() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}