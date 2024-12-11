package com.example.springcrud.Ferwaba.Repository;

import com.example.springcrud.Ferwaba.model.Teams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FerwabaRepository extends JpaRepository<Teams,Integer> {

}
