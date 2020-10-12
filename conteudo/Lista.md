# Listas

Lista é uma estrutura de dados que pode ser considerada como:

- _Homogênea,_ que compõe dados do mesmo tipo;
- _Ordenada,_ que possui elementos que são acessados por meio deposições;
- Inicia _vazia_ , seus elementos são alocados por meio da demanda;
- Cada _elemento_ ocupa uma espécie de "nó" da lista;

Na linguagem Java, para representar uma lista, utilizamos o tipo _List_ que simboliza uma interface. 
Para que possa ser executada, necessita de uma **classe** que possa implementar essa interface. Alguns
exemplos de classe são: ArrayList, LinkedList, etc.

A lista tem sua vantagens como seu tamanho ser variável e possui uma certa facilidade para se realizar
inserções ou deleções, assim como possui densvantagens como possuir apenas um acesso sequencial aos elementos.

Demonstrações de algumas operações de Listas:

```java
size()                                                                                 // Tamanho da lista
add(obj), add(int,obj)                                                                 // Inserir elemento na lista
remove(obj), remove(int), removeIf(predicate)                                          // Remover elementos da lista
indexOf(obj), lastIndexOf(obj)                                                         // Encontrar posição de elemento
List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());  // Filtrar lista com base em predicado
Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);            // Encontrar primeira ocorrência c/ base em predicado
```

