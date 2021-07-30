package g_game;

import g_game.ScanUtil;


public class Trick {

	
	public void trick1(){
		
		System.out.println("책상위에 놓여있는 쪽지를 보자 문제가 적혀있었다.");
		ScanUtil.stop(2000);
		System.out.println("========================");
		System.out.println("다음 보기중  프로그래밍 언어가 아닌것은?");
		System.out.println("1번. java");
		System.out.println("2번. python");
		System.out.println("3번. Ruby");
		System.out.println("4번. HTML");
		System.out.println("========================");
		System.out.print(">");
		int res = ScanUtil.nextInt();
		if(res == 4){
			//단서획득
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			ScanUtil.stop(2000);
			System.out.println("문제를 맞추자 종이에 숨겨져있던 문자가 떠올랐다.");
			ScanUtil.stop(2000);
			System.out.println("비밀번호의 첫번째 숫자는 [4]");
		}else{
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			ScanUtil.stop(2000);
			System.out.println("아무런 변화도 일어나지 않았다.");
			
		}
	}
	
	public void trick2(Monster mon){
		
		System.out.println("의자 위에는 숫자야구를 할수있는 단말기가 놓여있었다.");
		ScanUtil.stop(2000);
		System.out.println("========================");
		System.out.println("랜덤으로 주어진 3개의 숫자를 맞추십시오!");
		System.out.println("기회는 무한정이지만 너무 많이 틀린다면...");
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		do{
		a = (int)(Math.random() * 9) + 1; 
		b = (int)(Math.random() * 9) + 1; 
		c = (int)(Math.random() * 9) + 1; 
		
		}while(a == b || b == c || c == a);
		
		while(true){
			System.out.println("3자리의 숫자>");
			int input = ScanUtil.nextInt();
			
			int count = 0;
			
			int i3 = input % 10;
			input /= 10;
			int i2 = input % 10;
			input /= 10;
			int i1 = input % 10;
			
			int strike = 0;
			int ball = 0;
			int out = 0;
			
			if(a == i1) strike++;
			if(b == i2) strike++;
			if(c == i3) strike++;
			
			if(a == i2 || a == i2) ball++;
			if(b == i1 || b == i3) ball++;
			if(c == i1 || c == i2) ball++;
			
			out = 3 - strike - ball;
			
			System.out.println(count++ + "차 시도 (" + i1 + i2 + i3 + ") : " + strike + "스트라이크 " + ball + "볼 " + out + "아웃 ");
			mon.incUp(mon);
			if(strike == 3){
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				ScanUtil.stop(2000);
				System.out.println("축하합니다! 정답입니다~");
				ScanUtil.stop(2000);
				System.out.println();
				System.out.println("축하메세지와 함께 단말기에 문자가 표시되었다.");
				ScanUtil.stop(2000);
				System.out.println("비밀번호의 두번째 숫자는 [8]");
				break;
			}
				
			}
			
	}
	
	public void trick3(){
		
		System.out.println("침대 아래에 놓여있는 상자에 문제가 적혀있었다.");
		ScanUtil.stop(2000);
		System.out.println("========================");
		System.out.println("물음표 안에 들어갈 숫자를 입력하시오.");
		System.out.println(" 0 > 2 > 5 > ? ");
		System.out.println("========================");
		System.out.print(">");
		int res = ScanUtil.nextInt();
		if(res == 0){
			//단서획득
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			ScanUtil.stop(2000);
			System.out.println("문제를 맞추자 상자가 열렸다. 상자안에는 문자가 적혀있었다.");
			System.out.println("비밀번호의 세번째 숫자는 [6]");
		}else{
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			ScanUtil.stop(2000);
			System.out.println("아무런 변화도 일어나지 않았다.");
			
		}
		
	}
	
