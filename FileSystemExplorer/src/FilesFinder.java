import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FilesFinder {
	public static String pattern = ".xml";
	public static List<String> result = new ArrayList<>();
		
	public static void main(String[] args) {
		executeInSeparateThreads("D:\\qaAutomation\\IgniteTestAutomation\\");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Results:");
			for (String string : result) {
				System.out.println(string);
			}
		}
	}
	
	private static File serachByPattern(File file) {
		for (File f : file.listFiles()) {
			if (f.isFile()) {
				if (f.getName().contains(pattern)) {
					synchronized(new Object()) {
						result.add(f.getName());
					}
				}
			} else {
				serachByPattern(f);
			}
		}
		return null;
	}
	
	private static void executeInSeparateThreads(String rootPath) {
		for (File f : new File(rootPath).listFiles()) {
			if (f.isDirectory()) {
				new Thread(new Runnable() {
					@Override
					public void run() {
					serachByPattern(f);
					System.out.println(Thread.currentThread().getName() + " finished work");
					}
				}).start();
			} else {
				if (f.getName().contains(pattern)) {
					result.add(f.getName());
				}
			}
		}
	}	
}

