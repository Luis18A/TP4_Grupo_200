package ar.unju.edu.edm.principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import ar.edu.unju.edm.model.Administrativo;
import ar.edu.unju.edm.model.OrganismoProvincial;
import ar.edu.unju.edm.model.ParqueNatural;
import ar.edu.unju.edm.model.Usuario;

public class Principal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Set<Usuario> userlist = new HashSet<Usuario>();
//		userlist.add(new Usuario("luisc17","1234","Luis","Caballero",48391321,"luis@gmail.com","Administrativo"));
//		userlist.add(new Usuario("luisc13","1234","Luis","Caballero",483913221,"luiss@gmail.com","Secretario"));

		List<Usuario> usuarios = new ArrayList<Usuario>();	
		usuarios.add(new Administrativo("iruc","1234","Irupe","Condori",43634443,"irucondori.12@gmail.com","Administrativo"));
		usuarios.add(new Usuario("luisc","12345","Luis","Caballero",48331321,"luisc@gmail.com","Secretario"));
		
//		int i=0;
//		for (Usuario usuario: usuarios) {
//			i++;
//			System.out.println("Usuario "+i+" "+usuario);
//		}
		
		System.out.println("Ingrese usuario: ");
		Scanner sc = new Scanner(System.in);
		String usuarioIngresado = sc.next();
		boolean band=false;
		int i=-1, index=0;
		for (Usuario usuario: usuarios){
			i++;
			if (usuario.getNombreUsuario().equals(usuarioIngresado)) {
				band=true;
				index=i;
			}
			
		}	
		if(band==true) {
			if(usuarios.get(index).getTipoUsuario()=="Secretario") {

				
				int op=0;
				System.out.println("--------------------------------------MENU-------------------------------------");
				System.out.println("1. Listar todos los datos de los parques naturales ingresando una provincia");
				System.out.println("2. Listar todas las especies (sus atributos) que habitan en el parque seleccionado y mostrar la cantidad por cada especie");
				System.out.println("3. Mostrar todos los parques que tienen más de 10 años de haber sido declarado como parque natural");
				System.out.println("4. Listar todos los organismos ordenados alfabéticamente");
				op=sc.nextInt();
				
				switch(op) {
				case 1: 
					break;
				case 2: 
					break;
				case 3: 
					break;
				case 4:
					break;
				default: System.out.println("Opcion no valida");
					break;
				}
				
								
			}
			
			List<ParqueNatural> parquesNaturales = new ArrayList<ParqueNatural>();
			List<OrganismoProvincial> organismosProvinciales = new ArrayList<OrganismoProvincial>();
			
			if(usuarios.get(index).getTipoUsuario()=="Administrativo") {
			int op=0;
				do {
				System.out.println("\n--------------------------------------MENU-------------------------------------");
				System.out.println("1. Registrar datos de Organismo Provincial a cargo de un parque");
				System.out.println("2. Registrar un Parque natural");
				System.out.println("3. Registrar especies de Parque natural");
				System.out.println("4. Salir");
				op=sc.nextInt();
				
				switch(op) {
				case 1:
						OrganismoProvincial orgNuevo= new OrganismoProvincial();
						System.out.println("Ingrese nombre de Organismo Provincial: ");
						orgNuevo.setNombreOrganismo(sc.next());
						System.out.println("Ingrese el CUIT: ");
						orgNuevo.setCuit(sc.nextLong());
						System.out.println("Ingrese el nombre del representante titular: ");
						orgNuevo.setRepresentanteTitular(sc.next());
						System.out.println("Ingrese la dirección del Organismo Provincial: ");
						orgNuevo.setDireccion(sc.next());
						System.out.println("Ingrese el telefono: ");
						orgNuevo.setTelefono(sc.nextInt());
						organismosProvinciales.add(orgNuevo);
						System.out.println("Organismo Provincial agregado con éxito!");
						
					break;
				case 2: 
						ParqueNatural parque = new ParqueNatural();
						System.out.println("Ingrese código del parque: ");
						parque.setCodParque(sc.nextInt());
						System.out.println("Ingrese Nombre del parque: ");
						parque.setNombre(sc.next());
						int dia;
						int mes;
						int anio;
						System.out.println("Ingrese día de declaración como parque natural: ");
						dia=sc.nextInt();
						System.out.println("Ingrese mes de declaración como parque natural: ");
						mes=sc.nextInt();
						System.out.println("Ingrese año de declaración como parque natural: ");
						anio=sc.nextInt();
						LocalDate fechaDec = LocalDate.of(anio,mes,dia);
						parque.setFechaDeclaracion(fechaDec);
						System.out.println("Ingrese extensión del parque: ");
						parque.setExtension(sc.nextInt());
						System.out.println("Ingrese ubicación geográfica (provincia) del parque: ");
						parque.setUbicacionGeografica(sc.next());
						System.out.println("Ingrese cuit de Organismo Provincial: ");
						long cuitBuscado = sc.nextLong();
						int j=-1, ind;
						boolean bool=false;
						for(OrganismoProvincial orgP:organismosProvinciales) {
							j++;
							if(orgP.getCuit()==cuitBuscado) {
								bool=true;
								ind=j;
							}
						}
						if(bool==true) {
							parque.setNombreOrganismo(organismosProvinciales.get(j));
						}
						else {
							OrganismoProvincial orgProv = new OrganismoProvincial();
							orgProv.setCuit(cuitBuscado);
							System.out.println("Ingrese nombre de Organismo Provincial: ");
							orgProv.setNombreOrganismo(sc.next());
							System.out.println("Ingrese el nombre del representante titular: ");
							orgProv.setRepresentanteTitular(sc.next());
							System.out.println("Ingrese la dirección del Organismo Provincial: ");
							orgProv.setDireccion(sc.next());
							System.out.println("Ingrese el telefono: ");
							orgProv.setTelefono(sc.nextInt());
							organismosProvinciales.add(orgProv);
							parque.setNombreOrganismo(orgProv);
						}
						parquesNaturales.add(parque);
						System.out.println("Parque Natural agregado con éxito!");
						
					break;
				case 3: 
					//AGREGAR LO DE LAS ESPECIES
					//TENER EN CUENTA QUE ES UN LIST DE ESPECIES PARA UN OBJETO PARQUE QUE ESTA DENTRO DE OTRO LIST DE PARQUES
					
					break;
				case 4: System.out.println("Saliendo...");
					break;
				default: System.out.println("Opcion no valida");
					break;
				}
				}
				while(op!=4);
					
				for(OrganismoProvincial orgP:organismosProvinciales) {
					System.out.println(orgP);
				}
				for(ParqueNatural parqueN:parquesNaturales) {
					System.out.println(parqueN);
				}
				
			}
		}
		
		
		
		
//		String usuario, contraseña;
//		boolean band=true;
//		do {
//		Scanner sc = new Scanner(System.in);
//		Scanner sc1 = new Scanner(System.in);
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
		
//		int op=1;
//		System.out.println("menu");
//		System.out.println("1 Listar todos los datos de los parques naturales ingresando una provincia");
//		System.out.println("2 Listar todas las especies (sus atributos) que habitan en el parque seleccionado y mostrar la cantidad por cada especie");
//		System.out.println("3 Mostrar todos los parques que tienen más de 10 años de haber sido declarado como parque natural");
//		System.out.println("4 Listar todos los organismos ordenados alfabéticamente");
//		switch(op) {
//		case 1: 
//		}
}
}
