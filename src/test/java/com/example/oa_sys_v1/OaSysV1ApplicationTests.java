package com.example.oa_sys_v1;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OaSysV1ApplicationTests {

	@Ignore
	void contextLoads() {
		System.out.println("1234");
	}
	@Test
	void contextLoad() {
		System.out.println("4321");
	}
}
