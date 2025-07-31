public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    @Override
    public boolean equals(Object compared) {
        // 1. Check if both objects refer to the same memory location
        if (this == compared) {
            return true;
        }

        // 2. Check if the compared object is a Song
        if (!(compared instanceof Song)) {
            return false;
        }

        // 3. Type cast to Song
        Song comparedSong = (Song) compared;

        // 4. Compare all attributes for equality
        return this.artist.equals(comparedSong.artist) &&
               this.name.equals(comparedSong.name) &&
               this.durationInSeconds == comparedSong.durationInSeconds;
    }
}
