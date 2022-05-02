package mb.equipme_item_service.repositories;

import mb.equipme_item_service.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ItemRepository extends JpaRepository<Item, UUID> {
}
