import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFromNio {
	public static void main(String[] args) {
		try
		{
			Path p= Paths.get("ReadFileNio\\cinqueMaggio.txt");
			List<String> file = Files.readAllLines(p);
			for(String x : file) {
				System.out.println(x);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
