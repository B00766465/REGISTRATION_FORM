package com.michael;

import com.vaadin.data.Binder;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.*;

public class RegistrationForm<T extends User> extends VerticalLayout {

    private static final long serialVersionUID = 1L;
    private TextField userEmail;
    private TextField userPassword;
    private TextField confirmPassword;
    private TextField customerName;
    private TextField contactName;
    private TextField address1;
    private TextField address2;
    private TextField address3;
    private TextField phone;

    private T user;
    Binder<T> binder = new Binder<>();

    public RegistrationForm() {
 
        //Add the components of the form (Textfields)
        userEmail = new TextField("User Email:");
        userPassword = new TextField("User password:");
        confirmPassword= new TextField("Confirm Password:");
        customerName= new TextField("Customer Name:");
        contactName = new TextField("Contact Name:");
        address1 = new TextField("Address Line 1:");
        address2 = new TextField("Address Line 2:");
        address3 = new TextField("Address Line 3:");
        phone = new TextField("Phone Number:");
       
  
        //Add the labels, buttons and listeners
        Label registeredLabel = new Label("<strong>Click Register Me to register</strong>", ContentMode.HTML);
        Button registerButton = new Button("Register Me");
        registerButton.addClickListener(e -> {
            registeredLabel.setValue("<h3><strong> You have been registered </strong></h3>");
            return;
        });
        
        Label cancelLabel = new Label("<strong>Click Cancel to cancel your registration</strong>", ContentMode.HTML);
        Button cancelButton = new Button("Cancel");
        cancelButton.addClickListener(e -> {
            cancelLabel.setValue("<h3><strong> Your registration is cancelled!</strong></h3>");
        });

        //Layouts
        HorizontalLayout hLayout = new HorizontalLayout();
        HorizontalLayout hLayout2 = new HorizontalLayout();
        hLayout.addComponents(registerButton, registeredLabel, cancelButton, cancelLabel);
        hLayout2.addComponents(userEmail, userPassword, confirmPassword);
        addComponents(hLayout2, customerName, contactName,address1, address2, address3, phone, hLayout);
        
    }

    //setUser
    public void setUser(T user) {
        this.user = user;
        this.binder.setBean(this.user);
    }//setUser

}//Class
