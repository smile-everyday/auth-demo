package cn.dark.auth.core;

import cn.dark.auth.core.exception.AuthBaseException;

import java.util.Objects;

/**
 * Token、Session等持久层仓储
 *
 * @author dark
 * @date 2023-10-22
 */
public interface LoginRepository {

    /**
     * 保存数据
     *
     * @param key 键
     * @param value 值
     * @param timeout 过期时间，秒
     */
    void saveObject(Object key, Object value, int timeout);

    /**
     * 获取数据
     *
     * @param key
     * @return
     */
    Object getObject(Object key);

    /**
     * 保存session
     *
     * @param key
     * @param session
     * @param timeout 过期时间，秒
     */
    default void saveSession(String key, AuthSession session, int timeout) {
        saveObject(key, session, timeout);
    }

    /**
     * 查询Session
     *
     * @param key
     * @return
     */
    default AuthSession getSession(String key) {
        Object object = getObject(key);
        if (Objects.isNull(object)) {
            return null;
        }

        if (object instanceof AuthSession) {
            return (AuthSession) object;
        }

        throw new AuthBaseException("获取Session失败，传入的key对应值不是Session");
    }

}
