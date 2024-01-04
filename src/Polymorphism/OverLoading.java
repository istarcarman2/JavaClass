package Polymorphism;

public class OverLoading {

    String istar;

    public void dress(String a, String b) {

        istar = a+b;
        System.out.println("Monday and Tuesday I wear :" + istar );
    }

    public void dress (String a, String b, String c) {

        istar = a+b+c;
        System.out.println("rest of the days I wear :" + istar);
    }

    public static void main (String arg[]) {
        OverLoading obj = new OverLoading();
        obj.dress("dress" , ", jean");
        obj.dress("sari",", kari ,"," kurti ");

    }
}


