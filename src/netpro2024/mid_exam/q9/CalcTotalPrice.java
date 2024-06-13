package netpro2024.mid_exam.q9;
public class CalcTotalPrice {

    public static void main(String[] args) {
        /* 変更可 */
        Item[] books = {
                new Item("本A", 1000, false, true),
                new Item("本B", 200, true, true),
                new Item("皿", 400, true, false),
                new Item("本C", 500, false, false),
        };

        System.out.println(calcTotalPrice(books));
        // 11700

        /*
          上記例の内訳
          11700 = (1000 * 10) + (200 * 10 / 2) + (400 / 2) + 500
        */
    }

    public static int calcTotalPrice(Item[] items) {
        // FIXME: この関数を作りなさい
        int prices=0;
        for(Item i:items){
            int price=i.price;
            if(i.isPremier==true){
                price*=10;
            }
            if(i.isBroken==true){
                price*=0.5;
            }
            prices+=price;
        }
        return prices;
    }


    /* 変更不可 */
    public static class Item {
        public final String name;
        public final int price;
        public final boolean isBroken;
        public final boolean isPremier;

        public Item(String name, int price, boolean isBroken, boolean isPremier) {
            this.name = name;
            this.price = price;
            this.isBroken = isBroken;
            this.isPremier = isPremier;
        }
    }
}