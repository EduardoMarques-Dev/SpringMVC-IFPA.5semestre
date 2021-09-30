package com.ifpa.tads.strabalhoMVC.controllers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ifpa.tads.strabalhoMVC.models.Professor;
import com.ifpa.tads.strabalhoMVC.models.StatusProfessor;

@Controller
public class ProfessorController {

	@GetMapping("/professores")
	public ModelAndView index() {
		Professor batman = new Professor("Batman", new BigDecimal(5000.0), StatusProfessor.ATIVO);
		batman.setId((long) 1);
		Professor coringa = new Professor("Coringa", new BigDecimal(10000.0), StatusProfessor.APOSENTADO);
		coringa.setId((long) 2);
		Professor mulherMaravilha = new Professor("Mulher Maravilha", new BigDecimal(4000.0), StatusProfessor.AFASTADO);
		mulherMaravilha.setId((long) 3);

		List<Professor> professores = Arrays.asList(batman, coringa, mulherMaravilha);

		ModelAndView mv = new ModelAndView("professores/index");
		mv.addObject("professores", professores);

		return mv;
	}
}
