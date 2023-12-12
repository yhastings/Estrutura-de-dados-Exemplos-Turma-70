package estrutura_de_dados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Exemplo1 {

	public static void main(String[] args) {
		Queue<Integer> fila = new LinkedList<Integer>();
		
		for(int indice = 0; indice < 10; indice++) {
			fila.add(indice);
		}
		
		System.out.println("\nElementos da fila" + fila);
		
		System.out.println("\nRemover da fila " + fila.remove());
		
		System.out.println("\nFila Atualizada" + fila);
		
		System.out.println("\nAdicionar elementos na fila " + fila.add(10));
		
		System.out.println("\nFila Atualizada" + fila);
		
		System.out.println("\nExibir o primeiro item da fila " + fila.peek());
		
		System.out.println("\nExibir o tamanho da fila " + fila.size());
		
		System.out.println("\nChecar se existe um elemento na fila " + fila.contains(7));
		
		System.out.println("\nExibir e retirar o primeiro item da fila (HEAD) " + fila.poll());
		
		System.out.println("\nExibir os itens com interator \n ");
		
		Iterator<Integer> iterator = fila.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nLimpar a fila ");
		fila.clear();
		
		System.out.println("\nfila está vazia? " + fila.isEmpty());
		
		System.out.println("\nFila Atualizada" + fila);
		
		
		
		


	}

}
