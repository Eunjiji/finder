package movie.finder.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import movie.finder.DTO.MovieResponseDTO;
import movie.finder.DTO.MovieUpdateDTO;
import movie.finder.repository.MovieRepository;
import movie.finder.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public Long addMovie(Movie movie){
        Movie movieResult = movieRepository.save(movie);
        return movieResult.getId();
    }

    public List<Movie> findMovie() {
        return movieRepository.findAll();
    }

    @Transactional
    public Long update(Long id, MovieUpdateDTO requestDto){
        Movie movie = movieRepository.findById(id);
        movie.update(requestDto.getTitle(), requestDto.getSummary());
        return id;
    }

    public MovieResponseDTO findById(Long id){
        Movie entity = movieRepository.findById(id);
        return new MovieResponseDTO(entity);
    }
}
