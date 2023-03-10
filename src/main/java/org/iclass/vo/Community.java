package org.iclass.vo;

import java.sql.Timestamp;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Community {
	//필드,객체의 프로퍼티
	private long idx;
	private String writer;
	private String title;
	private String content;
	private int readCount;
	private Timestamp createdAt;
	private String ip;
	private String commentCount;

}
