package g_game;

import java.util.Scanner;

public class ScanUtil {

	private static Scanner s = new Scanner(System.in);
	
	//자주 사용되는 메서드는 객체생성을 하지 않기 위해 static을 붙인다.
	
	public static String nextLine(){
		return s.nextLine();
	}
	
	public static int nextInt(){
		int num = 0;
		while(true){
			try{
				num = Integer.parseInt(s.nextLine());
			}catch(Exception e){
				System.out.println("숫자를 입력해주세요.");
				continue;
			}
			break;
		}
		return num;
	}
	
	public static double nextDouble(){
		return Double.parseDouble(s.nextLine());
	}

	public static void stop(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}
