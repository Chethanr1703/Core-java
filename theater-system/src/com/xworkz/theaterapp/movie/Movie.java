package com.xworkz.theaterapp.movie;

import com.xworkz.theaterapp.constants.Certificate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter@NoArgsConstructor
public class Movie {
    private int movieId;
    private String movieName;
    private String hero;
    private String duration;
    private Certificate certification;



}
