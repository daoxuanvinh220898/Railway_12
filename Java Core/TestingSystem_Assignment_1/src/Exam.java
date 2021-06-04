import java.time.LocalDate;
import java.util.Arrays;

public class Exam {
	byte id;
	String code;
	String title;
	CategoryQuestion category;
	String duration;
	Account creator;
	LocalDate creatDate;
	Question[] questions;
	@Override
	public String toString() {
		return "Exam [id=" + id + ", code=" + code + ", title=" + title + ", category=" + category + ", duration="
				+ duration + ", creator=" + creator + ", creatDate=" + creatDate + ", questions="
				+ Arrays.toString(questions) + "]";
	}
}
