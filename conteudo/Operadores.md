# Operadores

### Operadores Aritméticos

Realizam operações matemáticas entre duas variáveis e retornam o resultado.

| Símbolo |              Descrição             |   
| :-----: | :--------------------------------: |
|    +    |          Operador de adição        | 
|    -    |        Operador de subtração       | 
|    *    |      Operador de multiplicação     |                  
|    /    |         Operador de divisão        |                    
|    %    | Operador módulo (resto da divisão) |                   


Podemos utilizar os **Operadores Aritméticos** em conjunto com os **Operadores de Atribuição**, exemplo:
```java 
int a = 2, b = 1;
a += b;
System.out.println(a);  // O valor de a resultará em 3.
```   

Outras opções desse tipo de operação:
```java
a -= b;  or  a = a - b;
a -= b;  or  a = a - b;
a *= b;  or  a = a * b;
a *= b;  or  a = a * b;
a /= b;  or  a = a / b;
a %= b;  or  a = a % b;
```

## Operadores de Igualdade e Relacionais

Os operadores de igualdade analisam se o valor ou o resultado da expressão lógica à esquerda é **igual (“==”), diferente (“!=”), menor ("<"), menor ou igual ("<="), maior (">") ou maior ou igual (">=")** ao da direita, retornando um valor booleano.

Visualizamos como exemplo os valores booleanos de aval:

```java
int a = 3, b = 1;

aval = a == b;      //aval resulta false
aval = a != b;      //aval resulta true
aval = a > b;       //aval resulta true
aval = a >= b;      //aval resulta true
aval = a < b;       //aval resulta false
aval = a <= b;      //aval resulta false
```

