package andrePardinho.listas.cap3;

public class InvoiceTest {
    public static void main(String[] args) {

        Invoice invoice1 = new Invoice("1234-A", "Processador AMD Ryzen 7 5700X3D", 5, 1699.99);

        System.out.println("Id: " + invoice1.getNumberId());
        System.out.println("Description: " + invoice1.getDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price: R$" + invoice1.getPrice());

        System.out.println("Invoice Amount: R$" + invoice1.getInvoiceAmount());
    }
}
