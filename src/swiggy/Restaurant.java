package swiggy;

public class Restaurant {
    int biryani;
    int sweet;
    int drink;
    int friedRice;
    int biryaniCost=100;
    int sweetCost=30;
    int drinkCost=20;
    int friedRiceCost=80;
    double totalCost;

    public Restaurant(int biryani, int sweet, int drink, int friedRice){
        this.biryani=biryani;
        this.drink=drink;
        this.friedRice=friedRice;
        this.sweet=sweet;
    }
}

