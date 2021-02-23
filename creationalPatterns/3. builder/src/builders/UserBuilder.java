/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builders;

import entidad.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laure
 */
public class UserBuilder {
    
    private User user;
    
    public UserBuilder(int id, String name){
        this.user = new User(id,name);
    }
    
    public UserBuilder name(String name){
        
        this.user.setName(name);
        
        return this;
    }
    
    public UserBuilder lastName(String name){
        
        this.user.setLastName(name);
        
        return this;
    }
    
    public UserBuilder age(int age){
        
        this.user.setAge(age);
        
        return this;
    }
    
    public UserBuilder phone(int phone){
        
        this.user.setPhone(phone);
        
        return this;
    }
    
    public UserBuilder profession(String profession){
        
        this.user.setProfession(profession);
        
        return this;
    }
    
    
    public User build(){
        
        return this.user;
        
    }
    
}
