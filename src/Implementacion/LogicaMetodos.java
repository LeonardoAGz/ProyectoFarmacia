package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Interface.Metodos;
import Model.Medicamentos;

public class LogicaMetodos implements Metodos {
	private List<Medicamentos> lista = new ArrayList<Medicamentos>();

	@Override
	public void guardar(Medicamentos medicamento) {
		// TODO Auto-generated method stub
		boolean bandera = false;

		for (Medicamentos m : lista) {
			if (m.getCodigoBarra() == medicamento.getCodigoBarra() || m.getNombre().equals(medicamento.getNombre())) {
				System.out.println("Ese registro ya existe");
				bandera = true;
				break;

			}
	

		}
		
		if (!bandera) {
			lista.add(medicamento);
			System.out.println("Se guardo");
		}

	}

	@Override
	public List<Medicamentos> mostrar() {
		// TODO Auto-generated method stub
		List<Medicamentos> listaNueva = lista;
		return listaNueva;
	}

	@Override
	public Medicamentos buscar(int indice) {
		// TODO Auto-generated method stub
		Medicamentos medicamento = lista.get(indice);
		return medicamento;
	}

	@Override
	public void editar(int indice, Medicamentos medicamento) {
		// TODO Auto-generated method stub
		lista.set(indice, medicamento);

	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);

	}

}
