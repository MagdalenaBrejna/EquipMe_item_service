package mb.equipme_item_service.domain;

import com.sun.istack.NotNull;
import lombok.*;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Item extends BaseEntity {

    public Item(UUID itemId, String itemName, String itemBrand, String itemModel, String itemDescription, byte[] itemImage, Double dayRentPrice) {
        super(itemId);
        this.itemName = itemName;
        this.itemBrand = itemBrand;
        this.itemModel = itemModel;
        this.itemDescription = itemDescription;
        this.itemImage = itemImage;
        this.dayRentPrice = dayRentPrice;
    }

    @Column(name="name")
    private String itemName;

    @Column(name="brand")
    private String itemBrand;

    @Column(name="model")
    private String itemModel;

    @Lob
    @Column(name="description")
    private String itemDescription;

    @Column(name="image")
    private byte[] itemImage;

    @Column(name="day_price")
    private Double dayRentPrice;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;
}
