/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jtm.jsf.bean;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author Jackey
 */
@Named("sampleAppScopedBean")
@ApplicationScoped  //Singleton instance will be around from when first used till undeployed
public class SampleApplicationScopedBean {
    
}
