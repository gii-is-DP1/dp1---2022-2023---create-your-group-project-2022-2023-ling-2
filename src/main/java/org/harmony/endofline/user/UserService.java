package org.harmony.endofline.user;

import org.harmony.endofline.multiplayer.Multiplayer;
import org.harmony.endofline.singleplayer.Singleplayer;
import org.harmony.endofline.userGame.UserGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> getUser(String username) {
        return userRepository.findById(username);
    }

    @Transactional
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Transactional
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Transactional
    public void deleteUser(String username) {
        userRepository.deleteById(username);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public boolean isUsernameTaken(String username) {
        return userRepository.findByUsername(username) != null;
    }

    public boolean isEmailTaken(String email) {
        return userRepository.findByEmail(email) != null;
    }

    @Transactional
    public void addUserGame(User user, UserGame userGame) {
        user.addMultiplayerGame(userGame);
    }

    public void addSingleplayerGame(User user, Singleplayer game) {
        user.addSingleplayerGame(game);
    }

    public List<Multiplayer> getMultiplayerGames(String username) {
        return userRepository.findUserMultiplayerGames(username);
    }

    public List<Singleplayer> getSingleplayerGames(String username) {
        return userRepository.findUserSingleplayerGames(username);
    }

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }
}
