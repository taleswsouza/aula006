# Aula 006

## Prática

### Polimorfismo (7.12 na pág.125)

#### Exemplo

A idéia por trás do polimorfismo é que um objeto possa assumir muitas formas, e não somente aquela que foi inicialmente determinado.
Porém, estás "muitas formas" seguem algumas regras básicas.
Verifique o exemplo abaixo:

```java
class Animal { }
class Cachorro extends Animal { }
class Cavalo extends Animal { }

class Fruta { }
class Abacate extends Fruta { }
class Pera extends Fruta { }

public class TestePolimorfismo {

    public static void main(String[] arg) {
        Animal qualquerAnimal;
        Fruta quaquerFruta;

        qualquerAnimal = new Animal();    // ok
        qualquerAnimal = new Cachorro();  // ok
        qualquerAnimal = new Cavalo();    // ok

        quaquerFruta = new Fruta();       // ok
        quaquerFruta = new Abacate();     // ok
        quaquerFruta = new Pera();        // ok

        qualquerAnimal = new Fruta();     // NÃO ok
        qualquerAnimal = new Abacate();   // NÃO ok
        qualquerAnimal = new Pera();      // NÃO ok

        quaquerFruta = new Animal();      // NÃO ok
        quaquerFruta = new Cachorro();    // NÃO ok
        quaquerFruta = new Cavalo();      // NÃO ok
    }
}
```

1. Copie o projeto chamado Heranca da aula005 renomeando-o para **Polimorfismo**
2. Criar um novo pacote chamado **com.aula.polimorfismo.teste**
3. Criar uma nova _Classe Java Principal_ chamada **TestePolimorfismo** e digite o conteúdo do exemplo acima.
* Verifique os erros de compilação.
* Por quê não funciona?
4. Comente os trechos que não estão ok (```// NÃO ok```) e execute e teste a classe **TestePolimorfismo**.
5. Abaixo de cada atribuição ok (```// ok```) coloque a impressão do objeto:
```java
System.out.println(qualquerAnimal);
// ou
System.out.println(quaquerFruta);
```
6. Execute e teste novamente a classe **TestePolimorfismo**.

#### Exercício do livro

Siga os procedimentos do livro, na parte final da página 125 e no início da página 126, criando o método **mostraClasse** e posteriormente criando a classe **PessoaPolimorfa**


