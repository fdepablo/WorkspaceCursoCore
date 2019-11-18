package main;

import java.util.ArrayList;

import bean.Casa;
import bean.Direcci�n;
import bean.Habitaci�n;
import bean.Persona;

public class TestCasaNatalia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Direcci�n d1 = new Direcci�n("Calle", "Manoteras", "Madrid");
		Persona pers1 = new Persona("Ana", 37, 55, d1);
		Persona pers2 = new Persona("Eva", 48, 55, new Direcci�n("Calle", "Castellana", "Valencia"));
		Persona pers3 = new Persona("Pepe", 25, 55, new Direcci�n("Calle", "Gran V�a", "Barcelona"));

		Direcci�n dir1 = new Direcci�n("Calle", "del Peine", "Salamanca");
		Direcci�n dir2 = new Direcci�n("Calle", "Bravo Murillo", "Zaragoza");
		Direcci�n dir3 = new Direcci�n("Calle", "de la Rambla", "Leon");

		Habitaci�n hab1 = new Habitaci�n();

		hab1.setSuperficie(50);
		hab1.setTipo("salon");

		Habitaci�n hab2 = new Habitaci�n();

		hab2.setSuperficie(35);
		hab2.setTipo("dormitorio1");

		Habitaci�n hab3 = new Habitaci�n();

		hab3.setSuperficie(35);
		hab3.setTipo("dormitorio2");

		Habitaci�n hab4 = new Habitaci�n();

		hab4.setSuperficie(35);
		hab4.setTipo("dormitorio3");

		Habitaci�n hab5 = new Habitaci�n();

		hab5.setSuperficie(35);
		hab5.setTipo("dormitorio4");

		Habitaci�n hab6 = new Habitaci�n();

		hab6.setSuperficie(35);
		hab6.setTipo("dormitorio5");

		Habitaci�n hab7 = new Habitaci�n();

		hab7.setSuperficie(15);
		hab7.setTipo("ba�o1");

		Habitaci�n hab8 = new Habitaci�n();

		hab8.setSuperficie(15);
		hab8.setTipo("ba�o2");

		Habitaci�n hab9 = new Habitaci�n();

		hab9.setSuperficie(25);
		hab9.setTipo("ba�o3");

		Habitaci�n hab10 = new Habitaci�n();

		hab10.setSuperficie(45);
		hab10.setTipo("cocina");

		Habitaci�n hab11 = new Habitaci�n();

		hab11.setSuperficie(200);
		hab11.setTipo("terraza");

		Habitaci�n hab12 = new Habitaci�n();

		hab12.setSuperficie(100);
		hab12.setTipo("garaje");

		ArrayList<Habitaci�n> listaHabitaciones1 = new ArrayList<Habitaci�n>();
		listaHabitaciones1.add(hab1);
		listaHabitaciones1.add(hab2);
		listaHabitaciones1.add(hab3);


		ArrayList<Habitaci�n> listaHabitaciones2 = new ArrayList<Habitaci�n>();
		listaHabitaciones2.add(hab6);
		listaHabitaciones2.add(hab7);
		listaHabitaciones2.add(hab8);
		listaHabitaciones2.add(hab9);


		ArrayList<Habitaci�n> listaHabitaciones3 = new ArrayList<Habitaci�n>();
		listaHabitaciones3.add(hab4);
		listaHabitaciones3.add(hab5);
		listaHabitaciones3.add(hab10);
		listaHabitaciones3.add(hab11);
		listaHabitaciones3.add(hab12);

		Casa casa1 = new Casa(500000, listaHabitaciones1, pers1, dir1);
		Casa casa2 = new Casa(400.000, listaHabitaciones2, pers2, dir2);
		Casa casa3 = new Casa(300.000, listaHabitaciones3, pers3, dir3);

		System.out.println("Casa1 " + casa1);
		System.out.println("Casa2 " + casa2);
		System.out.println("Casa3 " + casa3);

		System.out.println("Fin");

	}

}
