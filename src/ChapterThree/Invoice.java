package ChapterThree;

public class Invoice<price> {
    private String invoiceNumber;
    private String description;
    private int quantity;
    private double price;
    double invoiceAmount;


    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int initialQuantity) {
        initialQuantity = quantity;
    }

    public void setInvoiceNumber(String newNumber) {
        invoiceNumber = newNumber;
    }

    public void setPrice(double initialPrice) {
        double setPrice = 0;
        initialPrice = price;
    }


    public void InvoiceAmount(double invoiceAmount) {
        if (price > 0)
            price = quantity * price;
    }

    public void invoiceQuantity(int invoiceQuantity) {
        if (quantity > 0)
            quantity = (int) (quantity / price);
    }

    public double getInvoiceAmount() {
        return price;
    }

    public Invoice(int initialQuantity, double initialPrice) {
        quantity = initialQuantity;
        price = initialPrice;

    }

}
