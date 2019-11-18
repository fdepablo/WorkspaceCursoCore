package bean;

import java.util.ArrayList;

public class Casa {
	
	private double precio;
	private ArrayList <Habitaci�n> listaHabitaciones;
	private Persona propietario;
	private Direcci�n direcci�n;
	
	
	public Casa(double precio, ArrayList<Habitaci�n> listaHabitaciones, Persona propietario, Direcci�n direcci�n) {
		super();
		this.precio = precio;
		this.listaHabitaciones = listaHabitaciones;
		this.propietario = propietario;
		this.direcci�n = direcci�n;
	}
	public Casa() {
		super();
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public ArrayList<Habitaci�n> getListaHabitaciones() {
		return listaHabitaciones;
	}
	public void setlistaHabitaciones(ArrayList<Habitaci�n> listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}
	public Persona getPropietario() {
		return propietario;
	}
	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}
	public Direcci�n getDirecci�n() {
		return direcci�n;
	}
	public void setDirecci�n(Direcci�n direcci�n) {
		this.direcci�n = direcci�n;
	}
	@Override
	public String toString() {
		return "Casa [precio = " + precio + " Euros " + ", \n propietario = " + propietario
				+ ", \n direcci�n = " + direcci�n +  ", \n listaHabitaciones =" + listaHabitaciones + "]";
	}
	
	
	

	
	}

	
	
	
	


