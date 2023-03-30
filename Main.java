import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner inputScanner = new Scanner(System.in);
        //Create a variable to store the first Bucket in the list
        Bucket head = null;
        //Create a variable to store the last Bucket in the list
        Bucket tail = null;
        //Create a variable to store the user input
        String input;
        //Ask the user to input data
        System.out.println("Enter data. Enter \"done\" to finish.");
        //Loop until the inputted string equals "done"
        while (!(input = inputScanner.nextLine()).equals("done")) {
            //If the first Bucket has not been set
            if (head == null) {
                //Initialize the first Bucket to a new Bucket with the user input as its data
                head = new Bucket(input);
                //Set the last item in the list to the first item
                tail = head;
            } else { //If the first Bucket has already been set
                //Create a new Bucket with the user input as its data
                Bucket bucket = new Bucket(input);
                //Set the next Bucket in the list to this new Bucket
                tail.next = bucket;
                //Set this new Bucket's previous Bucket to the Bucket that used to be the last in the list
                bucket.previous = tail;
                //Update the last Bucket in the list to be this new Bucket
                tail = bucket;
            }
        }
        //Close the Scanner
        inputScanner.close();

        System.out.println("Data in order:");
        //Store the first Bucket in the list in a variable
        Bucket bucket = head;
        //Loop until the stored Bucket is null
        while (bucket != null) {
            //Print the Bucket's data
            System.out.println(bucket.data);
            //Store the next Bucket
            bucket = bucket.next;
        }
        System.out.println();

        System.out.println("Data in backwards order:");
        //Store the last Bucket in the list in a variable
        bucket = tail;
        //Loop until the stored Bucket is null
        while (bucket != null) {
            //Print the Bucket's data
            System.out.println(bucket.data);
            //Store the previous Bucket
            bucket = bucket.previous;
        }
        System.out.println();
    }
}
