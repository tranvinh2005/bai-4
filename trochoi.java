import java.util.Random;
import java.util.Scanner;

public class trochoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int dung = 0;
        int traloisai = 0;

        while (traloisai < 3) {
            int numCount = random.nextInt(4) + 2; //
            int[] numbers = new int[numCount];
            int traloidung = 0;

            // Tạo các số ngẫu nhiên và tính tổng
            StringBuilder problem = new StringBuilder();
            for (int i = 0; i < numCount; i++) {
                numbers[i] = random.nextInt(100) + 1;
                traloidung += numbers[i];
                problem.append(numbers[i]);
                if (i < numCount - 1) {
                    problem.append(" + ");
                }
            }

            System.out.println("giai bai toan: " + problem + " = ?");
            int userAnswer = scanner.nextInt();

            if (userAnswer == traloidung) {
                System.out.println("dung r!");
                dung++;
            } else {
                System.out.println("sai roi,dap an dung ka " + traloidung + ".");
                traloisai++;
            }

            System.out.println("diem hien tai: " + dung + "\n");
        }

        System.out.println("tro choi ket thuc diem ban dat duoc " + dung + " diem.");
        scanner.close();
    }
}

/*}*/
