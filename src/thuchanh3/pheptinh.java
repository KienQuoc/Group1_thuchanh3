package thuchanh3;

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
		// Viết code ở đây nhé, nhớ ghi chú từng phần mỗi người
	}

}
