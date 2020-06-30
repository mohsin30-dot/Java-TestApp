package ExampleDog;

public class Dog {
    public static void main(String[] args) {

        // make a dog object
        Dog dog1 = new dog();
        dog1.bark();
        dog1.name = "Bart";

        // now make a dog array
        Dog[] myDogs = new Dog[3];
        // put some dogs in it
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        // now access the dog using the array, reference
        myDogs[0].name = "Tom";
        myDogs[1].name = "Fred";

        // what is myDogs name?

        System.out.println("last dog name is" + myDogs[2].name );

        // now loops through the array & tell all dogs to bark
        int x = 0;
        while ( x < myDogs.length) {     // arrays have variable length that gives the number element in the array
            myDogs[x].bark();
            x = x+ 1;
        }
        public void bark() {
            System.out.println(name + "Says Ruff!");
        }


    }


}
