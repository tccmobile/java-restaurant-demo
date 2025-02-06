
public class Main {
    public static void main(String[] args) {
        // Using constructor
        Restaurant favPlace = new Restaurant("Central Deli", 4);
        favPlace.print();
        
        // Using mutators
        favPlace.setName("New Deli");
        favPlace.setRating(5);
        
        // Using accessors
        System.out.println("Updated Restaurant: " + favPlace.getName() + " -- " + favPlace.getRating());
    }
}
