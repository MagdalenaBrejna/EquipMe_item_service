package mb.equipme_item_service.services;

import mb.equipme_item_service.domain.Category;
import mb.equipme_item_service.domain.Item;
import mb.equipme_item_service.repositories.ItemRepository;
import mb.equipme_item_service.web.mappers.ItemMapper;
import mb.equipme_item_service.web.model.ItemDto;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ItemServiceImpl implements ItemService {

    private ItemRepository itemRepository;
    private ItemMapper mapper;

    public ItemServiceImpl(ItemRepository itemRepository, ItemMapper mapper) {
        this.itemRepository = itemRepository;
        this.mapper = mapper;
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

    @Override
    public void updateItem(ItemDto updatedItem) {
        Item item = itemRepository.findById(updatedItem.getId()).orElse(null);
        mapper.updateItemFromDto(updatedItem, item);
        save(item);
    }

    @Override
    public void blockItemInTime(UUID itemId, LocalDate startDate, LocalDate endDate) {
        //TO DO
    }

    @Override
    public List<Item> findItemByName(String itemName) {
        return itemRepository.findItemByName("%" + itemName + "%");
    }

    @Override
    public List<Item> findItemByCategory(String categoryName) {
        return itemRepository.findItemByCategory(categoryName);
    }

    @Override
    public List<Item> findItemByOwnerId(UUID ownerID) {
        return itemRepository.findItemByOwnerId(ownerID);
    }
}
