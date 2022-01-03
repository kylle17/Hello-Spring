package hello.hellospring;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class Optional_test {

    @Test
    public void orElse_Test() {
        String name = "천수영";
        Optional<String> op = Optional.ofNullable(name);
        String result = op.orElse(create_name());
        System.out.println(result);
    }

    @Test
    public void orElseGet_Test() {
        String name = "천수영";
        Optional<String> op = Optional.ofNullable(name);
        String result = op.orElseGet(() -> create_name());
        System.out.println(result);
    }


    private String create_name() {
        System.out.println("안중근 의사");
        return "안중근 의사";
    }


    @Test
    public void orElseThrow_Test() throws Exception {
        String name = "천수영";
        Optional<String> op = Optional.ofNullable(name);
        String result = op.orElseThrow( ()-> new Exception("머선 일이구") );
        System.out.println(result);
    }
}
