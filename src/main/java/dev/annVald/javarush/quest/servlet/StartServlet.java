package dev.annVald.javarush.quest.servlet;

import dev.annVald.javarush.quest.Story;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "startServlet", value = "/start")
public class StartServlet extends HttpServlet {
    Story story = new Story();

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        story.initStory();
        ServletContext servletContext = config.getServletContext();
        servletContext.setAttribute("story", story);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");

        HttpSession session = request.getSession();
        session.setAttribute("username", username);
        request.setAttribute("storyNode", story.getStory().get(1));

        getServletContext()
                .getRequestDispatcher("/story.jsp")
                .forward(request, response);


    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("storyNode", story.getStory().get(1));
        getServletContext()
                .getRequestDispatcher("/story.jsp")
                .forward(request, response);
    }
}
