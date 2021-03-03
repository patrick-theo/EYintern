package day11;
import java.io.IOException;
public class One {
	public static void main(String[] args) throws Exception {
		ExceptionTest exception = new ExceptionTest();
		exception.throwIOException(5);

	}
}

class ExceptionTest {
	public void throwIOException(int io) throws Exception {
		throw new IOException("IO Error");
	}
}
