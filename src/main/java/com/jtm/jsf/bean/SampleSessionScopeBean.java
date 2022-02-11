/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jtm.jsf.bean;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
/**
 *
 * @author Jackey
 */

@Named("sampleSessionBean")
@SessionScoped //Only instance per session (user browser session)
public class SampleSessionScopeBean implements Serializable{
    
}
