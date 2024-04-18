package com.example.lab3.Controller;

import com.example.lab3.Entity.Sede;
import com.example.lab3.Entity.Veterinario;
import com.example.lab3.Repository.SedeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = {"/sede"})
public class SedeController {

    final SedeRepository sedeRepository;

    public SedeController(SedeRepository sedeRepository){this.sedeRepository = sedeRepository;}


    @GetMapping(value= {"/list",""})
    public String listarSedes(Model model){
        List<Sede> lista = sedeRepository.findAll();
        model.addAttribute("listaSedes",lista);
        return "sede/sedelist";
    }

    @GetMapping(value = {"/mostrarMascotas"})
    public String mostrarMascotas(@RequestParam("id") int id){

        return "sede/mostrarMascotas";

    }

    @GetMapping(value = {"/mostrarVeterinarios"})
    public String mostrarVeterinarios(@RequestParam("id") int id,
                                      Model model){
        List<Veterinario> listaVeterinarios = 
        model.addAttribute("listaVeterinarios", listaVeterinarios);

        return "sede/mostrarVeterinarios";

    }

}


