package org.liuyiming.bigdata.antun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * spring boot项目启动类
 * 
 * @author zdjy
 *
 */
@SpringBootApplication
@EnableScheduling
@MapperScan("org.liuyiming.bigdata.antun.mapper")
public class AntunRunner {
	public static void main(String[] args) {
		SpringApplication.run(AntunRunner.class, args);
	}
}
