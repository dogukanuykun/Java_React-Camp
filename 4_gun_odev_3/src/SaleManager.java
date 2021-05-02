import java.util.ArrayList;

public class SaleManager {

	public void buyGame(User user,Game game) {
		ArrayList<Game> games = user.getGames();
		games.add(game);
		user.setGames(games);
		System.out.println(game.getName()+ " has added your library");
		System.out.println("Price: "+game.getPriceAfterDiscount());
	}
	
	public void showGame(User user,Game game) {
		if(game.getPriceAfterDiscount() < game.getPrice()) {
			System.out.println("The game is on sale! Price difference: "+(game.getPrice()-game.getPriceAfterDiscount()));
		}else {
			System.out.println("Name: "+game.getName());
			System.out.println("Price: "+game.getPrice());
		}
	}
	
		
	
	

}
