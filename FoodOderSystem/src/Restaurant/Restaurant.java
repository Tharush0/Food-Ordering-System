
package Restaurant;


public class Restaurant 
{
    private String restaurantName;
    private String[] foodNames;
    private double[] foodPrices;
    private int numItems;
    
    public Restaurant(String restaurantName, int capacity) 
    {
        this.restaurantName = restaurantName;
        this.foodNames = new String[capacity];
        this.foodPrices = new double[capacity];
        this.numItems = 0;
    }
    public void addMenuItem(String foodName, double price) 
    {
        if (numItems < foodNames.length) {
            foodNames[numItems] = foodName;
            foodPrices[numItems] = price;
            numItems++;
            System.out.println("Added '" + foodName + "' with price $" + price + " to the menu.");
        } else {
            System.out.println("Menu is full. Cannot add more items.");
        }
    }
    public void removeMenuItem(int index) 
    {
        if (index >= 0 && index < numItems) {
            String removedFoodName = foodNames[index];
            double removedFoodPrice = foodPrices[index];

            for (int i = index; i < numItems - 1; i++) {
                foodNames[i] = foodNames[i + 1];
                foodPrices[i] = foodPrices[i + 1];
            }

            numItems--;

            System.out.println("Removed '" + removedFoodName + "' with price $" + removedFoodPrice + " from the menu.");
        } else {
            System.out.println("Invalid index. Cannot remove item from the menu.");
        }
    }
    public void displayMenu() 
    {
        System.out.println("Menu for " + restaurantName + ":");
        for (int i = 0; i < numItems; i++) {
            System.out.println(foodNames[i] + " - $" + foodPrices[i]);
        }
    }
     public String getRestaurantName() {
        return restaurantName;
    }
     public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
     public String[] getFoodNames() {
        return foodNames;
    }
     public void setFoodNames(String[] foodNames) {
        this.foodNames = foodNames;
    }
     public double[] getFoodPrices() {
        return foodPrices;
    }
     public void setFoodPrices(double[] foodPrices) {
        this.foodPrices = foodPrices;
    }
     public int getNumItems() {
        return numItems;
    }
     public void setNumItems(int numItems) {
        this.numItems = numItems;
    }



}
