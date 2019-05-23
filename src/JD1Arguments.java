public class JD1Arguments {
    public static void main(String[] args) {
        sum(1, 5, 9, 15, 12, 64);
        mult("No multipliers");
        mult("Five multipliers:", 5, 4, 3, 634, 9431);
    }

    static void sum(int ...args){
        int result = 0;
        for (int n: args){
            result += n;
        }
        System.out.println(result);
    }

    static int mult(String someString, int ...args){
        int result = 1;
        for (int n: args) {
            result *= n;
        }
        System.out.println(someString);
        System.out.println(result);
        return result;
    }
}
