import java.time.LocalDate;
import java.util.Arrays;

public class Group {
	int id;
	String name;
	int creator;
	LocalDate creatDate;
	Account[] accounts;

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", creator=" + creator + ", creatDate=" + creatDate
				+ ", accounts=" + Arrays.toString(accounts) + "]";
	}

}
