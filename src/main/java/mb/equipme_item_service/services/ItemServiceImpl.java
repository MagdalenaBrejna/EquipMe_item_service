package mb.equipme_item_service.services;

import mb.equipme_item_service.domain.Item;
import mb.equipme_item_service.repositories.ItemRepository;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ItemServiceImpl implements ItemService {

    private ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<Item> findAll() {
        List<Item> items = new ArrayList<>();
        itemRepository.findAll().forEach(items::add);
        return items;
    }

    @Override
    public Item findById(UUID itemUUID) {
        return itemRepository.findById(itemUUID).orElse(null);
    }

    @Transactional
    @Override
    public Item save(Item newItem) {
        return itemRepository.save(newItem);
    }

    @Transactional
    @Override
    public void delete(Item toDeleteItem) {
        itemRepository.delete(toDeleteItem);
    }

    @Transactional
    @Override
    public void deleteById(UUID itemUUID) {
        itemRepository.deleteById(itemUUID);
    }
}
