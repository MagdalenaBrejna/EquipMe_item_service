package mb.equipme_item_service.services;

import mb.equipme_item_service.domain.Item;
import mb.equipme_item_service.web.model.ItemDto;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface ItemService  extends BaseService<Item, UUID> {

    void updateItem(ItemDto updatedItem);
    void blockItemInTime(UUID itemId, LocalDate startDate, LocalDate endDate);
    List<Item> findItemByName(String itemName);
    List<Item> findItemByCategory(String categoryName);
    List<Item> findItemByOwnerId(UUID ownerID);
}
