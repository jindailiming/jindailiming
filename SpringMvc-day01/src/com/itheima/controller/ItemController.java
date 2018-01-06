package com.itheima.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;

@Controller
public class ItemController {
	@Autowired
	private ItemsService itemsService;
@RequestMapping(value="/index.action")
public ModelAndView find(){
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.addObject("world", "helloword");
	modelAndView.setViewName("/index.jsp");
	return modelAndView;
}
@RequestMapping(value="/itemList.action")
public ModelAndView findItemsList(){
	ModelAndView modelAndView = new ModelAndView();
	List<Items>list = itemsService.findItemsList();
	modelAndView.addObject("itemList", list);
	modelAndView.setViewName("itemList");
	return modelAndView;

	}
@RequestMapping(value="/itemList.action")
public ModelAndView findItemsById(Integer id){
	ModelAndView modelAndView = new ModelAndView();
	Items items = itemsService.findItemsById(id);
	return null;
	}
}
