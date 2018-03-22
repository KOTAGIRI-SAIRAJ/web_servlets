package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("called post");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("called get");
        PrintWriter out = response.getWriter();
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your PostgreSQL JDBC Driver? "
                    + "Include in your library path!");
            e.printStackTrace();
            return;
        }
        try {

            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/servlet_project", "postgres",
                    "password");
            System.out.println("connection established "+connection);
            String sql = "SELECT * FROM registered_users";
            System.out.println("query exectued "+sql);
            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()){
                System.out.println("userId "+resultSet.getString("user_id")+ " username "+resultSet.getString("username"));
            }
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }
        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
    }
}
