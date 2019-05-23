public class JD1Primitives {
    public static void main(String[] args) {
        char charX, charY;
        byte byteX, byteY;
        short shortX, shortY;
        int intX, intY;
        long longX, longY;
        float floatX, floatY;
        double doubleX, doubleY;
        boolean booleanX, booleanY;

//        charX='d';
//        charY=102;
//        System.out.println("charX = " + charX);
//        System.out.println("charY = " + charY);
//
//        charX='\u0066';
//        charY=126;
//        System.out.println("charX = " + charX);
//        System.out.println("charY = " + charY);
//
//        byteX=127;
//        byteY=102;
//        System.out.println("byteX = " + byteX);
//        System.out.println("byteY = " + byteY);
//
//        byteX=-127;
//        byteY=-128;
//        System.out.println("byteX = " + byteX);
//        System.out.println("byteY = " + byteY);
//
//        intX=2_000_000_000;
//        intY=intX+1_000_000_000;
//        System.out.println("intX = " + intX);
//        System.out.println("intY = " + intY);
//
//        longX=2_000_000_000_000L;
//        longY=longX+1_000_000_000;
//        System.out.println("longX = " + longX);
//        System.out.println("longY = " + longY);
//
//        floatX=2.1f;
//        floatY=3_000_000_000_000_000L;
//        System.out.println("floatX = " + floatX);
//        System.out.println("floatY = " + floatY);
//
//        floatX=0.000546546546546546465454656512f;
//        floatY=3-2.1f;
//        System.out.println("floatX = " + floatX);
//        System.out.println("floatY = " + floatY);
//
//        doubleX=0.000546546546546546465454656512f;
//        doubleY=3-2.1f;
//        System.out.println("doubleX = " + doubleX);
//        System.out.println("doubleY = " + doubleY);
//
//        doubleX=0.5464/0;
//        doubleY=-3.2/0;
//        System.out.println("doubleX = " + doubleX);
//        System.out.println("doubleY = " + doubleY);
//
        doubleX=0.55%11;
//        doubleY=0/0; ==> ArithmeticException division by zero!
        doubleY=0.55%0.11;
        System.out.println("doubleX = " + doubleX);
        System.out.println("doubleY = " + doubleY);

        doubleX=0.55/11;
        doubleY=0.55/0.11;
        System.out.println("doubleX = " + doubleX);
        System.out.println("doubleY = " + doubleY);
    }
}
