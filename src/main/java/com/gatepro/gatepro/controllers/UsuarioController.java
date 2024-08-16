package com.gatepro.gatepro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gatepro.gatepro.models.Usuario;
import com.gatepro.gatepro.services.PermissaoService;
import com.gatepro.gatepro.services.UsuarioService;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private PermissaoService permissaoService;

    @GetMapping("/novo")
    public ModelAndView novoUsuario() {
        ModelAndView modelAndView = new ModelAndView("usuarios/novo");
        modelAndView.addObject("usuarios", new Usuario());
        modelAndView.addObject("permissoes", permissaoService.findAll());
        return modelAndView;
    }

    @PostMapping
    public String salvarUsuario(@ModelAttribute Usuario usuario) {
        usuarioService.save(usuario);
        return "redirect:/usuarios";
    }

    @GetMapping("/{id}")
    public String editarUsuario(@PathVariable Long id, Model model) {
        Usuario usuario = usuarioService.findById(id);
        model.addAttribute("usuario", usuario);
        model.addAttribute("permissoes", permissaoService.findAll());
        return "usuarios/editar"; // Alterei para "usuarios/editar"
    }

    @PutMapping("/usuarios/{id}")
    public String editarUsuario(@PathVariable Long id, @ModelAttribute Usuario usuario, BindingResult result) {
        if (result.hasErrors()) {
            return "usuarios/editar";
        }
        usuarioService.update(usuario);
        return "redirect:/usuarios";
    }

    @GetMapping
    public String listarUsuarios(Model model) {
        // Ordenando os usuários por nome de forma ascendente
        List<Usuario> usuariosOrdenados = usuarioService.findAll();

        model.addAttribute("usuarios", usuariosOrdenados);
        return "usuarios/listar";
    }

    @GetMapping("/{id}/excluir")
    public String excluirUsuario(@PathVariable Long id) {
        usuarioService.delete(id);
        return "redirect:/usuarios";
    }
}
