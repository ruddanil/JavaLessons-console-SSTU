package ru.rud.exam;

public class Button {
    private String text;
    private Action act;
    private Form form;
    private int x, y;

    public Button(String text, int x, int y, Action act) {
        this.text = text;
        if (x > 0 && x <= form.getWidth()) {
            this.x = x;
        } else throw new IllegalArgumentException();
        if (y > 0 && y <= form.getHeight()) {
            this.y = y;
        } else throw new IllegalArgumentException();
        this.act = act;
    }

    public void onClick() {
        act.onClick();
    }

}
