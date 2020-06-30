package ExampleJava;

public class Hobbits {
    String name;

    public static void main(String[] args) {
        Hobbits [] myHobbits = new Hobbits[3];
        int x = 0;

        myHobbits[0] = new Hobbits();

        myHobbits[0].name = "Bilbo";
        myHobbits[1].name = "Dumbo";
        myHobbits[2].name = "Gumbo";

        while (x < 2) {
            x = x +1 ;
            if (x == 1 ){
                myHobbits[1].name = "Dumbo";
            }
            if (x == 2) {
                myHobbits[2].name = "Gumbo";
            }
            System.out.println(myHobbits[x] + " is a " + " good Hobbit name");

        }
    }
}
