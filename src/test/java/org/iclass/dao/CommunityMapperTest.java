package org.iclass.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.iclass.vo.Community;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import lombok.extern.slf4j.Slf4j;


@DisplayName("CommunityMapper 구현체 생성확인합니다.")
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:META-INF/spring/applicationContext.xml")
@Slf4j
public class CommunityMapperTest {

	@Autowired
	private ApplicationContext context;
	@Autowired
	private CommunityMapper dao;
	
	@DisplayName("context, dao bean 생성 확인합니다.")
	@Test
	void bean() {
		log.info("@Test시험 dao 의 구현체 - " + dao.getClass().getName() + "() 생성");
		assertNotNull(context);
		assertNotNull(dao);
	}
	
	@DisplayName("list로 가져온 개수와 count 함수 결과는 같아야 합니다.")
	@Test
	void test() {
		List<Community> list = dao.list();
		int size = list.size();
		log.info("list = " + list);
		assertEquals(dao.count(), size);
	}

}
