package cinema.config;

import cinema.model.Movie;
import cinema.model.Role;
import cinema.model.User;
import cinema.service.MovieService;
import cinema.service.RoleService;
import cinema.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;
    private final MovieService movieService;


    public DataInitializer(RoleService roleService,
                           UserService userService, MovieService movieService) {
        this.roleService = roleService;
        this.userService = userService;
        this.movieService = movieService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(Role.RoleName.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setRoleName(Role.RoleName.USER);
        roleService.add(userRole);
        User admin = new User();
        admin.setEmail("admin2022@i.ua");
        admin.setPassword("admin2022");
        admin.setRoles(Set.of(adminRole));
        User user = new User();
        user.setEmail("user2022@gmail.com");
        user.setPassword("user2022");
        user.setRoles(Set.of(userRole));
        userService.add(admin);
        userService.add(user);
        Movie movie = new Movie();
        movie.setDescription("About robots");
        movie.setTitle("Terminator");
        movieService.add(movie);
    }
}
