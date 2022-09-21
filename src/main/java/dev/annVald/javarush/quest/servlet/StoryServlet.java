package dev.annVald.javarush.quest.servlet;

import dev.annVald.javarush.quest.Node;
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


@WebServlet(value = "/story")
public class StoryServlet extends HttpServlet {
    Story story;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ServletContext servletContext = config.getServletContext();
        story = (Story) servletContext.getAttribute("story");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int nextNodeId = Integer.parseInt(request.getParameter("nextNode"));
        Node node = story.getStory().get(nextNodeId);
        request.setAttribute("storyNode", node);
        if (node.getOption1Text() == null) {
            HttpSession session = request.getSession();
            request.setAttribute("username", session.getAttribute("username"));
            getServletContext()
                    .getRequestDispatcher("/finish.jsp")
                    .forward(request, response);
        } else
            getServletContext()
                    .getRequestDispatcher("/story.jsp")
                    .forward(request, response);

    }

}
