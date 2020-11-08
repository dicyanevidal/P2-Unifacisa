# Polimorfismo

É um recurso o qual permite que variáveis de um mesmo tipo mais genérico possam apontar para objetos de tipos específicos diferentes, tendo assim comportamentos diferentes 
conforme cada tipo específico. Sendo mais específica, é a capacidade de um objeto poder ser referenciado de várias formas.

Vemos abaixo, duas classes. A primeira é a super classe (Conta) que compõe da função *saque* e a segunda, uma subclasse (ContaPoupanca) que compõe a sobrescrita da função *saque*:
```java

 public class Conta {
    //...
    
    public void saque(double valor) {
    saldo -= valor + 5.0;
    }
 }
 
 
public class ContaPoupanca {
    //...
    
    @Override
    public void saque(double valor) {
    saldo -= valor;
    }
}
```
Em Java, a invocação de método sempre vai ser decidida em tempo de execução, ou seja, a associação do tipo específico com o tipo genérico é feita em upcasting (tempo de execução). 
O Java vai procurar o objeto na memória e, aí sim, decidir qual método deve ser chamado. No caso abaixo, estamos instanciando a **Conta x** como sendo **Conta**, ou seja, **x** 
vai realizar um saque o qual irá utilizar da função de **Conta x**. Já **Conta y** está sendo instanciada a subclasse **ContaPoupanca**, logo, o saque será realizado através da função sobrescrita.
Dessa forma, quando ele receber um objeto, o seu método reescrito será invocado.

```java
Conta x = new Conta(1020, "Alex", 1000.0);
Conta y = new ContaPoupanca(1023, "Maria", 1000.0, 0.01);
x.saque(50.0);
y.saque(50.0);
```

