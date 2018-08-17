package myexception;

public class TestMyException {

	public TestMyException(String sex) throws MyException {

		if (sex != "ÄÐ" && sex != "Å®") {

			throw new MyException("ÐÔ±ð´íÎó");
		}

	}

	public static void main(String[] args) {

		try {
			TestMyException t = new TestMyException("fas");
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

}
