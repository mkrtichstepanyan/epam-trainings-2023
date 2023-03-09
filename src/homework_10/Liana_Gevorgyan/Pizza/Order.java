package homework_10.Liana_Gevorgyan.Pizza;

public class Order implements IPrintable {
    private static final int MAX_PRODUCT_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;

    private int index;
    private int orderNumber;
    private Customer customer;
    private Product[] products = new Product[10];

    Order() {
        orderNumber = initialId++;
    }

    public void addProduct(Product product) {


        try {
            product.validateAndCorrectName(this);

            products[index] = product;
            index++;

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Hop axper jan!!");
        }

    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double calculateOrderPrice() {
        double totalPrice = 0.0;
        for (int i = 0; i < index; i++) {
            totalPrice = totalPrice + products[i].calculatePrice() * products[i].getQuantity();
        }

        return totalPrice;
    }


    public void printOrderAttributes() {
        for (int i= 0; i < index; i++ ) {
            System.out.println("[" + orderNumber + customer.getNumber() + products[i].getName() + products[i].getQuantity() + "]");
        }
    }

    public int getNumber() {
        return orderNumber;
    }

    public int getCustomerId() {
        return  customer.getNumber();
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public int getProductsQty() {
        return index;
    }

    public Product[] getProducts() {
        return products;
    }


    @Override
    public void print() {

        System.out.println("********************");
        System.out.println("Order : " + getNumber());
        System.out.println("Client: " + getCustomerId());

        for(int i = 0; i< getProductsQty(); i++){
            Product currentProduct=getProducts()[i];

            System.out.println("Name : " + currentProduct.getName());
            System.out.println("------------------");
            System.out.println(currentProduct.getPrintableString());
            System.out.println("------------------");

            System.out.println("Amount: " + currentProduct.calculatePrice() + "$");
            System.out.println("Quantity: " + currentProduct.getQuantity());
            System.out.println("------------------");

        }


        System.out.println("Total amount: " + calculateOrderPrice() + "$");

        System.out.println("********************");
    }
}
