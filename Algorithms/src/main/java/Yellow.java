public class Yellow {


    public static void f(int n) {
        System.current();
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.printf("[%d %d]",i, j);
            }
            System.out.printf("%n");

        }
        System.out.printf("%n");

    }
    public static void main(String[] args) {

        System.out.printf("%s %n","hello");
        f(7);
    }
}