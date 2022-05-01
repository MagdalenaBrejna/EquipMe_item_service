package mb.equipme_item_service.web.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import mb.equipme_item_service.domain.Item;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoryDto implements Serializable {

    @Null
    @JsonProperty("id")
    private UUID id;

    @NotNull
    private String upc;

    @NotBlank
    private String categoryName;

    @JsonProperty("items")
    private Set<ItemDto> items;
}
