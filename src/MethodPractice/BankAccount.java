package MethodPractice;

public class BankAccount {

    String bankName;
    String accountHolderName;
    double balance;
    long accountNumber;
    String userName;
    String password;
    boolean isLoggedIng;

    /*
    -create a method that will display all of the account
    information
    -create a method that will be named as deposit ,
    it will update and show the new balance
    -create a method that will be named as withdraw ,
    it will update and show the new balance
    -create a methode that will check if the use is logged in
    or not , and return true/false

    */
    public void accountInfo(){
        bankName="Bank of America";
        accountHolderName="Anatolie Molosag";
        balance =500;
        accountNumber=333344445;
        userName= "anatoliemolosag94";
        password="blablabla";

        System.out.println("Bank name "+ bankName + "\n Account Holder Name "+accountHolderName + "Balance: "+ balance +
                "\nAccount number: "+ accountNumber + "\nisLogged in: "+ isLoggedIng);


    }
    public double deposit(double money){
        balance+=money;
        System.out.println("your new return is "+ balance);
        return balance;
    }
    public double withdraw(double money) {
        balance -= money;
        System.out.println("your new balance after withdraw is: " + balance);
        return balance;

    }

    public boolean isLoggedIn(String user, String pass){
        if(user.equals(userName) &&pass.equals(password)){

            System.out.println("You logged in succesfull");
        }else{
            System.out.println("Your user or pass does not match");

        }
        return isLoggedIng;
    }

    public static void main(String[] args) {

        BankAccount obj =new BankAccount();
        obj.accountInfo();
        obj.deposit(100);
        obj.withdraw(50);
        obj.isLoggedIn("anatoliemolosag94","blablabla");



    }

}
