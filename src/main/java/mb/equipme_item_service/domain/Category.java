package mb.equipme_item_service.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "categories")
public class Category extends BaseEntity {

    public Category(UUID categoryId, String categoryName, String upc) {
        super(categoryId);
        this.categoryName = categoryName;
        this.upc = upc;
    }

    @Column(name="upc", unique = true)
    private String upc;

    @Column(name="name")
    private String categoryName;

    @OneToOne()
    @JoinColumn(name = "id")
    private Item item;
}
