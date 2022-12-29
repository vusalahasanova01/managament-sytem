package util;

import main.Main;

import java.util.Scanner;

public class MenuUtil {
  public static void showMenu() {
    Menu.showMenu();
    Menu menu = Menu.findMenu(Menu.acceptInt("Select menu:"));
    menu.process();
  }
}
