package stringtype;

public class StringTypeMain {

    public static void main(String[] args) {

        String prefix = "Hello ";
        System.out.println("prefix: " + prefix);
        String name = "John Doe";
        System.out.println("name: " + name);
        String message = prefix + name;
        System.out.println("message: " + message);
        boolean b = "Hello John Doe".equals(message);
        System.out.println("b: " + b);
        message = message + 444;
        System.out.println("new message: " + message);
        boolean c = "Hello John Doe".equals(message);
        System.out.println("c: " + c);

        String empty = "" + "";
        System.out.println("Két összekonkatenált üres String értéke: " + empty + " és hossza: " + empty.length());


        String str = "Abcde";
        System.out.println("Az Abcde String hossza: " + str.length());
        System.out.println("Az első és harmadik karaktere vesszővel elválasztva: " + str.substring(0, 1) + ", " + str.substring(2, 3));
        System.out.println("Az első és harmadik karaktere vesszővel elválasztva: " + str.charAt(0) + ", " + str.charAt(2));
        System.out.println("Az elsőtől a harmadik karakterig tartó részlete: " + str.substring(0,2));

    }
}
