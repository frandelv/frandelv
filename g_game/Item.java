package g_game;

public class Item {

	
	String[] hint = {"첫번째 자리는 4", "두번째 자리는 8", "세번째 자리는 6", "첫번째 자리는 5", "첫번째 자리는 2", "첫번째 자리는 7", "첫번째 자리는 3", "첫번째 자리는 1", "첫번째 자리는 9"};
	
	String itemdrop(Item items, int i){
			String res = hint[i];
		return res;
	}
	
}
