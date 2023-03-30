public class Bucket {
    //Variable for storing the Bucket that comes before this one
    Bucket previous;
    //Variable for storing the Bucket that comes after this one
    Bucket next;
    //Variable for storing the data that this Bucket holds
    String data;

    public Bucket(String data) {
        //Set this Bucket's data variable to the value that is passed in
        this.data = data;
        //Initialize the previous and next variables with null
        this.previous = null;
        this.next = null;
    }
}
