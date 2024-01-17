package com.dms;

import static org.testng.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dms.evaluation.model.Doctor;
import com.dms.evaluation.repository.DMSRepository;

@SpringBootTest
class SbDmsCicdApplicationTests {
	@Autowired
	static DMSRepository dao;
	Doctor bean = new Doctor(102, "Domnic", "Heart", "12_01_24", "12:35", "Dev");

	@Test
	void contextLoads() {
	}

	@Test
	public void testInsert() {
		dao = new DMSRepository();
		boolean result = dao.insert(bean);
		assertEquals(result, true);
	}

}
