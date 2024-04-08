import java.util.HashMap;
import java.util.Map;

public class UserDao {
    Map<String, User> userMap = new HashMap<>();

    public void register(User user) {
        if (!userMap.containsKey(user.getId())) {
            userMap.put(user.getId(), user);
            System.out.println("회원 가입에 성공했습니다.");
        } else {
            System.out.println("이미 존재하는 아이디입니다.");
        }
    }

    public boolean login(String id, String password) {
        if (userMap.containsKey(id) && userMap.get(id).getPassword().equals(password)) {
            System.out.println("로그인 성공!");
            return true;
        } else {
            System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
            return false;
        }
    }

    public void updateUserInfo(String id, String newPassword, String newName) {
        if (userMap.containsKey(id)) {
            User user = userMap.get(id);
            user.setPassword(newPassword);
            user.setName(newName);
            System.out.println("회원 정보가 수정되었습니다.");
        } else {
            System.out.println("존재하지 않는 아이디입니다.");
        }
    }

    public void deleteUser(String id) {
        if (userMap.remove(id) != null) {
            System.out.println("회원 탈퇴가 완료되었습니다.");
        } else {
            System.out.println("존재하지 않는 아이디입니다.");
        }
    }
}
