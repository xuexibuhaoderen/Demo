

import java.util.Scanner;

public class Main {
	public static void main(String [] arg0){
		String [] sy={"+","-","*","/"};
		Scanner scanner=new Scanner(System.in);
		System.out.println("Number:");
		int number=scanner.nextInt();
		String str="";
		for(int i=0;i<number;i++){
			for(int j=0;j<(int)(Math.random()*4)+1;j++){
				int b=(int)(Math.random()*100);
				int x=(int)(Math.random()*4);
				str+=sy[x];
				str+=b;
			}
			System.out.println(str+"=");
			str="";
			int n=(int) (Math.random()*100);
			str+=n;
		}
	}
}
