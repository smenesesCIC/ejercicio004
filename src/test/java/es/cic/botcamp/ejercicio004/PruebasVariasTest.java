package es.cic.botcamp.ejercicio004;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PruebasVariasTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		Integer[] lista = new Integer[] {3, 2, 1};
		
		List<Integer> listaInteger = Arrays.asList(lista);
		
		
		Enumeration enumeration = new Enumeration() {


			@Override
			public boolean hasMoreElements() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Object nextElement() {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
		
//		Comparator<Integer> comparador = new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o1.compareTo(o2);
//			}
//			
//		};
		
		Collections.sort(listaInteger,  
				(o1, o2) -> o1.compareTo(o2)
		);
		
		long cuentaPares = listaInteger
				.stream()
				.mapToInt(i -> i.intValue())
				.filter(a -> a%2 == 0)
				.count();
		
		int suma = listaInteger
				.stream()
				.mapToInt(i -> i.intValue())
				.sum();
		
		assertEquals(6, suma);
		
		
		long cuentas = listaInteger
				.stream()
				.count();
		
		assertEquals(3, cuentas);
		
		List<Persona> personas = Arrays.asList(new Persona("Juan"), new Persona("Antonio"));
		
		personas
			.stream()
			.forEach(p -> p.setNombre(p.getNombre().toUpperCase()));
		
		assertEquals("JUAN", personas.get(0).getNombre());
		
	}
	
	
	private class Persona{
		private String nombre;
		
		public Persona() {
		}
		
		public Persona(String nombre) {
			this.nombre = nombre;
		}
		
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
	}
	
	
	private class MiEnumerationInterna implements Enumeration {

		@Override
		public boolean hasMoreElements() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object nextElement() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	
	private class MiComparador implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
}
