# Estruturas Condicionais

Java contém três tipos de estruturas que tem como objetivo criar comparações/possibilidades no código, são elas: **if - if/else - else**. 

## Estrutura if

A Estrutura **if** é uma instrução única. Possui uma construção simples pois ela permite que uma instrução 
ou um conjunto de instruções possa avaliar, mediante as condições impostas, se o resultado da entrada do usuário é verdadeiro (_true_) ou 
falso (_false_), sendo assim, se a entrada do usuário resultar em falso, a instrução anteriormente imposta dentro do *if* não será executada e segue para a próxima.

Para exemplificar, segue um exemplo para verificar se um número fornecido pelo usuário é par. Se for, exibir a mensagem “O número __ é par”:

```java
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		numero = sc.nextInt();
		
		if (numero % 2 == 0)
			System.out.println("O número " + numero + " é par.");
      
		sc.close();

	}
}
```
Nesse caso, a estrutura vai analisar a entrada (*numero*) e verificar se o resto da divisão resulta em 0, caso contrário, o programa sai do **if** e não executa mais.

## Estrutura if/else

Essa estrutura segue a mesma idéia de comprovar condições, a diferença é ela que permite definir uma ação para quando a condição for verdadeira e 
uma ação distinta quando a condição é falsa.

Seguindo o mesmo raciocínio do exemplo anterior, acrescentamos mais uma condição. Verificar se um número fornecido pelo usuário é par.
Se for, exibir a mensagem “O número __ é par”, caso contrário, exibir a mensagem “O número __ é ímpar” :

```java
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		numero = sc.nextInt();
		
		if (numero % 2 == 0)
			System.out.println("O número " + numero + " é par.");
		else 
			System.out.println("O número " + numero + " é ímpar.");
      
		sc.close();
```

## Estrutura switch-case

Essa estrutura segue uma lógica um pouco mais específica, quando se trata devárias opções de condições a serem tratadas, ao invés de várias estruturas if-else
associadas, pode-se utilizar a estrutura *switch-case*.

|  Código  |   Produto     |   
| :------: | :-----------: |
|    1     |     Maça      | 
|    2     |    Banana     | 
|    3     |    Mamão      | 
|    4     |   Abacaxi     | 

Como modelo, segue um exemplo onde de acordo com a tabela, o usuário fornece um número que representa o código do produto e imprime o nome do mesmo.

```java
		Scanner sc = new Scanner(System.in);
		
		int numero;
		String produto;
		
		numero = sc.nextInt();
		
		switch (numero) {
		case 1:
			produto = "Maça";
			System.out.println("Produto: " + produto);
			break;
		case 2:
			produto = "Banana";
			System.out.println("Produto: " + produto);
			break;
		case 3:
			produto = "Mamão";
			System.out.println("Produto: " + produto);
			break;
		case 4:
			produto = "Abacaxi";
			System.out.println("Produto: " + produto);
			break;
		}
	
		sc.close();
```





