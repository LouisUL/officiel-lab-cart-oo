package ca.ulaval.glo4002.cart.interfaces.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import ca.ulaval.glo4002.cart.application.shop.ShopApplicationService;
import ca.ulaval.glo4002.cart.domain.shop.ShopRepository;
import ca.ulaval.glo4002.cart.domain.shop.ShopItem;

@Path("/shop")
public class ShopResource {
	
	private ShopApplicationService shopService;

	public ShopResource(ShopRepository shopRepository) {
		this.shopService = new ShopApplicationService(shopRepository);
	}
	
	@GET
	@Path("/available-items")
	public List<ShopItem> listItems() {
		return shopService.listAvailableItems();
	}
}
