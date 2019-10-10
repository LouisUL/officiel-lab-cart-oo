package ca.ulaval.glo4002.cart.repositories;

import ca.ulaval.glo4002.cart.domain.shop.ShopRepository;
import ca.ulaval.glo4002.cart.domain.shop.ShopItem;

import java.util.ArrayList;
import java.util.List;

public class ShopInMemoryRepository implements ShopRepository {
  private ArrayList<ShopItem> items = new ArrayList<>();

  public List<ShopItem> readShopFromFile() {
    return items;
  }

  public void persistShop(List<ShopItem> items){
    this.items = (ArrayList<ShopItem>) items;
  }
}
