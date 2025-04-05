package com.codedecode.order.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.codedecode.order.dto.FoodItemDTO;
import com.codedecode.order.dto.Restaurant;
import com.codedecode.order.dto.UserDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("order")
public class Order {

	private Integer orderId;
	private List<FoodItemDTO> foodItemList;
	private Restaurant restaurant;
	private UserDTO userDTO;
}
