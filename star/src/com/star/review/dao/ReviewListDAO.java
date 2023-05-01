package com.star.review.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.star.mybatis.config.MyBatisConfig;
import com.star.review.domain.ReviewDTO;

public class ReviewListDAO {
public SqlSession sqlSession;

   public ReviewListDAO() {
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
   }
   
// 전체 이용후기 화면
   public List<ReviewDTO> selectOverall(){
	   return sqlSession.selectList("review.selectOverall");
   }
}