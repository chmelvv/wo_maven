package com.mainacad.wo_maven;

import static java.lang.System.*;
import com.mainacad.RandomGenerator;

public class RandomTest {

    public static void main(String[] args){
		RandomGenerator rg = new RandomGenerator();
        System.out.println(rg.getRandom());
     }

}