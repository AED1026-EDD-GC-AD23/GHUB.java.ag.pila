package miPrincipal;
public class Pila<T> {
	//Atributo cabeza, que apunta al tope de la pila
	private Nodo<T> cabeza;
	//Almacena el total de elementos de la pila
	private int tamanio;
	public Pila() {
		cabeza = null;
		tamanio = 0;
	}
	public int getTamanio() {
		return tamanio;
	}
	//Verificar si la pila esta vacia
	public boolean esVacia() {
		return (cabeza==null);
	}
	//Apilar un elemento nuevo
	public void apilar(T valor) {
		//Crear el nodo
		Nodo<T> nuevo = new Nodo<T>();
		//fijar el valor dentro del nodo
		nuevo.setValor(valor);
		if (esVacia()) {
			//cabeza apunta a un nuevo nodo
			cabeza = nuevo;
		}
		else {
			//se enlaza el campo siguiente
			nuevo.setSiguiente(cabeza);
			//la nueva cabeza de la pila, pasa a ser el nuevo
			cabeza = nuevo;
		}
		//incrementa el tamaño de la pila
		tamanio++;
		
	}
	//Elimima el elemento de la pila
	public void retirar() {
		if(!esVacia()) {
			cabeza = cabeza.getSiguiente();
			tamanio--;	
		}
		
	}
	//Devuelve el elemento almacenado en el tope de la pila
	public T cima() {
		if(!esVacia())
			return cabeza.getValor();
		else
			return null;
	}
	/**
	 * 
	 * @param elemento
	 * @return la posición del elemento en la pila si lo encuentra
	 *         si no regresa -1
	 */
	//Coloque aquí el método faltante el cual debe llamarse buscar y debe recibir como
	//Argumento un elemento tipo T, es método debera regresar
	//  la posición que ocupa en la pila y de no encomtrarse deberá regresar un -1
	
	
	
	
	

}