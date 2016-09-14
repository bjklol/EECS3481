package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class C_Encrypt {
	@SuppressWarnings("resource")
	public static void main(String Args[]) throws Exception
	{
		FileInputStream msg;
		FileReader fr = new FileReader("MSG1.pt");
		BufferedReader br = new BufferedReader(fr);
		File pt = new File("MSG1.pt");
		CryptoTools.fileToBytes(pt);
		PrintWriter out = new PrintWriter("D:/Users/Tyler/workspace/EECS3481/src/util/MSG1.clean");
		 char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
		            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 
		            'w', 'x', 'y', 'z'};
//hey bj
		 char[] encrypted;
		 int shiftkey=19;
		String line;
		
		while((line = br.readLine()) != null)
		{ 
//comment
			line = line.replaceAll("[^a-zA-Z]", "");
			line = line.toUpperCase();
		   
		System.out.print(line);
		    }
		line.toCharArray();
		encrypted=new char[line.length()];
		
		for(int i=0;i<line.length();i++)
		{
//			letters.indexOf(line[i]);
		}
	} 
}

