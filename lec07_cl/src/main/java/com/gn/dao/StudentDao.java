package com.gn.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gn.dto.Student;

public class StudentDao {
	
	List<Student>	selectAll() {
		SqlSession session = SessionTemplate.getSqlSession(true);
		List<Student> list = session.selectList("con.gn.mapper.StudentMapper.selectAll");
		session.close();
		return list;
	}

}
