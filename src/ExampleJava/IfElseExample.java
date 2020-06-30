package ExampleJava;

public class IfElseExample {
    public static void main(String[] args) {
        int marks=65;

        if (60 <= marks) {
            if(marks >= 60){
                System.out.println("C grade");
            }
            else if(marks>=70 && marks<80){
                System.out.println("B grade");
            }
            else if(marks>=80 && marks<90){
                System.out.println("A grade");
            }else if(marks>=90 && marks<100){
                System.out.println("A+ grade");
            }else{
                System.out.println("Invalid!");
            }
        } else {
            System.out.println("D grade");
        }
    }
}

