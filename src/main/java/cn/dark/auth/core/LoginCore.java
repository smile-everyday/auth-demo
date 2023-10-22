package cn.dark.auth.core;

/**
 * 登录核心逻辑
 *
 * @author dark
 * @date 2023-10-22
 */
public class LoginCore {

    public static String login(Object loginId) {
        return login(loginId, CommonConstant.DEFAULT_DEVICE);
    }

    public static String login(Object loginId, String deviceType) {
        return null;
    }

}
