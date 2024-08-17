package com.gibran.usercrud.repository;

import com.gibran.usercrud.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class InMemoryUserRepository implements UserRepository {

    private final List<User> users = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    @Value("${users.data:}")
    private String usersData;

    @PostConstruct
    public void init() {
        if (usersData == null || usersData.isEmpty()) {
            System.err.println("Error en init");
            return;
        }
        loadUsers();
    }

    private void loadUsers() {
        String[] userEntries = usersData.split(";");
        for (String entry : userEntries) {
            String[] details = entry.split(",");
            if (details.length >= 15) {
                User user = new User();
                user.setId(counter.incrementAndGet());
                user.setNombre(details[0]);
                user.setPaterno(details[1]);
                user.setMaterno(details[2]);
                user.setFechaNacimiento(LocalDate.parse(details[3]));
                user.setGenero(details[4]);
                user.setCurp(details[5]);
                user.setRfc(details[6]);

                User.Direccion direccion = new User.Direccion();
                direccion.setCalle(details[7]);
                direccion.setNumint(Integer.parseInt(details[8]));
                direccion.setNumExt(Integer.parseInt(details[9]));
                direccion.setColonia(details[10]);
                direccion.setCp(details[11]);
                direccion.setMunicipio(details[12]);
                direccion.setEstado(details[13]);
                direccion.setPais(details[14]);

                user.setDireccion(direccion);
                users.add(user);
            } else {
                System.err.println("Error: " + entry);
            }
        }
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users);
    }

    @Override
    public Optional<User> findById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    @Override
    public User save(User user) {
        if (user.getId() == null) {
            user.setId(counter.incrementAndGet());
            users.add(user);
        } else {
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getId().equals(user.getId())) {
                    users.set(i, user);
                    return user;
                }
            }
        }
        return user;
    }

    @Override
    public void deleteById(Long id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}
