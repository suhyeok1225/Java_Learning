package day45;

import java.io.*;

public class File01 {
	public static void main(String[] args) throws IOException{
	FileInputStream fis=null;	//입력스트림
	FileOutputStream fos=null; //출력스트림
	fis=new FileInputStream("prac.txt"); //존재하는 파일과 연결
	fos=new FileOutputStream("result.txt"); //존재하지 않으면 파일 생성, 존재하면 파일 덮어쓰기
	
	BufferedInputStream bis=new BufferedInputStream(fis);
	BufferedOutputStream bos=new BufferedOutputStream(fos);
	
	int date;
	while((date=fis.read())!=-1) {
		//date에 읽어온 바이트를 저장하는데, date의 값이 -1이 아닐 떄까지
		//-1 : EOF(End Of File)
		bos.write(date);
	}
	//파일과의 연결을 닫는 작업
	bos.close();
	bis.close();
	}

}
