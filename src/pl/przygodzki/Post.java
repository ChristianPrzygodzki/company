package pl.przygodzki;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Post {

    private String title;
    private String author;
    Set<Tag> tagList = new HashSet<>();

    public Post(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void addTag(Tag tag){
        tagList.add(tag);
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", tagList=" + tagList +
                '}';
    }
}
