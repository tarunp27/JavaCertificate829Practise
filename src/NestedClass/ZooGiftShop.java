package NestedClass;

import java.util.List;

public class ZooGiftShop {
    int a,b,c;
//        abstract class SaleToday {
//        abstract int dollarsof();
//    }
    interface SaleToday {
        int tips = 50;
        int dollarsof();

    }

    public int admission(int basePrice) {
        SaleToday sale = new SaleToday() {
            public int dollarsof()
            {
//                tips++ ;
                return 3000+tips;
            }
            public int commition() {
                return 20;
            }
        };
        return basePrice - sale.dollarsof();

    }

    public static void main(String[] args) {
        ZooGiftShop gift = new ZooGiftShop();
        int sales = gift.admission(5000);
        System.out.println(sales);
//        var na = new Integer[]{1,null,3};
//        List<Integer>lst = List.of(na);
    }
}
