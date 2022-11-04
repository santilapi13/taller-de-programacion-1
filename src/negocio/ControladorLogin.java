package negocio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.Serializable;
import java.security.InvalidParameterException;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JOptionPane;

import modelo.*;
import vista.*;

@SuppressWarnings("deprecation")
public class ControladorLogin implements ActionListener, Observer {
	
	private IVistaLogin vista = null;
	private static ControladorLogin instance = null;

	private ControladorLogin() {
		//Cerveceria.getInstance().setUsuarioLogueado(null, null);
		this.vista = new VLogin();
		this.vista.setActionListener(this);
		Cerveceria.getInstance().addObserver(this);
	}
	
	public static ControladorLogin getInstance() {
		if (instance == null)
			instance = new ControladorLogin();
		return instance;
	}

	public IVistaLogin getVista() {
		return vista;
	}

	public void setVista(IVistaLogin vista) {
		this.vista = vista;
		this.vista.setActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (comando.equalsIgnoreCase("Ingresar")) {
			
			String user = this.vista.getUsername();
			String pass = this.vista.getPassword();
			String tipo = this.vista.getTipo();
			Cerveceria.getInstance().loguear(user,pass,tipo);
			
		} 
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o != Cerveceria.getInstance())
			throw new InvalidParameterException();
		if (arg.toString().contentEquals("ADMIN")) {
			this.vista.cerrarse();
			ControladorAdmin.getInstance().setVista(new VAdmin(Cerveceria.getInstance().getAdmin().getUsername()));
		} else if (arg.toString().contentEquals("OPERARIO")) {
			this.vista.cerrarse();
			//ControladorUsuario.getInstance().setVista(new VEmpleado(Agencia.getInstance().getUsuarioLogueado().getUsername()));
		} else if (arg.toString().contentEquals("INCORRECTO"))
			JOptionPane.showMessageDialog(null, "Usuario o contrasena incorrecta");
	}
}