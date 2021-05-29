package com.burutiscript;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
	
	public static void main(String[] args) {
		Aula a1 = new Aula("Revisando as ArrayLists", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
        
        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        
        /*
         * A invocação Collections.sort(aulas) não compila!
         * Pois Collections.sort não sabe ordenar uma lista de Aula.
         */
//       Collections.sort(aulas);
        
        
        /*
         * Quem implementou a classe String definiu
         * um critério de comparação entre duas Strings, no qual
         * qualquer pessoa pode comparar dois desses objetos. Isso é feito
         * através do método compareTo.
         */
        
        String s1 = "paulo";
        String s2 = "silveira";
        int resultado = s1.compareTo(s2);
        
        /*
         * O resultado da comparação é um int, pois um boolean não
         * bastaria. Esse método devolve um número negativo se s1 é
         * menor que s2, um número positivo se s2 é menor que s1 e
         * 0 se forem iguais. Mas o que é maior, menor e igual? No caso da
         * String, quem implementou a classe decidiu que o critério de
         * comparação seria a ordem lexicográfica (alfabética, por assim
         * dizer).
         */
        
        System.out.println(resultado);
        
//        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        
        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);
	}
}
