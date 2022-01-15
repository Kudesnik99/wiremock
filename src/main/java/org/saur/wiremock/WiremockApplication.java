package org.saur.wiremock;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.common.SingleRootFileSource;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.extension.responsetemplating.ResponseTemplateTransformer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

@Slf4j
@SpringBootApplication
public class WiremockApplication {

    public static void main(String[] args) {
        WireMockServer wireMockServer = new WireMockServer(WireMockConfiguration.wireMockConfig()
                .port(8082)
                .fileSource(new SingleRootFileSource("stub"))
                .extensions(new ResponseTemplateTransformer(true)));
        wireMockServer.start();

        log.info("Wiremock started!");
    }

}
