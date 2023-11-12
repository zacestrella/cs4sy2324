package exercise06;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adahestrella
 */
public class WaterType extends Monster {
    public WaterType(String n, int m, int base){
        super(n, "water", "fire", "grass", m, base);
        atk = (int) 0.7 * base;
        def = (int) 1.3 * base;
    }
    
    @Override
    public void special(){
        def += 2;
        hp -= (int) (0.1 * maxHP);
        
        System.out.printf("\n%s used special move! They increased their defense by"
                + " 2 points however reduced their HP to %.2f\n", getName(), hp);
    }
    
}
