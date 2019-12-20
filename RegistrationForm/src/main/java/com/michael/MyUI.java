package com.michael;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();//Add the overall layout
        Label logo = new Label(
            "<H2>New User Registration Form</H2><p/> <h4>Please enter the details below and click Register Me (or Cancel to return to Login)</h4>",
            ContentMode.HTML);
        HorizontalLayout hLayout = new HorizontalLayout();//Add the layout of the 2 buttons
        //Adding a grid here
        Grid<User> myGrid = new Grid<>();
        myGrid.setWidth("1200px");  
       
       
        //Add a form layout
        FormLayout registrationForm = new FormLayout();
        registrationForm.setMargin(false);
        registrationForm.addStyleName("outlined");
        registrationForm.setSizeFull();
        //registrationForm.setWidth("800px");

 
        //Add the components of the form (Textfields)
        final Component userEmail = new TextField("User Email Address");
        userEmail.setWidth(30.0f, Unit.PERCENTAGE);
        registrationForm.addComponent(userEmail);
 
        final TextField userPasswordField = new TextField("User password");
        userPasswordField.setWidth(30.0f, Unit.PERCENTAGE);
        registrationForm.addComponent(userPasswordField);
 
        final Component confirmUserPassword = new TextField("Confirm User password");
        confirmUserPassword.setWidth(30.0f, Unit.PERCENTAGE);
        registrationForm.addComponent(confirmUserPassword);

        final Component customerName = new TextField("Customer Name");
        customerName.setWidth(30.0f, Unit.PERCENTAGE);
        registrationForm.addComponent(customerName);

        final Component contactName = new TextField("Contact Name");
        contactName.setWidth(30.0f, Unit.PERCENTAGE);
        registrationForm.addComponent(contactName);

        final Component address1 = new TextField("Address 1");
        address1.setWidth(30.0f, Unit.PERCENTAGE);
        registrationForm.addComponent(address1);

        final Component address2 = new TextField("Address 2");
        address2.setWidth(30.0f, Unit.PERCENTAGE);
        registrationForm.addComponent(address2);

        final Component address3 = new TextField("Address 3");
        address3.setWidth(30.0f, Unit.PERCENTAGE);
        registrationForm.addComponent(address3);

        final Component telephone = new TextField("Telephone");
        telephone.setWidth(30.0f, Unit.PERCENTAGE);
        registrationForm.addComponent(telephone); 
  
        //Add the button and listeners
        Button registerButton = new Button("Register Me");
        registerButton.addClickListener(e -> {
            layout.addComponent(new Label("Thanks you are added!"));
        });
        
        Button cancelButton = new Button("Cancel");
        cancelButton.addClickListener(e -> {
            layout.addComponent(new Label("Your registration is cancelled!"));
        });

        //Adds the final layout
        hLayout.addComponents(registerButton, cancelButton);
        layout.addComponents(logo, registrationForm,hLayout);
        
        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {

        /**
         *
         */
        private static final long serialVersionUID = 1L;
    }
}//class
