package com.example.numberguessinggame.cli;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CommandRunner implements CommandLineRunner {
    private Scanner input = new Scanner (System.in);

    @Override
    public void run (String... args) {

    }
}