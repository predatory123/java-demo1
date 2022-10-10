package de.galileocomputing.schroedinger.java.kapite101;
import java.io.IOException; 
public class HellooSchrodinger {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.err.println("error message");		//打印错误信息
		System.out.println("Hello " + args[0]);   //打印自定义的名称 设置progrem_argument
		int alter = System.in.read();  //从命令行依次读入单个字符
		System.out.println(alter);
		
		

	}

}
