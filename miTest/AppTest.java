package miTest;

import miPrincipal.Pila;
import miPrincipal.Nodo;
import miPrincipal.Principal;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    private Pila<Integer> pila;

    /* 

	@Test 
    void tieneMetodoBuscar() {
        Pila p = new Pila<Integer>();
        assertNotNull(p.buscar(5), "Debe un método Buscar");
    }
    */
	@Test
	void test_apilar() {
		pila = new Pila<Integer>();
		pila.apilar(2);
		pila.apilar(5);
		pila.apilar(7);
		Integer n = pila.cima();
		boolean sonIguales = n==7;
		assertTrue(sonIguales,"La cima debe ser 7");
		
	}
	
	@Test
	void test_retirar() {
		pila = new Pila<Integer>();
		pila.apilar(2);
		pila.apilar(5);
		pila.apilar(7);
		pila.retirar();
		Integer n = pila.cima();
		boolean sonIguales = n==5;
		assertTrue(sonIguales,"La cima debe ser 5");
			
	}
	
	
	@Test
	void test_buscar1() {
		pila = new Pila<Integer>();
		pila.apilar(2);
		pila.apilar(5);
		pila.apilar(7);
		pila.retirar();
		Integer n = pila.buscar(7);
		boolean sonIguales = n==-1;
		assertTrue(sonIguales,"Debe ser -1");
		
	}
	
	@Test
	void test_buscar2() {
		pila = new Pila<Integer>();
		pila.apilar(2);
		pila.apilar(5);
		pila.apilar(7);
		pila.retirar();
		Integer n = pila.buscar(5);
		boolean sonIguales = n==0;
		assertTrue(sonIguales,"Debe regresar 0");
		
	}
	
}