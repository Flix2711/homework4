public class Main {
    public static void main(String[] args) {
        // ex1
        int i = 1;
        while (i <= 10) {
            System.out.print(" " + i);
            i++;
        }

        System.out.println();

        for (i = 10; i >= 1; i--) {
            System.out.print(" " + i);
        }
        //ex2
        System.out.println();

        int friday = 1;
        for ( friday = 1; friday <=31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + " -е число. Необходимо подготовить отчет.");
        }

    }
}