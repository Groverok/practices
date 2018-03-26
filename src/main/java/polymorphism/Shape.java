package polymorphism;

/**
 * Created by SergeyZhilinsky on 2/28/2018.
 */
public class Shape {

    public void draw() {
//ничего не делаем
    }

    public static void main(String[] args) {

        Shape[] a = new Shape[]{
                new Shape(), new Triangle(), new Square(), new Сircle()};
        for (int i = 0; i < a.length; i++) {
            a[i].draw();
        }

    }
}

//Таким образом каждый класс наследник вызвал именно свой метод draw, вместо того, чтобы вызвать пустой метод draw из класса Shape.
//В следующих уроках мы поймем зачем может понадобится такой подход.