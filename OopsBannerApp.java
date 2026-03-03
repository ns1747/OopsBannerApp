public class OopsBannerApp {

    public static void main(String[] args) {
        printBanner();
    }

    // Static method as required in UC3
    public static void printBanner() {

        System.out.println(String.join(" ",
                " ***  ",
                " ***  ",
                " **** ",
                " **** "
        ));

        System.out.println(String.join(" ",
                "*   * ",
                "*   * ",
                "*     ",
                "*     "
        ));

        System.out.println(String.join(" ",
                "*   * ",
                "*   * ",
                "***   ",
                " ***  "
        ));

        System.out.println(String.join(" ",
                "*   * ",
                "*   * ",
                "*     ",
                "    * "
        ));

        System.out.println(String.join(" ",
                "*   * ",
                "*   * ",
                "*     ",
                "    * "
        ));

        System.out.println(String.join(" ",
                "*   * ",
                "*   * ",
                "*     ",
                "*   * "
        ));

        System.out.println(String.join(" ",
                " ***  ",
                " ***  ",
                "*     ",
                " ***  "
        ));
    }
}