	public void trick4(){
		
		System.out.println("컴퓨터 콘솔에는 문제가 띄워져있었다.");
		ScanUtil.stop(2000);
		System.out.println("========================");
		System.out.println("다음 데이터 타입중  메모리의 사용 크기가 2의 배수가 아닌것은?");
		System.out.println("1번. short");
		System.out.println("2번. boolean");
		System.out.println("3번. char");
		System.out.println("4번. float");
		System.out.println("========================");
		System.out.print(">");
		int res = ScanUtil.nextInt();
		if(res == 2){
			//단서획득
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			ScanUtil.stop(2000);
			System.out.println("문제를 맞추자 콘솔화면에 새로운 창이 떴다. ");
			System.out.println("비밀번호의 첫번째 숫자는 [5]");
		}else{
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			ScanUtil.stop(2000);
			System.out.println("아무런 변화도 일어나지 않았다.");
			
		}
		
	}
	
	public void trick5(){
		
		System.out.println("수납장 안에는 작은 쪽지가 있었다.");
		ScanUtil.stop(2000);
		System.out.println("========================");
		System.out.println("다음 중 현재 403반의 java기초를 담당하고있는 교수님의 이름은?");
		System.out.println("1번. 김형민 교수님");
		System.out.println("2번. 하재관 교수님");
		System.out.println("3번. 김승섭 교수님");
		System.out.println("4번. 배미숙 교수님");
		System.out.println("========================");
		System.out.print(">");
		int res = ScanUtil.nextInt();
		if(res == 3){
			//단서획득
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			ScanUtil.stop(2000);
			System.out.println("문제를 맞추자 쪽지에 새로운 문자가 떠올랐다.");
			System.out.println("비밀번호의 두번째 숫자는 [2]");
		}else{
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			ScanUtil.stop(2000);
			System.out.println("아무런 변화도 일어나지 않았다.");
			
		}
	}
	
	public void trick6(){
		
		System.out.println("냉장고에 붙어있는 종이에 문제가 적혀있었다.");
		ScanUtil.stop(2000);
		System.out.println("========================");
		System.out.println("다음 코드 중 컨버트에러가 일어나는 것은?");
		System.out.println("1번. String Boolean; ");
		System.out.println("2번. int i = 99999999; ");
		System.out.println("3번. boolean $ = true; ");
		System.out.println("4번. char a = ''; ");
		
		System.out.println("========================");
		System.out.print(">");
		int res = ScanUtil.nextInt();
		if(res == 4){
			//단서획득
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			ScanUtil.stop(2000);
			System.out.println("문제를 맞추자 냉장고 안에서 조그만 공이 떨어졌다.");
			System.out.println("비밀번호의 세번째 숫자는 [7]");
		}else{
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			ScanUtil.stop(2000);
			System.out.println("아무런 변화도 일어나지 않았다.");
			
		}
	}
	
	public void trick7(){
		
		System.out.println("커튼을 젖히자 벽에 문제가 적혀있었다.");
		ScanUtil.stop(2000);
		System.out.println("========================");
		System.out.println("java에서 상속을 행했을때, 부모에게 물려받지 않는것은?");
		System.out.println("1번. 생성자");
		System.out.println("2번. 인스턴트 변수");
		System.out.println("3번. 메서드");
		System.out.println("3번. 지역 변수");		
		System.out.println("========================");
		System.out.print(">");
		int res = ScanUtil.nextInt();
		if(res == 1){
			//단서획득
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			ScanUtil.stop(2000);
			System.out.println("문제를 맞추자 벽이 움직이며 새로운 문자가 떠올랐다.");
			System.out.println("비밀번호의 첫번째 숫자는 [3]");
		}else{
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			ScanUtil.stop(2000);
			System.out.println("아무런 변화도 일어나지 않았다.");
			
		}
	}
	
	public void trick8(){
		
		System.out.println("창문에는 문제가 적혀있었다.");
		ScanUtil.stop(2000);
		System.out.println("========================");
		System.out.println(" 인터페이스를 만들때 Public [_______] class Interface 의 괄호안에 들어갈 단어는?");
		System.out.println("1번. void");
		System.out.println("2번. extends");
		System.out.println("3번. implements");
		System.out.println("4번. abstract");
		System.out.println("========================");
		System.out.print(">");
		int res = ScanUtil.nextInt();
		if(res == 4){
			//단서획득
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			ScanUtil.stop(2000);
			System.out.println("문제를 맞추자 창문이 열렸지만, 그 너머의 창문에는 문자가 적혀있었다.");
			System.out.println("비밀번호의 두번째 숫자는 [1]");
		}else{
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			ScanUtil.stop(2000);
			System.out.println("아무런 변화도 일어나지 않았다.");
			
		}
	}
	
