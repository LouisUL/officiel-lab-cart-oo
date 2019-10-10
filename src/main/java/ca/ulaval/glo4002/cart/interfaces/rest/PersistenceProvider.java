package ca.ulaval.glo4002.cart.interfaces.rest;

import ca.ulaval.glo4002.cart.domain.cart.CartRepository;
import ca.ulaval.glo4002.cart.repositories.CartInMemoryRepository;
import ca.ulaval.glo4002.cart.repositories.CartXMLRepository;
import ca.ulaval.glo4002.cart.repositories.ShopInMemoryRepository;
import ca.ulaval.glo4002.cart.repositories.ShopXMLRepository;
import ca.ulaval.glo4002.cart.domain.shop.ShopRepository;

public class PersistenceProvider {
  public static CartRepository getCartRepository() {
    if (System.getProperty("store").equalsIgnoreCase("xml")) {
      return new CartXMLRepository();
    } else {
      return new CartInMemoryRepository();
    }
  }

  public static ShopRepository getShopRepository() {
    if (System.getProperty("store").equalsIgnoreCase("xml")) {
      return new ShopXMLRepository();
    } else {
      return new ShopInMemoryRepository();
    }
  }
}