/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise02;

/**
 *
 * @author adahestrella
 */
public class TVShows {

    private String showName;
    private int showEpisodes;
    private String showGenre;
    
    //Constructor
    public TVShows(String showName, int showEpisodes, String showGenre){
        this.showName = showName;
        this.showEpisodes = showEpisodes;
        this.showGenre = showGenre;
    }
    
    public void printShowInfo(){
        System.out.print("Show Name: " + showName + "|| Number of Episodes: " + showEpisodes + "|| Genre: " + showGenre + "\n");
    }
            
}
