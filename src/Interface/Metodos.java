package Interface;

import java.util.List;

import Model.Medicamentos;


public interface Metodos {

	public void guardar (Medicamentos medicamento);
	public List<Medicamentos> mostrar();
	public Medicamentos buscar (int indice);
	public void editar(int indice, Medicamentos medicamento);
	public void eliminar(int indice);
}
