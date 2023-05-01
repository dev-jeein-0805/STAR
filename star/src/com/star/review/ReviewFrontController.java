package com.star.review;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.star.Result;
import com.star.review.controller.ReviewDeleteOkController;
import com.star.review.controller.ReviewListOkController;
import com.star.review.controller.ReviewLoadOkController;

public class ReviewFrontController extends HttpServlet {
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      req.setCharacterEncoding("UTF-8");

      String target = req.getRequestURI().replace(req.getContextPath() + "/", "").split("\\.")[0];
      Result result = null;
      if (target.equals("review")) {
    	  System.out.println("머선일이고");
    	  result = new Result();
   	  result.setPath("/templates/mypage/review.jsp");
   	  
   	  
      }else if(target.equals("reviewLoadOk")) {
         result = new ReviewLoadOkController().execute(req, resp);
      }else if(target.equals("reviewDeleteOk")) {
         result= new ReviewDeleteOkController().execute(req, resp);
      }else if(target.equals("listAllOk")) {
    	  result= new ReviewListOkController().execute(req, resp);
      }
      
      
      if (result != null) {
         if (result.isRedirect()) {
            resp.sendRedirect(result.getPath());
         } else {
            req.getRequestDispatcher(result.getPath()).forward(req, resp);
         }
      }
}

   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      doGet(req, resp);
   }
}

