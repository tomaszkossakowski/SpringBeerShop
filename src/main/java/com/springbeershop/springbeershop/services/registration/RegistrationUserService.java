package com.springbeershop.springbeershop.services.registration;

import com.springbeershop.springbeershop.dao.user.UserRepository;
import com.springbeershop.springbeershop.entities.user.User;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RegistrationUserService {

  private final UserRepository userRepository;

  @Autowired
  public RegistrationUserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void addNewUser(User user) {
    user.setCreationDate(new Date());
    final User addedUser = userRepository.save(user);
    log.info("New user added " + addedUser.toString());
  }
}
