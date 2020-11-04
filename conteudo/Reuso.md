# Reuso 

Como o próprio nome diz, *Reuso* é a reutilização de algo. No nosso caso, é visto como a reutilização de um software. É você criar novos objetos através de objetos já existentes, sem precisar recriar ou duplicar.

Em Java, dois bons representantes de reuso são: Herança e Composição. Ambos possibilitam a reutilização de uma classe, entretanto, possuem utilizações distintas. Sabendo disso, listamos algumas vantagens de ambos.

 -|Vantagens|
:--------:|:-------:|
Composição|Organização; Coesão; Flexibilidade; 
  Herança |Reutilização do código;

Do meu ponto de vista a Composição é a melhor de se trabalhar, pois, é possível escolher qual atributo da classe você deseja reutilizar. Ao contrário da herança, a qual herda todos os atributos da classe tonando desnecessário e contribui nos riscos de erro. 
Para entendermos melhor o funcionamento de cada um, veremos abaixo suas definições:

## Composição

É um tipo de associação que permite que um objeto contenha outro. Basicamente funciona como uma forma de comunicação, uma troca de informações de um objeto para outro onde, e este se encarrega de obter os dados e buscar formas de trabalhar em cima dele.

Costuma-se dizer que composição é o ato de delegar trabalho para outro objeto. Isso permite que seu código se torne mais organizado, menor e mais seguro.

Para enxergar a prática, realizamos o exercício proposto: [Exercício sobre Reuso](https://github.com/eduardolfalcao/P2-Unifacisa/blob/master/exercicios/Reuso.md)

## Herança

Também é um tipo de associação. Entretanto, a Herança permite que uma classe herde **todos** os dados e comportamentos de outra. É bem aproveitado quando se identifica que o atributo ou método de uma classe será igual para as outras.

Para enxergarmos melhor como funciona o uso da Herança, abaixo dispomos de um diagrama UML. Ao lado esquerdo, vemos a construção de duas classes com atributos idênticos e ao lado direito, a utilização da Herança, onde é possível observar o reuso da classe principal (Conta), acrescentando apenas atributos adicionais, resultando em uma simplificação do código.

![Apresentação1](https://user-images.githubusercontent.com/62221250/98054568-0bbf4700-1e1a-11eb-82ce-2ac04688d1db.png)
