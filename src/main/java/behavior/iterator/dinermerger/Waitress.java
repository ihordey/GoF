package behavior.iterator.dinermerger;

import java.util.Arrays;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Arrays.asList(pancakeHouseMenu.createIterator(),
                dinerMenu.createIterator(),
                dinerMenu.createReverseIterator()).
                forEach(i -> {
                    System.out.println("\nclass : " + i.getClass());
                    printMenu(i);
                });
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
