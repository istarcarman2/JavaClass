package Inheritance;

public class main {

    public static void main(String[] args) {

        Husband h = new Husband();
        h.name = "Paul";
        h.height = 5.11;
        h.age = 49;
        System.out.println("My husband name is "+ h.name);
        System.out.println("he is "+ h.height );
        System.out.println("he is "+ h.age + " years old.");
        System.out.println("------------------");

        Mom m = new Mom();
        m.name = "Martha";
        m.height=5.1;
        m.age = 60;
        System.out.println("My mom name is "+ m.name);
        System.out.println("she is "+ m.height);
        System.out.println(m.age);
        System.out.println("-----------------");

        Brother b = new Brother();
        b.name = "Dorji";
        b.height = 5.5;
        b.age = 47;
        System.out.println("My brother name is "+ b.name);
        System.out.println("he is " + b.age);
        System.out.println("he is "+ b.height);
        System.out.println("---------------");

        SisterInlaw s = new SisterInlaw();
        s.name = "Manjita";
        s.height = 5.4;
        s.age = 45;
        System.out.println(s.name);
        System.out.println(s.height);
        System.out.println(s.age);
        System.out.println("---------------");

        Sons son = new Sons();
        son.name = "JadenJoshua";
        son.age = 3;
        System.out.println(son.name);
        System.out.println(son.age);






    }



}
