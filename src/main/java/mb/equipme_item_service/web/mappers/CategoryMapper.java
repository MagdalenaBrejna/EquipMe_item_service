package mb.equipme_item_service.web.mappers;

import mb.equipme_item_service.domain.Category;
import mb.equipme_item_service.web.model.CategoryDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface CategoryMapper {

    @Mappings({
            @Mapping(target="id", source="category.id"),
            @Mapping(target="upc", source="category.upc"),
            @Mapping(target="categoryName", source="category.categoryName"),
            @Mapping(target="itemBrand", source="item.itemBrand"),
    })
    CategoryDto categoryToCategoryDto(Category category);

    @Mappings({
            @Mapping(target="id", source="dto.id"),
            @Mapping(target="upc", source="dto.upc"),
            @Mapping(target="categoryName", source="dto.categoryName"),
            @Mapping(target="itemBrand", source="dto.itemBrand"),
    })
    Category categoryDtoToCategory(CategoryDto dto);
}
