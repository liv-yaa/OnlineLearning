public class Yellow {
//irsmith
    public static long p1(long n) {
        long lo = System.currentTimeMillis();

        // Problem 1 - O(1) runtime
        long sum = 0;
        for(long i=0; i<n; i++) {
            sum = sum + 1;

        }
        long hi = System.currentTimeMillis();
        long time = hi - lo;
        return time;
    }
    public static long p2(long n) {
        long lo = System.currentTimeMillis();
        //Problem 2 - O(N^2) runtime
        long sum = 0;
        for(long i=0; i<n; i++) {
            for( long j=0; j<n; j++) {
                sum = sum + 1;
            }
        }
        long hi = System.currentTimeMillis();
        long time = hi - lo;
        return time;
    }
    public static long p3(long n) {
        long lo = System.currentTimeMillis();
        //Problem 3
        long sum = 0;
        for(long i=0; i < n; i++) {
            for(long j=0; j<n*n; j++) {
                sum = sum + 1;
            }
        }
        long hi = System.currentTimeMillis();
        long time = hi - lo;
        return time;
    }

    public static long p4(long n) {
        long lo = System.currentTimeMillis();
        //Problem 4
        long sum = 0;
        for( long i=0; i<n; i++) {
            for( long j=0; j<i; j++) {
                sum = sum + 1;
            }
        }
        long hi = System.currentTimeMillis();
        long time = hi - lo;
        return time;
    }

    public static long p5(long n) {
        long lo = System.currentTimeMillis();
        //Problem 5
        long sum = 0;
        for( long i=0; i<n; i++) {
            for( long j=0; j<i*i; j++) {
                for( long k=0; k < j; k++) {
                    sum = sum + 1;
                }
            }
        }
        long hi = System.currentTimeMillis();
        long time = hi - lo;
        return time;
    }

    public static long p6(long n) {
        long lo = System.currentTimeMillis();
        //Problem 6
        long sum = 0;
        for( long i=1; i<n; i++) {
            for( long j=1; j<i*i; j++) {
                for( long k=0; k < j; k++) {
                    sum = sum + 1;
                }
            }
        }
        long hi = System.currentTimeMillis();
        long time = hi - lo;
        return time;
    }

    public static void main(String[] args) throws InterruptedException {

//        System.out.println("P1");
//        long n = 10000000;
//
//        for (long i=0; i<6; i++) {
//            n = n * 2;
//            long time = p1(n);
//            System.out.println("n = " + n + ": " + time + " ms");
//        }
//
//        System.out.println("P2");
//        n = 1000;
//
//        for (long i=0; i<6; i++) {
//            n = n * 2;
//            long time = p2(n);
//            System.out.println("n = " + n + ": " + time + " ms");
//        }
//
//        System.out.println("P3");
//        n = 100;
//
//        for (long i=0; i<4; i++) {
//            n = n * 2;
//            long time = p3(n);
//            System.out.println("n = " + n + ": " + time + " ms");
//        }
//
//        System.out.println("P4");
//        n = 10000;
//
//        for (long i=0; i<4; i++) {
//            n = n * 2;
//            long time = p4(n);
//            System.out.println("n = " + n + ": " + time + " ms");
//        }
//
//        System.out.println("P5");
//        n = 10;
//
//        for (long i=0; i<4; i++) {
//            n = n * 2;
//            long time = p5(n);
//            System.out.println("n = " + n + ": " + time + " ms");
//        }

        System.out.println("P6");
        long n = 100;

        for (long i=0; i<6; i++) {
            n = n + 50;
            long time = p6(n);
            System.out.println("n = " + n + ": " + time + " ms");
        }

    }
}
