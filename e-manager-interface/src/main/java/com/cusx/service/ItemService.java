package com.cusx.service;

import com.cusx.commons.pojo.EasyUIDataGridResult;
import com.cusx.commons.utils.E3Result;
import com.cusx.pojo.TbItem;

public interface ItemService {

	TbItem getItemById(long itemId);
	
	EasyUIDataGridResult getItemList(int page, int rows);
	
	E3Result addItem(TbItem item, String desc);
}
