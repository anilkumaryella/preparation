package topic;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesNioDemo {

	public static void main(String[] args) {
		try {
			Path path = Paths.get("c:\\demo.txt");
			Stream<String> lines = Files.lines(path);
			List<String> replaced = lines.map(line -> line.replaceAll("foo", "bar")).collect(Collectors.toList());

			Files.write(path, replaced);
			lines.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
