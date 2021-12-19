package ru.rud.human;

import java.util.ArrayList;
import java.util.List;

public class Publication {
    private String header;
    private String text;
    private Boolean isEdited;
    private List<String> tags = new ArrayList<String>();
    private List<Comment> comments = new ArrayList<Comment>();
    private int rate;

    public Publication(String header, String text, int rate) {
        this.header = header;
        this.text = text;
        this.rate = rate;
        isEdited = false;
    }

    public Publication(String header, String text, int rate, String... tags) {
        this.header = header;
        this.text = text;
        this.rate = rate;
        for (String s : tags) addTag(s);
        isEdited = false;
    }

    public void addTag(String tag) {
        tags.add(tag);
    }

    private void markIsEdited() {
        isEdited = true;
    }

    public Boolean isCanEdited() {
        return !isEdited;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
        markIsEdited();
    }

    public void addRate(int rate) {
        if (rate == 1 || rate == -1)
            this.rate += rate;
        else throw new IllegalArgumentException("Рейтинг может быть увеличен или уменьшен только на единицу");
        markIsEdited();
    }

    public void editText(String text) {
        if (isEdited)
            throw new IllegalArgumentException("Нельзя изменять публикацию после добавления комментария или изменения её рейтинга");
        this.text = text;
    }


    public String getHeader() {
        return header;
    }

    @Override
    public String toString() {
        String pub = "(" + rate + ") " + header + "\n" + "тэги: ";
        for (int i = 0; i < tags.size(); i++)
            pub += tags.get(i) + ", ";
        pub += "\n" + text + "\n" + "Комментарии: \n";
        for (Comment c : comments)
            pub += c.toString();
        return pub;
    }
}
