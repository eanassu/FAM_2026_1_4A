package br.com.vemprafam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.vemprafam.dao.DaoFuncionario;
import br.com.vemprafam.pojo.Funcionario;

@Controller
@RequestMapping("/funcionarios")
public class FuncionariosController {

	@GetMapping
	public String showFuncHomeVazio(Model model) {
		return "funcionarios";
	}
	@GetMapping("/")
	String showFuncionariosHome(Model model) {
		return "funcionarios";
	}
	@GetMapping("/new")
	public String showFuncionariosForm(Model model) {
		Funcionario f = new Funcionario();
		model.addAttribute("funcionario", f);
		return "create-funcionario";
	}
	DaoFuncionario dao = new DaoFuncionario();
	@PostMapping
	public String insert(@ModelAttribute Funcionario f) {
		dao.insert(f);
		return "redirect:funcionarios";
	}


}
