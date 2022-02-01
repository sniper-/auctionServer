package xyz.auction.server.util;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ImportResource("classpath:/applicationContext.xml")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "xyz.auction.server.db.repository")
@EntityScan({"xyz.auction.server.db.domain"})
@ComponentScan({"xyz.auction.server"})
public class AuctionStarter {

    public static void main(String[] args) {
        SpringApplication.run(AuctionStarter.class, args);
    }
}
