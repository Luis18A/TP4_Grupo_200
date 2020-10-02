package ar.unju.edu.edm.principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import ar.edu.unju.edm.model.Administrativo;
import ar.edu.unju.edm.model.Animal;
import ar.edu.unju.edm.model.Especie;
import ar.edu.unju.edm.model.Mineral;
import ar.edu.unju.edm.model.OrganismoProvincial;
import ar.edu.unju.edm.model.ParqueNatural;
import ar.edu.unju.edm.model.Provincia;
import ar.edu.unju.edm.model.Usuario;
import ar.edu.unju.edm.model.Vegetal;

public class Principal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Set<Usuario> userlist = new HashSet<Usuario>();
//		userlist.add(new Usuario("luisc17","1234","Luis","Caballero",48391321,"luis@gmail.com","Administrativo"));
//		userlist.add(new Usuario("luisc13","1234","Luis","Caballero",483913221,"luiss@gmail.com","Secretario"));

		List<Usuario> usuarios = new ArrayList<Usuario>();	
		usuarios.add(new Usuario("iruc","1234","Irupe","Condori",43634443,"irucondori.12@gmail.com","Administrativo"));
		usuarios.add(new Usuario("luisc","12345","Luis","Caballero",48331321,"luisc@gmail.com","Secretario"));
		
//		PROVINCIAS YA CREADAS, SACAR PROBABLEMENTE
//		List<Provincia> provincias = new ArrayList<Provincia>();
//		provincias.add(new Provincia(01,"Jujuy"));
		
		
//		LISTAR LOS USUARIOS
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
			Map<Integer,ParqueNatural> parquesNaturales = new HashMap<Integer,ParqueNatural>();
