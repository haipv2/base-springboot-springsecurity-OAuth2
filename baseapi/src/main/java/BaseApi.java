import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by haipv on 3/23/2018.
 *
 * @version 1.0
 */
@SpringBootApplication(scanBasePackages={"com.hai"})
public class BaseApi {
    public static void main(String[] args) {
        SpringApplication.run(BaseApi.class, args);
    }
}
