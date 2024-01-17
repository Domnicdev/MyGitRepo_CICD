package com.dms.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dms.evaluation.model.Doctor;
import com.dms.evaluation.repository.DMSRepository;

public class SB_DMS_CICD_test {

	static DMSRepository dao;
  Doctor bean = new Doctor(102,"Domnic","Heart","12_01_24","12:35","Dev");
	@Test
	public void testInsert() {
        dao = new DMSRepository();
        boolean result = dao.insert(bean);
        assertEquals(result,true);


	}

	

}
