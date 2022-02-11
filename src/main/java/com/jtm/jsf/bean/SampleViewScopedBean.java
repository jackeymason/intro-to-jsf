/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jtm.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jackey
 */
@Named("SampleViewBean")
@ViewScoped //This is an intermediate scope between request and session, great for AJAX - around till user navigates away from page
public class SampleViewScopedBean implements Serializable{
    private List<String> dogs;
    
    

    /**
     * How to initialize data for JSF
     */
    @PostConstruct
    public void initDog(){
        dogs = new ArrayList<>();
        dogs.add("corgi");
        dogs.add("retriever");
    }
    
    
    @PreDestroy
    public void cleanUp(){
        dogs = null;
    }
    
    public void getSession(){
        //false, so we don't create a session if one doesn't exist
        HttpSession session = (HttpSession)FacesContext
                .getCurrentInstance()
                .getExternalContext()
                .getSession(false);
        //This might be good for logout or page timeout
        if(session != null)
            session.invalidate();
    }
    
    /**
     * @return the dogs
     */
    public List<String> getDogs() {
        
        return dogs;
    }

    /**
     * @param dogs the dogs to set
     */
    public void setDogs(List<String> dogs) {
        this.dogs = dogs;
    }
}
