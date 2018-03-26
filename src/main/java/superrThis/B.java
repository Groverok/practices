package superrThis;

/**
 * Created by SergeyZhilinsky on 3/1/2018.
 */
class B extends A {

    B() {
        this(""); // вызов конструктора с одним аргументом класса B
        System.out.println("Конструктор без аргументов класса B");
    }

    B(String args) {
        super(""); // вызов конструктора с одним аргументом класса A
        System.out.println("Конструктор с одним аргументом класса B");
    }
}

