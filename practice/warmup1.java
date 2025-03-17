public class warmup1 {
    public class Warmup {
        public static int foo(int x) {
            if (x <= 1) {
                return x;
            } else {
                return x + foo(x - 1);
            }
        }

        public static void main(String[] args) {
            System.out.println(foo(5));
        }
    }
}
