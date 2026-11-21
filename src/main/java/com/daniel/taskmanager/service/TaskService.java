package com.daniel.taskmanager.service;
import com.daniel.taskmanager.model.Task;
import com.daniel.taskmanager.repository.TaskRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
@Service public class TaskService {
 private final TaskRepository repository;
 public TaskService(TaskRepository repository){this.repository=repository;}
 public List<Task> findAll(){return repository.findAll();}
 public Optional<Task> findById(Integer id){return repository.findById(id);}
 public Task save(Task task){return repository.save(task);}
 public void deleteById(Integer id){if(repository.existsById(id)) repository.deleteById(id);}
}
