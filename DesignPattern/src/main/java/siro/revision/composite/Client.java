package siro.revision.composite;

public class Client {
    public static void main(String[] args) {
        //leaf
        MenuComponent dinnerMenu = new MenuItem("dinner menu","dinner","nothing",440);
        MenuComponent lunchMenu = new MenuItem("lunch menu","lunch","many",323);

        MenuComponent allDayMenu = new Menu("ALl day","daily","do not know", 1233);
        //
        allDayMenu.add(dinnerMenu);
        allDayMenu.add(lunchMenu);
        allDayMenu.print();
    }
}
