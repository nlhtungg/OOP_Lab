package hust.soict.dsai.test;

import java.util.List;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;

import java.util.ArrayList;

public class Polymorphism {

    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<Media>();
        ArrayList<Track> tracks = new ArrayList<Track>();
        tracks.add(new Track("Track 1", 1.0f));
        tracks.add(new Track("Track 2", 2.0f));
        CompactDisc cd = new CompactDisc(1, "Nhac bat hu", "Music", 10.0f, "Artist", tracks);
        DigitalVideoDisc dvd = new DigitalVideoDisc(2, "DVD", "Movie", 20.0f, "Director", 120);
        Book book = new Book(3, "Book", "Book", 5.0f, List.of("Author 1", "Author 2"));
        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);

        for(Media m: mediae) {
            System.out.println(m.toString());
        }
    }

}