package cn.dark.auth.core;

import cn.hutool.core.collection.CollUtil;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 系统配置
 *
 * @author dark
 * @date 2023-10-22
 */
@Configuration
@ConfigurationProperties(prefix = "auth")
public class SysConfig {

    private static SysConfig INSTANCE;

    private List<Object> abnormalAccounts;

    @PostConstruct
    public void init() {
        INSTANCE = this;
    }

    public static List<Object> getAbnormalaccounts() {
        if (CollUtil.isEmpty(INSTANCE.abnormalAccounts)) {
            return Lists.newArrayList();
        }
        return INSTANCE.abnormalAccounts;
    }

}
