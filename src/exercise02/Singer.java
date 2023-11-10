/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise02;

/**
 *
 * @author adahestrella
 */
public class Singer {
    //Fields
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    
    public Singer(String singerName){
        this.name = singerName;
        this.noOfPerformances = 0;
        this.earnings = 0.0;
        this.favoriteSong = null;     
    }
    
    //Methods
    
    public void performForAudience(int noOfAudience) {
        noOfPerformances++;
        earnings += noOfAudience * 100;
    }
    
    public void changeFavSong(Song newFavSong) {
        favoriteSong = newFavSong;
    }
    
    //Printing Info
    public void printSingerInfo() {
        System.out.println("Singer: " + name);
        System.out.println("Number of Performances: " + noOfPerformances);
        System.out.println("Earnings: $" + earnings);
        System.out.println("Favorite Song is currently " + favoriteSong.getSongName() + " in the genre of " 
        + favoriteSong.getSongGenre() + " by " + favoriteSong.getSongArtist() + "\n\n");
    }
    
    
    
}
