package com.yuri.development.bolos.mare.dto;

import com.yuri.development.bolos.mare.enums.ESupplyType;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {

    private Long id;

    @NotNull
    private String name;

    private String hexColor;

    @NotNull
    private Integer quantity;

    @NotNull
    private BigDecimal price;

    @NotNull
    private ESupplyType supplyType;
}
