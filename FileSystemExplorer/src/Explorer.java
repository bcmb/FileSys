import java.io.File;

public class Explorer {
	private static long i;
	public static void main(String[] args) {
		analyseFsRecursively(new File("D:\\Soft\\"));
		System.out.println("Done");
	}
	
	static void analyseFsRecursively(File fs) {
		for (File f : fs.listFiles()) {
			if (f.isDirectory()) {
				analyseFsRecursively(f);
			}
		}
	}
}
