package ch.frankel.blog.jlink;

import com.google.common.base.Joiner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        String hello = "Hello";
        String world = "world!";
        String from = "from Guava";
        String message = Joiner.on(" ").join(hello, world, from);
        LOGGER.info(message);
    }
}
