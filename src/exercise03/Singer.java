/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise03;

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
   
    private static int totalPerformances = 0;
    
    //Access Modifiers
    
    /**
     * @return the totalPerformances
     */
    public static int getTotalPerformances() {
        return totalPerformances;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the noOfPerformances
     */
    public int getNoOfPerformances() {
        return noOfPerformances;
    }

    /**
     * @return the earnings
     */
    public double getEarnings() {
        return earnings;
    }

    /**
     * @return the favoriteSong
     */
    public Song getFavoriteSong() {
        return favoriteSong;
    }
    
    
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param noOfPerformances the noOfPerformances to set
     */
    public void setNoOfPerformances(int noOfPerformances) {
        this.noOfPerformances = noOfPerformances;
    }

    /**
     * @param earnings the earnings to set
     */
    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    /**
     * @param favoriteSong the favoriteSong to set
     */
    public void setFavoriteSong(Song favoriteSong) {
        this.favoriteSong = favoriteSong;
    }

    /**
     * @param aTotalPerformances the totalPerformances to set
     */
    public static void setTotalPerformances(int aTotalPerformances) {
        totalPerformances = aTotalPerformances;
    }

//Methods
       
    public void changeFavSong(Song newFavSong) {
        favoriteSong = newFavSong;
        System.out.println(getName() + "'s"+ " favorite Song is " 
                + getFavoriteSong().getSongName() + " in the genre of " 
                + getFavoriteSong().getSongGenre() + " by " + getFavoriteSong().getSongArtist() + "\n");
    }
    
    public void performForAudience(int noOfAudience) {
        noOfPerformances++;
        earnings = noOfAudience * 100;
        totalPerformances++;
        
        System.out.println("Singer: " + getName());
        System.out.println("The singer is performing alone");
        System.out.println("Total Number of Performances: " + getTotalPerformances());
        System.out.println(getName() + " performed " + getNoOfPerformances() + " times");
        System.out.println(getName() + " has earned: $" + getEarnings());
    } 
    
    public void performForAudience(int noOfAudience, Singer coSinger){
        noOfPerformances++;
        totalPerformances += noOfPerformances;
        earnings = (noOfAudience * 100)/2;
        coSinger.noOfPerformances++;
        coSinger.earnings = (noOfAudience * 100)/2;
        
        System.out.println("Singer: " + getName());
        System.out.println("The singer is performing with " + coSinger.name);
        System.out.println("Total Number of Performances: " + getTotalPerformances());
        System.out.println(getName() + " performed " + getNoOfPerformances() + " times");
        System.out.println(getName() + " has earned: $" + getEarnings());
    }

}