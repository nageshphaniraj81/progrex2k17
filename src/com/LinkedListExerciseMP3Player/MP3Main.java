package com.LinkedListExerciseMP3Player;

import java.util.*;

/**
 * Created by Nagesh Phaniraj on 2/4/2017.
 */
public class MP3Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

       Album album = new Album("Strombringer", "Deep Purple");
        album.addSong("Strombringer", 4.6);
        album.addSong("Love dont mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You cant do it right", 6.23);
        album.addSong("Hing ball Shooter", 4.27);
        album.addSong("The gypse", 4.2);
        album.addSong("Soldiers of fortune", 3.13);
       albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to Rock", 4.6);
        album.addSong("I put the finger on you", 4.22);
        album.addSong("Lets go", 4.3);
        album.addSong("Inject the Venom", 5.6);
        album.addSong("SnowBalled", 3.21);
        album.addSong("Evil walks", 6.23);
        album.addSong("C.O.D", 4.27);
        album.addSong("Breaking the rules" , 4.2);
        album.addSong("Night of the long knives", 3.13);
        albums.add(album);

        LinkedList<Song> playlist  = new LinkedList<Song>();
        albums.get(0).addToPlayList("Hold on",playlist);
        albums.get(0).addToPlayList("The gypse",playlist);
        albums.get(0).addToPlayList("Soldiers of fortune",playlist);
        albums.get(1).addToPlayList(2,playlist);
        albums.get(1).addToPlayList(3,playlist);
        albums.get(1).addToPlayList(5,playlist);
        albums.get(1).addToPlayList(6,playlist);
        albums.get(1).addToPlayList(24,playlist);
        play(playlist);

    }

    private static void play(LinkedList<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0){
            System.out.println("Playlist is empty");
        }else{
            System.out.println("Now playing : "+listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action  = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Quiting out of the playlist");
                    quit = true;
                    break;
                case 1:
                      if(!forward){
                         if(listIterator.hasNext()){
                             listIterator.next();
                          }
                          forward =true;
                      }
                      if(listIterator.hasNext()){
                          System.out.println("Now playing :"+listIterator.next().toString());
                      }else{
                          System.out.println("We have reached to the end of the playlist");
                          forward =false;
                      }
                    break;
                case 2:
                    if(forward){
                    if(listIterator.hasPrevious()){
                        listIterator.previous();
                    }
                    forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing :"+listIterator.previous().toString());
                }else{
                        System.out.println("We have reached to the top of the playlist");
                        forward = true;
                    }

                    break;
                case 3:
                    if(forward){
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing"+listIterator.previous().toString());
                        forward = false;
                    }else{
                        System.out.println("We are at the start of the play list");
                    }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now playing"+listIterator.next().toString());
                            forward = true;
                        }else{
                            System.out.println("We are at the end of the play list");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size()>0){
                    listIterator.remove();
                        if (listIterator.hasNext()){
                            System.out.println("Now playing"+listIterator.next());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now playing"+listIterator.previous());
                        }
                    }
                    break;

            }

        }



    }

    private static void printMenu(){
        System.out.println("Here are the menu options for you");
        System.out.println("==================================");
        System.out.println("0 -> Quit");
        System.out.println("1 -> Move to the next song");
        System.out.println("2 -> Move to the previous song");
        System.out.println("3 -> Replay the current song");
        System.out.println("4 -> List songs in the playlist ");
        System.out.println("5 -> Print Menu");
        System.out.println("6 -> Delete current song from playlist");
    }

    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("=========================");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("==========================");

    }

}
