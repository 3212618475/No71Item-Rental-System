package com.entity.view;

import com.entity.WupinguihaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物品归还
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-01 12:14:50
 */
@TableName("wupinguihai")
public class WupinguihaiView  extends WupinguihaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WupinguihaiView(){
	}
 
 	public WupinguihaiView(WupinguihaiEntity wupinguihaiEntity){
 	try {
			BeanUtils.copyProperties(this, wupinguihaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
