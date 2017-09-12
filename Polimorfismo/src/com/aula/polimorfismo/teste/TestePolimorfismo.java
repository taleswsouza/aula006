package com.aula.polimorfismo.teste;

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
        System.out.println(qualquerAnimal);
        qualquerAnimal = new Cachorro();  // ok
        System.out.println(qualquerAnimal);
        qualquerAnimal = new Cavalo();    // ok
        System.out.println(qualquerAnimal);

        quaquerFruta = new Fruta();       // ok
        System.out.println(quaquerFruta);
        quaquerFruta = new Abacate();     // ok
        System.out.println(quaquerFruta);
        quaquerFruta = new Pera();        // ok
        System.out.println(quaquerFruta);

//        qualquerAnimal = new Fruta();     // NÃO ok
//        qualquerAnimal = new Abacate();   // NÃO ok
//        qualquerAnimal = new Pera();      // NÃO ok
//
//        quaquerFruta = new Animal();      // NÃO ok
//        quaquerFruta = new Cachorro();    // NÃO ok
//        quaquerFruta = new Cavalo();      // NÃO ok
    }
}
