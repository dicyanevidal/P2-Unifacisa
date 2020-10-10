# Encapsulamento

É um princípio que consiste em esconder detalhes de implementação de uma classe, expondo apenas operações seguras e que mantenham os objetos em um estado consistente. Sendo que
o objeto deve sempre estar em um estado consistente, ou seja, não deve haver dados inválidos e a própria classe deve garantir isso.

É importante lembrar que o objeto *não* deve expor nenhum atributo. Utilizamos nos atributos o modificador de acesso **private** onde para serem acessados, é necessário utilizarmos os métodos **get** e **set**.

Para compreendermos melhor na prática, segue abaixo um exemplo padrão:
```java
private String nome;
private double preco;

public String getNome() {
  return nome;
}
public void setNome(String nome) {
  this.nome = nome;
}
public double getPreco() {
  return preco;
}
public void setPreco(double preco) {
  this.preco = preco;
}
```


### Modificadores de acesso 

- *private:* O membro só pode ser acessado na própria classe.

- *(nada):* O membro só pode ser acessado nas classes do mesmo pacote.

- *protected:* O membro só pode ser acessado no mesmo pacote, bem como em
subclasses de pacotes diferentes.

- *public:* O membro é acessado por todas classes (ao menos que ele resida em
um módulo diferente que não exporte o pacote onde ele está).
