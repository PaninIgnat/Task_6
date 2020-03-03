import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_6 {
    public static void main(String[] args) throws IOException {

        System.out.println("Введите 3 числа:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String num = reader.readLine(); String num2 = reader.readLine(); String num3 = reader.readLine();
        int x = Integer.parseInt(num);
        int y = Integer.parseInt(num2);
        int z = Integer.parseInt(num3);
        int avg = (x + y + z)/3;
        System.out.println(avg);

        int avg2 = avg / 2;
        if (avg2 > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}



