package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import negocio.Sistema;
import presentacion.IVistaLogin;
import presentacion.InterfazOptionPanel;
import presentacion.MiOptionPane;
import presentacion.VLogin;

public class ControladorLogin implements ActionListener{

	private IVistaLogin vista = null;
	private static ControladorLogin instance = null;
	

	private ControladorLogin() {
		Sistema.getInstance().setOpLogueado(null);
		this.vista = new VLogin();
		this.vista.setActionListener(this);
	}
	
	public static ControladorLogin getInstance() {
		if (instance == null)
			instance = new ControladorLogin();
		return instance;
	}
	
	
	 public ControladorLogin(VLogin ventana) {    //Metodo para test
		Sistema.getInstance().setOpLogueado(null);
		instance = null;
		this.vista = ventana;
		this.vista.setActionListener(this);
	}
	

	public IVistaLogin getVista() {
		return vista;
	}

	
	public void setVista(IVistaLogin vista) {
		this.vista = vista;
		this.vista.setActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) { //lanzar Excepciones?
		String comando = e.getActionCommand();
		if (comando.equalsIgnoreCase("Ingresar")) {
			String user = this.vista.getUsername();
			String pass = this.vista.getPassword();
			Sistema.getInstance().loguear(user,pass);
		}
	}
}
