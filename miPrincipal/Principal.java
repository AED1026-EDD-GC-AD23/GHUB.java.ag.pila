package miPrincipal;

public class Principal {
    

    public static void main(String[] args) {
        // Crear una nueva pila de enteros
		Pila<Integer> pila2 = new Pila<Integer>();
		pila2.apilar(2);
		pila2.apilar(5);
		pila2.apilar(7);
		System.out.println("El tope de la pila es "+pila2.cima());
		//desapilar
		pila2.retirar();
		System.out.println("El tope de la pila es "+pila2.cima());
		pila2.retirar();
		System.out.println("El tope de la pila es "+pila2.cima());
		pila2.retirar();
		System.out.println("El tope de la pila es "+pila2.cima());
		pila2.apilar(2);
		pila2.apilar(5);
		pila2.apilar(7);
		System.out.println("El emento 5, se encuetra en la posion: "+pila2.buscar(5));
		System.out.println("El emento 2, se encuetra en la posion: "+pila2.buscar(2));
		System.out.println("El emento 7, se encuetra en la posion: "+pila2.buscar(7));
		System.out.println("El emento 10, se encuetra en la posion: "+pila2.buscar(10));
	
	}
  
}