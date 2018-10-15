public class roketman {
    private static final int E = 2;

    public static void main(String[] args) {
        cone();
        line();
    }

    private static void cone() {
        for (int e = 1; e < E * 2; e++) {
            for (int a = E * 2; a > e; a--) {
                System.out.print(" ");
            }
            for (int b = 0; b < e; b++) {
                System.out.print("/");
            }
            System.out.print("**");
            for (int c = 0; c < e; c++) {
                System.out.print("\\");
            }
            System.out.println("");
        }
    }
    private static void line() {
        System.out.print("+");
            for(int d = 0; d < E * 2; d++){
                System.out.print("=");
                System.out.print("*");
        }
        System.out.println("+");
    }
    private static void
    for(int a = 1; a < E * 2; a++){
        System.out.print("|");
    }
}
