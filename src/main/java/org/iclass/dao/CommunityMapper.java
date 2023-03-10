package org.iclass.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.iclass.vo.Community;

@Mapper
public interface CommunityMapper {
	
	int insert(Community vo);
	
	int update(Community vo);
	
	int delete(Long idx);
	
	Community selectByIdx(Long idx);
	
	int count();

	int setReadCount(Long idx);
	
	long commentsCount(Long mref);
	
	int maxOf();
	
	List<Community> list();
	
}
