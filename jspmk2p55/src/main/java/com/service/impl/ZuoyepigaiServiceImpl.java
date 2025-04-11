package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZuoyepigaiDao;
import com.entity.ZuoyepigaiEntity;
import com.service.ZuoyepigaiService;
import com.entity.vo.ZuoyepigaiVO;
import com.entity.view.ZuoyepigaiView;

@Service("zuoyepigaiService")
public class ZuoyepigaiServiceImpl extends ServiceImpl<ZuoyepigaiDao, ZuoyepigaiEntity> implements ZuoyepigaiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuoyepigaiEntity> page = this.selectPage(
                new Query<ZuoyepigaiEntity>(params).getPage(),
                new EntityWrapper<ZuoyepigaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuoyepigaiEntity> wrapper) {
		  Page<ZuoyepigaiView> page =new Query<ZuoyepigaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuoyepigaiVO> selectListVO(Wrapper<ZuoyepigaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuoyepigaiVO selectVO(Wrapper<ZuoyepigaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuoyepigaiView> selectListView(Wrapper<ZuoyepigaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuoyepigaiView selectView(Wrapper<ZuoyepigaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
