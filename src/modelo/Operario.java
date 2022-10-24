package modelo;

import excepciones.MesaInexistenteException;
import excepciones.MesaNoDisponibleException;
import excepciones.MozoInexistenteException;
import excepciones.MozoNoDisponibleException;

/**
 * Clase Operario del modelo <br>
 * <b>Invariante: </b><br>
 * - nya debe ser distinto de null.
 * - username debe ser distinto de null.
 * - password debe ser distinto de null.
 */
public class Operario {

   protected String nya;
   protected String username;
   protected String password;
   protected boolean activo;

   public String getNya() {
      return nya;
   }

   public String getUsername() {
      return username;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public boolean isActivo() {
      return activo;
   }

   public void setActivo(boolean activo) {
      this.activo = activo;
   }

   /**
    * Crea un nuevo operario del sistema que permite gestionar mozos, mesas, comandas y pedidos. <br>
    * <b>Pre:</b> Todos los parametros deben ser distintos de null. nya y username deben ser representativos del operario correspondiente.<br>
    * <b>Post:</b> El operario debe ser instanciado de forma que puede ingresar al sistema mediante su username y contrasena pasados por parametro.<br>
     * @param nya : Es el nombre y apellido reales del operario.
    * @param username : Es el nombre de usuario con el cual el operario sera identificado en el sistema. Debe ser unico.
    * @param password : Es la constrasena con la cual el el operario podra iniciar sesion en el sistema y acceder a sus funciones.
    */
   public Operario(String nya, String username, String password) {
      assert nya != null : "El nombre y apellido del operario no puede ser nulo.";
      assert username != null : "El nombre de usuario del operario no puede ser nulo.";
      assert password != null : "La contrasena del operario no puede ser nula.";
      this.nya = nya;
      this.username = username;
      this.password = password;
      this.activo = true;
      this.invariante();
   }

   /**
    * Asigna como estado actual del mozo pasado por parámetro al estado pasado por parámetro.<br>
    * <b>Pre:</b> El parametro nya debe ser distinto de null y el parametro estado debe ser ACTIVO, FRANCO o AUSENTE.<br>
    * <b>Post:</b> El mozo pasado por parametro debera tener el estado pasado por parametro.<br>
    *
    * @param nya : El nombre del mozo al cual se quiere cambiar su estado.
    * @param estado : El estado que se quiere asignar al mozo.
    */
   public void setEstado(String nya, EstadoMozo estado) throws MozoInexistenteException {
      assert nya != null : "El nombre del mozo no puede ser nulo.";
      assert estado != EstadoMozo.ACTIVO && estado != EstadoMozo.FRANCO && estado != EstadoMozo.AUSENTE: "El estado no puede ser distinto de ACTIVO, FRANCO y AUSENTE";
      Cerveceria.getInstance().setEstado(nya, estado);
      this.invariante();
   }

   /**
    * Asigna una mesa pasada por parametro al mozo pasado por parámetro .<br>
    * <b>Pre:</b> El parametro nya debe ser distinto de null y el nro de mesa debe ser mayor o igual que 0.<br>
    * <b>Post:</b> Se agregara una mesa a la lista de mesas del mozo y se marcara la mesa como asignada.<br>
    *
    * @param nya : El mozo al cual se quiere agregar una mesa.
    * @param nroMesa : Numero de mesa a asignarle.
    */
   public void asignarMesa(String nya, int nroMesa) throws MozoInexistenteException, MozoNoDisponibleException, MesaInexistenteException, MesaNoDisponibleException {
      assert nya != null : "El nombre del mozo no puede ser nulo.";
      assert nroMesa >= 0 : "El numero de mesa no puede ser menor a 0.";
      Cerveceria.getInstance().asignarMesa(nya, nroMesa);
      this.invariante();
   }

   /**
    * Cierra la mesa porque los comensales pidieron la cuenta, dejando la mesa libre.<br>
    * <b>Pre: </b> El numero de mesa debe ser mayor o igual que 0.<br>
    * <b>Post: </b> Se cierra la mesa y se deja libre.<br>
    *
    * @param nroMesa : Numero de mesa a cerrar.
    */
    public void cerrarMesa(int nroMesa) throws MesaInexistenteException, MesaNoDisponibleException {
       assert nroMesa >= 0 : "El numero de mesa no puede ser menor a 0.";
       Cerveceria.getInstance().cerrarMesa(nroMesa);
       this.invariante();
    }

   private void invariante() {
      assert this.nya != null : "El nombre y apellido del operario no puede ser null.";
      assert this.username != null : "El username del operario no puede ser null.";
      assert this.password != null : "El password del operario no puede ser null.";
   }

}