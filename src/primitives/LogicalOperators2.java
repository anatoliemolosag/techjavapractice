package primitives;

public class LogicalOperators2 {
    public static void main(String[] args) {
        /* you want to buy a new laptop it's cost is 1200$
        you can pay it as cash or credit
        if you have enought cash or enought credit limit in your credit card ,
        you can take the laptop home
         */

        int laptopcost = 1200;
        int cash = 0;
        int cclimit = 1100;

        boolean get = laptopcost<=cash || laptopcost<=cclimit || cash + cclimit >= laptopcost;
        System.out.println(get);

    }
}
