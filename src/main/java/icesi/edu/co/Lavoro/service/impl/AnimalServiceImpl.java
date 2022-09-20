package icesi.edu.co.Lavoro.service.impl;

import icesi.edu.co.Lavoro.constant.AnimalErrorCode;
import icesi.edu.co.Lavoro.error.exception.AnimalDemoError;
import icesi.edu.co.Lavoro.error.exception.AnimalDemoException;
import icesi.edu.co.Lavoro.service.AnimalService;
import icesi.edu.co.Lavoro.model.Animal;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import icesi.edu.co.Lavoro.repository.AnimalRepository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
@Primary
public class AnimalServiceImpl implements AnimalService {

    public final AnimalRepository animalRepository;

    @Override
    public Animal getAnimal(UUID animalID) {
        return animalRepository.findById(animalID).orElse(null);
    }

    @Override
    public Animal createAnimal(Animal animalDTO) {
        return animalRepository.save(animalDTO);
    }

    @Override
    public List<Animal> getAnimals() {
        return StreamSupport.stream(animalRepository.findAll().spliterator(),false).collect(Collectors.toList());
    }

    private void wordLengthFormatChecker(String word) {
        if(word==null || word.length()>120) {
            throw new AnimalDemoException(HttpStatus.LENGTH_REQUIRED, new AnimalDemoError(""+AnimalErrorCode.CODE_UD_01,"BastaneteMemeLaverdad  "));
        }
    }
}
