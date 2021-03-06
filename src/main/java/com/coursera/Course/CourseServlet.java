package com.coursera.Course;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coursera.File.File;
import com.coursera.File.FileDAO;
import com.coursera.Quiz.Quiz;
import com.coursera.Quiz.QuizDAO;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/Main/Course")
public class CourseServlet extends HttpServlet{
	
	private void loadFiles(int CourseID,HttpServletRequest request)
	{
		FileDAO dao=new FileDAO();

		ArrayList<File> FilesArray=dao.getFiles(CourseID);
		request.getSession().setAttribute("FilesArray", FilesArray);
	}
	private void loadQuizez(int CourseID,HttpServletRequest request)
	{
		QuizDAO dao=new QuizDAO();
		
		ArrayList<Quiz> QuizesArray=dao.getquiz(CourseID);
		request.getSession().setAttribute("QuizesArray", QuizesArray);
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int CourseID=(int)request.getSession().getAttribute("CourseID");
		loadFiles(CourseID,request);
		loadQuizez(CourseID,request);
		System.out.println(CourseID);
		request.getRequestDispatcher("/WEB-INF/Pages/Course.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int CourseID=Integer.parseInt(request.getParameter("CourseID"));
		request.getSession().setAttribute("CourseID", CourseID);
		response.sendRedirect("/Main/Course");
	}

			

}
