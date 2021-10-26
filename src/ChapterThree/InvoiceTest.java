package ChapterThree;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice myInvoice = new Invoice(1, 50);

   double myInvoicePrice = myInvoice.getPrice();
   System.out.println("the invoice amount is "+ myInvoicePrice);

   //myInvoice.setPrice();
   //myInvoicePrice = myInvoice.getPrice();
   //System.out.println("the current invoice amount is "+ myInvoicePrice);

   myInvoice.setQuantity(200);
   int myInvoiceQuantity = myInvoice.getQuantity();
   System.out.println("the current invoice amount is "+ myInvoicePrice);


    }
}
