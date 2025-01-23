package Assignments.Assignment_2;

// Tanishq Harit - tharit@stevens.edu
// CWID: 20031876

public class Widget {
    private double price;   // to hold price of widget.
    private boolean sold;   // to check if widget is sold or not, initially False.

    private static double income = 0;   // initially 0, no widgets sold yet.

    public Widget(double price) {
        this.price = price;
        this.sold = false;
    }

    public double getPrice() {      // method to return price of the widget.
        return price;
    }

    public void setPrice(double price) {    // to change price of widget, but only when not sold.
        if (!sold) {
            this.price = price;
        }
    }

    public boolean isSold() {   // Boolean decision, whether widget is sold or not.
        return sold;
    }

    public static double getIncome() {      // total income for all sold widgets.
        return income;
    }

    public void sell() {    // if not sold, then sold = true, then updating the total income.
        if (!sold) {
            sold = true;
            income += price;
        }
    }
}