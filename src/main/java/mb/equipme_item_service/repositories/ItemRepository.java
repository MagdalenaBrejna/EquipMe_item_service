package mb.equipme_item_service.repositories;

import mb.equipme_item_service.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface ItemRepository extends JpaRepository<Item, UUID> {

    @Query(nativeQuery = true, value = "SELECT * FROM items WHERE name LIKE ?1")
    List<Item> findItemByName(String itemName);

    @Query(nativeQuery = true, value = "SELECT * FROM items WHERE owner_id = ?1")
    List<Item> findItemByOwnerId(UUID ownerId);

    @Query(nativeQuery = true, value = "SELECT * FROM items INNER JOIN categories ON items.category = categories.id WHERE categories.name LIKE ?1")
    List<Item> findItemByCategory(String categoryName);
}
