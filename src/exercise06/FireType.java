package exercise06;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adahestrella
 */
public class FireType extends Monster {
    public FireType(String n, int m, int base){
        super(n, "fire", "grass", "water", m, base);
        atk = (int) 1.3 * base;
        def = (int) 0.7 * base;
    }
    
    @Override
    public void special(){
        atk += 2;
        hp -= (int) (0.1 * maxHP);
        
        System.out.printf("\n%s used special move! They increased their attack "
                + "by 2 points however reduced their HP to %.2f\n", getName(), hp);
    }
    
}
