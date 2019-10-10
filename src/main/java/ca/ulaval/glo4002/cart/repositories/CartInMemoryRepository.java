package ca.ulaval.glo4002.cart.repositories;

import ca.ulaval.glo4002.cart.domain.cart.CartRepository;
import ca.ulaval.glo4002.cart.domain.cart.Cart;

import java.util.ArrayList;
import java.util.List;

public class CartInMemoryRepository implements CartRepository {
  private ArrayList<Cart> carts = new ArrayList<>();

  public List<Cart> retrieveCarts() {
    return carts;
  }

  public void persistCarts(List<Cart> carts) {
    this.carts = (ArrayList<Cart>) carts;
  }
}
