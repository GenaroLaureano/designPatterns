/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import builders.UserBuilder;
import entidad.User;

/**
 *
 * @author laure
 */
public class Principal {
    
    public static void main(String[] args){
       
        UserBuilder a = new UserBuilder(1,"jose");
        a.age(12);
        a.lastName("fernando");
         
        User u3 = a.build();
       
        User u1 = new User(1,"");
        User u2 = new User(2,"");
        
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
                
    }
    
}
