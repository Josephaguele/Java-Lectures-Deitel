package ch03.exercises.Invoice;
/*
* Create a class called Invoice that a hardware store might use to represent
an invoice for an item sold at the store. An Invoice should include four pieces of information as
instance variables—a part number (type String), a part description (type String), a quantity of the
item being purchased (type int) and a price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.
In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
multiplies the quantity by the price per item), then returns the amount as a double value. If the
* quantity is not positive, it should be  set to 0. If the price per item is not positive, it should be set
* to 0.0
* Write a test application named InvoiceTest that demonstrates class Invoice's capabilities*/

public class Invoice {
    private String partNumber; //part number of hardware
    private String partDescription; // part description of hardware
    private int itemQuantity; // quantity of item being purchased
    private double itemPrice; // price of item

    //constructor that initializes instance variables.
    public Invoice(String partNo, String partDesc, int itemQty, double itemPr){
        partNumber = partNo;
        partDescription = partDesc;
        itemQuantity = itemQty;
        itemPrice = itemPr;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPr) {
        itemPrice = itemPr;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescr){
        partDescription = partDescr;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNo){
        partNumber =partNo;


    }

    public double getInvoiceAmount(int itemQuantity, double itemPrice){
        double invoiceAmount = itemQuantity * itemPrice;

        // if the quantity is not positive, it should be set to zero
        if (itemQuantity > 0.0)
            this.itemQuantity = itemQuantity;

        //if the price per item is not positive, it should be set to 0
        if(itemPrice <= 0.0)
            this.itemPrice = itemPrice;

        return invoiceAmount;
    }
}// end class Invoice
