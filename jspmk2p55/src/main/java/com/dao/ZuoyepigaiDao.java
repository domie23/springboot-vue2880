package com.dao;

import com.entity.ZuoyepigaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuoyepigaiVO;
import com.entity.view.ZuoyepigaiView;


/**
 * 作业批改
 * 
 * @author 
 * @email 
 * @date 2022-04-15 09:22:05
 */
public interface ZuoyepigaiDao extends BaseMapper<ZuoyepigaiEntity> {
	
	List<ZuoyepigaiVO> selectListVO(@Param("ew") Wrapper<ZuoyepigaiEntity> wrapper);
	
	ZuoyepigaiVO selectVO(@Param("ew") Wrapper<ZuoyepigaiEntity> wrapper);
	
	List<ZuoyepigaiView> selectListView(@Param("ew") Wrapper<ZuoyepigaiEntity> wrapper);

	List<ZuoyepigaiView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoyepigaiEntity> wrapper);
	
	ZuoyepigaiView selectView(@Param("ew") Wrapper<ZuoyepigaiEntity> wrapper);
	

}
