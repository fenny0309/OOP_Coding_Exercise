/* Aim:
   Write a Java program to simulate a Music Playlist using LinkedList<String>.
   Perform the following operations:
   1. Add songs to the playlist.
   2. Display the full playlist.
   3. Play the first song (remove from front).
   4. Skip the last song (remove from end).
   5. Display the updated playlist after each operation.
*/

import java.util.*;

public class PR31_CodingExercise
{
    public static void main(String args[])
    {
        LinkedList<String> playlist = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of songs: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter song names:");

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter song " + (i+1) + ": ");
            String song = sc.nextLine();
            playlist.add(song);
        }

      
        System.out.println("\nFull Playlist:");
        System.out.println(playlist);

        
        System.out.println("\nPlaying first song: " + playlist.removeFirst());

        System.out.println("Playlist after playing first song:");
        System.out.println(playlist);

        System.out.println("\nSkipping last song: " + playlist.removeLast());

        System.out.println("Updated Playlist:");
        System.out.println(playlist);
    }
}

/* OUTPUT:

Enter number of songs: 4
Enter song names:
Enter song 1: Perfect
Enter song 2: Believer
Enter song 3: Thunder
Enter song 4: Faded

Full Playlist:
[Perfect, Believer, Thunder, Faded]

Playing first song: Perfect
Playlist after playing first song:
[Believer, Thunder, Faded]

Skipping last song: Faded
Updated Playlist:
[Believer, Thunder]

*/