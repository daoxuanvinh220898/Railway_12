import java.time.LocalDate;
import java.util.Arrays;

public class Account {
	int id;
	String email;
	String userName;
	String fullName;
	Department department;
	Position position;
	LocalDate creatDate;
	Group[] groups;
	public Object groupAcc1;

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName
				+ ", department= " + department + ", position=" + position + ", creatDate=" + creatDate
				+ ", groups=" + Arrays.toString(groups) + "]";
	}

	public String toString2() {
		return "Account [id=" + id + ", fullName=" + fullName + ", groups=" + Arrays.toString(groups) + "]";

	}
}
