import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class test {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	static String [] prev=new String[26];
	//static int id []={1,2,3,7,8,9,10};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		try {
			BufferedReader bf=new BufferedReader(new FileReader("XSQYD-2.txt"));
			try {
				BufferedWriter wr=new BufferedWriter(new FileWriter("data4.txt"));
				String str=bf.readLine();
				while(str!=null)
				{
					if(str.length()==0)
						;
					else if(str.charAt(0)=='T'||str.charAt(0)=='-')
					    ;
					else
					    str=dataadd(str);
					wr.write(str);
					wr.newLine();
					str=bf.readLine();
				}
				wr.flush();
				wr.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
			bf.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String dataadd(String str)
	{
		String [] curr=new String[26];
		String addstr="";
		int i=0;
		/*for (;i<7;i++)
		{
			curr[i]=str.substring(21*id[i],21*id[i]+20);
			if(curr[i].equals("                    "))
				curr[i]=prev[i];
			else prev[i]=curr[i];
		}
		addstr=str.substring(0,21)+curr[0]+' '+curr[1]+' '
				+curr[2]+' '+str.substring(84,147)
				+curr[3]+' '+curr[4]+' '+curr[5]+' '+curr[6]+' '
				+str.substring(231,299);
				*/
		for (;i<26;i++)
		{
			curr[i]=str.substring(21*i,21*i+20);
			if(curr[i].equals("                    "))
				curr[i]=prev[i];
			else prev[i]=curr[i];
			addstr=addstr+curr[i]+' ';
		}
		addstr=addstr+str.substring(21*26,614);
		return addstr;
	}
}
