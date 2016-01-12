import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class FilterTagsInAFile {
	public static void main(String[] args) throws IOException {
		
		File folder = new File("C:/Users/Gourav/Downloads/tweetsDummy/");
		File[] listOfFiles = folder.listFiles();
		Scanner sc=null;
		FileWriter fw = new FileWriter("C:/Users/Gourav/Downloads/tweetsDummy/newFile");
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		Date date=new Date();
		System.out.println(date.getDate());
		
		
		try {
		for (File file : listOfFiles) {	   
			
				 sc = new Scanner(file);				
			     
				while (sc.hasNextLine()) {
					String line = sc.nextLine();
					if (!line.startsWith("***")&&!line.startsWith("Type:")&&!line.startsWith("Origin:") && !line.startsWith("Text:")
							&& !line.startsWith("URL:")&& !line.startsWith("ID:")
							&& !line.startsWith("RetCount:")&& !line.startsWith("Favorite:")&& 
							!line.startsWith("MentionedEntities:")) {
						bw.write(line);
						bw.write("\n");
					}
				}
		}
				
			} catch (Exception e) {
				e.printStackTrace();
			
			
			
		}
		finally{
			bw.close();
			sc.close();
		}
		
		
		
		
		
		
	}
}