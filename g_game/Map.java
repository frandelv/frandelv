package g_game;

import g_game.ScanUtil;


public class Map {

	Trick t = new Trick();
	
	String[] obj = {"책상", "의자", "침대", "문"};
	
	String obj1 = "책상";
	String obj2 = "의자";
	String obj3 = "침대";
	String obj4 = "문";
	
	void lvlup(Character c){
		c.level += 1;
	}
	
	void clear(){
		
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		ScanUtil.stop(2000);
		System.out.print("문밖으로 나오자 ");
		ScanUtil.stop(1000);
		System.out.println("당신은 자신이 있던 곳이 외딴 숲의 낡은 저택이었던 것을 알게됩니다.");
		System.out.println();
		ScanUtil.stop(2000);
		System.out.print("그리고 머지않아 ");
		ScanUtil.stop(1000);
		System.out.println("저택 안에서 괴물의 커다란 고함소리가 들려왔습니다.");
		System.out.println();
		ScanUtil.stop(2000);
		System.out.println("그 소리는 당신을 향해 점점 가까워지고 있었습니다.");
		System.out.println();
		ScanUtil.stop(2000);
		System.out.print("당신은 겁에질려");
		System.out.println("뒤도 돌아보지않고 숲밖을 향해 달려나갔습니다.");
		System.out.println();
		ScanUtil.stop(2000);
		System.out.println("숲밖에 나온 당신은 자신이 잘 아는 길가로 돌아오게되었지만 ");
		System.out.println();
		ScanUtil.stop(2000);
		System.out.println("뒤를 돌아보자 숲 속에 있는 저택은 어느샌가 사라져있었습니다.");
		System.out.println();
		ScanUtil.stop(2000);
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		ScanUtil.stop(3000);
		System.out.println();
		System.out.println();
		System.out.println("====Congratulation!!====");
		System.out.println("축하합니다! 당신은 탈출하셨습니다!");
		System.out.println();
		System.out.println();
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
	}
	
}

class Map2 {
	
	String obj1 = "컴퓨터";
	String obj2 = "수납장";
	String obj3 = "냉장고";
	String obj4 = "문";
}

class Map3 {
	
	String obj1 = "커튼";
	String obj2 = "창문";
	String obj3 = "벽";
	String obj4 = "문";
}