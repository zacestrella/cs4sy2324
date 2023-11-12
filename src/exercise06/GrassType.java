package exercise06;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adahestrella
 */
public class GrassType extends Monster {
    public  GrassType(String n, int m, int base){
        super(n, "grass", "water", "fire", m, base);
        atk = base;
        def = base;
    }
    
    public void rest(){
        hp += (0.5 * maxHP);
        
        System.out.printf("%s restored their health to %d HP\n", getName(), hp);
    }
    
    @Override
    public void special(){
        hp += (int) (0.2 * maxHP);
        
        System.out.printf("\n%s used special move! "
                + "They increased their HP to %d\n", getName(), hp);
    }
}
