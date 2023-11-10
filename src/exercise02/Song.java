/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise02;

/**
 *
 * @author adahestrella
 */
public class Song {
    
    //Fields of the class
    private String songName;
    private String songGenre;
    private String songArtist;
    
    //Constructor
    public Song(String songName, String songGenre, String songArtist) {
        this.songName = songName;
        this.songGenre = songGenre;
        this.songArtist = songArtist;     
    }
    
    //Methods

    /**
     * @return the songName
     */
    public String getSongName() {
        return songName;
    }

    /**
     * @param songName the songName to set
     */
    public void setSongName(String songName) {
        this.songName = songName;
    }

    /**
     * @return the songGenre
     */
    public String getSongGenre() {
        return songGenre;
    }

    /**
     * @param songGenre the songGenre to set
     */
    public void setSongGenre(String songGenre) {
        this.songGenre = songGenre;
    }

    /**
     * @return the songArtist
     */
    public String getSongArtist() {
        return songArtist;
    }

    /**
     * @param songArtist the songArtist to set
     */
    public void setSongArtist(String songArtist) {
        this.songArtist = songArtist;
    }
    
    public void printSongInfo(){
      System.out.println("Song: " + songName + " Song Artist: " + songArtist + " Song Genre: " + songGenre ); 
    }
}
