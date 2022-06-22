package at.technikum.imperialapi;

import org.springframework.web.bind.annotation.*;

@RestController
public class ConverterController {

    @RequestMapping("/inch")
    public double inch(@RequestParam double a){
        return (a * 2.54);
    }


@RequestMapping("/yard")
    public double yard(@RequestParam double b){
        return b/1.094;
    }

}
