package ch01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

public class LogWriter {
	// 2. 자신에 참조값을 담을 정적 변수 선언 
	private static LogWriter instance; 
	private static BufferedWriter writer;
	
	
	// 1. 외부에서 접근 불가 생성자 생성 
	private LogWriter() {
		try {
			writer = new BufferedWriter(new FileWriter("log.txt", true));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 공유 개념 <-- t1, t2
	
	// 3. 외부에서 접근 가능한 정적 메서드 만들어 주기 
	public static LogWriter getInstance() {
		if(instance == null) {
			instance = new LogWriter();
		}
		return instance;
	}
	
	// 로그 작성 기능 
	public void writeLog(String log) {
		try {
			writer.write(log); 
			writer.newLine();
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
