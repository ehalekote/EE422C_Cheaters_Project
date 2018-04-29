import java.io.File;
		
public class cheaters {
	public static void main(String args[]) {
		int[][] commonPhrases;		//Matrix to hold number of common words between row and column numbered essays
		
		File dir = new File("/Users/ehalekote/Desktop/cheaters_documents/sm_doc_set"); //Set to appropriate directory path
		File[] directoryListing = dir.listFiles();
		
		//Fine number of files
		int matrixCount = 0;
		if (directoryListing != null) {
		  for (File essay : directoryListing) {
			  matrixCount++;
		  }
		}
		
		//Iterate through files
		if (directoryListing != null) {
		  for (File essay : directoryListing) {
		      //create hashmap of terms
			  //compare every other essay to this one
			  //store in a global matrix
		  }
		}
  
	}
	

}
