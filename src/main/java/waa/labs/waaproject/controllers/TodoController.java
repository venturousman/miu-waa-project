package waa.labs.waaproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import waa.labs.waaproject.models.Todo;
import waa.labs.waaproject.services.ITodoService;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final ITodoService todoService;

    // @Autowired
    public TodoController(ITodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> getAllTodos() {
        System.out.println("Hello Todos");
        return List.of();
    }
}
