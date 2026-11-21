package com.daniel.taskmanager.controller;
import com.daniel.taskmanager.model.Task;
import com.daniel.taskmanager.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
@Controller public class TaskController {
 private final TaskService service;
 public TaskController(TaskService service){this.service=service;}
 @GetMapping({"/","/tasks"}) public String list(Model model){model.addAttribute("tasks",service.findAll());return "index";}
 @GetMapping("/addTask") public String add(Model model){model.addAttribute("task",new Task());return "add-task";}
 @PostMapping("/addTask") public String saveNew(@Valid @ModelAttribute("task") Task task, BindingResult errors){if(errors.hasErrors())return "add-task";task.setId(null);service.save(task);return "redirect:/";}
 @GetMapping("/editTask/{id}") public String edit(@PathVariable Integer id, Model model){var task=service.findById(id);if(task.isEmpty())return "redirect:/";model.addAttribute("task",task.get());return "edit-task";}
 @PostMapping("/editTask/{id}") public String saveEdit(@PathVariable Integer id, @Valid @ModelAttribute("task") Task task, BindingResult errors){if(service.findById(id).isEmpty())return "redirect:/";task.setId(id);if(errors.hasErrors())return "edit-task";service.save(task);return "redirect:/";}
 @PostMapping("/deleteTask/{id}") public String delete(@PathVariable Integer id){service.deleteById(id);return "redirect:/";}
}
