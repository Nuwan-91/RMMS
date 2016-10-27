package io.egreen.rmms;

import io.egreen.apistudio.bootstrap.ApiStudio;
import io.egreen.apistudio.bootstrap.config.MSApp;

import javax.ws.rs.ApplicationPath;

/**
 * Created by nuwan on 9/1/16.
 */
@ApplicationPath("/")
@MSApp(name = "RMMS")
public class MainApplication {
    public static void main(String[] args) {
        ApiStudio.boot(MainApplication.class, "0.0.0.0", 4545, "/RMMS");
    }
}
