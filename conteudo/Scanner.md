# Conceito de Scanner

Scanner é considerada uma classe que tem como finalidade obter a informação que o usuário digita no teclado e armazenar a mesma dentro de uma variável.

Vejamos na prática os passos necessários para sua utilização:

**1º Passo:** Para seu funconamento, a classe necessita de funções, dentre elas, a importação.
```java
import java.util.Scanner;
```

**2º Passo:** Precisa-se criar um objeto do tipo Scanner que torna o objeto *System.in* como argumento dentro do construtor, dessa forma:
```java
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

	}
}
```

**3º Passo:** O objeto *System.in* é quem é responsável pela leitura da entrada realizada pelo usuário. Entretanto para que essa leitura seja captada é necessário 
declarar o método existente para cada tipo primitivo, que retorna o valor especificado na entrada de dados sempre seguindo o formato *nextTipo()*.
```java
String ex1 = sc.next();
int ex21 = sc.nextInt();
float ex3 = sc.nextFloat();
double ex4 = sc.nextDouble();
byte ex5 = sc.nextByte();
long ex6 = sc.nextLong();
boolean ex7 = sc.nextBoolean();
```

**4º Passo:** Existem alguns métodos da classe para serem utilizados, mas para nosso exemplo utilizamos o *close()*	responsável por fechar o escaneamento de leitura.

```java
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite algo: ");
		String x = entrada.next();
		
		System.out.println(x);
		
		entrada.close();

	}
}
```
