package mb.equipme_item_service.web.mappers;

import mb.equipme_item_service.domain.Item;
import mb.equipme_item_service.web.model.ItemDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface ItemMapper {

    @Mappings({
            @Mapping(target="id", source="item.id"),
            @Mapping(target="upc", source="item.upc"),
            @Mapping(target="itemName", source="item.itemName"),
            @Mapping(target="itemBrand", source="item.itemBrand"),
            @Mapping(target="itemModel", source="item.itemModel"),
            @Mapping(target="itemDescription", source="item.itemDescription"),
            @Mapping(target="itemImage", source="item.itemImage"),
            @Mapping(target="dayRentPrice", source="item.dayRentPrice"),
            @Mapping(target="category", source="item.category"),
            @Mapping(target="userId", source="item.userId")
    })
    ItemDto itemToItemDto(Item item);

    @Mappings({
            @Mapping(target="id", source="dto.id"),
            @Mapping(target="upc", source="dto.upc"),
            @Mapping(target="itemName", source="dto.itemName"),
            @Mapping(target="itemBrand", source="dto.itemBrand"),
            @Mapping(target="itemModel", source="dto.itemModel"),
            @Mapping(target="itemDescription", source="dto.itemDescription"),
            @Mapping(target="itemImage", source="dto.itemImage"),
            @Mapping(target="dayRentPrice", source="dto.dayRentPrice"),
            @Mapping(target="category", source="dto.category"),
            @Mapping(target="userId", source="dto.userId")
    })
    Item itemDtoToItem(ItemDto dto);
}

