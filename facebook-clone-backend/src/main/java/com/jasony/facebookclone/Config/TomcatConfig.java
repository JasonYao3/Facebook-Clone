package com.jasony.facebookclone.Config;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TomcatConfig {

    @Bean
    public TomcatServletWebServerFactory tomcatServletWebServerFactory() {
        TomcatServletWebServerFactory tomcatFactory = new TomcatServletWebServerFactory() {

            @Override
            protected void customizeConnector(Connector connector) {
                super.customizeConnector(connector);
                connector.setMaxPostSize(215000000);
            }

        };
        return tomcatFactory;
    }
}
