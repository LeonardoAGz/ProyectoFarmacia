package Main;

import java.util.Scanner;

import Implementacion.LogicaMetodos;
import Model.Medicamentos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner lectura = null;
		
		int codigoBarras, menuPrinc, indice;
		String nombre;
		float precio;
		boolean status;
		
		Medicamentos medicamento;
		
		LogicaMetodos imp = new LogicaMetodos();
		
		System.out.println("PRUEBA PARA GIT");
		System.out.println("Esto es una modificacion");
		
		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1---ALTA");
			System.out.println("2---MOSTRAR");
			System.out.println("3---BUSCAR");
			System.out.println("4---EDITAR");
			System.out.println("5---ELIMINAR");
			System.out.println("6---SALIR");
			
			lectura = new Scanner(System.in);
			menuPrinc = lectura.nextInt();
			
			switch (menuPrinc) {
			case 1:
				try {
					System.out.println("Ingresa el codigo de barras");
					lectura = new Scanner(System.in);
					codigoBarras = lectura.nextInt();

					System.out.println("ingrese el nombre");
					lectura = new Scanner(System.in);
					nombre = lectura.nextLine();

					System.out.println("Ingrese el precio");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();
					
					System.out.println("Se encuentra en existencia?");
					lectura = new Scanner(System.in);
					String respuesta = lectura.nextLine();
					status = respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("true");
					
					medicamento = new Medicamentos(codigoBarras, nombre, precio, status);
					
					imp.guardar(medicamento);
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al guardar");
				}
				
				break;

			case 2:
				if (imp.mostrar().size() > 0)
					System.out.println(imp.mostrar());
				else
					System.out.println("No hay registros");
				break;
			case 3:
				try {
					System.out.println("Ingrese el indice a buscar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();
					
					//buscar
					
					medicamento = imp.buscar(indice);
					System.out.println("Se encontro " + medicamento);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("No existe ese registro");
				}
				break;
			case 4:
				try {
					System.out.println("Ingrese el indice a editar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();
					
					//buscar
					
					medicamento = imp.buscar(indice);
					System.out.println("Se encontro " + medicamento);
					//proceso para editar
					System.out.println("Ingresa el nuevo precio");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();
					
					
					medicamento.setPrecio(precio);
					
					imp.editar(indice, medicamento);
					System.out.println("Se edito");
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("No existe ese registro");
				}
				
				
				break;
			case 5:
				try {
					System.out.println("Ingrese el indice del registro a eliminar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();
					
					imp.eliminar(indice);
					System.out.println("Se elimino");
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("No existe ese registro");
				}
				break;
			case 6:
				break;
			}
			
		} while (menuPrinc < 6);

	}

}
