package com.codedecode.order.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTOFromFE {

	private List<FoodItemDTO> foodItemList;
	private Integer userId;
	private Restaurant restaurant;
}
