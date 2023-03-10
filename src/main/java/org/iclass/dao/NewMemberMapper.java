package org.iclass.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.iclass.vo.NewMember;

@Mapper
public interface NewMemberMapper{
	
	int insert(NewMember vo);
	
	List<NewMember> selectAll();
	
	int update(Map<String, String> map);
	
	int delete(String id);
	
}
