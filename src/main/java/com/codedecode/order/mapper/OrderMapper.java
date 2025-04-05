package com.codedecode.order.mapper;

import com.codedecode.order.dto.OrderDTO;
import com.codedecode.order.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order mapOrderDTOToOrder(OrderDTO orderDTO);
    OrderDTO mapOrderToOrderDTO(Order order);

}

/*import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.codedecode.order.dto.OrderDTO;
import com.codedecode.order.entity.Order;

@Mapper
public interface OrderMapper {

	OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
	
	Order mapOrderDTOToOrder(OrderDTO orderDTO);
	OrderDTO mapOrderToOrderDTO(Order order);
}
*/
