public class JD1Wrappers {
    public static void main(String[] args) {
        Float f1 = new Float(10.03);
        Float f2 = 35.68f;
        String s1 = Float.toString(0f);
        String s2 = String.valueOf(f1);
        Byte b = Byte.valueOf("120");
        double d = b.doubleValue();
        Character ch1 = new Character('f');
        Character ch2 = 'a';
        int i = Character.digit(ch1.charValue(), 10);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(b);
        System.out.println(d);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch1.charValue());
        System.out.println(i);
        System.out.println(f1.compareTo(f2));
        System.out.println(b.equals((byte) d));
    }
}
