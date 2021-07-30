package g_game;

import g_game.ScanUtil;



public class Mygame {

	Character c;
	Monster mon;
	Map m;
	Map2 m2;
	Map3 m3;
	Trick t;
	Item i;
	
	
	
	
	
	
	
	
	
	
	
	
	Mygame(){
		
		c = new Character("홍길동", 6, 0);
		mon = new Monster(0);
		m = new Map();
		m2 = new Map2();
		m3 = new Map3();
		t = new Trick();
		i = new Item();
		
	}
	
	
	public static void main(String[] args) {
		
		new Mygame().start();
		
	}
	
	
	void start(){
		
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println();
		ScanUtil.stop(2000);
		System.out.println("당신은 좁은 방 안에서 눈을 떴습니다.");
		ScanUtil.stop(2000);
		System.out.println("영문은 모르겠지만 일단 이 방에서 탈출해야 할것 같습니다.");
		ScanUtil.stop(2000);
		System.out.println("먼저 주위를 둘러보고 조사하고 싶은 곳을 찾아 퍼즐을 풀어나가세요.");
		ScanUtil.stop(2000);
		System.out.println();
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("");
		System.out.println("   방  탈  출  (퀴  즈) 게 임(仮)       ");
		System.out.println("");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		int input = 0;
		while(true){
			System.out.println("=========================");
			System.out.println("1.둘러보기   2.조사하기  0.종료");
			input = ScanUtil.nextInt();
			switch(input){
			case 1:
				view(c,m,m2,m3,mon);
				break;
			case 2:
				invest(c,m,m2,m3,mon);
				break;
			case 0:
				System.out.println("게임이 종료되었습니다.");
				System.exit(0);
				break;
			}
		}	
		
	
	}
	
	void view(Character c, Map m, Map2 m2, Map3 m3, Monster mon){
		System.out.println("=========================");
		ScanUtil.stop(2000);
		System.out.println();
		System.out.println("잠시 주변을 둘러보니 수상해보이는 곳을 발견했다.");
		if(c.level == 0){
			System.out.println("[ " + m.obj1 + ", " + m.obj2 + ", " + m.obj3 + ", " + m.obj4 + " ]");
			System.out.println();
			mon.incount(c, mon);
		}else if(c.level == 1){
			System.out.println("[ " + m2.obj1 + ", " + m2.obj2 + ", " + m2.obj3 + ", " + m2.obj4 + " ]");
			System.out.println();
			mon.incount(c, mon);
		}else if(c.level == 2){
			System.out.println("[ " + m3.obj1 + ", " + m3.obj2 + ", " + m3.obj3 + ", " + m3.obj4 + " ]");
			System.out.println();
			mon.incount(c, mon);
		}
	}
	
	
	void invest(Character c, Map m, Map2 m2, Map3 m3, Monster mon){
		String input;
		System.out.println("조사하고 싶은 물건을 입력해주세요.>");
		input = ScanUtil.nextLine();
		if(c.level == 0){
			if(input.equals(m.obj1)){
				t.trick1();
				mon.incount(c, mon);
			}else if(input.equals(m.obj2)){
				t.trick2(mon);
				mon.incount(c, mon);
			}else if(input.equals(m.obj3)){
				t.trick3();
				mon.incount(c, mon);
			}else if(input.equals(m.obj4)){
				t.door(mon, m,c);
				mon.incount(c, mon);
			}else{
				System.out.println("입력이 잘못되었습니다.");
			}
		}else if(c.level == 1){
			if(input.equals(m2.obj1)){
				t.trick4();
				mon.incount(c, mon);
			}else if(input.equals(m2.obj2)){
				t.trick5();
				mon.incount(c, mon);
			}else if(input.equals(m2.obj3)){
				t.trick6();
				mon.incount(c, mon);
			}else if(input.equals(m.obj4)){
				t.door(mon, m,c);
				mon.incount(c, mon);
			}else{
				System.out.println("입력이 잘못되었습니다.");
			}
		}else if(c.level == 2){
			if(input.equals(m3.obj1)){
				t.trick7();
				mon.incount(c, mon);
			}else if(input.equals(m3.obj2)){
				t.trick8();
				mon.incount(c, mon);
			}else if(input.equals(m3.obj3)){
				t.trick9();
				mon.incount(c, mon);
			}else if(input.equals(m.obj4)){
				t.door(mon, m,c);
				mon.incount(c, mon);
				if(c.level== 3){
					m.clear();
				}
				System.exit(0);
			}else{
				System.out.println("입력이 잘못되었습니다.");
			}
		}else{
			System.out.println("입력이 잘못되었습니다.");
		}
		
		
	}
	
	
}