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
public class Drive {

    public static Field[] field = new Field[40];

    public void makeFields() {
        for (int i = 0; field.length > i; i++) {
            field[i] = new Field("Field"+i, i);
        }
    }

}
