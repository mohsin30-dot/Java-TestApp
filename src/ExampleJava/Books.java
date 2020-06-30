package ExampleJava;

public class Books {
    String title;
    String author;


    public static void main(String[] args) {

        Books[] myBooks = new Books[3]; // Initialize array
        // lets make books object
        myBooks[0]= new Books();
        myBooks[1]= new Books();
        myBooks[2]= new Books();
        int x = 0;
        // Declare Array
        myBooks[0].title = "Life of PI";
        myBooks[1].title = "Beautiful Mind";
        myBooks[2].title = "Democracy is not for all";
        myBooks[0].author= "Stephen king";
        myBooks[1].author= "Nelson mandela";
        myBooks[2].author= "Abraham Lincoln";

        while (x < 3) {
            System.out.println(myBooks[x].title + " by " + myBooks[x].author);
            x = x+1;
        }


    }

}
