# Array

Arrays são estruturas de dados estáticas, o que significa dizer que elas possuem um tamanho fixo, sendo obrigatório defini-lo antes de atribuir valores.
São capazes de armazenar conjunto de vetores de um mesmo tipo de dado, podendo ser: vetores ou matrizes.

Para compreendermos melhor sua construção, trabalharemos com vetores. Logo, precisamos realizar 4 operações básicas:
- Como _declarar_ um array
- Como _instanciar_ um array
- Como _inicializar_ um array
- Como _consultar_ um array

#### Como declarar:
Para criar um objeto Array, devemos especificar o tipo de dado dos elementos e o numero de elementos como parte de uma expressão de criação de array que utiliza a palavra new.

```java
tipo[] nomeArray;   /Exemplo base
tipo nomeArray[];   /Exemplo base
int[] idade         /Exemplo prático
int idade[];        /Exemplo prático
```

#### Como instanciar:

Depois de criado o array é necessário instanciá-lo, como os vetores são considerados objetos em java, é preciso instancia-los antes de usar. 
Instanciar um array significa lhe atributir um endereço de memória onde ele possa armazenar seus valores.

```java
NomeArray = new tipo[posicao]; /Exemplo base
idade = new int[4];            /Exemplo prático
letras = new char[15];         /Exemplo prático
nome = new string[30];         /Exemplo prático
```

_A declaração e instanciação do vetor também podem ser feitas em uma única instrução:_

```java
tipo[] nomeArray = new tipo[tamanho];  /Exemplo base
int[] idade = new int [4];              /Exemplo prático
```

#### Como inicializar:
Inicialização de um Array consiste na gravação de um valor em cada uma das suas posições. A inicialização pode ser feita posição a posição, após sua declaração e a instanciação.

```java
NomeArray[posição] = valor;  /Exemplo base
Idade[0] = 25;               /Exemplo prático
```

Para percorrer o Array/Vetor, é necessária a utilização de uma **Estrutura de Repetição**, assim podemos percorrer cada valor que o pertence. 
Vejamos um exemplo prático abaixo, o qual armazena _n_ nomes no Array e nos retorna o resutado de armazenamento desses dados:

```java
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		
		for (int i=0; i<n; i++) {
			nome[i] = sc.next();
		}
		
		for (String nomes : nome) {
			System.out.println(nomes);
		}
		
		sc.close();
	}

```





