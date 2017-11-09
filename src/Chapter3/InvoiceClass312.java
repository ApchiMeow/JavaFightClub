package Chapter3;
public class InvoiceClass312 {
    private String partNumber;
    private String partDescr;
    private int quantity;
    private double price;

    public InvoiceClass312(String partNumber, String partDescr, int quantity, double price){
        setPartNumber(partNumber);
        setPartDescr(partDescr);
        setQuantity(quantity);
        setPrice(price);
    }

    public double InvoiceAmount(){
        return getQuantity()*getPrice();
    }
    public String getPartNumber(){
        return partNumber;
    }
    public String getPartDescr(){
        return partDescr;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }
    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }
    public void setPartDescr(String partDescr){
        this.partDescr = partDescr;
    }
    public void setQuantity(int quantity){
        if (quantity > 0){
            this.quantity = quantity;
        }
    }
    public void setPrice(double price){
        if (price > 0.0) {
            this.price = price;
        }
    }
}