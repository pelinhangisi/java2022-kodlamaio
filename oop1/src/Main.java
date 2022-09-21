public class Main {

    public static void main(String[] args) {
        String mesaj = "Vade oranı";

        Product product1 = new Product();
                        // set value
        product1.name ="Delonghi Kahve Makinesi";
        product1.unitPrice = 7500;
        product1.discount = 7;
        product1.unitsInStock = 3;
        product1.imageUrl = "bilmemne.jpg";

                        //get
        System.out.println(product1.name);
    }
}
