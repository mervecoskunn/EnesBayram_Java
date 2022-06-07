public class TypeConversions {
    public static void main(String[] args) {
            //String---->Int
        String a = "5";
        String b ="6";
        int c = Integer.valueOf(a); //or int c = Integer.parseInt(a);
        int d = Integer.valueOf(b);
        int result = c+d;
        System.out.println("a+b= "+result);

        // Integer-->String
        int age = 34;
        String newAge1= age+"";
        String newAge2= String.valueOf(age);
        //

    }
}
