import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringFinder {
	 double countOfMatchedWords = 0,countBuffer=0,countLine=0;
	    String lineNumber = "";
	    String filePath1 = "C:\\Users\\Gourav\\Downloads\\t1.txt";
	    String filePath2 = "C:\\Users\\Gourav\\Downloads\\t2.txt";
	    BufferedReader br;
	    String[] findWords;
	  //  String inputSearch = "love";
	    String line = "";
	    double matchPercentage;
	    
public static void main(String[] args)
	    {
	       StringFinder sf=new StringFinder();
	       sf.toGiveWordsToFindFile();
	      
	       }
	    public void toSearchWord(){
	    	  try {
	    	        br = new BufferedReader(new FileReader(filePath1));
	    	        try {
	    	            while((line = br.readLine()) != null)
	    	            {
	    	                countLine++;
	    	                //System.out.println(line);
	    	                String[] words = line.split(" ");

	    	                for(String searchWord:findWords){
	    	                for (String word : words) {
	    	                	
	    	            //    System.out.println("WORD TO SEARCH   " + searchWord);
	    	               // 	System.out.println("W  " +word);
	    	                	
	    	                  if (word.equals(searchWord)) {
	    	                	  countOfMatchedWords++;
	    	                    countBuffer++;
	    	                  }
	    	                }
	    	                }

	    	                if(countBuffer > 0)
	    	                {
	    	                    countBuffer = 0;
	    	                    lineNumber += countLine + ",";
	    	                }
	    	            }
	    	            br.close();
	    	        } catch (IOException e) {
	    	            // TODO Auto-generated catch block
	    	            e.printStackTrace();
	    	        }
	    	    } catch (FileNotFoundException e) {
	    	        // TODO Auto-generated catch block
	    	        e.printStackTrace();
	    	    }
	    	    System.out.println("Times found at--"+countOfMatchedWords);
	    	    
	    	    returnPercentageOfMatch();
}

public void toGiveWordsToFindFile(){
	 try {
	        br = new BufferedReader(new FileReader(filePath2));
	        try {
	            while((line = br.readLine()) != null)
	            {
	                countLine++;
	                //System.out.println(line);
	                 findWords = line.split(" ");
	                 
	                // System.out.print(findWords.length);
	                }
	            br.close();
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    } catch (FileNotFoundException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	 
	 toSearchWord();
}

public void returnPercentageOfMatch(){
	
	//System.out.println(countOfMatchedWords);
	//System.out.println(findWords.length);
	matchPercentage=(countOfMatchedWords/findWords.length)*100;
	System.out.println("The Matching percentage is " + matchPercentage+"%" );
}
}