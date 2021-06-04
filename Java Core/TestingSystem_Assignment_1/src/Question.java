import java.time.LocalDate;
import java.util.Arrays;

public class Question {
	int id;
	String content;
	CategoryQuestion category;
	TypeQuestion type;
	Account creator;
	LocalDate creatDate;
	Exam[] exams;
	@Override
	public String toString() {
		return "Question [id=" + id + ", content=" + content + ", category=" + category + ", type=" + type
				+ ", creator=" + creator + ", creatDate=" + creatDate + ", exams=" + Arrays.toString(exams) + "]";
	}
	
}
