package com.dao;

import com.entity.WupinguihaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WupinguihaiVO;
import com.entity.view.WupinguihaiView;


/**
 * 物品归还
 * 
 * @author 
 * @email 
 * @date 2023-05-01 12:14:50
 */
public interface WupinguihaiDao extends BaseMapper<WupinguihaiEntity> {
	
	List<WupinguihaiVO> selectListVO(@Param("ew") Wrapper<WupinguihaiEntity> wrapper);
	
	WupinguihaiVO selectVO(@Param("ew") Wrapper<WupinguihaiEntity> wrapper);
	
	List<WupinguihaiView> selectListView(@Param("ew") Wrapper<WupinguihaiEntity> wrapper);

	List<WupinguihaiView> selectListView(Pagination page,@Param("ew") Wrapper<WupinguihaiEntity> wrapper);
	
	WupinguihaiView selectView(@Param("ew") Wrapper<WupinguihaiEntity> wrapper);
	

}
