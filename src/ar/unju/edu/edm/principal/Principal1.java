package ar.unju.edu.edm.principal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import ar.edu.unju.edm.model.Usuario;

public class Principal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		Set<Usuario> userlist = new HashSet<Usuario>();
		userlist.add(new Usuario("luisc17","1234","Luis","Caballero",48391321,"luis@gmail.com","Administrativo"));
		userlist.add(new Usuario("luisc13","1234","Luis","Caballero",483913221,"luiss@gmail.com","Secretario"));
//		ArrayList<Usuario> userlist = new ArrayList<Usuario>();
//		userlist.add(new Usuario("luisc17","Luis","Caballero",48391321,"luis@gmail.com","Administrativo"));
//		userlist.add(new Usuario("luisc1ss7","Lssuis","Cssaballero",48331321,"luaaais@gmail.com","Secretario"));
		for (Usuario usuario: userlist) {
			i++;
			System.out.println("Usuario "+i+" "+usuario);
		}
		String usuario, contraseña;
		boolean band=true;
//		do {
//		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
//		System.out.println("ingrese usuario");
//		usuario=sc.next();
//		System.out.println("ingrese contraseña");
//		contraseña=sc.next();
//		while(band=!true) {
//		for(Usuario usr: userlist) {
//			
//			if(usr.getNombreUsuario()==usuario) {
//				band = false;			
//		}else {
//				band = true;
//		}
//		}
//		}
//		}while(band!=true);
		
		int op=1;
		System.out.println("menu");
		System.out.println("1 Listar todos los datos de los parques naturales ingresando una provincia");
		System.out.println("2 Listar todas las especies (sus atributos) que habitan en el parque seleccionado y mostrar la cantidad por cada especie");
		System.out.println("3 Mostrar todos los parques que tienen más de 10 años de haber sido declarado como parque natural");
		System.out.println("4 Listar todos los organismos ordenados alfabéticamente");
		switch(op) {
		case 1: 
		}
}
}
