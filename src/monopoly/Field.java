/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author rickie
 */
public class Field {
    String name;
    int number;
    
    Field(String _name, int _number){
        name = _name;
        number = _number;
    }
    
    public String getName(){
        return name;
    }
    
    public int getNumber(){
        return number;
    }
    
    public String toString(){
        return name;
    }
}
