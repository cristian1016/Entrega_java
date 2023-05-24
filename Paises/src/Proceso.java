import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Proceso {
	
	String ciudad, pais;
	
	HashMap<String, ArrayList<String>> mapciudades = new HashMap<>();
	ArrayList<String> paisesCiudades;

	
	public void menu () {
		
		int opcion = 0;
		
		do {
			
		
		opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea consultar?\n"
				+ "1 - Registrar paises y ciudades\n"
				+ "2 - Guardar e imprimir\n" 
				+ "3 - Consultar pais y ciudades asociadas"));
		
		switch (opcion) {
		case 1:
			registrarPaises();
			break;
			
		case 2: 
			imprimirDatos();
			break;
		case 3:
			consultarPais();
			break;
		default:
			System.out.println("Opcion incorrecta");
			break;
		}
		
		} while (opcion != 4);
	}


	public void imprimirDatos() {
		
		System.out.println("Registro exitoso");
		
		System.out.println(mapciudades);
		
		for (String pais:mapciudades.keySet()) {
			
			System.out.println(pais + " - " + mapciudades.get(pais));
		}

		
	}


	public void registrarPaises() {
		
		String opcion;
		
		paisesCiudades = new ArrayList<>();
		
		do {
			
		
		pais = JOptionPane.showInputDialog("Ingrese el pais que desea registrar");
		
		registrarCiudades();
		
		opcion = JOptionPane.showInputDialog("¿Desea agregar otro pais?\n"
				+ "Si - No");
		
		
		paisesCiudades.add(ciudad);
		mapciudades.put(pais, paisesCiudades);
				
		
		} while (opcion.equalsIgnoreCase("si"));
		
	}
	
	private void registrarCiudades() {
		String opcion = "";
		
				do {
			
				ciudad = JOptionPane.showInputDialog("Ingrese la ciudad que desea agregar");
				
				opcion = JOptionPane.showInputDialog("¿Desea agregar otra ciudad?\n"
				+ "Si - No");
				
				
		} while (opcion.equalsIgnoreCase("si"));
			
	}
	
	//----------------------------------
	public void consultarPais() {
		
		String busqueda;
		
		do {
			
		
		busqueda = JOptionPane.showInputDialog("Ingrese el pais que desea buscar");
		
		if (mapciudades.containsKey(busqueda)) {
			
					System.out.println(mapciudades);
					
		}else {
			JOptionPane.showMessageDialog(null, "El pais ingresado no existe");
		}
		
		
				} while (busqueda.equalsIgnoreCase("si"));		}}
				

	
