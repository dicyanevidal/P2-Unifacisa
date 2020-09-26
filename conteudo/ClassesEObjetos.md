# Classes e Objetos

Classe é um tipo estruturado de dados que compõe as características de um objeto, ou seja, permite armazenar membros. Esse membros possuem atributos (dados ou campos) e métodos
(funções ou operações) que compõem um Objeto. 

Vemos um exemplo na prática, onde o objetivo é um programa para ler as medidas dos lados de dois triângulos X e Y. Em seguida, mostrar o valor das áreas dos dois triângulos
e dizer qual dos dois triângulos possui a maior área. O trinângulo é uma entidade que possui três atributos: a, b e c, logo, vamos utilizar essas três variáveis para representa-lo:

```java
double xA, xB, xC;
double yA, yB, yC;
```
Com as variáveis definidas, vamos criar o programa:

```java
package CalculoTriangulo;
import java.util.Locale;
import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
    
		double xA, xB, xC, yA, yB, yC;
    
		System.out.println("Digite as medidas do triângulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Digite as medidas do triângulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
    
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
    
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
    
		System.out.printf("Área do triângulo X: %.4f%n", areaX);
		System.out.printf("Área do triângulo Y: %.4f%n", areaY);
    
		if (areaX > areaY) {
			System.out.println("Área maior: X");
		} else {
			System.out.println("Área maior: Y");
		}
		sc.close();
	}
}
```

Com o objetivo de entender melhor o funcionamento de uma Classe a qual mostra benefícios de reaproveitamento, vamos criar uma para representar melhor o triângulo:

```java
package CalculoTriangulo;

public class Triangulo {	
	public double a;
	public double b;
	public double c;
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
```

Sabendo que temos uma variável do tipo classe teremos que instânciar ela. Imagine que minha Classe é o Projeto do nosso Triângulo, o **Objeto** é justamente o que 
podemos construir a partir desse projeto. Abaixo uma imagem representando o significado dos campos da classe:

![classe](https://user-images.githubusercontent.com/62221250/94348602-00574f80-0014-11eb-9c28-01fcad7b2e8d.png)

### Instanciação

Durante a execução do programa quando utilizamos o *new* é ele o responsável pela alocação dinâmica da memória, ou seja, um novo objeto criado dessa classe, com o 
operador *new*. Vemos abaixo uma imagem a qual demonstra como funciona a alocação de memória.

![Memoria](https://user-images.githubusercontent.com/62221250/94348662-73f95c80-0014-11eb-8987-7cf68551b161.png)

Assim que finalizamos nossa classe do tipo Triangulo, nós importamos ela para nosso código. Sabendo disso, o resultado do nosso código é esse:

```java
import java.util.Locale;
import java.util.Scanner;

import CalculoTriangulo.Triangulo;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
			
		System.out.println("Digite as medidas do triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite as medidas do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Área do triângulo X: %.4f%n", areaX);
		System.out.printf("Área do triângulo Y: %.4f%n", areaY);
		if (areaX > areaY) {
			System.out.println("Área maior: X");
		}
		else {
			System.out.println("Área maior: Y");
		}
		sc.close();
	}
}
```



