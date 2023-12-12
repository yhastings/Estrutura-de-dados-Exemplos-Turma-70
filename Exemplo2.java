package estrutura_de_dados;

import java.util.Iterator;
import java.util.Stack;

public class Exemplo2 {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.push("Prato Verde");
		pilha.push("Prato Azul");
		pilha.push("Prato Branco");
		pilha.push("Prato Amarelo");
		pilha.push("Prato Vermelho");
		
		System.out.println("\nElementos da pilha: " + pilha);
		
		System.out.println("\nRetirar Elementos da pilha: " + pilha.pop());
		
		System.out.println("\nElementos da pilha: " + pilha);
		
		System.out.println("\nRetirar Elementos da pilha: " + pilha.pop());
		
		System.out.println("\nElemento no topo da pilha: " + pilha.peek());
		
		System.out.println("\nAdicionar Elemento na pilha: " + pilha.push("Prato Roxo"));
		
		System.out.println("\nElementos da pilha: " + pilha);
		
		System.out.println("\nTamanho da pilha: " + pilha.size());
		
		System.out.println("\nVerificar se existe Elemento dentro da pilha: " + pilha.contains("Prato Verde") );
		
		System.out.println("\n");
		
		Iterator<String> iterator = pilha.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		pilha.clear();
		
		System.out.println("\nPilha está vazia? " + pilha.isEmpty());
		

	}

}
