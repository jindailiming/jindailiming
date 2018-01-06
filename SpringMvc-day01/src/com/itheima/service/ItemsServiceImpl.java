package com.itheima.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.mapper.ItemsMapper;
import com.itheima.pojo.Items;

@Service
public class ItemsServiceImpl implements ItemsService {
	@Autowired
	private ItemsMapper itemsMapper;
	@Override
	public List<Items> findItemsList() {
		return itemsMapper.findItemsList();
	}
	@Override
	public Items findItemsById(Integer id) {
		// TODO Auto-generated method stub
		return itemsMapper.findItemsById(id);
	}

}
