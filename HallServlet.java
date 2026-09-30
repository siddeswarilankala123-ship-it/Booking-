package com.functionhall.controller;
import com.functionhall.dao.HallDAO;import jakarta.servlet.annotation.WebServlet;import jakarta.servlet.http.*;import jakarta.servlet.ServletException;import java.io.*;
@WebServlet("/halls") public class HallServlet extends HttpServlet{protected void doGet(HttpServletRequest q,HttpServletResponse p)throws ServletException,IOException{try{q.setAttribute("halls",new HallDAO().findAll());q.getRequestDispatcher("halls.jsp").forward(q,p);}catch(Exception e){throw new ServletException(e);}}}
