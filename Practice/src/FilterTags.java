import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;


public class FilterTags {

	
public static void main(String[] args) throws IOException {
		
	File file = new File("C:/Users/Gourav/Downloads/tweetsDummy/newFile");

	 Writer fileWriter = null;
	 
	         BufferedWriter bw = null;

	         
	         fileWriter = new FileWriter(file);
	         
	                     bw = new BufferedWriter(fileWriter);

	         
		
		//FileWriter fw = new FileWriter("C:/Users/Gourav/Downloads/tweetsDummy/newFile");
		//BufferedWriter bw = new BufferedWriter(fw);
		//FileWriter f=new FileWriter(fw);
		File f = new File(
				"C:/Users/Gourav/Downloads/tweetsDummy/432");
		
		try {
		   
			
				Scanner sc = new Scanner(f);				
			     
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
		
				
			} catch (Exception e) {
				e.printStackTrace();
			
			
			
		}
		finally{
			bw.close();
			
		}
		
		
		
		
		
		
	}
}
