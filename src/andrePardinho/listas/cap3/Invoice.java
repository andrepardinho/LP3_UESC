package andrePardinho.listas.cap3;

public class Invoice {
    private String numberId;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String numberId, String description, int quantity, double price){
        this.numberId = numberId;
        this.description = description;
        setQuantity(quantity);
        setPrice(price);
    }

    public String getNumberId() {
        return numberId;
    }
    public void setNumberId(String numberId) {
        this.numberId = numberId;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public double getInvoiceAmount() {
        return quantity * price;
    }
}
