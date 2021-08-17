import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {
	
	public static void main(String[] args) throws IOException {
		 // class : System, Math, FileWriter
        // instance : f1, f2
		// f1이 가르키고 있는 값 f2가 가르키고 있는 값
         
		System.out.println(Math.PI);
        System.out.println(Math.floor(1.8));
        System.out.println(Math.ceil(1.8));
        
		FileWriter f1=new FileWriter("data.txt");
		f1.write("Hello");
	    f1.write(" Java");
	    f1.close();
	    
	    FileWriter f2=new FileWriter("data2.txt");
		f2.write("Hello");
	    f2.write(" Java2");
	    f2.close(); // 파일 작업 끝
	    // 클래스를 복제해서 복제본을 만들어 제어할 수 있다.
	    f1.write("!!!");
	    f1.close();
	}

}
