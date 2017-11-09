package Chapter3;
public class InvoiceClass312Test {
    public static void main(String[] args) {
        InvoiceClass312 item1 = new InvoiceClass312("Part312","Car",5,17.5);
        //выводим на экран
        System.out.printf("Name:%s, description:%s, quantity:%d, price:%.2f%n",
                item1.getPartNumber(),item1.getPartDescr(),item1.getQuantity(),item1.getPrice());
        System.out.printf("Total price: %.2f%n", item1.InvoiceAmount());
    }
}
