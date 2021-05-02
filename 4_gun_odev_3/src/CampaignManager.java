
public class CampaignManager implements CampaignService {
	
	@Override
	public void addNewCampaign(Campaign campaign) {
		System.out.println("New Campaign!");
		Game currentGame = campaign.getGame();
		currentGame.setPriceAfterDiscount(currentGame.getPrice() - currentGame.getPrice()*campaign.getDiscountRate());
		System.out.println("New Price: " + currentGame.getPriceAfterDiscount());
	}
	
	@Override
	public void deleteCampaign(Campaign campaign) {
		Game currentGame = campaign.getGame();
		currentGame.setPriceAfterDiscount(currentGame.getPrice());
		System.out.println("Campaign deleted.");	

	}
	
	@Override
	public void updateCampaign(Campaign campaign,double newDiscount) {
		Game currentGame = campaign.getGame();
		currentGame.setPriceAfterDiscount(newDiscount);
		currentGame.setPriceAfterDiscount(currentGame.getPrice() - currentGame.getPrice()*campaign.getDiscountRate());
		System.out.println("Campaign updated! New price: "+currentGame.getPriceAfterDiscount());
	}

}
