package com.dhakad.user.controller;

import com.dhakad.topic.model.Topic;
import com.dhakad.user.model.Role;
import com.dhakad.user.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/v1/")
public class RoleController {
    @Autowired
    private RoleService roleService;

    //this is to get all book list
    @CrossOrigin(origins = "*")
    @RequestMapping("/roles")
    public List<Role> getRoles(){
        return roleService.getRoleList();
    }

    //this is to get Topic object by id
     @CrossOrigin(origins = "*")
    @RequestMapping("/roles/{id}")
    public Optional<Role> getRole(@PathVariable Long id)
    {
        return roleService.getRole(id);
    }

    //this is to add Topic
     @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.POST, value = "/roles/")
    public void addRole(@RequestBody Role role)
    {
         roleService.addRole(role);
    }

    //this is to add Topic
     @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.PUT, value = "/roles/{id}")
    public void updateRole(@PathVariable Long id,@RequestBody Role role)
    {
        roleService.updateRole(id, role);
    }

    //this is to add Topic
     @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.DELETE, value = "/roles/{id}")
    public void deleteRole(@PathVariable Long id)
    {
        roleService.deleteRole(id);
    }

}
