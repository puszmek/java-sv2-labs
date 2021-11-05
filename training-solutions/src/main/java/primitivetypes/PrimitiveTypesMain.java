package primitivetypes;

public class PrimitiveTypesMain {

    public static void main(String[] args) {

        int a = 2;    // típusnak megfelelő értékadás
        System.out.println(a);

        Integer b = 2;    // autoboxing
        System.out.println(b);

        Integer c = a;    // autoboxing
        System.out.println(c);

        Integer d = b;    // típusnak megfelelő értékadás
        System.out.println(d);

        Integer e = Integer.valueOf(2);    // típusnak megfelelő értékadás
        System.out.println(e);

        int f = Integer.valueOf(2);    // autounboxing
        System.out.println(f);

        int g = Integer.valueOf(a);    // autounboxing
        System.out.println(g);

        int h = Integer.valueOf(c);    // autounboxing, autounboxing
        System.out.println(h);

        int i = Integer.parseInt("2");    // típusnak megfelelő értékadás
        System.out.println(i);

        Integer j = Integer.parseInt("2");    // autoboxing
        System.out.println(j);

        boolean k = true;    // típusnak megfelelő értékadás
        Boolean l = true;    // autoboxing
        boolean m = Boolean.valueOf(true);    // autounboxing
        Boolean n = Boolean.valueOf(true);    // típusnak megfelelő értékadás
        boolean o = Boolean.parseBoolean("TrUe");     // típusnak megfelelő értékadás
        Boolean p = Boolean.parseBoolean("TrUe");     // autoboxing
        boolean q = Boolean.parseBoolean("TreU");     // típusnak megfelelő értékadás
        Boolean r = Boolean.parseBoolean("TreU");     // autoboxing
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
        System.out.println(q);  // false
        System.out.println(r);  // false
    }
}
