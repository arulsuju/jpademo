package come.jwl.org.jwl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping("/")
    public String Hello()
    {
        return "<h1>Hello Suju";
    }
}
