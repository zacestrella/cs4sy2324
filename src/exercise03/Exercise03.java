/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise03;

/**
 *
 * @author adahestrella
 */
public class Exercise03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //TVShows: 3 instances 
        System.out.println("TVShow Class: "); //Outout Divider  
        
        TVShows.TVShows("Big Bang Theory", 279, "Sitcom");
        TVShows.TVShows("Gossip Girl", 121, "Drama");
        TVShows.TVShows("Modern Family", 250, "Sitcom");
        
        //Songs: 2 Instances
        System.out.println("\nSong Class:"); //Outout Divider    
        
        Song.Song("You Are In Love", "Pop", "Taylor Swift");
        Song.Song("Golden", "Pop", "Harry Styles");
        
        //Singer
        System.out.println("\nSinger Class:"); //Outout Divider 
        
        System.out.println("\nWithout Singing Partner:");//Outout Divider 
        Singer singer1 = new Singer("Adah Estrella");
        singer1.performForAudience(12);

        System.out.println("\nWith Singing Partner:");//Outout Divider  
        Singer singer2 = new Singer("Ethan");
        singer1.performForAudience(12, singer2);
        
            // Favorite Song
        System.out.println("\nOld Favorite Song "); //Outout Divider  
        Song favoriteSong = new Song("all my ghosts", "Pop", "Lizzy McAlpine");
        singer1.changeFavSong(favoriteSong);
        
        System.out.println("New Favorite Song");//Outout Divider
        Song newFavSong = new Song("New Romantics", "Pop", "Taylor Swift");
        singer1.changeFavSong(newFavSong);
    }
    
}