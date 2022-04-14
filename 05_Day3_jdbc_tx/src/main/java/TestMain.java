import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		
		TestDAO dao = new TestDAO();
		
		ArrayList<TestDTO> list = dao.select();
		for (TestDTO s : list) {
			System.out.println(s);
		}
		
		dao.insert(6, "박명수", "청주");
		ArrayList<TestDTO> list2 = dao.select();
		for (TestDTO s : list2) {
			System.out.println(s);
		}

	}

}
