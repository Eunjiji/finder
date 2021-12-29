package movie.finder.controller;

import movie.finder.DTO.HelloResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //JSON을 반환하는 controller로 만들어준다.
public class HelloController {
   @GetMapping("/hello")
   public String hello(){
       return "hello";
   }

   @GetMapping("/hello/dto")
    public HelloResponseDTO helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
       return new HelloResponseDTO(name, amount);
   }

}
