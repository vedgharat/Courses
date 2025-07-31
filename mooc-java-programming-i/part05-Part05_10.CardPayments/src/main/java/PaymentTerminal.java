
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double price = 2.50;
        if (payment >= price) {
            this.money += price;
            this.affordableMeals++;
            return payment - price; // return change
        } else {
            return payment; // not enough money, return full amount
        }
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        double price = 4.30;
        if (payment >= price) {
            this.money += price;
            this.heartyMeals++;
            return payment - price; // return change
        } else {
            return payment; // not enough money, return full amount
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        double price = 2.50;
        if (card.takeMoney(price)) {
            this.affordableMeals++;
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        double price = 4.30;
        if (card.takeMoney(price)) {
            this.heartyMeals++;
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);  // increase card balance
            this.money += sum;   // add the same amount to the terminal cash
        }
    }

 

    @Override
    public String toString() {
        return "money: " + this.money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
