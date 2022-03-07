package string;

public class SubstringIndexOf {
    public static void main(String[] args) {
        String s = "anatolie is a good co-pilot";
        String a = s.substring(10);//s a good co-pilot
        String b = s.substring(14,19);//good

        String c = s.substring(0,s.length() );//anatolie is a good co-pilot


        int d =s.indexOf("co-pilot");
        String e = s.substring(s.indexOf("is"),s.indexOf("is") +2);
        int g = s.lastIndexOf("o");
        String f = s.substring(14,18);
        int h = f.length();
        int i = f.lastIndexOf('o');
        int j = s.indexOf("is");
        String k = s.substring(s.indexOf("co-pilot"),s.lastIndexOf("co-pilot")+8);

        System.out.println(k);

    }
}
