package connectus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan
@ComponentScan(basePackages = "connectus.member")
@ComponentScan(basePackages = "connectus.board")
@ComponentScan(basePackages = "connectus.product")
@ComponentScan(basePackages = "connectus.reservation")
@ComponentScan(basePackages = "connectus.comment")
@ComponentScan(basePackages = "connectus.chat")

@MapperScan(basePackages = "connectus.comment")
@MapperScan(basePackages = "connectus.member")
@MapperScan(basePackages = "connectus.board")
@MapperScan(basePackages = "connectus.product")
@MapperScan(basePackages = "connectus.reservation")
@MapperScan(basePackages = "connectus.chat")
public class ConnectusApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConnectusApplication.class, args);
	}

}
