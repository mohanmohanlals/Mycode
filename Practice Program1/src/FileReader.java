import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
	public static void main(String[] args) throws IOException {
		File file =new File("C:\\Users\\mohan\\OneDrive\\Desktop\\captmidn.txt");
		Scanner sc =new Scanner(file);
	    
		String fileContent="";
		while (sc.hasNextLine()) {
		//System.out.println(sc.nextLine());
			fileContent= fileContent.concat(sc.nextLine());
			}
		FileWriter writer =new FileWriter("C:\\Users\\mohan\\OneDrive\\Desktop\\new.text");
		writer.write(fileContent);
		writer.close();
	}

}
