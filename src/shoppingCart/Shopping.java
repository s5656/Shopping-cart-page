package shoppingCart;

import java.util.ArrayList;

public class Shopping {
    public void milkOffer(ArrayList<Products> milkbill){//milk offer
        int count=0;
        for (Products milk:milkbill){
            if (milk.getName().equalsIgnoreCase("milk")) {
                count++;//count
            }
        }
        if (count>=2) {
            milkbill.add(new Products("Milk", 34));
        }
    }
}
