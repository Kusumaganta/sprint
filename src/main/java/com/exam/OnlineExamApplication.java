package com.exam;

import java.util.HashSet;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.entity.Role;
import com.exam.entity.User;
import com.exam.entity.UserRole;
import com.exam.service.UserService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class OnlineExamApplication implements CommandLineRunner{
	
	@Autowired
    private UserService userService;         
	public static void main(String[] args) {
		SpringApplication.run(OnlineExamApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code");
		// TODO Auto-generated method stub
//		User user =new User();
//		user.setFirstName("vipin");
//		user.setLastName("singh");
//		user.setUsername("vipising001");
//		user.setPassword("abcd");
//		user.setEmail("vipin.negi.ddn@gamil.com");
//		user.setProfile("student");
//		
//		Role role1=new Role();
//		role1.setRoleId(101);
//		role1.setRoleName("Admin");
//		
//		Set<UserRole> userRoleSet=new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//		
//		User user1=this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());
//		
		
		
		
	}
}


