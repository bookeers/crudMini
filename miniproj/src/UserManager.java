import java.util.Scanner;

public class UserManager {
    private static UserDao userDao = new UserDao();
    private static Scanner scanner = new Scanner(System.in);
    private static UserService userService = new UserService(userDao, scanner);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1: 회원 가입, 2: 로그인, 3: 회원 정보 수정, 4: 탈퇴, 0: 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 숫자 입력 후 남은 줄바꿈 문자 제거

            switch (choice) {
                case 1:
                    userService.register();
                    break;
                case 2:
                    userService.login();
                    break;
                case 3:
                    userService.updateUserInfo();
                    break;
                case 4:
                    userService.deleteUser();
                    break;
                case 0:
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
