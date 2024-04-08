import java.util.Scanner;

public class UserService {
    private UserDao userDao;
    private Scanner scanner;
    private String loggedInUserId;

    public UserService(UserDao userDao, Scanner scanner) {
        this.userDao = userDao;
        this.scanner = scanner;
        this.loggedInUserId = null;
    }

    public void register() {
        System.out.print("아이디: ");
        String id = scanner.nextLine();
        System.out.print("비밀번호: ");
        String password = scanner.nextLine();
        System.out.print("이름: ");
        String name = scanner.nextLine();

        User user = new User(id, password, name);
        userDao.register(user);
        System.out.println(user.id + "님 가입을 환영합니다.");
    }

    public void login() {
        if (loggedInUserId != null) {
            System.out.println("이미 로그인되어 있습니다.");
            return;
        }
        System.out.print("아이디: ");
        String id = scanner.nextLine();
        System.out.print("비밀번호: ");
        String password = scanner.nextLine();

        boolean loginSuccess = userDao.login(id, password);
        if (loginSuccess) {
            loggedInUserId = id; // 로그인 성공한 사용자의 아이디를 저장
        } else {
            System.out.println("로그인 실패");
        }
    }

    public void updateUserInfo() {
        if (loggedInUserId == null) {
            System.out.println("로그인 상태가 아닙니다.");
            return;
        }

        System.out.print("새 비밀번호: ");
        String newPassword = scanner.nextLine();
        System.out.print("새 이름: ");
        String newName = scanner.nextLine();

        userDao.updateUserInfo(loggedInUserId, newPassword, newName);
    }

    public void deleteUser() {
        if (loggedInUserId == null) {
            System.out.println("로그인 상태가 아닙니다.");
            return;
        }

        userDao.deleteUser(loggedInUserId);
    }
}
