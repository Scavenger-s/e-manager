package com.cusx.service;

import java.util.List;

import com.cusx.commons.pojo.EasyUITreeNode;

public interface ItemCatService {
	List<EasyUITreeNode> getItemCatList(long parentId);
}
