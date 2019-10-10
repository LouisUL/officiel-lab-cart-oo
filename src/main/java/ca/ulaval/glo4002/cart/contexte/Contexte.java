package ca.ulaval.glo4002.cart.contexte;

import ca.ulaval.glo4002.cart.domain.shop.ShopRepository;

public class Contexte {
  private ShopRepository shopRepository;

  public Contexte(ShopRepository shopRepository) {
    this.shopRepository = shopRepository;

    if (System.getProperty("mode").equals("demo")) {
      ContexteDemo contexteDemo = new ContexteDemo(shopRepository);
      contexteDemo.createDemoData();
    }
  }
}