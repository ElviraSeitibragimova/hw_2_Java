import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }
    static {Scanner sc = new Scanner(System.in);
        System.out.println("введите значение основания параллелограмма, см");
                int side1 = 0;
                if (sc.hasNextInt()) {
                side1 = sc.nextInt();
                System.out.println("вы ввели число" + " " + side1);
                } else {
                System.out.println("вы ввели неправильное значение");

                }
                System.out.println("введите значение высоты параллелограмма, см");
                int side2 = 0;
                if (sc.hasNextInt()) {
                side2 = sc.nextInt();
                System.out.println("вы ввели число" + " " + side2);
                } else {
                System.out.println("вы ввели неправильное значение");
                }
                int sideNew1 = (side1);
                int sideNew2 = (side2);

                float SRectangl = sideNew1 * sideNew2;
                System.out.println("пллощадь прямоугольника=" + SRectangl + "см^");
                }
                }