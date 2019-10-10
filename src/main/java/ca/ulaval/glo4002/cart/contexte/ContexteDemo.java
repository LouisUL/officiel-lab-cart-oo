package ca.ulaval.glo4002.cart.contexte;

import ca.ulaval.glo4002.cart.domain.shop.ShopRepository;
import ca.ulaval.glo4002.cart.domain.shop.PrimeShopItem;
import ca.ulaval.glo4002.cart.domain.shop.ShopItem;
import ca.ulaval.glo4002.cart.domain.shop.StandardShopItem;

import java.util.List;
import java.util.logging.Logger;

public class ContexteDemo {

  private ShopRepository shopRepository;

  ContexteDemo(ShopRepository shopRepository) {
    this.shopRepository = shopRepository;
  }

  public void createDemoData() {
    Logger.getGlobal().info("Prefilling data in the shop for the demo");
    addItem(new StandardShopItem("1251521", "Peanuts", 5, 1, 1.20, true));
    addItem(new PrimeShopItem("236637", "Clean Code", 35, 2, 0.50, false));
    addItem(new StandardShopItem("235265", "Détendeur Mares Abyss Navy 22", 999, 5, 0.15, true));
    addItem(new StandardShopItem("276101", "Imprimante 3D", 2341, 31, 0.60, true));
    addItem(new PrimeShopItem("818113", "GoPro", 650, 1, 4.60, true));
    addItem(new StandardShopItem("51-153", "Peinture à numéro", 1, 2, 1.40, true));
  }
  private void addItem(ShopItem item) {
    List<ShopItem> items = shopRepository.readShopFromFile();
    items.add(item);

    shopRepository.persistShop(items);
  }
}
