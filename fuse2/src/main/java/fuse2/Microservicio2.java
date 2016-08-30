package fuse2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
public class Microservicio2 {

	public Microservicio2() {
		super();
	}
	
	@RequestMapping("/")
	String homeMethod() {
		return "<br><h1><strong>Microservicio 1</strong></h1></br>";
	}

	
	
	
	

	/*******************************************
	 * MAIN                                    *
	 *                                         *
	 * @param args                             *
	 *                                         *
	 * @throws Exception                       *
	 *                                         *
	 ******************************************/
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Microservicio2.class, args);
	}
}
