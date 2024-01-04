package TestingMySelf;

public class WorkSplit {


    public static void main(String[] args) {
        SplitNames();
        String value = "Mango,Grape,Banana,Apple,Orange";
        String[] values = value.split(",");
        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);
        System.out.println(values[3]);
        System.out.println(values[4]);

    }

    public static void SplitNames(){
        String str = "Hello Good Evening Everyone";
        String parts [] = str.split(" ");

        for(int i=0;i<parts.length;i++){
            System.out.println(parts[i]);


        }
    }
}
