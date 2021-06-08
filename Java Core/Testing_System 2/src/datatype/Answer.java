package datatype;

public class Answer {
	int id;
	String content;
	Question question;
	Boolean isCorrect;
	@Override
	public String toString() {
		return "Answer [id=" + id + ", content=" + content + ", question=" + question + ", isCorrect=" + isCorrect
				+ "]";
	}
	// 1 object mặc định có 1 hàm khởi tạo rỗng . VD: Answer()
	// nếu tạo 1 hàm khởi tạo có 1 tham số thì hàm khởi tạo rỗng phải tự định nghĩa lại 
	// có thể có nhiều hàm khởi tạo cho 1 đối tượng (object)
	//
	// 1 ham khoi tao rong => defaul id = 0 , content= null , question= null , isCrrect = false
	
		public Answer() {
			super();
			this.id = 0;
			this.content = content;
			this.question = question;
			this.isCorrect = false;
		}
	// 1 ham khoi tao co 3 tham so la ID va Content ,question => defaul isCorrect = false 


		public Answer(int id, String content, Question question) {
			super();
			this.id = id;
			this.content = content;
			this.question = question;
			this.isCorrect = false;
		}
	// 1 ham khoi tao co 4 tham so 

	public Answer(int id, String content, Question question, Boolean isCorrect) {
		super();
		this.id = id;
		this.content = content;
		this.question = question;
		this.isCorrect = true;
		
		
		
	}
		
}
