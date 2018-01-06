package com.itheima.service;

import java.util.List;

import com.itheima.pojo.Items;

public interface ItemsService {

	List<Items> findItemsList();

	Items findItemsById(Integer id);

}
