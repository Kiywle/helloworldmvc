package org.view;

import org.contract.IView;

/**
 * Hello world!
 *
 */
public class View implements IView
{
    public void displayMessage(String message) {
    	System.out.println(message);
    }
}
