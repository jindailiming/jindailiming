package com.itheima.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;

import com.itheima.pojo.Items;

public interface ItemsMapper {
	List<Items> findItemsList();

	Items findItemsById(Integer id);

}
