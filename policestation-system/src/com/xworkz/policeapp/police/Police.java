package com.xworkz.policeapp.police;

import com.xworkz.policeapp.constants.Post;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter@Setter
@NoArgsConstructor
public class Police {
   private int policeId;
    private Post typeOfPost;
    private String name;
    private double salary;
    private int experience;

}
