package org.Main;

import org.contract.IModel;
import org.contract.IView;
import org.controller.Controller;
import org.model.Model;
import org.view.View;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main(String[] args)
    {
    	IView view = new View();
    	IModel model = new Model();
        Controller controller = new Controller(view, model);
        controller.run();
    }
}
