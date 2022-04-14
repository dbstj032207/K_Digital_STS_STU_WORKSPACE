import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		
		TestDAO dao = new TestDAO();
		
		ArrayList<TestDTO> list = dao.select();
		for (TestDTO s : list) {
			System.out.println(s);
		}

	}

}
