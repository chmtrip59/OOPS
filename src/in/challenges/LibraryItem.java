package in.challenges;

public class LibraryItem {

    private String itemId;

    private String title;

    private String author;

    public void checkout(){
        System.out.println("Checkout");
    }
    public void  returnItems(){
        System.out.println("Returning the item");
    }
}
