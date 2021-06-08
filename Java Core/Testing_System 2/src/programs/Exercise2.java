package programs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

import datatype.Account;
import datatype.Department;
import datatype.Exam;
import datatype.Group;
import datatype.Position;
import datatype.PositionName;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Department
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "giám đốc";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "sale";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "marketing";

//		Position
		Position position1 = new Position();
		position1.id = 1;
		position1.name = PositionName.PM;

		Position position2 = new Position();
		position2.id = 2;
		position2.name = PositionName.SCRUM_MASTER;

		Position position3 = new Position();
		position3.id = 3;
		position3.name = PositionName.DEV;

		// Group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Testing_System";

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Development";

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "sale";

		// Account
		Account acc1 = new Account();
		acc1.id = 1;
		acc1.email = "daonq1";
		acc1.userName = "daoq1";
		acc1.fullName = "Dao Nguyen 1";
		acc1.department = department2;
		acc1.position = position2;
		acc1.creatDate = LocalDate.now();
		Group[] groupAcc1 = { group2, group3 };
		acc1.groups = groupAcc1;

		Account acc2 = new Account();
		acc2.id = 2;
		acc2.email = "daonq2";
		acc2.userName = "daoq2";
		acc2.fullName = "Dao Nguyen 2";
		acc2.department = department2;
		acc2.position = position2;
		acc2.creatDate = LocalDate.now();
		Group[] groupAcc2 = { group2, group3 };
		acc2.groups = groupAcc2;

		Account acc3 = new Account();
		acc3.id = 3;
		acc3.email = "daonq3";
		acc3.userName = "daoq3";
		acc3.fullName = "Dao Nguyen 3";
		acc3.department = null;
		acc3.position = position3;
		acc3.creatDate = LocalDate.now();
		Group[] groupAcc3 = { group2, group3 };
		acc3.groups = groupAcc3;
		
// Question 1 :
		int i  = 5;
		System.out.printf("%d%n" , i );
		System.out.printf("%d%n" , i );
// 	Question 2 :	
		int a = 10000000;
		System.out.printf(Locale.US ,"%,d%n" ,a);
//	Question 3 :
		float c = 5.546098f;
		System.out.printf("%5.4f%n" , c);
// Question 4 :
//		String d = " Đào Xuân Vinh" ; 
//		System.out.printf(" Tên tôi là \" "+ d +"\" và tôi đang đọc thân );
	
// 	Question 5 :
	   String pattern = "dd/MM/yyyy HH:mm:ss";
	   SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	   String date = simpleDateFormat.format(new Date());
	   System.out.println(date);
// EXERCISE 3 : DATE FORMAT
// Question 1 : 
//	   Locale locale = new Locale("vn" , "VN");
//	   DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT,locale);
//	   String date = dateFormat.format(.createDate);
	   
//  EXERCISE 4 : random nunber
//	Question 1 : 
	   Random random = new Random();
	   int n = random.nextInt();
	   System.out.println(" Số ngẫu nhiền " + n);
// Question 2 : 	   
	   float f = random.nextFloat();
	   System.out.println("Số ngẫu nhiên :" + f);
//Question 3 :
	   String[] nameStudent = {"vinh" , "hạnh" ," quỳnh anh " , "mai " , " thảo"};
	   int t = random.nextInt(nameStudent.length);
	   System.out.println("Tên ngẫu nhiên 1 bạn trong lớp  laf: " + nameStudent[t]);
//Question 5  :
	   int now = (int) LocalDate.now().toEpochDay();
	   int randomDate = now - random.nextInt(365);
	   LocalDate reuLocalDate1 =  LocalDate.ofEpochDay(randomDate);
	   System.out.println("1 ngày ngẫu nhiên  quá trong khứ " + reuLocalDate1);
// 	
	
	}
	
}
