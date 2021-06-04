import java.util.Date;
import java.util.Scanner;

public class Lesson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// x++ <=> x = x + 1 
		int x = 1; // x = 1 
		int y = x++; // y = 1 | x = 2 
		int z = ++x; // z = 3 | x = 3 
		
		System.out.printf(" x = %d , y = %d , z = %d ", x, y, z );
		 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("mời bạn nhập vào một chuỗi" );
// 		String chuoiString = scanner.next(); // gặp dấu cách thì dừng lại
		String chuoiString = scanner.nextLine();
		System.out.println(" chuỗi vừa nhập là" + chuoiString+"\n\n");
		
		System.out.println("mời bạn nhập vào chuỗi");
		String chuoiString2 = scanner.nextLine();
		System.out.println("số vừa nhập vào là:" + chuoiString+"\n\n");
		
		System.out.println("mời bạn nhập vào một chữ số");
		int inputNumber = scanner.nextInt();
		System.out.println("số vừa nhập vào là:" +inputNumber );
		
		boolean checkTyping = true;
		
		int i = 0;
		
		do {
			System.out.println("mời bạn nhập vào tuổi của mình : ");
			if(scanner.hasNextInt()) {
				int temp = scanner.nextInt();
				System.out.println("bạn đã nhập số tuổi = " + temp );
				i= 9;
				
			}
			
		} while (checkTyping);
		
		

	}

}
