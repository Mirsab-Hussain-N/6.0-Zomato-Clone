package com.mirsab_hussain_n.food_delivery_app.repository;
import com.mirsab_hussain_n.food_delivery_app.entity.*;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
import java.util.List;



public interface VerifyUserRepository extends JpaRepository<VerifyUser, Long>{
    // Optional<VerifyUser> findByEmail(String email);
    VerifyUser findByEmail(String email);
    
}
