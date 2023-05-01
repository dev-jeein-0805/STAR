package com.star.review.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import com.star.Action;
import com.star.Result;
import com.star.review.dao.ReviewListDAO;

public class ReviewListOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
	    resp.setContentType("text/html; charset=utf-8");
	    System.out.println("컨트롤러 들어옴");
	    
		ReviewListDAO reviewListDAO = new ReviewListDAO();
		Result result = new Result();
		JSONArray jsonArray = new JSONArray();    
	    reviewListDAO.selectOverall().stream().map(review -> new JSONObject(review)).forEach(jsonArray::put);
	    req.setAttribute("reviews", jsonArray.toString());
	    result.setPath("templates/2yong/2yong.jsp");
	    return result;
	}
}
