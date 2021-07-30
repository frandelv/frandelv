package g_game;

import g_game.ScanUtil;


public class Monster {


	int inc = 10;

	Monster(int inc){
		this.inc = inc;
	}
	
	void incount(Character c, Monster mon){
		int ran = (int)(Math.random() * 100);
		if(ran < mon.inc){	
			System.out.println("어디선가 발소리가 들려온다...");
			ScanUtil.stop(2000);
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			System.out.println("▒▒         /\\   }  /\\  ▒▒");
			System.out.println("▒▒        _|(O\\_ _/O)  ▒▒");
			System.out.println("▒▒      _|/  (__''__)  ▒▒" );
			System.out.println("▒▒    _|\\/    WVVVVW   ▒▒");
			System.out.println("▒▒   \\ _\\     \\MMMM/_  ▒▒");
			System.out.println("▒▒ _|\\_\\     _ '---; \\_▒▒");
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			System.out.println("▒▒▒▒▒ 괴물이 나타났다!! ▒▒▒▒▒");
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			ScanUtil.stop(2000);
			mon.damage(c);
		}else if(ran == mon.inc){
			System.out.println("어디선가 발소리가 들려온다...");
			ScanUtil.stop(2000);
			System.out.println("... 하지만 발소리는 멀어졌다.");
			mon.incDown(mon);
		}else{
			mon.incUp(mon);
		}
	}
	
	void incUp(Monster mon){
		mon.inc += 10;
	}
	
	void incDown(Monster mon){
		mon.inc = 0;
	}
	
	void damage(Character c){
		int ran = (int)(Math.random() * 100);
		if(ran > 40){
			System.out.println("괴물이 당신에게 달려듭니다!");
			ScanUtil.stop(2000);
			System.out.println("당신은 그대로 괴물의 공격을 받았습니다!");
			ScanUtil.stop(1000);
			System.out.println("당신은 격통을 느끼며 필사적으로 도망갔습니다.");
			c.hp--;	
			ScanUtil.stop(2000);
			System.out.println("당신의 남은 체력 : " + c.hp);
		}else if(ran <= 40){
			System.out.println("괴물이 당신에게 달려듭니다!");
			ScanUtil.stop(2000);
			System.out.println("당신은 괴물이 팔을 크게 휘두르는 틈을 노려 공격을 피했습니다!");
			ScanUtil.stop(1000);
			System.out.println("몸을 겨누지 못하는 괴물을 뒤로 간신히 도망쳤습니다.");
		}
		if(c.hp == 0){
			System.out.println();
			System.out.println("=====GAME OVER=====");
			System.out.println("당신은 괴물에게 사망했습니다.");
			System.exit(0);
		}
	}

	public void stop(int interval) {
		try {
			Thread.sleep(interval);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
