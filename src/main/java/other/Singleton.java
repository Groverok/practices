package other;

/**
 * Created by SergeyZhilinsky on 2/27/2018.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {  // нельзя создать объект (это конструктор).
    }

    public static Singleton getInstance() { // метод предоставляет объект
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}