import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class mny2200593 {

	public static void main(String[] args) {
		File myFile=new File("F1.txt"); 
		try {
			Scanner myReader = new Scanner(myFile);
			
			while(myReader.hasNextLine()) {
				
				String FC2 = myReader.nextLine();
				StringBuffer sb2 = new StringBuffer("");
				StringBuffer sb1 = new StringBuffer("");
				
					for(int i=0;i<=FC2.length()-1;i++)
					{
						if(i%2==0)
							sb1.append(FC2.charAt(i)+"\n");
						else
							sb2.append(FC2.charAt(i)+"\n");					
					}
				
					File myFile2 = new File("F2.txt");
					PrintWriter myWrite=new PrintWriter(myFile2);
					 myWrite.println(sb1);
					 myWrite.close();
					 
					 File myFile3 = new File("F3.txt");
						PrintWriter myWrite2=new PrintWriter(myFile3);
						 myWrite2.println(sb2);
						 myWrite2.close();	 
				}
			
			myReader.close();
		} catch (FileNotFoundException e) {
			
			System.out.println("File dose not exist");
		}
		
	}

	}


