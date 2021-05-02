import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Game> games1 = new ArrayList<Game>();
		User user1 = new User("Doðukan","Uykun","01.01.2000",1234567890,games1);
		Game game1 = new Game("GTA",100,100);
		
		SaleManager saleManager = new SaleManager();
		CampaignManager campaignManager = new CampaignManager();
		UserManager userManager = new UserManager(new EGovernmentConfirmatory());
		Campaign newCampaign = new Campaign("Gta Discount", game1, 0.3);
		
		userManager.register(user1);
		
		campaignManager.addNewCampaign(newCampaign);
		
		saleManager.showGame(user1, game1);
		saleManager.buyGame(user1, game1);		
		
		
	}

}
