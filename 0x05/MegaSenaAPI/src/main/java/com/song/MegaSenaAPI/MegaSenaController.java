package com.song.MegaSenaAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/megasena")
public class MegaSenaController {

    @GetMapping("/simpleMessageWelcome")
    public String mensagemBoasVindas() {

        return "Geração de números da Mega-Sena";

    }

    @GetMapping("/getNumbers")
    public List<Integer> numerosMegaSena() {
        Random gera = new Random();
        return gera.ints(10).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    }

}
