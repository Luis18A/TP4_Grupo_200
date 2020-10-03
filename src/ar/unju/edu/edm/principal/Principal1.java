package ar.unju.edu.edm.principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

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
		
		List<Usuario> usuarios = new ArrayList<Usuario>();	
		usuarios.add(new Usuario("admin","1234","Ariel","Gomez",43634443,"arielG.12@gmail.com","Administrativo"));
		usuarios.add(new Usuario("secret","12345","Juan","Suarez",48331321,"juanS@gmail.com","Secretario"));
		
		Map<Integer,ParqueNatural> parquesNaturales = new HashMap<Integer,ParqueNatural>();
		Map<Integer,Especie> especies= new HashMap<Integer,Especie>();
		List<OrganismoProvincial> organismosProvinciales = new ArrayList<OrganismoProvincial>();
		List<Provincia> provincias = new ArrayList<Provincia>();

		Scanner sc = new Scanner(System.in);
		int op=0;
		do {
		System.out.println("\n---------------------MENU PRINCIPAL---------------------");
		System.out.println("1. Ingresar usuario ");
		System.out.println("2. SALIR");
		System.out.println("\nIngrese opción: ");
		op=sc.nextInt(); 
			switch(op){
			case 1:
				System.out.println("Ingrese nombre de usuario: ");
				String usuarioIngresado = sc.next();
				System.out.println("Ingrese contraseña: ");
				String contrIngresada = sc.next();
				boolean band=false;
				int i=-1, index=0;
				for (Usuario usuario: usuarios){
					i++;
					if (usuario.getNombreUsuario().equals(usuarioIngresado) && usuario.getContraseña().equals(contrIngresada)) {
						band=true;
						index=i;
					}
					
				}	
				if(band==true) {
					if(usuarios.get(index).getTipoUsuario().equalsIgnoreCase("Administrativo")) {
						mostrarMenuAdministrativo(parquesNaturales, especies, organismosProvinciales, provincias);
					}
						
					if(usuarios.get(index).getTipoUsuario().equalsIgnoreCase("Secretario")) {
						mostrarMenuSecretario(parquesNaturales, organismosProvinciales);
					}
				}
				else {
					System.out.println("\nEl usuario no existe o ingresó mal la contraseña!");
				}
				break;
			case 2: System.out.println("\nSaliendo...");
				break;
			default: System.out.println("\nOpción no válida!");
				break;
			}

		}while(op!=2);
	}
	
	
	
	
	
	
	public static void mostrarMenuAdministrativo(Map<Integer,ParqueNatural> parquesNaturales, Map<Integer,Especie> especies, List<OrganismoProvincial> organismosProvinciales,List<Provincia> provincias) {
		Scanner sc= new Scanner(System.in);
		int op=0;
		do {
		System.out.println("\n-------------------------------MENU ADMINISTRATIVO--------------------------------");
		System.out.println("1. Registrar una provincia nueva ");
		System.out.println("2. Registrar datos de Organismo Provincial a cargo de un parque");
		System.out.println("3. Registrar un Parque natural");
		System.out.println("4. Registrar especies de Parque natural");
		System.out.println("5. Salir");
		System.out.println("\nIngrese opción: ");
		op=sc.nextInt();
		
		switch(op) {
		
		case 1:
				Provincia provNueva= new Provincia();
				System.out.println("Ingrese código de la provincia: ");
				int codigoIngresado = sc.nextInt();
				//SE CONTROLA SI NO EXISTE YA UNA PROVINCIA POR EL CODIGO
				int w=-1, x=0;
				boolean ba=false;
				for(Provincia pr:provincias) {
					w++;
					if(pr.getCodProvincia()==codigoIngresado) {
						ba=true;
						x=w;
					}
				}
				if(ba==true) {
					System.out.println("\nLa provincia ya existe!");
				}
				//SE AGREGA PROVINCIA PORQUE NO EXISTE
				else {
					provNueva.setCodProvincia(codigoIngresado);
					System.out.println("Ingrese nombre de la provincia: ");
					provNueva.setNombreProvincia(sc.next());
					provincias.add(provNueva);
					System.out.println("\nProvincia agregada con éxito!");
					
				}											
				
			break;
		case 2:
				OrganismoProvincial orgNuevo= new OrganismoProvincial();
				System.out.println("Ingrese el CUIT: ");
				long cuitIngresado = sc.nextLong();
				//SE CONTROLA SI NO EXISTE YA EL CORGANISMO PROVINCIAL POR EL CUIT
				int y=-1, z=0;
				boolean bander=false;
				for(OrganismoProvincial orgP:organismosProvinciales) {
					y++;
					if(orgP.getCuit()==cuitIngresado) {
						bander=true;
						z=y;
					}
				}
				if(bander==true) {
					System.out.println("\nEl organismo provincial ya existe!");
				}
				//SE AGREGA EL ORGANISMO PORQUE NO EXISTE
				else {
					orgNuevo.setCuit(cuitIngresado);
					System.out.println("Ingrese nombre de Organismo Provincial: ");
					orgNuevo.setNombreOrganismo(sc.next());
					System.out.println("Ingrese el nombre del representante titular: ");
					orgNuevo.setRepresentanteTitular(sc.next());
					System.out.println("Ingrese la dirección del Organismo Provincial: ");
					orgNuevo.setDireccion(sc.next());
					System.out.println("Ingrese el telefono: ");
					orgNuevo.setTelefono(sc.nextInt());
					organismosProvinciales.add(orgNuevo);
					System.out.println("\nOrganismo Provincial agregado con éxito!");
				}	
			break;
		case 3: 
				ParqueNatural parque = new ParqueNatural();
				System.out.println("Ingrese código del parque: ");
				int codigoParqueIngresado = sc.nextInt();
				
				Iterator iterato = parquesNaturales.keySet().iterator();
				boolean ban=false;
				while(iterato.hasNext() && ban==false) {
					Integer key = (Integer) iterato.next();
					if(key==codigoParqueIngresado) {
						ban=true;
					}
				}
				if(ban==true) {
					System.out.println("\nEl parque ya existe!");
				}
				else {
				parque.setCodParque(codigoParqueIngresado);
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
				int codigIngresado = sc.nextInt();
				int h=-1, c=0;
				boolean boo=false;
				for(Provincia pr:provincias) {
					h++;
					if(pr.getCodProvincia()==codigIngresado) {
						boo=true;
						c=h;
					}
				}
				if(boo==true) {
					parque.setProvincia(provincias.get(c));
				}
				else {
					Provincia prov= new Provincia();
					prov.setCodProvincia(codigIngresado);
					System.out.println("Ingrese nombre de la provincia: ");
					prov.setNombreProvincia(sc.next());	
					parque.setProvincia(prov);
					provincias.add(prov);
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
				System.out.println("\nParque Natural agregado con éxito!");
				}
			break;
		case 4: 
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
					System.out.println("\n---------------TIPOS DE ESPECIES-----------");
					System.out.println("1. Vegetal");
					System.out.println("2. Animal");
					System.out.println("3. Mineral");
					System.out.println("4. CANCELAR");
					System.out.println("\nIngrese N° de opción según la especie que quiere agregar al "+parquesNaturales.get(codigoBuscado).getNombre()+":");
					opcion=sc.nextInt();
					
					switch(opcion) {
						case 1: 
							Vegetal vegetal = new Vegetal();
							System.out.println("Ingrese código numérico: ");
							vegetal.setCodigoNumerico(sc.nextInt());
							System.out.println("Ingrese denominación científica: ");
							vegetal.setDenominacionCientifica(sc.next());
							System.out.println("Ingrese denominación vulgar: ");
							vegetal.setDenominacionVulgar(sc.next());
							System.out.println("Ingrese tipo de Especie: ");
							vegetal.setTipoEspecie(sc.next());
								boolean bienIngresado=false;
								while(bienIngresado==false){
									System.out.println("Ingrese S si tiene floración, ingrese N si no lo tiene: ");
									String fl= sc.next();
									if(fl.equals("S") || fl.equals("s")) {
										bienIngresado=true;
										vegetal.setFloracion(true);
										System.out.println("Ingrese período de floración: ");
										vegetal.setPeriodoProduccion(sc.next());
									}
									else {
										if(fl.equals("N") || fl.equals("n")){
											bienIngresado=true;
											vegetal.setFloracion(false);
											vegetal.setPeriodoProduccion("No tiene");
										}
									}
								}
								especies.put(vegetal.getCodigoNumerico(), vegetal);
								parquesNaturales.get(codigoBuscado).getEspecies().put(vegetal.getCodigoNumerico(), vegetal);
								System.out.println("\nEspecie vegetal agregado con éxito a:"+ parquesNaturales.get(codigoBuscado).getNombre());
//								LO SIG IMPRIME LAS ESPECIES
//								Iterator it = parquesNaturales.get(codigoBuscado).getEspecies().keySet().iterator();
//								while(it.hasNext()) {
//									Integer key = (Integer) it.next();
//									System.out.println(parquesNaturales.get(codigoBuscado).getEspecies().get(key));
//									}
							break;
						case 2:
							Animal animal = new Animal();
							System.out.println("Ingrese código numérico: ");
							animal.setCodigoNumerico(sc.nextInt());
							System.out.println("Ingrese denominación científica: ");
							animal.setDenominacionCientifica(sc.next());
							System.out.println("Ingrese denominación vulgar: ");
							animal.setDenominacionVulgar(sc.next());
							System.out.println("Ingrese tipo de Especie: ");
							animal.setTipoEspecie(sc.next());
							System.out.println("Ingrese tipo de alimentación: ");
							animal.setTipoAlimentacion(sc.next());
							System.out.println("Ingrese período de celo: ");
							animal.setPeriodosCelo(sc.next());
							boolean bienIng= false;
							while(bienIng==false) {
								System.out.println("Ingrese S si está en peligro de extinción, ingrese N si no lo está: ");
								String pExt= sc.next();
								if(pExt.equals("S") || pExt.equals("s")) {
									bienIng=true;
									animal.setPeligroExtincion(true);
								}
								else {
									if(pExt.equals("N") || pExt.equals("n")) {
										bienIng=true;
										animal.setPeligroExtincion(false);
									}
								}
								
							}
							especies.put(animal.getCodigoNumerico(), animal);
							parquesNaturales.get(codigoBuscado).getEspecies().put(animal.getCodigoNumerico(), animal);
							System.out.println("\nEspecie animal agregado con éxito a "+ parquesNaturales.get(codigoBuscado).getNombre());
							break;
						case 3:
							Mineral mineral = new Mineral();
							System.out.println("Ingrese código numérico: ");
							mineral.setCodigoNumerico(sc.nextInt());
							System.out.println("Ingrese denominación científica: ");
							mineral.setDenominacionCientifica(sc.next());
							System.out.println("Ingrese denominación vulgar: ");
							mineral.setDenominacionVulgar(sc.next());
							System.out.println("Ingrese tipo de Especie: ");
							mineral.setTipoEspecie(sc.next());
							System.out.println("Ingrese el tipo de mineral: ");
							mineral.setTipoMineral(sc.next());
							especies.put(mineral.getCodigoNumerico(), mineral);
							parquesNaturales.get(codigoBuscado).getEspecies().put(mineral.getCodigoNumerico(), mineral);
							System.out.println("\nEspecie mineral agregado con éxito a "+ parquesNaturales.get(codigoBuscado).getNombre());		
							break;
						case 4: System.out.println("\nCancelando...");
							break;
						default: System.out.println("\nOpción no válida");
							break;
					}	
					} while(opcion!=4);
				}
				else {
					System.out.println("\nEl código no existe!");
				}
			break;
		case 5: System.out.println("\nSaliendo...");
			break;
		default: System.out.println("\nOpcion no válida");
			break;
		}
		}while(op!=5);
		
	}
	
	
	
	
	
	
	public static void mostrarMenuSecretario(Map<Integer,ParqueNatural> parquesNaturales,List<OrganismoProvincial>organismosProvinciales) {
			int op=0; Scanner sc = new Scanner(System.in);
			do {
			System.out.println("\n-----------------------------------MENU SECRETARIO-------------------------------");
			System.out.println("1. Listar todos los datos de los parques naturales ingresando una provincia");
			System.out.println("2. Listar todas las especies (sus atributos) que habitan en el parque seleccionado y mostrar la cantidad por cada especie");
			System.out.println("3. Mostrar todos los parques que tienen más de 10 años de haber sido declarado como parque natural");
			System.out.println("4. Listar todos los organismos ordenados alfabéticamente");
			System.out.println("5. Salir");
			System.out.println("\nIngrese opción: ");
			op=sc.nextInt();
			switch(op) {
			case 1: 			
				if(parquesNaturales.isEmpty()) {	
					System.out.println("\nNo hay ningún parque natural cargado!");				
				}else {	
					System.out.println("Ingrese nombre de provincia: ");
					String aux;
					aux= sc.next();
					Iterator it = parquesNaturales.keySet().iterator();
					while(it.hasNext()) {
						Integer key = (Integer) it.next();
						if(parquesNaturales.get(key).getProvincia().getNombreProvincia().equalsIgnoreCase(aux)) {
							System.out.println(parquesNaturales.get(key));
						}
					}
					
				}
			break;
			case 2: 
				if(parquesNaturales.isEmpty()){
					System.out.println("\nNo hay parques naturales cargados!");
				}
				else {
					System.out.println("Ingrese código del parque: ");		
					int codigoIng= sc.nextInt();
					boolean b=false;
					int A=0,M=0,V=0;
					Iterator it = parquesNaturales.keySet().iterator();
					while(it.hasNext() && b==false) {
						Integer key = (Integer) it.next();
						if(parquesNaturales.get(key).getCodParque()==codigoIng) {
							b=true;
						}
					}
					if(b==true) {
						System.out.println("Especies del "+parquesNaturales.get(codigoIng).getNombre());
						
						Iterator iter = parquesNaturales.get(codigoIng).getEspecies().keySet().iterator();
						while(iter.hasNext()) {
							Integer key = (Integer) iter.next();
							Especie especie = parquesNaturales.get(codigoIng).getEspecies().get(key);
							System.out.println(especie);
							if(especie instanceof Animal) {
								A++;
							}
							else {
								if(especie instanceof Vegetal) {
									V++;
								}
								else {
									M++;
								}
							}
						}
						System.out.println("Cantidad de especies Animales = "+A);
						System.out.println("Cantidad de especies Vegetales = "+V);
						System.out.println("Cantidad de especies Minerales= "+M);
					}
					else {
						System.out.println("\nNo existe el código ingresado!");
					}
				}
				break;
			case 3: 
				parquesNaturales.entrySet().stream().filter(p -> p.getValue().calcularAnios()>=10).forEach(System.out::println);
				break;
			case 4:
				if(organismosProvinciales.isEmpty()) {
					System.out.println("\nNo hay organismos provinciales agregados!");
				}
				else {
					organismosProvinciales.stream().sorted(Comparator.comparing(OrganismoProvincial :: getNombreOrganismo)).forEach(System.out::println);;
				}
				break;
			case 5:
				System.out.println("Saliendo...");
				break;
			default: System.out.println("Opcion no valida");
				break;
			}
			} while(op!=5);
			
		}	
		
			
}