	public void trick9(){
		
		System.out.println("책상위에 놓여있는 쪽지를 보자 문제가 적혀있었다.");
		ScanUtil.stop(2000);
		System.out.println("========================");
		System.out.println("같은 이름의 메서드를 여러개 정의하는 것을 가르키는 용어는?");
		System.out.println("1번. override");
		System.out.println("2번. overload");
		System.out.println("3번. overdrive");
		System.out.println("4번. overlead");
		System.out.println("========================");
		System.out.print(">");
		int res = ScanUtil.nextInt();
		if(res == 2){
			//단서획득
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			ScanUtil.stop(2000);
			System.out.println("문제를 맞추자 종이에 숨겨져있던 문자가 떠올랐다.");
			ScanUtil.stop(2000);
			System.out.println("비밀번호의 세번째 자리는 [9]");
		}else{
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			ScanUtil.stop(2000);
			System.out.println("아무런 변화도 일어나지 않았다.");
			
		}
	}
	
	public void door(Monster mon, Map m, Character c){
		
		System.out.println("문에는 비밀번호로 된 잠금장치가 되어있다.");
		System.out.println("비밀번호를 입력해 주세요.");
		System.out.print(">");
		int pw = ScanUtil.nextInt();
		if(c.level == 0){
			if(pw == 486){
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				ScanUtil.stop(2000);
				m.lvlup(c);
				System.out.println("	   /|		");
				System.out.println("	  / | 끼이익	");
				System.out.println("	 /__|______");
				System.out.println("	|  __  __  |");
				System.out.println("	| |  ||  | |");
				System.out.println("	| |__||__| |");
				System.out.println("	|  __  __()|");
				System.out.println("	| |  ||  | |");
				System.out.println("	| |  ||  | |");
				System.out.println("	| |__||__| |");
				System.out.println("	|__________|");
				ScanUtil.stop(2000);
				System.out.println("잠금장치가 열리는 소리가 들렸다.");
				System.out.println("========================");
				System.out.println("문 너머로 보이는 또 하나의 방으로 들어갔다.");
			}else{
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				ScanUtil.stop(2000);
				System.out.println("아무일도 일어나지 않았다.");
				mon.incUp(mon);
			}
		}else if(c.level == 1){
			if(pw == 527){
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				ScanUtil.stop(2000);
				System.out.println("	   /|		");
				System.out.println("	  / | 끼이익	");
				System.out.println("	 /__|______");
				System.out.println("	|  __  __  |");
				System.out.println("	| |  ||  | |");
				System.out.println("	| |__||__| |");
				System.out.println("	|  __  __()|");
				System.out.println("	| |  ||  | |");
				System.out.println("	| |  ||  | |");
				System.out.println("	| |__||__| |");
				System.out.println("	|__________|");
				ScanUtil.stop(2000);
				System.out.println("잠금장치가 열리는 소리가 들렸다.");
				System.out.println("========================");
				m.lvlup(c);
				System.out.println("문 너머로 보이는 또 하나의 방으로 들어갔다.");
			}else{
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				ScanUtil.stop(2000);
				System.out.println("아무일도 일어나지 않았다.");
				mon.incUp(mon);
			}
		}else if(c.level ==2){
			if(pw == 319){
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				ScanUtil.stop(2000);
				System.out.println("	   /|		");
				System.out.println("	  / | 끼이익	");
				System.out.println("	 /__|______");
				System.out.println("	|  __  __  |");
				System.out.println("	| |  ||  | |");
				System.out.println("	| |__||__| |");
				System.out.println("	|  __  __()|");
				System.out.println("	| |  ||  | |");
				System.out.println("	| |  ||  | |");
				System.out.println("	| |__||__| |");
				System.out.println("	|__________|");
				ScanUtil.stop(2000);
				System.out.println("잠금장치가 열리는 소리가 들렸다.");
				System.out.println("========================");
				m.lvlup(c);
			}else{
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				ScanUtil.stop(2000);
				System.out.println("아무일도 일어나지 않았다.");
				mon.incUp(mon);
			}
		}
		
		
	}
	
}
