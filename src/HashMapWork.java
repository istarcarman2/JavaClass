import java.util.HashMap;

public class HashMapWork {

    public static void main(String[] args) {
        HashMap<String,Double> StoresName = new HashMap<String,Double>();
        StoresName.put("Dell", 200.00);
        StoresName.put("Mac",100.00);
        StoresName.put("Sony", 300.0);
        StoresName.put("HP",400.00);
    //    System.out.println(StoresName.get("Dell"));

        for (String store : StoresName.keySet()){
            System.out.println(store+" price is "+ StoresName.get(store));
        }
    }
}
