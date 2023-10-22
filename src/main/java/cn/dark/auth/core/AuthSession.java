package cn.dark.auth.core;

import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Session信息
 *
 * @author dark
 * @date 2023-10-22
 */
public class AuthSession {

    private String sessionId;

    /**
     * 账号id
     */
    private Object loginId;

    /**
     * session所属Token
     */
    private String token;

    /**
     * session创建时间
     */
    private Date createTime;

    /**
     * 挂载数据
     */
    private final Map<Object, Object> extraData = new ConcurrentHashMap<>();

    public AuthSession(String sessionId) {
        this.sessionId = sessionId;

        this.createTime = new Date();
    }

    public void putData(Object key, Object value) {
        extraData.put(key, value);
    }

    public boolean putDataIfAbsent(Object key, Object value) {
        return Objects.isNull(extraData.putIfAbsent(key, value));
    }

    public Object getData(Object key) {
        return extraData.get(key);
    }

    public Object getLoginId() {
        return loginId;
    }

    public void setLoginId(Object loginId) {
        this.loginId = loginId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
