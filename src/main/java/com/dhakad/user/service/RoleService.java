package com.dhakad.user.service;

import com.dhakad.security.JwtProvider;
import com.dhakad.topic.model.Topic;
import com.dhakad.user.model.Role;
import com.dhakad.user.model.User;
import com.dhakad.user.repository.RoleRepository;
import com.dhakad.user.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoleService {
    private static final Logger LOGGER = LoggerFactory.getLogger(RoleService.class);

    @Autowired
    private RoleRepository roleRepository;


    public void addRole(Role role)
    {
        roleRepository.save(role);
    }

    public List<Role> getRoleList(){
        //return  bookList;
        List<Role> roles = new ArrayList<>();
        roleRepository.findAll().forEach(n-> roles.add((Role)n));
        return roles;
    }

    public Optional<Role> getRole(Long id)
    {
        return roleRepository.findById(id);
    }
    public void updateRole(Long id, Role role)
    {

        roleRepository.save(role);
    }
    public void deleteRole(Long id)
    {

        roleRepository.deleteById(id);
    }

}