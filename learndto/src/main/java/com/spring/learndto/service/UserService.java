package com.spring.learndto.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.learndto.dto.UserLocationDTO;
import com.spring.learndto.model.User;
import com.spring.learndto.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserLocationDTO> getAllUserLocation(){
        return userRepository.findAll()
        .stream()
        .map(this::convertEntityToDto)
        .collect(Collectors.toList());
    }

    private UserLocationDTO convertEntityToDto(User user){
        UserLocationDTO userLocationDTO = new UserLocationDTO();

        userLocationDTO.setUserId(user.getId());
        userLocationDTO.setEmail(user.getEmail());
        userLocationDTO.setPlace(user.getLocation().getPlace());
        userLocationDTO.setLongitude(user.getLocation().getLongitude());
        userLocationDTO.setLatitude(user.getLocation().getLatitude());
        return userLocationDTO;
    }
}
