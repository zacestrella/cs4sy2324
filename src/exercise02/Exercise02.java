/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise02;

/**
 *
 * @author adahestrella
 */
public class Exercise02 {
    public static void main(String[] args) {

        //TVShows: 3 instances 
        System.out.println("TVShow Class: ");
        TVShows show1 = new TVShows("Big Bang Theory", 279, "Sitcom");
        TVShows show2 = new TVShows("Gossip Girl", 121, "Drama");
        TVShows show3 = new TVShows("Modern Family", 250, "Sitcom");
        show1.printShowInfo();
        show2.printShowInfo();
        show3.printShowInfo();
        
        //Songs: 2 Instances
        System.out.println("\nSong Class:");        
        Song firstSong = new Song("You Are In Love", "Pop", "Taylor Swift");
        Song secondSong = new Song("Golden", "Pop", "Harry Styles");
        firstSong.printSongInfo();
        secondSong.printSongInfo();
        
        //Singer
        System.out.println("\nSinger Class: " + "\n" + "Pre Performance- ");
        Singer singerName = new Singer("Adah Estrella");

        Song favoriteSong = new Song("Golden", "Pop", "Harry Styles");
        singerName.changeFavSong(favoriteSong);
        singerName.printSingerInfo();
        singerName.performForAudience(12);
        
        System.out.println("Post Performance- ");
        Song newFavSong = new Song("You Are In Love", "Pop", "Taylor Swift");
        singerName.changeFavSong(newFavSong); 
        singerName.printSingerInfo();
    }
    
}
