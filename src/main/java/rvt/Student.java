package rvt;

public class Student {

    public class Students {
        String name;
        int age;
    }

    
    public static void main(String[] args) {
        Students st1 = new Students();
        st1.name = "Peter";
        st1.age = 20;

        Students st2 = new Students();
        st2.name = "Artem";
        st2.age = 10;

        Students st3 = new Students();
        st3.name = "Yarik";
        st3.age = 15;
    }
}
