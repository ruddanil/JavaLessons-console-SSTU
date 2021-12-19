package ru.rud.unsorted;

public class Box<T> {
    private T obj;

    public void setObj(T obj) {
        if (!boxIsFull()) {
            T objCopy = obj;
            this.obj = objCopy;
        } else throw new RuntimeException("Коробка не пуста");
    }

    public T getObj() {
        T objCopy = obj;
        obj = null;
        return objCopy;
    }

    public Boolean boxIsFull() {
        if (obj != null) {
            return true;
        }
        return false;
    }


}
