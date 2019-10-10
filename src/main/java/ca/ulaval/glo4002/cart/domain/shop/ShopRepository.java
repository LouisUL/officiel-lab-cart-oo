package ca.ulaval.glo4002.cart.domain.shop;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import ca.ulaval.glo4002.cart.application.PersistenceException;
import ca.ulaval.glo4002.cart.application.XmlUtils;
import ca.ulaval.glo4002.cart.domain.shop.ShopItem;

public interface ShopRepository {
    List<ShopItem> readShopFromFile();
    void persistShop(List<ShopItem> items);
}
