# Estruturas de Repetição

## Estrutura *while*

A estrutura repetitiva while (enquanto) tem como objetivo repetir um bloco de comandos enquanto uma condição for 
verdadeira. É aconselhável utiliza-la quando não se tem a certeza da quantidade de repetições que deve ser realizada.

Segue um exemplo abaixo aplicando while:

```java

		int x = 5;
		int y = 0;
		
		while (x > 2) {
		  System.out.println(x);
		  y += x;
		  x -= 1;
		}
 ```
 
 No caso acima, o programa define que enquanto o **x** for maior que **2** o resultado de *y = y + x* e *x = x - 1* será executado.
 
 ## Estrutura *for*
 
 A estrutura repetitiva for (para) também é uma estrutura de controle que repetir um bloco de comandos, entretanto, é executada
 mediante um indervalo definido de valores. É aconselhável utiliza-la quando se tem em mente a quantidade de repetições que deve ser realizada.
 
 ![for](https://user-images.githubusercontent.com/62221250/93495696-c6d06700-f8e4-11ea-871c-b4226cc15874.png)

# Estrutura *do-while*

A estrutura repetitiva do-while (faça-enquanto) também é um laço de repetição, entretanto, a diferença dele para os outros, é que o bloco de instrução será executado no mínimo uma única vez. 
O do-while possui uma construção simples, fazemos um laço de repetição que antes de verificar se deve ou se repetir, primeiro executa-se o bloco de instrução.

Segue o exemplo de representação abaixo:

```java
  do {
    comando
  } while (condicao);
```
Em prática, o **x** vai iniciar no **do**, caso for verdadeiro, ele retorna, caso for falso ele entra no while e para. A condição somente é avaliada 
depois que suas instruções são executadas:

```java
		int x = 0; 
		                            
		do {
			System.out.println("Número " + x);
		 	x++;
		 	
		} while (x < 15);
 ```
