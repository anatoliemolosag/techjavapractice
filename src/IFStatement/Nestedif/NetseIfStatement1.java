package IFStatement;

public class NetseIfStatement1 {
    public static void main(String[] args) {
        /*passport, visa , ticket , covid testing

         */

        boolean passport = true, visa = false , ticket = true , covid = true;

        if (passport){

            if(visa){

                if (ticket){

                    if(covid){

                        System.out.println("you can fly");


                    }else {
                        System.out.println("you shoud have covid test");

                    }

                }else{
                    System.out.println("you shoud have a ticket");
                }


            }else{
                System.out.println("you shoud have visa");
            }
        }else{
            System.out.println("you shoud have passaport");
        }

    }
}
