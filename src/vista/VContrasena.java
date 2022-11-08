package vista;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.DayOfWeek;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import modelo.Comanda;
import modelo.EstadoMozo;
import modelo.FormaPago;
import modelo.Mesa;
import modelo.Mozo;
import modelo.Operario;
import modelo.Pedido;
import modelo.Producto;
import modelo.PromoProducto;
import modelo.PromoTemporal;
import modelo.Promocion;
import modelo.Venta;

@SuppressWarnings("serial")
public class VContrasena extends JFrame implements KeyListener, MouseListener, IVistaLogin {

    private JPanel contentPane;
    private JPanel panel;
    private JPanel panel_1;
    private JPanel panel_2;
    private JLabel lblNewLabel;
    private JTextField textActual;
    private JLabel lblNewLabel_1;
    private JButton btnIngresar;
    private JLabel lblNewLabel_2;
    private JPasswordField textPassword;
    private ActionListener actionListener;

    public VContrasena() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 280, 317);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(this.contentPane);

        this.panel = new JPanel();
        this.contentPane.add(this.panel, BorderLayout.CENTER);
        this.panel.setLayout(new GridLayout(1, 0, 0, 0));

        this.panel_2 = new JPanel();
        this.panel.add(this.panel_2);
        this.panel_2.setLayout(new GridLayout(4, 0, 0, 0));

        this.lblNewLabel = new JLabel("ACTUAL");
        this.lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        this.panel_2.add(this.lblNewLabel);

        this.textActual = new JTextField();
        this.textActual.addKeyListener(this);
        this.textActual.setFont(new Font("Tahoma", Font.PLAIN, 15));
        this.panel_2.add(this.textActual);
        this.textActual.setColumns(10);

        this.lblNewLabel_1 = new JLabel("NUEVA");
        this.lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        this.panel_2.add(this.lblNewLabel_1);

        this.textPassword = new JPasswordField();
        this.textPassword.addKeyListener(this);
        this.panel_2.add(this.textPassword);

        this.panel_1 = new JPanel();
        this.contentPane.add(this.panel_1, BorderLayout.SOUTH);
        this.panel_1.setLayout(new GridLayout(1, 0, 0, 0));

        this.btnIngresar = new JButton("APLICAR CAMBIOS");
        this.btnIngresar.setEnabled(true);
        this.btnIngresar.setFont(new Font("Tahoma", Font.BOLD, 12));
        this.panel_1.add(this.btnIngresar);

        this.lblNewLabel_2 = new JLabel("Contrase\u00F1a");
        this.lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 20));
        this.lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        this.contentPane.add(this.lblNewLabel_2, BorderLayout.NORTH);
        this.setVisible(true);
    }

    @Override
    public void setActionListener(ActionListener actionListener) {
        this.btnIngresar.addActionListener(actionListener);
        this.actionListener = actionListener;
    }

    @Override
    public String getUsername() {
        return null;
    }


    @Override
    public String getPassword() {
        return this.textPassword.getText();
    }

    @Override
    public String getTipo() {
        return null;
    }



    @Override
    public void cerrarse() {
        this.dispose();
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void ActualizarListaOperarios(ArrayList<Operario> operarios) {
        // TODO Auto-generated method stub

    }

    @Override
    public String getPasswordActual() {
        return this.textActual.getText();
    }

    @Override
    public String getNya() {
        // TODO Auto-generated method stub
        return null;
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
    public void ActualizarMozos(ArrayList<Mozo> mozos) {
        // TODO Auto-generated method stub

    }

    @Override
    public void ActualizarMesas(ArrayList<Mesa> mesas) {
        // TODO Auto-generated method stub

    }

  
    

    @Override
    public void ActualizarProductos(ArrayList<Producto> productos) {
        // TODO Auto-generated method stub

    }

    @Override
    public int getComensales() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double pCosto() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double pVenta() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int stock() {
        // TODO Auto-generated method stub
        return 0;
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

	@Override
	public boolean getIsOperarioEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getIsMesaEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getIsMozoEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getIsPromocionProdEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getIsPromocionTempEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Operario getOperarioSeleccionado() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mesa getMesaSeleccionada() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mozo getMozoSeleccionado() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PromoProducto getPromocionProdSeleccionada() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PromoTemporal getPromocionTempSeleccionada() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getEstadoOperario() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void ActualizarPromociones(ArrayList<PromoProducto> promocionesProd,
			ArrayList<PromoTemporal> promocionesTem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean is2x1() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCantidad() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getCantMinima() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getpUnitario() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<DayOfWeek> getDias() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FormaPago getFormaPago() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getHoraInicio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHoraFin() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPorcentaje() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isAcumulable() {
		// TODO Auto-generated method stub
		return false;
	}

    @Override
    public void deseleccionarTodo() {

    }

    @Override
	public void ActualizarVentas(ArrayList<Venta> ventas) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ActualizarComandas(ArrayList<Comanda> comandas) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EstadoMozo getEstadoMozo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ActualizarPedidos(ArrayList<Pedido> pedidos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void estadisticas(String s) {
		// TODO Auto-generated method stub
		
	}




}