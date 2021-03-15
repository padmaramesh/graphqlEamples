package padma.ramesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("padma.ramesh.domain")
@EnableJpaRepositories("padma.ramesh.repository")
public class GraphqlEamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlEamplesApplication.class, args);
	}

}
