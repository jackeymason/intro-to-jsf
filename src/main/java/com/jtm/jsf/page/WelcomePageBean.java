/*
 * This is the Model, the backing bean of the MVC
 * index.xhtml is the View
 * The FacesServlet si the Controller 
*/
package com.jtm.jsf.page;

import com.jtm.jsf.bean.SampleViewScopedBean;
import java.security.Principal;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jackey
 */
@Named("welcomePageBean") //gives the name/handle we can use in our JSFs
@RequestScoped //Tell CDI how long this bean should live - RequestScoped last only for the request, once page is fully loaded in browser.
public class WelcomePageBean {
    private String welcomeUserName;
    private String completedGreeting;
    
    //Add a bean to this bean and use it below...
    //Though no restrictions, you DON't want to inject narrower scope beans into wider ones
    //or you can get memory leaks. So, inject wider into narrower like:
    //Application scoped beans into Session scoped beans, and Session scope beans into request scope beans,
    //But NOT Request into Session 
    @Inject
    SampleViewScopedBean viewBean;
    
    @Inject //Session into request is good
    HttpSession session;
    
    @Inject
    ServletContext servletContext;
    
//    @Inject //for a security enabled bean or page where we say login a user we can inject the user.
//    Principal currentUser; //Causing issues as not such intitity 
    
    

    /**
     * @return the welcomeUserName
     */
    public String getWelcomeUserName() {
        return welcomeUserName;
    }

    /**
     * @param welcomeUserName the welcomeUserName to set
     */
    public void setWelcomeUserName(String welcomeUserName) {
        this.welcomeUserName = welcomeUserName;
    }

    /**
     * @return the completedGreeting
     */
    public String getCompletedGreeting() {
        return completedGreeting;
    }

    /**
     * @param completedGreeting the completedGreeting to set
     */
    public void setCompletedGreeting(String completedGreeting) {
        this.completedGreeting = completedGreeting;
    }
    
    public void sayHello(){
        completedGreeting = "Hello, " + welcomeUserName;
    }
    
    //Flash Scope
    public String navigateToFlashPage(){
        //Flash scope is the best way to transmit data bean to bean or bean to page
        //Here we are passing data from another bean from within this one.
        FacesContext.getCurrentInstance().getExternalContext().getFlash().put("transmittedVariable", viewBean.getDogs().get(0));
        //add parameter to update url
        return "flashscope.xhtml?faces-redirect=true";
    }
    
    public void isRefreshed(){
        //FacesContext is a key JSF Object. getCurrentInstance will be tied to this object scope,
        //so RequestScope!
        FacesContext.getCurrentInstance().isPostback();
        FacesContext.getCurrentInstance().validationFailed();
        
    }
    
}
