package HW3_1;

public class APP {
    public static void app(String[] args) {
        HW3_1.PRODUCT[] product = new HW3_1.PRODUCT[4];
        product[0] = new HW3_1.PRODUCT(1, "Milky way 26", "4011100091054", "NY Ltd.", 33, 180, 20);
        product[1] = new HW3_1.PRODUCT(2, "Stew 325", "4870004760165", "Russia Ltd.", 154, 720, 5);
        product[2] = new HW3_1.PRODUCT(3, "Aloevera drink 0,5", "8801105912159", "Thailand Ltd.", 109, 180, 3);
        product[3] = new HW3_1.PRODUCT(4, "Coca-Cola 0,5", "4760567891014", "USA Ltd.", 75, 180, 6);
        product[4] = new HW3_1.PRODUCT(5, "Spaghetti 700", "7894567891015", "Russia Ltd.", 48, 360, 12);

        for (int i = 0; i < product.length; i++) {
            product[i].show();
        }


    }

        }
