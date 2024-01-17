package com.dms.evaluation.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dms.evaluation.model.Doctor;

@Repository
public class DMSRepository {

	static List<Doctor> repoList;

	public static boolean insert(Doctor bean) {
		
		repoList=new ArrayList<Doctor>();
		repoList.add(bean);
		return true;
	}

	public static List<Doctor> view() {
		return repoList;
	}
	



}
