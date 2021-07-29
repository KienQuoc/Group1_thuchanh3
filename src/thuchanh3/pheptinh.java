package thuchanh3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class pheptinh {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
         
        System.out.println("Nhập vào số thứ nhất: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int secondNumber = scanner.nextInt();
		// 6 -> 14 Hoàng Phước Nhân
        int tong = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + tong);
        //15-17 Quốc Hùng
        int hieu = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + hieu);
        // 3->4, 21->23 Nguyễn Tấn An
		// Viết code ở đây nhé, nhớ ghi chú từng phần mỗi người
        int tich = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + tich);
        //25->27 Lê Quang Định
        float thuong = (float) firstNumber / secondNumber;
        System.out.println(firstNumber + " / " + secondNumber + " = " + 
                decimalFormat.format(thuong));  // làm tròn thương đến 2 chữ số thập phân
        //28->31 Trần Quang Sang
	}

}
