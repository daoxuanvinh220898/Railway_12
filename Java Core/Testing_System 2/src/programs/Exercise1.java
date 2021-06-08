package programs;

import java.time.LocalDate;
import java.util.Iterator;

import datatype.*;

public class Exercise1 {

	public static void main(String[] args) {
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
// IF
// Question 1 :
		if (acc2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban ");
		} else {
			System.out.println("Phòng ban của nhân viên này là :" + acc2.department.name);
		}

// Question 2 : 
		if (acc2.groups == null) {
			System.out.println("Nhân viên này chưa có Groups");
		} else {
			int countGroup = acc2.groups.length;
			if (countGroup == 1 || countGroup == 2) {
				System.out.println("Groups của nhân viên này là Java Fresher , C# Fresher");
			}
			if

			(countGroup == 3) {
				System.out.println("Nhân viên này là người quan trọng , tham gia nhiều groups");
			}
			if (countGroup >= 4) {

				System.out.println("Nhân viên này là người hóng chuyện , tham gia tất cả các groups");
			}
		}
// Question 3 		
		System.out.println(acc2.department == null ? "Nhân viên này chưa có phòng ban."
				: "phòng ban của nhân viên này là :" + acc2.department.name.toString());

// Question 4 :
		System.out.println(
				acc1.position.name.toString() == "DEV" ? "Đây là Developer" : "Người này không phải là Developer");

// SWITCH CASE
// Question 5:		
		if (group1.accounts == null) {
			System.out.println("Groups chưa có thành viên nào tham gia ");
		} else {
			int countAccInGroup = group1.accounts.length;
			switch (countAccInGroup) {
			case 1:
				System.out.println("Nhóm có một thành viên");

				break;
			case 2:
				System.out.println("Nhóm có hai thành viên");
				break;
			case 3:
				System.out.println("Nhóm có 3 thành viên ");
				break;
			default:
				System.out.println("Nhóm có nhiều thành viên ");
				break;
			}
		}
// Question 6 :
		if (acc2.groups == null) {
			System.out.println("Nhân viên chưa có Groups");
		} else {
			switch (acc2.groups.length) {
			case 1:
				System.out.println(" Groupcủa nhân viên này là Java Fresher, C# fresher");

				break;
			case 2:
				System.out.println("Groupcủa nhân viên này là Java Fresher, C# fresher");
				break;
			case 3:
				System.out.println("Nhân viên này là người quan trọng , tham gia nhiều Group");
				break;
			default:
				System.out.println("Nhân viên này là người hóng chuyện , tham gia tất cả các group");

				break;
			}
		}
// Question 7 :
		String positionName = acc1.position.name.toString();
		switch (positionName) {
		case "DEV":
			System.out.println("Đây là Developer");

			break;

		default:
			System.out.println("Người này không phải là Developer ");
			break;
		}

// FOREACH
// Question 8 :
		Account[] accArray = { acc1, acc2, acc3 };
		for (Account account : accArray) {
			System.out.println("AccountID:" + account.id + "Email:" + account.email + "Name:" + account.fullName);
		}

// Question 9 :
		Department[] depArray = { department1, department2, department3 };
		for (Department department : depArray) {
			System.out.println("DepID:" + department.id + "DepName:" + department.name);
		}

//FOR		
// Question 10: 
		Account[] accArray1 = { acc1, acc2 };
		for (int i = 0; i < accArray1.length; i++) {
			System.out.println("Thông tin account thứ  " + (i + 1) + "là : ");
			System.out.println("Email:" + accArray1[i].email);
			System.out.println("FullName:" + accArray1[i].fullName);
			System.out.println("Phòng ban :" + accArray1[i].department.toString());
		}
// Question 11:
		Department[] depArray1 = { department1, department2, department3 };
		for (int i = 0; i < depArray1.length; i++) {
			System.out.println("Thông tin Department thứ  " + (i + 1) + "là:");
			System.out.println("ID:" + depArray1[i].id);
			System.out.println("NAME:" + depArray1[i].name);
		}
		
// Question 12:
		Department[] depArray2 = {department1 ,department2,department3};
		for (int i = 0; i < depArray2.length; i++) {
			System.out.println("Thông tin department thứ" + (i +1 ) + "là : ");
			System.out.println("ID"+ depArray2[i].id);
			System.out.println("Name" + depArray2[i].name);
		}
		
// Question 13:
//		Account[] accArray2 = {acc1,acc2,acc3};
//		for (int i = 0; i < accArray2.length; i++) {
//			if (i != 1) {
//				System.out.println("THông tin account thứ" + (i+1)+ "là: ");
//				System.out.println("Email:" +accArray2[i].email);
//				System.out.println("Full name " + accArray2[i].fullName);
//				System.out.println("phòng ban" + accArray2[i].department.name);
				
//			}
		
// Question 15 	
		for (int i = 1; i <= 20; i++) {
			if (i%2 == 0) {
				System.out.println(i+ "  ");
			}
//	Question 16:
			Account[] accArray3 = {acc1,acc2,acc3};
			int a = 0;
			while (a <accArray3.length  ) {
				System.out.println("Thông tin account thứ " + (a + 1) + "là : ");
				System.out.println("Email" + accArray3[a].email);
				System.out.println("FullName:" +accArray3.length);
				System.out.println(" Phòng ban " +accArray3.toString());	
			}
			
		}
		
	}

}
