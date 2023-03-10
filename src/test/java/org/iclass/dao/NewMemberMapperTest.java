package org.iclass.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.iclass.vo.NewMember;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import lombok.extern.slf4j.Slf4j;


@DisplayName("NewMemberMapper 구현체 생성확인합니다.")
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:META-INF/spring/applicationContext.xml")
@Slf4j
class NewMemberMapperTest {
	
	@Autowired
	private ApplicationContext context;
	@Autowired
	private NewMemberMapper mapper;
	
	@Test
	@DisplayName("NewMember - insert실험")
	void insert() {
		int cnt = mapper.insert(NewMember.builder()
				.id("dmsehRl")
				.name("은도끼")
				.password("1234")
				.email("dmsehRl@naver.com")
				.age(500)
				.gender("M".charAt(0))
				.hobbies("장작").build());
		assertEquals(cnt, 1);
	}
	
	@Test
	@DisplayName("NewMember - selectAll실험")
	void select() {
		List<NewMember> list = mapper.selectAll();
		
		assertNotNull(list);
	}
	
	@Test
	@DisplayName("NewMember - update실험")
	void update() {
		Map<String, String> map = new HashMap<>();
		map.put("name", "배고파");
		map.put("id", "rmaehRL");
		int cnt = mapper.update(map);
		
		assertEquals(cnt, 1);
	}
	
	@Test
	@DisplayName("NewMember - delete실험")
	void delete() {
		int cnt = mapper.delete("momo");
		
		assertEquals(cnt, 1);
	}

}
