
import javax.swing.JOptionPane;

public class Procesos {
	

	    public static void main(String[] args) {
	        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona:");
	        String telefono = JOptionPane.showInputDialog("Ingrese el teléfono de la persona:");

	        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso en kg:"));
	        double talla = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la talla en metros:"));

	        double imc = calcularIMC(peso, talla);

	        String categoria = obtenerCategoriaIMC(imc);

	        String resultado = "IMC: " + imc + "\n";
	        resultado += "Categoría: " + categoria + "\n";
	        resultado += "Nombre: " + nombre + "\n";
	        resultado += "Teléfono: " + telefono;

	        JOptionPane.showMessageDialog(null, resultado, "Resultado IMC", JOptionPane.INFORMATION_MESSAGE);
	    }

	    public static double calcularIMC(double peso, double talla) {
	        return peso / (talla * talla);
	    }

	    public static String obtenerCategoriaIMC(double imc) {
	        if (imc < 18) {
	            return "anorexia";
	        } else if (imc < 20) {
	            return "delgadez";
	        } else if (imc < 27) {
	            return "normalidad";
	        } else if (imc < 30) {
	            return "obesidad 1";
	        } else if (imc < 35) {
	            return "obesidad 2";
	        } else if (imc < 40) {
	            return "obesidad 3";
	        } else {
	            return "obesidad mórbida";
	        }
	    }
	}

