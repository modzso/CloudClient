package org.core.client;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Modzso on 2015.05.29..
 */
@ConfigurationProperties("my")
public class Config {

    private String base;
    private String otherprop;

    public String getBase() {
        return base;
    }

    public String getOtherprop() {
        return otherprop;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setOtherprop(String otherprop) {
        this.otherprop = otherprop;
    }

    @Override
    public String toString() {
        return "Config{" +
                "base='" + base + '\'' +
                ", otherprop='" + otherprop + '\'' +
                '}';
    }
}
