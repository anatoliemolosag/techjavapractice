public class testing {
    public static void main(String[] args) {


       int a =5;
       int b =15;

       a=a+b;
       b=a-b;
       a=a-b;

        System.out.println("a = "+a);
        System.out.println("b = "+b);



        String word1 = "Anatolie";
        String word2 = "Molosag";

        word1=word1+word2;

        word2=word1.substring(0,word1.length()-word2.length());
        word1=word1.substring(word2.length());
        System.out.println(word1);
        System.out.println(word2);


        int[] numbers = { 100,300,200,450,350 };

        int largest = 0;
        int secondLargest = 0;
        int thirdLargest = 0;

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i]>largest){
                thirdLargest=largest;
                secondLargest=largest;
                largest=numbers[i];
            } else if (numbers[i]>secondLargest&&numbers[i]!=largest){
                secondLargest=numbers[i];
            }else if (numbers[i]>thirdLargest&&numbers[i]!=secondLargest&&numbers[i]!=largest){
                thirdLargest=numbers[i];
            }

        }
        System.out.println(largest);
        System.out.println(secondLargest);
        System.out.println(thirdLargest);

        int e = 10;
        int f = 25;

        e=e+f;
        f=e-f;
        e=e-f;

        System.out.println("e is " +e);
        System.out.println("f is "+f);

        String name = "Anatolie";
        String last = "Molosag";

        name=name+last;
        last=name.substring(0,name.length()-last.length());
        name= name.substring(last.length());
        System.out.println(name);
        System.out.println(last);

        String str = "Anatolie Molosag";
        String reversed ="";
        for (int i = str.length(); i >=1 ; i--) {

            reversed += str.substring(i-1,i);

        }
        System.out.println(reversed);


        String str1 = "I love Java";
        String[] arr = str1.split(" ");

        String reversed1 = "" ;

        for (int i = arr.length-1 ; i>=0;i--){
            reversed1+=arr[i]+ " ";

        }

        System.out.println(reversed1);


    }
































}
