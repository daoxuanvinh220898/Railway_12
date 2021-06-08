package datatype;
import java.time.LocalDate;
import java.util.Arrays;

public class Group {
	public int id;
	public String name;
	public int creator;
	public LocalDate creatDate;
	public Account[] accounts;

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", creator=" + creator + ", creatDate=" + creatDate
				+ ", accounts=" + Arrays.toString(accounts) + "]";
	}

}
