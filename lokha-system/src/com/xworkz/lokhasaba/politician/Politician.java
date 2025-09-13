package com.xworkz.lokhasaba.politician;

import com.xworkz.lokhasaba.constants.Nationality;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter@Setter@NoArgsConstructor
public class Politician {
    private int id;
    private String name;
    private String constitution;
    private int age;
    private Nationality nationality;


}
