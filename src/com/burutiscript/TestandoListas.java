package com.burutiscript;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	
	public static void main(String[] args) {
		
		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
//		As listas, assim como a maioria dos casos no 
//		Java, são indexadas a partir do 0, e não do 1.
		aulas.remove(0);
		System.out.println(aulas);
		
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
//		O método aqui é o get.
//		Ele retorna o primeiro elemento se passarmos o 0 
//		como argumento.
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é " + primeiraAula);
		
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("aula :" + aulas.get(i));
		}
		
		/*
		 * Fizemos até i < aulas.size() pois size retorna o total de
		 * elementos. Se acessássemos até i <= aulas.size() teríamos
		 * um problema! Uma exception do tipo
		 * IndexOutOfBoundsException seria lançada!
		 */
		
		
		/*
		 * Temos um método (não um comando!) agora que se chama forEach.
		 *  Ele recebe um objeto do tipo Consumer, mas o interessante é
		 *  que você não precisa criá-lo, você pode utilizar uma sintaxe
		 *  bem mais enxuta, mas talvez assustadora a primeira vista, 
		 *  chamada lambda.
		 */
		aulas.forEach(aula -> {
			System.out.println("Percorrendo: ");
			System.out.println("Aula " + aula);
		});
		
		
		
		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println("Depois de ordenado:");
		System.out.println(aulas);
	}
}
