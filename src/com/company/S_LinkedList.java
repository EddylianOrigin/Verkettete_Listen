package com.company;

/**
 * Kurs "fuks"
 */
public class S_LinkedList {
    public static class ElementL {
        private Object element;
        private ElementL next;

        public ElementL(Object o) {
            element = o;
            next = null;
        }
    }

    public ElementL head;

    public S_LinkedList() {
        head = null;
    }

    public S_LinkedList(Object o) {//am Anfang einfügen
        ElementL newE1 = new ElementL(o);
        head = newE1;
    }

    public ElementL insert(Object o) {
        ElementL newE1 = new ElementL(o);
        if (head == null) {
            head = newE1;
        } else {
            newE1.next = head;
            head = newE1;
        }
        return newE1;
    }

    public ElementL insert(Object o, ElementL pred) { //hinter dem Element einfügen //pred vorgänger
        ElementL newE1 = new ElementL(o);
        if (head == null || pred == null) {
            newE1.next = head;
            head = newE1;
        } else {
            newE1.next = pred.next;
            pred.next = newE1;
        }
        return newE1;
    }

    public void remove(ElementL pred) {//Element danach löschen
        if (pred == null && head != null) {
            head = head.next;
        } else if (pred.next != null) {
            pred.next = pred.next.next;
        }
    }

    public String toString() {//ausgeben
        ElementL help = head;
        String s = "(";
        while (help != null && help.next != null) {
            s = s + help.element + ",";
            help = help.next;
        }
        if (help != null) {
            s = s + help.element + ")";
        }
        return s;
    }


}
