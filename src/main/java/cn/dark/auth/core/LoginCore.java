package cn.dark.auth.core;

import cn.dark.auth.core.exception.AuthBaseException;
import java.util.Objects;

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
        if (Objects.isNull(loginId)) {
            throw new AuthBaseException("账号id不能为空");
        }


        return null;
    }

}
