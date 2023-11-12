package exercise06;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author adahestrella
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Monster fire = new FireType("Charizard", 200, 50);
        Monster grass = new GrassType("Bulbasaur", 150, 60);
        Monster water = new WaterType("Squirtle", 175, 20);
        
        battle(grass, fire);
        battle(fire, water);
        battle(grass, fire);
    }
        
        public static void battle(Monster monster1, Monster monster2){
        while ((monster2.getHP() > 0) && (monster1.getHP() > 0)){
            System.out.printf("\n%s is battling against %s\n", monster1.getName(), monster2.getName());
            
            if (monster1.getHP() > 0){
            monster1.attack(monster2);
            }
            
            if (monster2.getHP() > 0){
                monster2.attack(monster1);
            }
            
            
        }
        
        if (monster1.getHP() > 0){
        System.out.printf("\n%s has won against %s\n", monster1.getName(), monster2.getName());
        }
        if (monster2.getHP() > 0){
        System.out.printf("\n%s has won against %s\n", monster2.getName(), monster1.getName());
        }
        monster1.restoreHealth();
        monster2.restoreHealth();
        }   
    }
    
