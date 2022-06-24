package com.api.filmeteca.repository;

import com.api.filmeteca.model.Interesse;
import com.api.filmeteca.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InteresseRepository extends JpaRepository<Interesse,Long> {

    public List<Interesse> findByUsuario(Usuario usuario);

    public List<Interesse> findByUsuarioAndIdFilme(Usuario usuario, Long id);
}
