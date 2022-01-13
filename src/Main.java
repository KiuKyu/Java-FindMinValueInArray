import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // khởi tạo mảng
        Scanner scanner = new Scanner(System.in);
        int arrSize;
        System.out.print("Enter array's size: ");
        arrSize = scanner.nextInt();
        int []arrNum = new int[arrSize];
//        nhập vào giá trị mảng
        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = (int) (Math.floor(Math.random() * 100 + 1));
        }
//        in mảng
        for (int j: arrNum) {
            System.out.print(j + ", ");
        }
//        khai báo biến min = phần tử đầu tiên trong mảng + duyệt mảng tìm min
        int min = arrNum[0];
        for (int k = 0; k < arrNum.length; k++) {
            if (arrNum[k] < min) {
                min = arrNum[k];
            }
        }
        System.out.println();
        System.out.println("Min element in array is: " + min);
    }
}
