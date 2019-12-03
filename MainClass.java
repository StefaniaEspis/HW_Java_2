import java.util.HashMap;
import java.util.HashSet;

public class MainClass {
    public static void main(String[] args) {
        // Задание 1

        String [] arr = {"A","B","A","D","C","C","E"};
        HashMap<String,Integer> hm = new HashMap<>();
        for (String o: arr){
            hm.put(o, hm.getOrDefault(o,0) + 1);
        }
        System.out.println(hm);
    }
}

// Задание 2
class PhoneBox {
    HashMap<String,HashSet<String>> hm;

    public PhoneBox(){
        this.hm = new HashMap<>();
    }

    public void add (String name, String phone) {
        HashSet<String> hs = hm.getOrDefault(name, new HashSet<>());
        hs.add(phone);
        hm.put(name, hs);
    }
    public void findString(String name){
        if(hm.containsKey(name)){
            System.out.println(hm.get(name));
        } else {
            System.out.println("Такой фамилии нет");
        }
    }
    public static void main(String [] args){
        PhoneBox book = new PhoneBox();
        book.add("Ivanov", "123");
        book.add("Ivanov", "124");
        book.add("Ivanov", "125");
        book.add("Petrov", "444");
        book.add("Petrov", "445");
        book.add("Petrov", "446");

        book.findString("Ivanov");
        book.findString("Petrov");
        book.findString("Petrasdovjhk");
    }
}