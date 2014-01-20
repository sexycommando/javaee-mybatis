/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.apps.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author bigadmin
 */
@Named(value = "indexPage")
@RequestScoped
public class IndexPage {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
//    @Inject
//    private UserService userService;
    public String submit() {
        //Usertable usertable = userService.getUsertable();
        return "";
    }
}
