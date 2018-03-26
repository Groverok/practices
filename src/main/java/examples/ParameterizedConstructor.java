package examples;
/**
 * Created by SergeyZhilinsky on 2/19/2018.
 */

public class ParameterizedConstructor {
        int id;
        String name;

        // parameterized Constructor

        ParameterizedConstructor(int i, String n) {
            id = i;
            name = n;
        }

        void display() {
            System.out.println(id + " " + name);
        }

        public static void main(String args[]) {
            ParameterizedConstructor c1 = new ParameterizedConstructor(1, "New York");
            ParameterizedConstructor c2 = new ParameterizedConstructor(2, "London");
            c1.display();
            c2.display();
        }
    }
