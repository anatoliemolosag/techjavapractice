package OOP.FinalKeyword;

public final class T_Shirt extends Shirt {


    public T_Shirt() {
        super(11.99,"M");
    }

//    @Override       ----> you can not override final method from parent in the child
//    public boolean isCotton(){
//        System.out.println("T-Shirt is Cotton");
//        return true;
//    }

    public void discount(double percent){
        System.out.println("You are getting discount from t-shirt"+percent);
    }
}
