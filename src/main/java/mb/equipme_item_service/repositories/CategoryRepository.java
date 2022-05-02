package mb.equipme_item_service.repositories;

import mb.equipme_item_service.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
