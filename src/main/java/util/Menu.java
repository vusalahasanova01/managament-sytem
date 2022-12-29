package util;

import service.MenuAddService;
import service.MenuLoginService;
import service.MenuRegisterService;
import service.MenuService;

import java.util.Scanner;

public enum Menu {
  LOGIN(1, "Login", new MenuLoginService()),
  REGISTER(2, "Register", new MenuRegisterService()),
  ADD_TEACHER(3, "Add teacher", new MenuAddService()),
  ADD_STUDENT(4, "Add student", new MenuAddService()),
  SHOW_ALL_TEACHER(5, "Show all teachers list", null),
  SHOW_ALL_STUDENT(6, "Show all studens list", null),
  EXIT(7, "Exit", null),
  UNKNOWN;

  private String label;
  private int listNumber;
  private MenuService menuService;

  Menu() {
  }

  Menu(int ListNumber, String label, MenuService menuService) {
    this.label = label;
    this.listNumber = ListNumber;
    this.menuService = menuService;
  }

  public int getListNumber() {
    return listNumber;
  }

  public void process() {
    menuService.process();
  }

  public static Menu findMenu(int number) {
    Menu[] menus = Menu.values();
    for (int i = 0; i < menus.length; i++) {
      if (menus[i].getListNumber() == number) {
        return menus[i];
      }
    }
    return null;
  }

  public static void showMenu() {
    Menu[] values = Menu.values();
    for (int i = 0; i < values.length; i++) {
      if (values[i] != Menu.UNKNOWN)
        System.out.println(values[i]);
    }
  }

  public static int acceptInt(String question) {
    System.out.println(question);
    Scanner sc = new Scanner(System.in);
    return sc.nextInt();
  }

  @Override
  public String toString() {
    return listNumber + "." + label;
  }
}
