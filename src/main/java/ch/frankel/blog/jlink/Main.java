package ch.frankel.blog.jlink;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        String hello = "Hello ";
        String world = "world! ";
        String from = "from Commons Lang";
        String message = StringUtils.join(hello, world, from);
        LOGGER.info(message);
    }
}
