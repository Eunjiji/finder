package movie.finder.controller;

import lombok.AllArgsConstructor;
import movie.finder.DTO.MovieResponseDTO;
import movie.finder.DTO.MovieUpdateDTO;
import movie.finder.service.MovieService;
import movie.finder.domain.Movie;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class MovieController {

    private MovieService movieService;

    @RequestMapping("/")
    public String main(Model model){

        List<Movie> movieList = movieService.findMovie();
        Movie movie = new Movie();
        Long id = movieService.addMovie(movie.addMovie("Harry Potter", "Harry Potter Story", "Daniel, Emma"));

        System.out.println("id : " + id);


        model.addAttribute("movieList", movieList);

        return "index";
    }

    @PostMapping("/api/v1/movies/{id}")
    public Long update(@PathVariable Long id, @RequestBody MovieUpdateDTO movieUpdateDTO){
        return movieService.update(id , movieUpdateDTO);
    }

    @GetMapping("/api/v1/movies/{id}")
    public MovieResponseDTO findById(@PathVariable Long id){
        return movieService.findById(id);
    }
}
