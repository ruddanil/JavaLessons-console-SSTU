package ru.rud.human;

import java.util.ArrayList;
import java.util.List;

public class Comment {
    private int rating;
    private String comment;
    private Boolean isCommented;
    private List<Comment> comments = new ArrayList<Comment>();

    public Comment(String comment, int rating) {
        this.comment = comment;
        this.rating = rating;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
        markIsCommented();
    }

    private void markIsCommented() {
        isCommented = true;
    }

    public Boolean isCanEdited() {
        return !isCommented;
    }

    public void editText(String comment) {
        if (isCommented)
            throw new IllegalArgumentException("Нельзя изменять комментарий после добавления подкомментария");
        this.comment = comment;
    }

    private String getComment(int lvl) {
        String output = "";
        for (int i = 0; i < lvl; i++)
            output += "---";
        output += " (" + rating + ") " + comment + "\n";

        for (Comment c : comments) {
            output += c.getComment(lvl + 1);
        }
        return output;
    }

    public String toString() {
        String output = "(" + rating + ") " + comment + "\n";
        for (Comment c : comments) {
            output += c.getComment(1);
        }
        return output;
    }
}
