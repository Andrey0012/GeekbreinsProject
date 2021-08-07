public class MyClass2 {
    public static void main(String[] args){
        short s = 2404;
        int i = 123456;
        float f = 12.5F;
        long l = 1000L;
        char c = 'A';
        double d = 15.5D;
        byte b = 10;
        boolean bool = true;
        primer(5,8);
        number(5);
        name("Андрей");
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(c);
        System.out.println(d);
        System.out.println(b);
        System.out.println(number3(-5));
        System.out.println(Formyla(100F,8F,7F,8F));
        System.out.println(primer1(5,20));
        years(2020);
    }
    static float Formyla (float a, float b, float c, float d) { return a * ( b + ( c / d ) );}
    static boolean primer1 (int a, int b) { return (a + b < 20 && a + b > 10);}
    static void primer (int a, int b) {
        if (a + b < 20 && a + b > 10)
        { System.out.println("true"); }
        else { System.out.println("false");
        }
    }
    static void number (int a) {
        if (a < 0)
        { System.out.println("передали отрицательное число"); }
        else { System.out.println("передали положительное число");
        }
    }
    static boolean number3 (int a) { return a < 0 ;}
    static void name (String name) { System.out.println("привет " + name + "!"); }
    static void years (int a) {
        if (((a % 4 ==0) && !(a % 100 == 0)) ||  (a % 400 == 0)) {
            System.out.println("год високосный");
        } else {
            System.out.println("год не високосный");
        }
    }
}






