package com.michael;

import java.io.Serializable;

/**
 * Program to define the user class
 * 
 */

public class User {
    @SuppressWarnings("serial")
    public class Customer implements Serializable, Cloneable {
        private String userEmail = "";
        private String userPassword = "";
        private String customerName = "";
        private String contactName = "";
        private String address1 = "";
        private String address2 = "";
        private String address3 = "";
        private String customerPhone = "";

        //Get the value of the user email
        public String getUserEmail() {
            return userEmail;
        }//getUserEmail

        //Set the value of the user email
        public void setUserEmail(String email) {
            this.userEmail = email;
        }//setuserEmail
        
        //Get the value of the user password
        public String getUserPassword() {
            return userPassword;
        }//getUserPassword

        //Set the value of the user password
        public void setUserPassword(String password) {
            this.userPassword = password;
        }//setuserPassword
        
        //Get the value of the customer name
        public String getCustomerName() {
            return customerName;
        }//getCustomerName

        //Set the value of the customer name
        public void setCustomerName(String customer) {
            this.customerName = customer;
        }//setCustomerName
    
        //Get the value of the contact name
        public String getContactName() {
            return contactName;
        }//getContactName

        //Set the value of the contact name
        public void setContactName(String contact) {
            this.contactName = contact;
        }//setContactName

        //Get the value of address1
        public String getAddress1() {
            return address1;
        }//getAddress1
        
        //Set the value of address1
        public void setAddress1(String address_1) {
            this.address1 = address_1;
        }//setAddress1

        //Get the value of address2
        public String getAddress2() {
            return address2;
        }//getAddress2
    
        //Set the value of address2
        public void setAddress2(String address_2) {
        this.address2 = address_2;
        }//setAddress2

        //Get the value of address3
        public String getAddress3() {
        return address3;
        }//getAddress3

        //Set the value of address3
        public void setAddress3(String address_3) {
        this.address3 = address_3;
        }//setAddress2
        
        //Get the value of customerPhone
        public String getCustomerPhone() {
            return customerPhone;
            }//getcustomerPhone

        //Set the value of customerPhone
        public void setCustomerPhone(String phone) {
            this.customerPhone = phone;
        }//setCustomerPhone
     
    }
}