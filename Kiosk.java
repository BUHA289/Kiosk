package Kiosk;

import java.util.Scanner;

public class Kiosk {

    private Menu burgerMenu;

    public Kiosk() {
        this.burgerMenu = new Menu();

        burgerMenu.addMenuItem(
                new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거")
        );
        burgerMenu.addMenuItem(
                new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
        );
        burgerMenu.addMenuItem(
                new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
        );
        burgerMenu.addMenuItem(
                new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")
        );
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");

            for (int i = 0; i < burgerMenu.getMenuItems().size(); i++) {
                MenuItem item = burgerMenu.getMenuItems().get(i);
                System.out.println((i + 1) + ". "
                        + item.getName()
                        + " | W " + item.getPrice()
                        + " | " + item.getDescription());
            }
            System.out.println("0. 종료      | 종료\n");

            System.out.print("메뉴를 선택하세요: ");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice >= 1 && choice <= burgerMenu.getMenuItems().size()) {
                MenuItem selected = burgerMenu.getMenuItems().get(choice - 1);
                System.out.println(selected.getName() + "를(을) 선택하셨습니다.\n");
            } else {
                System.out.println("잘못된 번호를 입력하셨습니다. 다시 시도해주세요.\n");
            }
        }

        sc.close();
    }
}
