/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise03;

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

      /**
     * @return the showName
     */
    public String getShowName() {
        return showName;
    }

    /**
     * @param showName the showName to set
     */
    public void setShowName(String showName) {
        this.showName = showName;
    }

    /**
     * @return the showEpisodes
     */
    public int getShowEpisodes() {
        return showEpisodes;
    }

    /**
     * @param showEpisodes the showEpisodes to set
     */
    public void setShowEpisodes(int showEpisodes) {
        this.showEpisodes = showEpisodes;
    }

    /**
     * @return the showGenre
     */
    public String getShowGenre() {
        return showGenre;
    }

    /**
     * @param showGenre the showGenre to set
     */
    public void setShowGenre(String showGenre) {
        this.showGenre = showGenre;
    }
    
        //Printing Info 
        public static void TVShows(String showName, int showEpisodes, String showGenre){
        System.out.print("Show Name: " + showName + "|| Number of Episodes: " 
                   + showEpisodes + "|| Genre: " + showGenre + "\n");
    }

            
}