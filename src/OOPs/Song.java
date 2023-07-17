package OOPs;

import java.util.HashSet;

public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;

    }

    public boolean isInRepeatingPlaylist() {
        HashSet<Song> set = new HashSet<>();
        Song a= this;
        while (this.nextSong!=null){
            if(set.contains(a)){
                return true;
            }
            set.add(a);

            a =a.nextSong;
        }
        return false;
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");

        first.setNextSong(second);
        second.setNextSong(first);

        System.out.println(first.isInRepeatingPlaylist());
    }
}