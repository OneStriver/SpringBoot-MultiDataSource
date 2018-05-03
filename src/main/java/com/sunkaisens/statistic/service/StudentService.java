package com.sunkaisens.statistic.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.sunkaisens.statistic.configuration.TargetDataSource;
import com.sunkaisens.statistic.mapper.StudentDao;
import com.sunkaisens.statistic.modal.Student;

/**
 * Student Service
 */
@Service
public class StudentService {

//    @Autowired
//    private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private StudentDao studentDao;

    /**
     * 不指定数据源使用默认数据源
     */
    public List<Student> getList(){
//        String sql = "select id,age,name,subScore,avgScore from student";
//        return (List<Student>) jdbcTemplate.query(sql, new RowMapper<Student>(){
//
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Student stu = new Student();
//                stu.setId(rs.getInt("id"));
//                stu.setAge(rs.getInt("age"));
//                stu.setName(rs.getString("name"));
//                stu.setSumScore(rs.getString("subScore"));
//                stu.setAvgScore(rs.getString("avgScore"));
//                return stu;
//            }
//
//        });
    	List<Student> localList = studentDao.getLocalList();
    	return localList;
    }

    /**
     * 指定数据源
     */
    @TargetDataSource(name="hss1")
    public List<Student> getListByDs1(){
//        String sql = "select id,age,name,subScore,avgScore from student";
//        return (List<Student>) jdbcTemplate.query(sql, new RowMapper<Student>(){
//
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Student stu = new Student();
//                stu.setId(rs.getInt("id"));
//                stu.setAge(rs.getInt("age"));
//                stu.setName(rs.getString("name"));
//                stu.setSumScore(rs.getString("subScore"));
//                stu.setAvgScore(rs.getString("avgScore"));
//                return stu;
//            }
//
//        });
    	List<Student> localList = studentDao.getLocalHss1List();
    	return localList;
    	
    }

    /**
     * 指定数据源
     */
    @TargetDataSource(name="hss2")
    public List<Student> getListByDs2(){
//        String sql = "select id,age,name,subScore,avgScore from student";
//        return (List<Student>) jdbcTemplate.query(sql, new RowMapper<Student>(){
//
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Student stu = new Student();
//                stu.setId(rs.getInt("id"));
//                stu.setAge(rs.getInt("age"));
//                stu.setName(rs.getString("name"));
//                stu.setSumScore(rs.getString("subScore"));
//                stu.setAvgScore(rs.getString("avgScore"));
//                return stu;
//            }
//
//        });
    	List<Student> localList = studentDao.getLocalHss2List();
    	return localList;
    	
    }
}
