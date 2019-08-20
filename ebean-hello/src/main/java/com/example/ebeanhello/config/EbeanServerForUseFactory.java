package com.example.ebeanhello.config;

import io.ebean.EbeanServer;
import io.ebean.EbeanServerFactory;
import io.ebean.config.ServerConfig;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述
 * @author Ryze
 * @date 2019-08-20 16:30
 */
@Configuration
public class EbeanServerForUseFactory implements FactoryBean<EbeanServer> {
    @Override
    public EbeanServer getObject() throws Exception {
        return createEbeanServer();
    }

    @Override
    public Class<?> getObjectType() {
        return EbeanServer.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    /**
     * Create a EbeanServer instance.
     */
    private EbeanServer createEbeanServer() {

        ServerConfig config = new ServerConfig();
        config.setName("db");
        // load configuration from ebean.properties
        config.loadFromProperties();
        config.setDefaultServer(true);
        // other programmatic configuration
        return EbeanServerFactory.create(config);
    }
}
