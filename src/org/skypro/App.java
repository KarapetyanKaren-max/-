package org.skypro;

public class App {
    private static Product[] products;

    {
        Product milk = new Product(15, "milk");
        System.out.println(milk);
        ProductBasket basket = new ProductBasket();
        System.out.println(basket);
    }

    static ProductBasket basket = new ProductBasket();

    static void addProduct(String name) {
        boolean productAvailability = false;
        for (int number = 0; number < products.length; number++) {
            if (products[number].productsName.equalsIgnoreCase(name.trim())) {
                System.out.println("Продукт есть в магазине");
                basket.addProduct(products[number]);
                productAvailability = true;
                break;

            }
        }
        if (!productAvailability) {
            System.out.println("Продукта в магазине нет");
        }
    }

    public static void main(String[] args) {
        System.out.println("Добави продукт в корзину");
        String product1 = "молоко";
        String product2 = "рыба";
        String product3 = "хрен";
        String product4 = "масло";
        String product5 = "торт";
        addProduct(product1);
        addProduct(product2);
        addProduct(product3);
        addProduct(product4);
        addProduct(product5);
        basket.printBasket();
        System.out.println("Стоимость корзины: " + basket.priceBasket());
    }
}