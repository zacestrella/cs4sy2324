/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercise01;

/**
 *
 * @author PHOTON
 */
public class Exercise01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//declarations
  String show1name = "Big Bang Theory";
  int show1episodes = 279;
  String show1genre = "Sitcom";
  
  String show2name = "Gossip Girl";
  int show2episodes = 121;
  String show2genre = "Drama";
  
  String show3name = "Modern Family";
  int show3episodes = 250;
  String show3genre = "Sitcom";

//printing information  
  System.out.print("Show 1:\n" + "Name: " + show1name + "\nNumber of Episodes: " + show1episodes + "\nGenre: " + show1genre + "\n\n");

  System.out.print("Show 2:\n" + "Name: " + show2name + "\nNumber of Episodes: " + show2episodes + "\nGenre: " + show2genre + "\n\n");

  System.out.print("Show 3:\n" + "Name: " + show3name + "\nNumber of Episodes: " + show3episodes + "\nGenre: " + show3genre + "\n\n");  
  
//operations and outputs

    //sum of episodes
  int totalepisodes = show1episodes + show2episodes + show3episodes;
  
    System.out.println("Total Episodes: " + totalepisodes);
  
    //determining whether or not show 1 has the most episodes
  System.out.print("\n" + show1name + " has the most episodes: ");

    
  System.out.print(show1episodes > show2episodes && show1episodes > show3episodes);
  
    //comparison of genres
  
  System.out.print("\n\nShows with the same Genre: \n");
  
    //comparison of genres
  System.out.print(show1name + " and " + show2name + ": ");
    System.out.print(show1genre == show2genre);

  System.out.print("\n" + show1name + " and " + show3name + ": ");
    System.out.print(show1genre == show3genre);

  System.out.print("\n" + show2name + " and " + show3name + ": ");
    System.out.print(show2genre == show3genre);
    }
}