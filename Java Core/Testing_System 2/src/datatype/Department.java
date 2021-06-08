package datatype;
public class Department {
	public int id;
	public String name;

	@Override
	public String toString() {
		return "Department [id=" + id + " , name=" + name + "]";
	}

	// phương thức đc đinh nghĩa ()
	public String name() {
		return name;
	}

	public Department() {

	}

	public Department(String name) {
		super();
		this.id = 0;
		this.name = name;
	}

}
