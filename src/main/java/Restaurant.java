
class Restaurant {
    private String name;
    private int rating;

    // Constructor
    public Restaurant(String restaurantName, int userRating) {
        name = restaurantName;
        rating = userRating;
    }

    // Mutator methods
    public void setName(String restaurantName) {
        name = restaurantName;
    }
    public void setRating(int userRating) {
        rating = userRating;
    }
    
    // Accessor methods
    public String getName() {
        return name;
    }
    public int getRating() {
        return rating;
    }
    
    public void print() {
        System.out.println(name + " -- " + rating);
    }
}