//			List<ParqueNatural> parquesNaturales = new ArrayList<ParqueNatural>();
			Map<Integer,Especie> especies= new HashMap<Integer,Especie>();
			List<OrganismoProvincial> organismosProvinciales = new ArrayList<OrganismoProvincial>();
			List<Provincia> provincias = new ArrayList<Provincia>();
			
			if(usuarios.get(index).getTipoUsuario()=="Administrativo") {
			int op=0;
				do {
				System.out.println("\n--------------------------------------MENU-------------------------------------");
				System.out.println("1. Registrar una provincia nueva ");
				System.out.println("2. Registrar datos de Organismo Provincial a cargo de un parque");
				System.out.println("3. Registrar un Parque natural");
				System.out.println("4. Registrar especies de Parque natural");
				System.out.println("5. Salir");
				op=sc.nextInt();
				
				switch(op) {
				
				case 1:
						Provincia provNueva= new Provincia();
						System.out.println("Ingrese código de la provincia: ");
						provNueva.setCodProvincia(sc.nextInt());
						System.out.println("Ingrese nombre de la provincia: ");
						provNueva.setNombreProvincia(sc.next());
						provincias.add(provNueva);
						System.out.println("Provincia agregada con éxito!");
						//CONTROLAR SI NO EXISTE YA UNA PROVINCIA POR EL CODIGO
					
					break;
				case 2:
						OrganismoProvincial orgNuevo= new OrganismoProvincial();
						System.out.println("Ingrese el CUIT: ");
						orgNuevo.setCuit(sc.nextLong());
						System.out.println("Ingrese nombre de Organismo Provincial: ");
						orgNuevo.setNombreOrganismo(sc.next());
						System.out.println("Ingrese el nombre del representante titular: ");
						orgNuevo.setRepresentanteTitular(sc.next());
						System.out.println("Ingrese la dirección del Organismo Provincial: ");
						orgNuevo.setDireccion(sc.next());
						System.out.println("Ingrese el telefono: ");
						orgNuevo.setTelefono(sc.nextInt());
						organismosProvinciales.add(orgNuevo);
						System.out.println("Organismo Provincial agregado con éxito!");
						//CONTROLAR SI NO EXISTE YA EL CORGANISMO PROVINCIAL POR EL CUIT, ABAJO YA ESTA HECHO EN EL CASE 3
						
					break;
				case 3: 
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
						System.out.println("Ingrese la ubicación geográfica: ");
						parque.setUbicacionGeografica(sc.next());
						System.out.println("Ingrese código de provincia en la que está ubicada geográficamente el parque: ");
						int codigBuscado = sc.nextInt();
						int h=-1, c=0;
						boolean boo=false;
						for(Provincia pr:provincias) {
							h++;
							if(pr.getCodProvincia()==codigBuscado) {
								boo=true;
								c=h;
							}
						}
						if(boo==true) {
							parque.setProvincia(provincias.get(c));
//							provincias.get(c).getParquesNaturales().add(parque);
						}
						else {
							Provincia prov= new Provincia();
							System.out.println("Ingrese código de la provincia: ");
							prov.setCodProvincia(sc.nextInt());
							System.out.println("Ingrese nombre de la provincia: ");
							prov.setNombreProvincia(sc.next());	
							parque.setProvincia(prov);
							provincias.add(prov);
//							prov.getParquesNaturales().add(parque);
						}
						
						
						System.out.println("Ingrese cuit de Organismo Provincial: ");
						long cuitBuscado = sc.nextLong();
						int j=-1, ind=0;
						boolean bool=false;
						for(OrganismoProvincial orgP:organismosProvinciales) {
							j++;
							if(orgP.getCuit()==cuitBuscado) {
								bool=true;
								ind=j;
							}
						}
						if(bool==true) {
							parque.setNombreOrganismo(organismosProvinciales.get(ind));
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
						parquesNaturales.put(parque.getCodParque(), parque);
						System.out.println("Parque Natural agregado con éxito!");
						System.out.println(parquesNaturales);
						//CONTROLAR SI NO EXISTE YA EL PARQUE NATURAL INGRESADO POR EL CODIGO
					break;
				case 4: 
					//AGREGAR LO DE LAS ESPECIES
					//TENER EN CUENTA QUE ES UN LIST DE ESPECIES PARA UN OBJETO PARQUE QUE ESTA DENTRO DE OTRO LIST DE PARQUES
					int codigoBuscado=0;
					boolean booleano=false;
					System.out.println("Ingrese codigo del parque al que desea agregar especies: ");
					codigoBuscado=sc.nextInt();
					
					Iterator iterator = parquesNaturales.keySet().iterator();
					while(iterator.hasNext() && booleano==false) {
						Integer key = (Integer) iterator.next();
						if(key==codigoBuscado) {
							booleano=true;
						}
					}
					
						if(booleano==true) {
							int opcion=0;
							do {
							System.out.println("1. Vegetal");
							System.out.println("2. Animal");
							System.out.println("3. Mineral");
							System.out.println("4. CANCELAR");
							System.out.println("Ingrese N° de opción según la especie que quiere agregar al "+parquesNaturales.get(codigoBuscado).getNombre());
							opcion=sc.nextInt();
							
							switch(opcion) {
								case 1: 
									Vegetal vegetal = new Vegetal();
									System.out.println("Ingrese código numérico: ");
									int cN= sc.nextInt();
									vegetal.setCodigoNumerico(cN);
									System.out.println("Ingrese denominación científica: ");
									String dC= sc.next();
									vegetal.setDenominacionCientifica(dC);
									System.out.println("Ingrese denominación vulgar: ");
									String dV= sc.next();
									vegetal.setDenominacionVulgar(dV);
									System.out.println("Ingrese tipo de Especie: ");
									String tE= sc.next();
									vegetal.setTipoEspecie(tE);
										boolean ingresado=false;
										while(ingresado==false){
											System.out.println("Ingrese S si tiene floración, ingrese N si no lo tiene: ");
											String fl= sc.next();
											if(fl.equals("S") || fl.equals("s")) {
												ingresado=true;
												vegetal.setFloracion(true);
												System.out.println("Ingrese período de floración: ");
												String periodo= sc.next();
												vegetal.setPeriodoProduccion(periodo);
											}
											else {
												if(fl.equals("N") || fl.equals("n")){
													ingresado=true;
													vegetal.setFloracion(false);
													vegetal.setPeriodoProduccion("No tiene");
												}
											}
										}
										especies.put(vegetal.getCodigoNumerico(), vegetal);
//										System.out.println("Ingrese código del parque al que desea agregar la especie: ");
//										int codigoParqueBuscado= sc.nextInt();
//										boolean bandera=false;
//										
//										Iterator it = parquesNaturales.keySet().iterator();
//										while(it.hasNext() && bandera==false) {
//											Integer key = (Integer) it.next();
//											if(key==codigoParqueBuscado) {
//												bandera=true;
//											}
//										}
										parquesNaturales.get(codigoBuscado).getEspecies().put(vegetal.getCodigoNumerico(), vegetal);
										//ver ACA, VER SI FUNCIONA
										//HACER LO MISMO PARA ANIMAL Y MINERAL
										System.out.println("Especie vegetal agregado con éxito a:"+ parquesNaturales.get(codigoBuscado).getNombre());
										
										Iterator it = parquesNaturales.get(codigoBuscado).getEspecies().keySet().iterator();
										while(it.hasNext()) {
											Integer key = (Integer) it.next();
											System.out.println(parquesNaturales.get(codigoBuscado).getEspecies().get(key));
											}
										System.out.println(parquesNaturales);
									break;
								case 2:
									Animal animal = new Animal();
									break;
								case 3:
									Mineral mineral = new Mineral();
									break;
								case 4: System.out.println("Cancelando...");
									break;
								default: System.out.println("Opción no válida");
									break;
							}
							
							} while(opcion!=4);
							//parquesNaturales.get(cod).getEspecies().ad
							
//							if(parquesNaturales.get(cod).getEspecies().isEmpty()) {
//								System.out.println("esta vacia, agregar");
//							}
//							else {
//								System.out.println("tiene elementos");
//								
//							}
							
							
						}
						else {
							System.out.println("El código no existe");
						}
//						System.out.println("valor: "+ parquesNaturales.get(key));

					
					break;
				case 5: System.out.println("Saliendo...");
					break;
				default: System.out.println("Opcion no válida");
					break;
				}
				}
				while(op!=5);
					
				for(OrganismoProvincial orgP:organismosProvinciales) {
					System.out.println(orgP);
				}
				Iterator it = parquesNaturales.keySet().iterator();
				while(it.hasNext()) {
					Integer key = (Integer) it.next();
					System.out.println("valor: "+ parquesNaturales.get(key));

				}
				
				
			}
		}
		
		else {
			System.out.println("El usuario no existe");
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
