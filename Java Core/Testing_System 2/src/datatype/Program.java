package datatype;
import java.time.LocalDate;

public class Program {

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

//		System.out.println(acc3.toString2());
		for(int i = 0; i< acc1.groups.length; i++) {
			System.out.println(acc1.groups.toString());
		}
//		System.out.println(department1.toString());
//		System.out.println(acc2.toString());
//		System.out.println(acc2.toString2());
//      quesition: 1 
//		if (acc3.department == null) {
//			System.out.println("nhân viên k thuộc phòng ban nào");
//		} else if (acc1.department == null) {
//			System.out.println("nhân viên thuộc phòng ban2");
//		} else {
//			System.out.println("nhân viên thuộc phòng ban " + acc2.department.name());
//		}

		// quesition2:
//		if (acc2.groups == null) {
//			System.out.println(" nhân viên này chưa có group ");
//		} else if (acc2.groups.length == 1) {
//			System.out.println("Group của nhân viên này là " + acc2.groups[0]);
//		} else if (acc2.groups.length == 2) {
//			System.out.println("Group của nhân viên là  " + acc2.groups[0] + "," + acc2.groups[1]);
//		} else if (acc2.groups.length == 3) {
//			System.out.println("nhân viên này là người quan trọng tham gia nhiều group ");
//		} else {
//			System.out.println("nhân viên này là người hóng chuyện , tham gia tất cả các group ");
		// Question3 : toan tu ternary
		// System.out.println(acc3.department == null ? "nhân viên không thuộc phòng ban
		// nào " : "nhân viên thuộc phòng ban " + acc2.department.name() );

		// Question 4 :
		// System.out.println(acc1.position.name == "DEV" ? "đây là developer"
		// : "người này không phải là developer" );
		

	}
}
